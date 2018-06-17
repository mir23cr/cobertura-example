package org.cobertura.examples.maven.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	private HelloWorld subject;

	@Before
	public void setup() {
		this.subject = new HelloWorld();
	}
	
	@Test
	public void testWorldMessage() {
		assertEquals("Hello World!", this.subject.getMessage(false));
	}

	@Test
    public void testComparation(){
	    int num1 = 5;
	    int num2 = 3;
	    assertEquals(num1 + " is bigger than " + num2, this.subject.comparation(num1,num2));
	}

	
}
