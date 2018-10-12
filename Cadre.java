package toutobjet;

public class Cadre extends Employé {
	public int nbjTravaille;
	public int tauxJournalier=300;
	
	@Override
	void mission() {
		System.out.println("Gerer les projets");
	}

	@Override
	public float salaireBrut() {
		return nbjTravaille*tauxJournalier;
	}

	public Cadre(String nom,String prenom,int secu,Adresse adressePersonne, CoordonnéesPersonnelles coordonneesPerso,String matricule,CoordonnéesPro coordonneesProf,int nbjTravaille) {
		super(nom, prenom, secu, adressePersonne, coordonneesPerso, matricule, coordonneesProf);
		this.nbjTravaille = nbjTravaille;
	}
	
	

}
