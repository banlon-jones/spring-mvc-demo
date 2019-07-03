package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

// helper class that contains business rule / validation rule
@Constraint(validatedBy = CourseCodeConstraintValidator.class)

//target
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

public @interface CourseCode {
	
	//define default Course code
	
	public String value() default "LUV";
	
	//define default error message
	
	public String message() default "must start with LUV";
	//define default group
	
	public Class<?>[] groups() default {};
	
	//define default payload
	
	public Class<? extends Payload>[] payload() default{};
}
