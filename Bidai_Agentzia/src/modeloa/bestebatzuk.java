package modeloa;

public class bestebatzuk {

	private String izena;
	private String deskribapena;
	private int data;
	private int prezioa;
	/**
	 * @param izena
	 * @param deskribapena
	 * @param data
	 * @param prezioa
	 */
	public bestebatzuk(String izena, String deskribapena, int data, int prezioa) {
		super();
		this.izena = izena;
		this.deskribapena = deskribapena;
		this.data = data;
		this.prezioa = prezioa;
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
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getPrezioa() {
		return prezioa;
	}
	public void setPrezioa(int prezioa) {
		this.prezioa = prezioa;
	}
	
	@Override
	public String toString() {
		return "bestebatzuk [izena=" + izena + ", deskribapena=" + deskribapena + ", data=" + data + ", prezioa="
				+ prezioa + "]";
	}
}
