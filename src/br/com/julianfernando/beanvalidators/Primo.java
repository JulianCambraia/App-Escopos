package br.com.julianfernando.beanvalidators;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import br.com.julianfernando.beanvalidators.PrimoBeanValidator;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PrimoBeanValidator.class)
public @interface Primo {
	
	String message() default "{br.com.julianfernando.message}";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {}; 
}
