package toutobjet;

public class main {

	public static void main(String[] args) {
		Adresse adress=new Adresse(358,"rue poiro",34000,"montpellier");
		CoordonnéesPersonnelles cord1 =new CoordonnéesPersonnelles(066666666,"lalala@lala.com");
		CoordonnéesPro cord2 =new CoordonnéesPro(066666666,"lalala@lala.com","prod",adress);
		
		Cadre norbert=new Cadre("norbert", "delanoait", 1900816745, adress, cord1, "HP007", cord2,212);
		Commercial steven=new Commercial("steven", "spielberg", 1845671254, adress, cord1, "ET034", cord2, 30_000_000);
		Technicien jack=new Technicien("jack", "Nikolson", 1451545454, adress, cord1, "SHINING05", cord2, 0, 0);
		
		System.out.println("Norbert à la chance de toucher " + norbert.salaireBrut() + "Euros Brut par an");
		
		
		//steven.mission();

		System.out.println(steven);
		//System.out.println(jack);
	}


}
