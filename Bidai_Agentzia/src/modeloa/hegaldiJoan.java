package modeloa;

public class hegaldiJoan{

	private String jatorriAireport;
	private String helmugAireport;
	private int hegaldiKod;
	private String airelinea;
	private int prezioa;
	private int irteeraData;
	private int irteeraordu;
	private int bidaiIraupen;
	
	/**
	 * @param jatorriAireport
	 * @param helmugAireport
	 * @param hegaldiKod
	 * @param airelinea
	 * @param prezioa
	 * @param irteeraData
	 * @param irteeraordu
	 * @param bidaiIraupen
	 */
	
	public hegaldiJoan(String jatorriAireport, String helmugAireport, int hegaldiKod, String airelinea, int prezioa,
			int irteeraData, int irteeraordu, int bidaiIraupen) {
		super();
		this.jatorriAireport = jatorriAireport;
		this.helmugAireport = helmugAireport;
		this.hegaldiKod = hegaldiKod;
		this.airelinea = airelinea;
		this.prezioa = prezioa;
		this.irteeraData = irteeraData;
		this.irteeraordu = irteeraordu;
		this.bidaiIraupen = bidaiIraupen;
	}
	public String getJatorriAireport() {
		return jatorriAireport;
	}
	public void setJatorriAireport(String jatorriAireport) {
		this.jatorriAireport = jatorriAireport;
	}
	public String getHelmugAireport() {
		return helmugAireport;
	}
	public void setHelmugAireport(String helmugAireport) {
		this.helmugAireport = helmugAireport;
	}
	public int getHegaldiKod() {
		return hegaldiKod;
	}
	public void setHegaldiKod(int hegaldiKod) {
		this.hegaldiKod = hegaldiKod;
	}
	public String getAirelinea() {
		return airelinea;
	}
	public void setAirelinea(String airelinea) {
		this.airelinea = airelinea;
	}
	public int getPrezioa() {
		return prezioa;
	}
	public void setPrezioa(int prezioa) {
		this.prezioa = prezioa;
	}
	public int getIrteeraData() {
		return irteeraData;
	}
	public void setIrteeraData(int irteeraData) {
		this.irteeraData = irteeraData;
	}
	public int getIrteeraordu() {
		return irteeraordu;
	}
	public void setIrteeraordu(int irteeraordu) {
		this.irteeraordu = irteeraordu;
	}
	public int getBidaiIraupen() {
		return bidaiIraupen;
	}
	public void setBidaiIraupen(int bidaiIraupen) {
		this.bidaiIraupen = bidaiIraupen;
	}
	
	@Override
	public String toString() {
		return "hegaldiJoan [jatorriAireport=" + jatorriAireport + ", helmugAireport=" + helmugAireport
				+ ", hegaldiKod=" + hegaldiKod + ", airelinea=" + airelinea + ", prezioa=" + prezioa + ", irteeraData="
				+ irteeraData + ", irteeraordu=" + irteeraordu + ", bidaiIraupen=" + bidaiIraupen + "]";
	}
}
