package toutobjet;

public class Personne {
	String nom;
	String prénom;
	int numSecu;
	Adresse adressePersonne;
	CoordonnéesPersonnelles coordonneesPerso;
	public Personne(String prénom, String nom, int numSecu, Adresse adressePersonne,
			CoordonnéesPersonnelles coordonneesPerso) {
		this.nom = nom;
		prénom = prénom;
		this.numSecu = numSecu;
		this.adressePersonne = adressePersonne;
		this.coordonneesPerso = coordonneesPerso;
	}
	
	// this : permets d'appeler l'élément de cet classe la particulièrement. Au cas ou il y en a d'autres se qui porterait à confusion
}
