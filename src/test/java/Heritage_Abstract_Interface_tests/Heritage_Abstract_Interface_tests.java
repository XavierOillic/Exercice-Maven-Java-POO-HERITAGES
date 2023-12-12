package Heritage_Abstract_Interface_tests;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Heritage_Abstract_Interface.Cercle;
import Heritage_Abstract_Interface.Polygones;

public class Heritage_Abstract_Interface_tests {
	
	@Test
	void aireCercle () {
		Cercle cercle1 = new Cercle(20);
		assertEquals(1256.6371f, cercle1.aire());
		
	}
	
	@Test
	void perimetreCercle () {
		Cercle cercle2 = new Cercle(20);
		assertEquals(125.663704f, cercle2.perimetre());
	}
	
	@Test
	void aireRectangle () {
		Polygones polygones1 = new Polygones(10, 5);
		assertEquals(50, polygones1.aire());
	}
	
	@Test
	void perimetreRectangle () {
		Polygones polygones2 = new Polygones(10, 5);
		assertEquals(30, polygones2.perimetre());
	}

}
