package toutobjet;

public abstract class Employé extends Personne{
	String matricule;
	CoordonnéesPro coordonneesProf;

	abstract void mission();
	abstract float salaireBrut();
	float salaireNet() {
		return (float) (salaireBrut() * 0.76);
	}
	public Employé(String nom, String prénom, int numSecu, Adresse adressePersonne,
			CoordonnéesPersonnelles coordonneesPerso, String matricule, 
			CoordonnéesPro coordonneesProf) {
		super(nom, prénom, numSecu, adressePersonne, coordonneesPerso);
		this.matricule = matricule;
		this.coordonneesProf = coordonneesProf;
	}
	@Override
	public String toString() {
		return "Employé "+ prénom +" "+ nom +" de matricule " + matricule +" et de numéro de Secu " + numSecu+ "\n"
				+ " coordonneesProf=" + coordonneesProf  
	 			+ " adressePersonne=" + adressePersonne 
				+ " coordonneesPerso="+ coordonneesPerso ;
	}
	
	
	
	
}
