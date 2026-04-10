package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import villagegaulois.Village;

class ControlLibererEtalTest {
	private Village village;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	@BeforeEach
	public void init() {
		village = new Village("Village des irréductible", 5,10);
		controlTrouverEtalVendeur = new ControlTrouverEtalVendeur(village);
	}

	
	@Test
	void testControleLibererEtale() {
		ControlLibererEtal controlLibererEtal = new ControlLibererEtal(controlTrouverEtalVendeur);
		assertNull(controlLibererEtal, "constructor null");
	}
	
	@Test
	void testIsVendeur() {
		ControlLibererEtal controlLibererEtal = new ControlLibererEtal(controlTrouverEtalVendeur);
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		controlEmmenager.ajouterGaulois("Bonemine", 5);
	}
}
