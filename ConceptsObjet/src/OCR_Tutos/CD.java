package OCR_Tutos;

// classe OCR
public class CD implements Comparable {
	private String auteur, titre;
	private double prix;
	
	public CD(String auteur, String titre, double prix) {
		this.auteur = auteur;
		this.titre = titre;
		this.prix = prix;
	}

	public String toString() {
		return "CD [auteur : " + auteur + ", titre : " + titre + ", prix : " + prix
				+ "]";
	}

	public String getAuteur() {
		return auteur;
	}

	public String getTitre() {
		return titre;
	}

	public double getPrix() {
		return prix;
	}

	@Override
	public int compareTo(Object o) {
		if(o.getClass().equals(CD.class)){
			//Nous allons trier sur le nom d'artiste
			CD cd = (CD)o;
			//Si les deux CD ont le même auteur, on trie sur le nom de l'album
			if(this.auteur.compareTo(cd.getAuteur()) == 0)
				return this.titre.compareTo(cd.getTitre());
			return this.auteur.compareTo(cd.getAuteur());
		}
		return -1;
	}
//	public int compareTo(Object o) {
//		if(o.getClass().equals(CD.class)) {
//			CD cd = (CD)o;
//			String aut = cd.getAuteur();
//			Integer res = this.getAuteur().compareTo(aut);
//			if(res!=0) { // l'auteur n'est pas le même
//				return res;
//			} else {
//				// on compare les nom des CD
//				String disc = cd.getTitre();
//				return this.getTitre().compareTo(disc);
//			}
//
//			System.out.println("erreur");
//			return -1;
//		}
//		return 0;
//	}
	
}