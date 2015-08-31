package br.com.julianfernando.converters;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import br.com.julianfernando.modelo.Pessoa;
import br.com.julianfernando.modelo.RIC;

@FacesConverter(forClass=RIC.class) 
public class ConversorRIC implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		FacesMessage message = null;
		
		if (value !=null && !"".equals(value)) {
			value = value.trim();
			if (!Pattern.matches("[0-9]{10}-[0-9]{1}", value)) {
				message = new FacesMessage("Registro de Indentificação Civil inválido.");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				throw new ConverterException(message);
			}
			
			Pessoa pessoa = new Pessoa();
			RIC ric = new RIC();
			
			String [] campos = value.split("-");
			int numeroIdentificadorRic = Integer.parseInt(campos[0]);
			int numeroVerificadorRic = Integer.parseInt(campos[1]);
			
			ric.setIdentificador(numeroIdentificadorRic);
			ric.setVerificador(numeroVerificadorRic);
			pessoa.setRic(ric);
			
			return ric;
		}
		
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		
		RIC numeroIdentificador = (RIC) value;
		if (numeroIdentificador!=null) {
			return numeroIdentificador.getIdentificador()+"-"+numeroIdentificador.getVerificador();
		}
		return null;
	}

}
