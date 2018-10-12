package toutobjet;

public class CoordonnéesPersonnelles {
		int numeroDeTel;
		String mail;
		
		public CoordonnéesPersonnelles(int numeroDeTel, String mail) {
			this.numeroDeTel = numeroDeTel;
			this.mail = mail;
		}

		@Override
		public String toString() {
			return "Tel=" + numeroDeTel + ", mail=" + mail+"\n";
		}
		
		
		
}
