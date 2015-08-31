package br.com.julianfernando.validators;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import br.com.julianfernando.modelo.RIC;

@FacesValidator("br.com.julianfernando.ValidadorDeRIC")
public class ValidadorDeRIC implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {

		FacesMessage message = null;
		
		if (value==null || "".equals(value)) {
			
			message = new FacesMessage("Registro de Identificação Civil não pode ser nulo.");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage(null, message);
			context.renderResponse();
		} else {
			RIC ric = (RIC) value;
			String ricTexto =  Integer.toString(ric.getIdentificador()) +"-" +Integer.toString(ric.getVerificador());
			if (!Pattern.matches("[0-9]{10}-[0-9]{1}", ricTexto)) {
				message = new FacesMessage("Registro de Identificação Civil incorreto.");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage(null, message);
				context.renderResponse();
			}
		}
	}
}
