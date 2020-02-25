package mavenTest;

import junit.framework.TestCase;

public class MainTest extends TestCase {
	private CalculMetier calc;
	protected void setUp() throws Exception {
		super.setUp();
		calc = new CalculMetier();
	}
	public void testSomme() {
		assertTrue(calc.somme(9, 10) == 19);
	}
	public void testProduit() {
		assertTrue(calc.produit(9, 10) == 90);
	}
}
