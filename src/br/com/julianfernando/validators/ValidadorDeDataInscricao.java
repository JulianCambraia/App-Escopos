package br.com.julianfernando.validators;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("br.com.julianfernando.ValidadorDeDataInscricao")
public class ValidadorDeDataInscricao implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		Date dataInicio =  (Date) component.getAttributes().get("dataInicial");
		Date dataFim =  (Date) component.getAttributes().get("dataFinal");
		
		
		if (value != null && !"".equals(value)) {
			
			if (dataInicio.after((Date) value) || dataFim.before((Date) value)) {
				
				FacesMessage message = new FacesMessage("Data de inscrição não está entre o período válido");
				
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				
				throw new ValidatorException(message);
			}
			
		}

	}

}
