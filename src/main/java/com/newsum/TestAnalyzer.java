package com.newsum;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestAnalyzer 
{
	/**
	   *  Counts the number of methods in the class given by `clazz` that have been annotated
	   *  with the @Test annotation.
	   */
	  public static int getNumAnnotatedMethods(Class<?> clazz) {
		    Method[] methods = clazz.getDeclaredMethods();
		    
		    int numAnnotatedMethods = 0;
		    
		    for (Method m : methods) 
		    {
		      Annotation[] annotations = m.getDeclaredAnnotations();
		      
		      if (annotations.length > 0) 
		      {
		    	  numAnnotatedMethods++; 
		      }
		    }
		    return numAnnotatedMethods;  
	  }
}
