package fr.ubo.hello.business;

import fr.ubo.hello.bean.Greeting;

public class GreetingBusiness {
	
	public Greeting greeting1(String str) {
		Greeting g = new Greeting("Hello, ",str);
		return g;
	}
	
	public Greeting greeting2() {
		Greeting g = new Greeting("name est obligatorie. Merci de le renseigner.");
		return g;
	}
	
	public Greeting hello() {
		Greeting g = new Greeting("Bienvenue dans notre site : "
				+ "Merci de naviguer sur .../ArchiJEEWSRestTP/greeting   ------- "
				+ "ou ----- .../ArchiJEEWSRestTP/greeting3?name=IMZILI    -------"
				+ "ou -------.../ArchiJEEWSRestTP/greeting2");
		return g;
	}

}
