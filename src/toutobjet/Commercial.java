package toutobjet;

public class Commercial extends Employé {
	float chiffreAffaireN_Moin1;
// La on a simplement demander d'afficher "Trouver de nouveaux contacts", ne renvoie rien d'autres
	@Override
	void mission() {
		System.out.println("Trouver de nouveaux contacts");
		
	}

	@Override
	float salaireBrut() {
		return chiffreAffaireN_Moin1*0.05f;
	}

	public Commercial(String nom, String prénom, int numSecu, Adresse adressePersonne,
			CoordonnéesPersonnelles coordonneesPerso, String matricule, CoordonnéesPro coordonneesProf,
			float chiffreAffaireN_Moin1) {
		super(nom, prénom, numSecu, adressePersonne, coordonneesPerso, matricule, coordonneesProf);
		this.chiffreAffaireN_Moin1 = chiffreAffaireN_Moin1;
	}

	@Override
	public String toString() {
		return super.toString()+"\n	"
				+ "Commercial [chiffreAffaireN_Moin1=" + chiffreAffaireN_Moin1 + "]";
	}


	
	
}
