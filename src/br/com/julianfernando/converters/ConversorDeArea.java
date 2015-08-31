package br.com.julianfernando.converters;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import br.com.julianfernando.modelo.Telefone;

@FacesConverter(forClass = Telefone.class)
public class ConversorDeArea implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		// TODO Auto-generated method stub
		if (value != null && !"".equals(value)) {

			Telefone telefone = new Telefone();

			value = value.trim();

			if (!Pattern.matches("[0-9]{2}", value)) {

				FacesMessage message = new FacesMessage("Código da área inválido.");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				throw new ConverterException(message);
			} else {

				telefone.setCodigoArea(value);
			}

			return telefone;
		}

		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		
		Telefone telefone = (Telefone) value;

		return telefone.getCodigoArea();
	}

}
