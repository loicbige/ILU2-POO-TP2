package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}
	
	public void libererEtal(String nomVendeur) {
		if (!controlLibererEtal.isVendeur(nomVendeur)) {
			System.out.println("Mais vous n'êtes même pas inscrit sur notre marché aujoud'hui !");
		} else {
			String[] donneesEtal = controlLibererEtal.libererEtal(nomVendeur);
			
			String etalOccupe = donneesEtal[0];
			if (etalOccupe.equals("true")) {
				System.out.println("Vous avez vendu "+ donneesEtal[4] + " " +donneesEtal[2] + " sur "+donneesEtal[3]+".");
				System.out.println("Au revoir "+ nomVendeur +", passez une bonne journée");
			}
		}
		
		
	}

}
