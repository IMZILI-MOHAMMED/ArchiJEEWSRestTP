package fr.ubo.hello.business;

import org.junit.Test;

import fr.ubo.hello.bean.Greeting;

public class GreetingBusinessTest {
	@Test
	public void testGreetingString() {
		String str = null;
		Greeting g = new Greeting("Hello, ",str);
		System.out.println(g);
	}

	@Test
	public void testGreeting() {
		Greeting g = new Greeting("name est obligatorie. Merci de le renseigner");
		System.out.println(g);

	}

}
