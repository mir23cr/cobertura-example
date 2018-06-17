package org.cobertura.examples.maven.java;

public class HelloWorld {
	
	public String getMessage(boolean bigger) {
		if (bigger) {
			return "Hello Universe!";
		} else {
			return "Hello World!";
		}
	}

	public String comparation(int num1, int num2) {
	    if(num1 > num2) {
	        return num1 + " is bigger than " + num2;
        } else if(num2 > num1) {
	        return num2 + " is bigger than " + num1;
        } else {
	        return "Numbers are equal";
        }
    }

}
