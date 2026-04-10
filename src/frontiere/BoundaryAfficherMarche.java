package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		String[] infoMarche = controlAfficherMarche.donnerInfoMarche();
		if (infoMarche.length == 0) {
			System.out.println("Le marché est vide, revenez plus tard.");
		} else {
			System.out.println(nomAcheteur + ", vous trouverez au marché :");
			for (int i = 0; i < infoMarche.length; i++) {
				System.out.println("vendeur = " + infoMarche[i]);
				i++;
				System.out.println("Quantité = " + infoMarche[i]);
				i++;
				System.out.println("produit = " + infoMarche[i]);
			}
		}
	}
}
