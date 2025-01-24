package modeloa;

public class hegaldiJoanEtorri {
	private String jatorriAireport;
	private String helmugAireport;
	private int hegaldiKod;
	private String airelinea;
	private int prezioa;
	private int irteeraData;
	private int irteeraordu;
	private int bidaiIraupen;
	private int iztuleraData;
	private int itzuleraOrdu;
	private int bultaIraupen;
	private String bueltaAirelinea;
	
	/**
	 * @param jatorriAireport
	 * @param helmugAireport
	 * @param hegaldiKod
	 * @param airelinea
	 * @param prezioa
	 * @param irteeraData
	 * @param irteeraordu
	 * @param bidaiIraupen
	 * @param iztuleraData
	 * @param itzuleraOrdu
	 * @param bultaIraupen
	 * @param bueltaAirelinea
	 */
	
	public hegaldiJoanEtorri(String jatorriAireport, String helmugAireport, int hegaldiKod, String airelinea,
			int prezioa, int irteeraData, int irteeraordu, int bidaiIraupen, int iztuleraData, int itzuleraOrdu,
			int bultaIraupen, String bueltaAirelinea) {
		super();
		this.jatorriAireport = jatorriAireport;
		this.helmugAireport = helmugAireport;
		this.hegaldiKod = hegaldiKod;
		this.airelinea = airelinea;
		this.prezioa = prezioa;
		this.irteeraData = irteeraData;
		this.irteeraordu = irteeraordu;
		this.bidaiIraupen = bidaiIraupen;
		this.iztuleraData = iztuleraData;
		this.itzuleraOrdu = itzuleraOrdu;
		this.bultaIraupen = bultaIraupen;
		this.bueltaAirelinea = bueltaAirelinea;
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

	public int getIztuleraData() {
		return iztuleraData;
	}

	public void setIztuleraData(int iztuleraData) {
		this.iztuleraData = iztuleraData;
	}

	public int getItzuleraOrdu() {
		return itzuleraOrdu;
	}

	public void setItzuleraOrdu(int itzuleraOrdu) {
		this.itzuleraOrdu = itzuleraOrdu;
	}

	public int getBultaIraupen() {
		return bultaIraupen;
	}

	public void setBultaIraupen(int bultaIraupen) {
		this.bultaIraupen = bultaIraupen;
	}

	public String getBueltaAirelinea() {
		return bueltaAirelinea;
	}

	public void setBueltaAirelinea(String bueltaAirelinea) {
		this.bueltaAirelinea = bueltaAirelinea;
	}

	@Override
	public String toString() {
		return "hegaldiJoanEtorri [jatorriAireport=" + jatorriAireport + ", helmugAireport=" + helmugAireport
				+ ", hegaldiKod=" + hegaldiKod + ", airelinea=" + airelinea + ", prezioa=" + prezioa + ", irteeraData="
				+ irteeraData + ", irteeraordu=" + irteeraordu + ", bidaiIraupen=" + bidaiIraupen + ", iztuleraData="
				+ iztuleraData + ", itzuleraOrdu=" + itzuleraOrdu + ", bultaIraupen=" + bultaIraupen
				+ ", bueltaAirelinea=" + bueltaAirelinea + "]";
	}
}
