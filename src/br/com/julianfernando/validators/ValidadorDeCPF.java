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
		} else {
			CPF cpf = (CPF)value;
			
			if (! validaCPF(cpf.getNumeroIdentificador(), cpf.getPrimeiroNumeroVerificador(), cpf.getSegundoNumeroVerificador())) {
				String numeroCPF = cpf.getNumeroIdentificador() +"-"+ cpf.getPrimeiroNumeroVerificador() + cpf.getSegundoNumeroVerificador();
			
				message = new FacesMessage("O Número " + numeroCPF + " não é um CPF válido.");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				context.addMessage(null, message);
				context.renderResponse();
			}
		}
			
	}

	private boolean validaCPF(int numeroIdentificador, int primeiroDigitoVerificador, int segundoDigitoVerificador) {
		long primeiroDigito = this.modulo11( (long) numeroIdentificador);
		long segundoDigito = this.modulo11( (long) numeroIdentificador * 10 + primeiroDigito);
		
		return primeiroDigito == primeiroDigitoVerificador && segundoDigito == segundoDigitoVerificador;
	}
	
	private long modulo11(long numero) {
		// acumulador
		long soma = 0;
		
		long multiplicador = 2;
		
		// percorre o numero do cpf enquanto o mesmo for maior que zero
		while(numero > 0) {
			// aplica o numero ao módulo obtendo o resto da divisão a atribuindo ao digito
			long digito = numero % 10;
			
			// atribui o produto do iterador com o digito acumulando a soma a cada passo 
			soma+= multiplicador * digito;
			
			// decrementa o numero do cpf a cada passada
			numero/= 10;
			
			// incrementa o contador
			multiplicador++;
		}
		
		// verifica se a soma acumulada possui um resto maior do que 2 ou menor;
		long resto = soma % 11;
		if (resto < 2) {
			return 0;
		} else {
			return 11 - resto;
		}
	}
}
