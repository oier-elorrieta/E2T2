package modeloa;

public class bidaia {

	private int identifikatzailea;
	private String izena;
	private String deskribapena;
	private String mota;
	private int datak;
	private int iraupen;
	private String helmugaHerri;
	private String herriDeskribapena;
	
	/**
	 * @param identifikatzailea
	 * @param izena
	 * @param deskribapena
	 * @param mota
	 * @param datak
	 * @param iraupen
	 * @param helmugaHerri
	 * @param herriDeskribapena
	 */
	
	public bidaia(int identifikatzailea, String izena, String deskribapena, String mota, int datak, int iraupen,
			String helmugaHerri, String herriDeskribapena) {
		super();
		this.identifikatzailea = identifikatzailea;
		this.izena = izena;
		this.deskribapena = deskribapena;
		this.mota = mota;
		this.datak = datak;
		this.iraupen = iraupen;
		this.helmugaHerri = helmugaHerri;
		this.herriDeskribapena = herriDeskribapena;
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
	public String getDeskribapena() {
		return deskribapena;
	}
	public void setDeskribapena(String deskribapena) {
		this.deskribapena = deskribapena;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public int getDatak() {
		return datak;
	}
	public void setDatak(int datak) {
		this.datak = datak;
	}
	public int getIraupen() {
		return iraupen;
	}
	public void setIraupen(int iraupen) {
		this.iraupen = iraupen;
	}
	public String getHelmugaHerri() {
		return helmugaHerri;
	}
	public void setHelmugaHerri(String helmugaHerri) {
		this.helmugaHerri = helmugaHerri;
	}
	public String getHerriDeskribapena() {
		return herriDeskribapena;
	}
	public void setHerriDeskribapena(String herriDeskribapena) {
		this.herriDeskribapena = herriDeskribapena;
	}
	
	@Override
	public String toString() {
		return "bidaia [identifikatzailea=" + identifikatzailea + ", izena=" + izena + ", deskribapena=" + deskribapena
				+ ", mota=" + mota + ", datak=" + datak + ", iraupen=" + iraupen + ", helmugaHerri=" + helmugaHerri
				+ ", herriDeskribapena=" + herriDeskribapena + "]";
	}
	
}
