package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		
		if (!controlPrendreEtal.verifierIdentite(nomVendeur)) {
		System.out.println("Je suis désolé " + nomVendeur + " mais il faut être un habitant de notre village pour commercer ici.\n");
		} else {
			System.out.println("Bonjour " + nomVendeur + ", je vais regarder si je peux vous trouver une étal.");
			
			if (!controlPrendreEtal.resteEtals()) {
				System.out.println("Désolé " + nomVendeur + " je n'ai plus d'étal qui ne soit pas déjà occupé.");
			} else {
				installerVendeur(nomVendeur);
			}
		}
	}

	private void installerVendeur(String nomVendeur) {
		System.out.println("C'est parfait, il me reste une étal pour vous!");
		
		StringBuilder question = new StringBuilder();
		question.append("Il me faudrait quelques renseignement.\n");
		question.append("Quel produit souhaitez-vous vendre ?\n");
		String produit = Clavier.entrerChaine(question.toString());
		
		int quantity = Clavier.entrerEntier("Combien souhaitez-vous en vendre ?");
		int numeroEtal = controlPrendreEtal.prendreEtal(nomVendeur, produit, quantity);
		if (numeroEtal != -1) {
			System.out.println("Le vendeur "+ nomVendeur +" s'est installé à l'étal n°" + numeroEtal );
		}
	}
}
