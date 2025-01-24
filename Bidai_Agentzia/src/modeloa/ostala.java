package modeloa;

public class ostala{
	
	private String izena;
	private String hiria;
	private int prezioa;
	private int sarreraEgun;
	private int irteeraEgun;
	private String logelaMota;
	/**
	 * @param izena
	 * @param hiria
	 * @param prezioa
	 * @param sarreraEgun
	 * @param irteeraEgun
	 * @param logelaMota
	 */
	public ostala(String izena, String hiria, int prezioa, int sarreraEgun, int irteeraEgun, String logelaMota) {
		super();
		this.izena = izena;
		this.hiria = hiria;
		this.prezioa = prezioa;
		this.sarreraEgun = sarreraEgun;
		this.irteeraEgun = irteeraEgun;
		this.logelaMota = logelaMota;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public String getHiria() {
		return hiria;
	}
	public void setHiria(String hiria) {
		this.hiria = hiria;
	}
	public int getPrezioa() {
		return prezioa;
	}
	public void setPrezioa(int prezioa) {
		this.prezioa = prezioa;
	}
	public int getSarreraEgun() {
		return sarreraEgun;
	}
	public void setSarreraEgun(int sarreraEgun) {
		this.sarreraEgun = sarreraEgun;
	}
	public int getIrteeraEgun() {
		return irteeraEgun;
	}
	public void setIrteeraEgun(int irteeraEgun) {
		this.irteeraEgun = irteeraEgun;
	}
	public String getLogelaMota() {
		return logelaMota;
	}
	public void setLogelaMota(String logelaMota) {
		this.logelaMota = logelaMota;
	}
	
	@Override
	public String toString() {
		return "ostala [izena=" + izena + ", hiria=" + hiria + ", prezioa=" + prezioa + ", sarreraEgun=" + sarreraEgun
				+ ", irteeraEgun=" + irteeraEgun + ", logelaMota=" + logelaMota + "]";
	}	
}
