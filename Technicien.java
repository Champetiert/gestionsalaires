package toutobjet;

public class Technicien extends Employé {


	int nbHeures;
	int tauxHoraire;

	float salaireBrut() {
		return this.nbHeures * this.tauxHoraire;
	}

	void mission() {
		System.out.println("Fabriquer et controler les produits de l'entreprise");
	}
	public Technicien(String nom, String prénom, int numSecu, Adresse adressePersonne,
			CoordonnéesPersonnelles coordonneesPerso, String matricule, CoordonnéesPro coordonneesProf, int nbHeures,
			int tauxHoraire) {
		super(nom, prénom, numSecu, adressePersonne, coordonneesPerso, matricule, coordonneesProf);
		this.nbHeures = nbHeures;
		this.tauxHoraire = tauxHoraire;
	}
}
