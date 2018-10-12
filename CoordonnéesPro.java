package toutobjet;

public class CoordonnéesPro extends CoordonnéesPersonnelles {
	String service;
	Adresse adresseEntreprise;
	
	public CoordonnéesPro(int numeroDeTel, String mail) {
		super(numeroDeTel, mail);
		// TODO Auto-generated constructor stub
	}

	public CoordonnéesPro(int numeroDeTel, String mail, String service, Adresse adresseEntreprise) {
		super(numeroDeTel, mail);
		this.service = service;
		this.adresseEntreprise = adresseEntreprise;
	}
	
	
	
}
