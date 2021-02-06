package com.newsum;

public class App 
{
	
	public static void main(String args[]) 
	{
		System.out.printf("Number of methods in %s class with annotations is %d.",SocialNetworkTest.class,TestAnalyzer.getNumAnnotatedMethods(SocialNetworkTest.class));
	}

}
