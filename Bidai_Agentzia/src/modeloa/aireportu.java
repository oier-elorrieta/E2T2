package modeloa;

public class aireportu {

	private int identifikatzailea;
	private String hiria;
	
	/**
	 * @param identifikatzailea
	 * @param hiria
	 */
	
	public aireportu(int identifikatzailea, String hiria) {
		super();
		this.identifikatzailea = identifikatzailea;
		this.hiria = hiria;
	}
	
	//GETTERS AND SETTERS
	public int getIdentifikatzailea() {
		return identifikatzailea;
	}
	public void setIdentifikatzailea(int identifikatzailea) {
		this.identifikatzailea = identifikatzailea;
	}
	public String getIzena() {
		return hiria;
	}
	public void setIzena(String izena) {
		this.hiria = izena;
	}
	
	@Override
	public String toString() {
		return "aireportu [identifikatzailea=" + identifikatzailea + ", hiria=" + hiria + "]";
	}
}
