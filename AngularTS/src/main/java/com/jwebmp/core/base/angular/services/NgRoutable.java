package com.jwebmp.core.base.angular.services;

import com.google.inject.*;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

@Target({TYPE, METHOD})
@Retention(RUNTIME)
@ScopeAnnotation
public @interface NgRoutable
{
	/**
	 * use : to denote id's or changes
	 * { path: 'products/:productId', component: ProductDetailsComponent },
	 *
	 * @return
	 */
	String path();
	
	
}
