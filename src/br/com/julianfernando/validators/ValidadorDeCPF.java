package br.com.julianfernando.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import br.com.julianfernando.modelo.CPF;

@FacesValidator("br.com.julianfernando.ValidadorDeCPF")
public class ValidadorDeCPF implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		
		FacesMessage message = null;
		
		if (value == null || "".equals(value)) {
			message = new FacesMessage("Número do CPF não pode ser nulo.");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage(null, message);
			context.renderResponse();
		}
	}

}
