package br.com.julianfernando.beanvalidators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PrimoBeanValidator implements ConstraintValidator<Primo, Long>{

	@Override
	public void initialize(Primo arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(Long value, ConstraintValidatorContext context) {
		if (value<=1) {
			return false;
		}
		
		double raizQuadrada = Math.sqrt((double)value);
		
		for (long i=2; i<=raizQuadrada; i++) {
			
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}
}
