package modeloa;

public class agentzia {

	private int identifikatzailea;
	private String izena;
	private String kolorea;
	private int langKop;
	private String mota;
	
	/**
	 * @param identifikatzailea
	 * @param izena
	 * @param kolorea
	 * @param langKop
	 * @param mota
	 */
	public agentzia(int identifikatzailea, String izena, String kolorea, int langKop, String mota) {
		super();
		this.identifikatzailea = identifikatzailea;
		this.izena = izena;
		this.kolorea = kolorea;
		this.langKop = langKop;
		this.mota = mota;
	}
	
	//GETTERS AND SETTERS
	public int getIdentifikatzailea() {
		return identifikatzailea;
	}
	public void setIdentifikatzailea(int identifikatzailea) {
		this.identifikatzailea = identifikatzailea;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public String getKolorea() {
		return kolorea;
	}
	public void setKolorea(String kolorea) {
		this.kolorea = kolorea;
	}
	public int getLangKop() {
		return langKop;
	}
	public void setLangKop(int langKop) {
		this.langKop = langKop;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	
	@Override
	public String toString() {
		return "agentzia [identifikatzailea=" + identifikatzailea + ", izena=" + izena + ", kolorea=" + kolorea
				+ ", langKop=" + langKop + ", mota=" + mota + "]";
	}
	
}
