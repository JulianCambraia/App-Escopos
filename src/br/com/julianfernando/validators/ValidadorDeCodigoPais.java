package br.com.julianfernando.validators;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import br.com.julianfernando.modelo.Telefone;

@FacesValidator("br.com.julianfernando.ValidadorDeCodigoPais")
public class ValidadorDeCodigoPais implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {

		if (value == null || "".equals(value)) {
			FacesMessage messages = new FacesMessage(
					"Código do país não pode ser nulo.");
			messages.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage(null, messages);
			context.renderResponse();
		} else {
			Telefone telefone = (Telefone)value;
			value = telefone.getCodigoPais();
			if (!Pattern.matches("[0-9]{2}+", value.toString())) {
				FacesMessage messages = new FacesMessage("Código do país inválido.");
				messages.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage(null, messages);
				context.renderResponse();
			}
		}
	}

}
