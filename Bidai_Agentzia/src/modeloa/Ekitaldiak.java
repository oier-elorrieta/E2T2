package modeloa;

public class Ekitaldiak {
	 
	private String ekitaldi_id;
	private String bidai_id;
	//hegaldi
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
	//ostatua
	private String izena;
	private String hiria;
	private int sarreraEgun;
	private int irteeraEgun;
	private String logelaMota;
	//beste batzuk
	private String deskribapena;
	private int data;
	public String getEkitaldi_id() {
		return ekitaldi_id;
	}
	public void setEkitaldi_id(String ekitaldi_id) {
		this.ekitaldi_id = ekitaldi_id;
	}
	public String getBidai_id() {
		return bidai_id;
	}
	public void setBidai_id(String bidai_id) {
		this.bidai_id = bidai_id;
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
	
	@Override
	public String toString() {
		return "ekitaldiak [ekitaldi_id=" + ekitaldi_id + ", bidai_id=" + bidai_id + ", jatorriAireport="
				+ jatorriAireport + ", helmugAireport=" + helmugAireport + ", hegaldiKod=" + hegaldiKod + ", airelinea="
				+ airelinea + ", prezioa=" + prezioa + ", irteeraData=" + irteeraData + ", irteeraordu=" + irteeraordu
				+ ", bidaiIraupen=" + bidaiIraupen + ", iztuleraData=" + iztuleraData + ", itzuleraOrdu=" + itzuleraOrdu
				+ ", bultaIraupen=" + bultaIraupen + ", bueltaAirelinea=" + bueltaAirelinea + ", izena=" + izena
				+ ", hiria=" + hiria + ", sarreraEgun=" + sarreraEgun + ", irteeraEgun=" + irteeraEgun + ", logelaMota="
				+ logelaMota + ", deskribapena=" + deskribapena + ", data=" + data + "]";
	}
	
	public Ekitaldiak(String ekitaldi_id, String bidai_id, String jatorriAireport, String helmugAireport,
			int hegaldiKod, String airelinea, int prezioa, int irteeraData, int irteeraordu, int bidaiIraupen,
			int iztuleraData, int itzuleraOrdu, int bultaIraupen, String bueltaAirelinea, String izena, String hiria,
			int sarreraEgun, int irteeraEgun, String logelaMota, String deskribapena, int data) {
		super();
		this.ekitaldi_id = ekitaldi_id;
		this.bidai_id = bidai_id;
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
		this.izena = izena;
		this.hiria = hiria;
		this.sarreraEgun = sarreraEgun;
		this.irteeraEgun = irteeraEgun;
		this.logelaMota = logelaMota;
		this.deskribapena = deskribapena;
		this.data = data;
	}
	
	
	
	
	
	
	
}
