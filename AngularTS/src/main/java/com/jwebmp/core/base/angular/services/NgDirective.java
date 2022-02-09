package com.jwebmp.core.base.angular.services;

import com.google.inject.*;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

@Target({TYPE, METHOD})
@Retention(RUNTIME)
@ScopeAnnotation
public @interface NgDirective
{
	String selector();
	
	String[] inputs() default {};
	
	String[] outputs() default {};
	
	String exportAs() default "";
	
	String[] queries() default {};
	
	String host() default "";
}
