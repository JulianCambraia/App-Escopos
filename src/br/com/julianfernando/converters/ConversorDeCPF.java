package br.com.julianfernando.converters;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import br.com.julianfernando.modelo.CPF;
import br.com.julianfernando.modelo.Pessoa;

@FacesConverter(forClass=CPF.class)
public class ConversorDeCPF implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null && !"".equals(value)) {
			
			value = value.trim();
			if (!Pattern.matches("[0-9]{9}-[0-9]{2}", value)) {
				FacesMessage message = new FacesMessage("Número do CPF inválido");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				throw new ConverterException(message);
			}
			// particinando o cpf
			String campos[] = value.split("-");
			int numeroIdentificador = Integer.parseInt(campos[0]);
			int primeiroNumeroVerificador = Integer.parseInt(campos[1].substring(0, 1));
			int segundoNumeroVerificador = Integer.parseInt(campos[1].substring(1, 2));
			
			Pessoa pessoa = new Pessoa();
			CPF cpf = new CPF();
			
			cpf.setNumeroIdentificador(numeroIdentificador);
			cpf.setPrimeiroNumeroVerificador(primeiroNumeroVerificador);
			cpf.setSegundoNumeroVerificador(segundoNumeroVerificador);
			pessoa.setCpf(cpf);
			
			return cpf;
		}
		
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		
		CPF cpf = (CPF)value;
		if (cpf != null) {
			return cpf.getNumeroIdentificador()+"-"+cpf.getPrimeiroNumeroVerificador()+cpf.getSegundoNumeroVerificador();
		}
		return null;
	}

}
