package Heritage;

import org.junit.jupiter.api.Test;

public class Capitale_test {
	
	@Test
	void testParis () {
		Capitale capitale1 = new Capitale("Paris", 100);
		capitale1.ajouterMonument(new Monument("Tour Eiffel"));
		System.out.println(capitale1);
	}
	
	@Test
	void testNY () {
		Capitale capitale2 = new Capitale("New York", 200);
		capitale2.ajouterMonument(new Monument("MoMA"));
		System.out.println(capitale2);
	}
	
	@Test 
	void testRome () {
		Capitale capitale3 = new Capitale("Rome", 300);
		capitale3.ajouterMonument(new Monument("Colisée"));
		System.out.println(capitale3);
	}
	
}
