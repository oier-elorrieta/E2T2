package modeloa;

import java.util.Date;

public class Ekitaldi {

	private String ekitaldi_id;
	private String bidai_id;
	private String izena;
	private String bidai_mota;
	//hegaldi
	private String jatorriAireport;
	private String helmugAireport;
	private Date irteeraData;
	private int hegaldiKodJoan;
	private int irteeraordu;
	private String joanAirelinea;
	private int prezioaJoan;
	private String joanIraupen;
	
	private String jatorriAireportBuel;
	private String helmugAireportBuel;
	private Date irteeraDataBuel;
	private int hegaldiKodBuel;
	private int irteeraorduBuel;
	private String EtorAirelinea;
	private int prezioaBuel;
	private String EtorIraupen;
	//ostatua
	private String hiria;
	private int sarreraEgun;
	private int irteeraEgun;
	private String logela_kod;
	private int prezioaOstatua;
	//beste batzuk
	private String deskribapena;
	private int data;
	
	//GETTERS AND SETTERS
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
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public String getBidai_mota() {
		return bidai_mota;
	}
	public void setBidai_mota(String bidai_mota) {
		this.bidai_mota = bidai_mota;
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
	public Date getIrteeraData() {
		return irteeraData;
	}
	public void setIrteeraData(Date irteeraData) {
		this.irteeraData = irteeraData;
	}
	public int getHegaldiKodJoan() {
		return hegaldiKodJoan;
	}
	public void setHegaldiKodJoan(int hegaldiKodJoan) {
		this.hegaldiKodJoan = hegaldiKodJoan;
	}
	public int getIrteeraordu() {
		return irteeraordu;
	}
	public void setIrteeraordu(int irteeraordu) {
		this.irteeraordu = irteeraordu;
	}
	public String getJoanAirelinea() {
		return joanAirelinea;
	}
	public void setJoanAirelinea(String joanAirelinea) {
		this.joanAirelinea = joanAirelinea;
	}
	public int getPrezioaJoan() {
		return prezioaJoan;
	}
	public void setPrezioaJoan(int prezioaJoan) {
		this.prezioaJoan = prezioaJoan;
	}
	public String getJoanIraupen() {
		return joanIraupen;
	}
	public void setJoanIraupen(String joanIraupen) {
		this.joanIraupen = joanIraupen;
	}
	public String getJatorriAireportBuel() {
		return jatorriAireportBuel;
	}
	public void setJatorriAireportBuel(String jatorriAireportBuel) {
		this.jatorriAireportBuel = jatorriAireportBuel;
	}
	public String getHelmugAireportBuel() {
		return helmugAireportBuel;
	}
	public void setHelmugAireportBuel(String helmugAireportBuel) {
		this.helmugAireportBuel = helmugAireportBuel;
	}
	public Date getIrteeraDataBuel() {
		return irteeraDataBuel;
	}
	public void setIrteeraDataBuel(Date irteeraDataBuel) {
		this.irteeraDataBuel = irteeraDataBuel;
	}
	public int getHegaldiKodBuel() {
		return hegaldiKodBuel;
	}
	public void setHegaldiKodBuel(int hegaldiKodBuel) {
		this.hegaldiKodBuel = hegaldiKodBuel;
	}
	public int getIrteeraorduBuel() {
		return irteeraorduBuel;
	}
	public void setIrteeraorduBuel(int irteeraorduBuel) {
		this.irteeraorduBuel = irteeraorduBuel;
	}
	public String getEtorAirelinea() {
		return EtorAirelinea;
	}
	public void setEtorAirelinea(String etorAirelinea) {
		EtorAirelinea = etorAirelinea;
	}
	public int getPrezioaBuel() {
		return prezioaBuel;
	}
	public void setPrezioaBuel(int prezioaBuel) {
		this.prezioaBuel = prezioaBuel;
	}
	public String getEtorIraupen() {
		return EtorIraupen;
	}
	public void setEtorIraupen(String etorIraupen) {
		EtorIraupen = etorIraupen;
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
	public String getLogela_kod() {
		return logela_kod;
	}
	public void setLogela_kod(String logela_kod) {
		this.logela_kod = logela_kod;
	}
	public int getPrezioaOstatua() {
		return prezioaOstatua;
	}
	public void setPrezioaOstatua(int prezioaOstatua) {
		this.prezioaOstatua = prezioaOstatua;
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
	
	//KONSTRUKTOREA
	public Ekitaldi(String ekitaldi_id, String bidai_id, String izena, String bidai_mota, String jatorriAireport,
			String helmugAireport, Date irteeraData, int hegaldiKodJoan, int irteeraordu, String joanAirelinea,
			int prezioaJoan, String joanIraupen, String jatorriAireportBuel, String helmugAireportBuel,
			Date irteeraDataBuel, int hegaldiKodBuel, int irteeraorduBuel, String etorAirelinea, int prezioaBuel,
			String etorIraupen, String hiria, int sarreraEgun, int irteeraEgun, String logela_kod, int prezioaOstatua,
			String deskribapena, int data) {
		super();
		this.ekitaldi_id = ekitaldi_id;
		this.bidai_id = bidai_id;
		this.izena = izena;
		this.bidai_mota = bidai_mota;
		this.jatorriAireport = jatorriAireport;
		this.helmugAireport = helmugAireport;
		this.irteeraData = irteeraData;
		this.hegaldiKodJoan = hegaldiKodJoan;
		this.irteeraordu = irteeraordu;
		this.joanAirelinea = joanAirelinea;
		this.prezioaJoan = prezioaJoan;
		this.joanIraupen = joanIraupen;
		this.jatorriAireportBuel = jatorriAireportBuel;
		this.helmugAireportBuel = helmugAireportBuel;
		this.irteeraDataBuel = irteeraDataBuel;
		this.hegaldiKodBuel = hegaldiKodBuel;
		this.irteeraorduBuel = irteeraorduBuel;
		EtorAirelinea = etorAirelinea;
		this.prezioaBuel = prezioaBuel;
		EtorIraupen = etorIraupen;
		this.hiria = hiria;
		this.sarreraEgun = sarreraEgun;
		this.irteeraEgun = irteeraEgun;
		this.logela_kod = logela_kod;
		this.prezioaOstatua = prezioaOstatua;
		this.deskribapena = deskribapena;
		this.data = data;
	}
	
	//to string
	@Override
	public String toString() {
		return "Ekitaldi [ekitaldi_id=" + ekitaldi_id + ", bidai_id=" + bidai_id + ", izena=" + izena + ", bidai_mota="
				+ bidai_mota + ", jatorriAireport=" + jatorriAireport + ", helmugAireport=" + helmugAireport
				+ ", irteeraData=" + irteeraData + ", hegaldiKodJoan=" + hegaldiKodJoan + ", irteeraordu=" + irteeraordu
				+ ", joanAirelinea=" + joanAirelinea + ", prezioaJoan=" + prezioaJoan + ", joanIraupen=" + joanIraupen
				+ ", jatorriAireportBuel=" + jatorriAireportBuel + ", helmugAireportBuel=" + helmugAireportBuel
				+ ", irteeraDataBuel=" + irteeraDataBuel + ", hegaldiKodBuel=" + hegaldiKodBuel + ", irteeraorduBuel="
				+ irteeraorduBuel + ", EtorAirelinea=" + EtorAirelinea + ", prezioaBuel=" + prezioaBuel
				+ ", EtorIraupen=" + EtorIraupen + ", hiria=" + hiria + ", sarreraEgun=" + sarreraEgun
				+ ", irteeraEgun=" + irteeraEgun + ", logela_kod=" + logela_kod + ", prezioaOstatua=" + prezioaOstatua
				+ ", deskribapena=" + deskribapena + ", data=" + data + "]";
	}
	public Ekitaldi() {
		super();
	}
	
	
	
}
