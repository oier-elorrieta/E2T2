package modeloa;

public class Hiria {

		private String izena;
		private String deskribapena;
		
		public Hiria(String izena, String deskribapena) {
			super();
			this.izena = izena;
			this.deskribapena = deskribapena;
		}

		public String getIzena() {
			return izena;
		}

		public void setIzena(String izena) {
			this.izena = izena;
		}

		public String getDeskribapena() {
			return deskribapena;
		}

		public void setDeskribapena(String deskribapena) {
			this.deskribapena = deskribapena;
		}

		@Override
		public String toString() {
			return "Hiria [izena=" + izena + ", deskribapena=" + deskribapena + "]";
		}
		
}
