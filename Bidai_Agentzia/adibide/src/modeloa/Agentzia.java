package modeloa;

import java.util.ArrayList;

public class Agentzia {
	
	private int idAgentzia;
	private String izena;
	private String kolorea;
	private String langile_kod;
	private String agentzia_kod;
	private String logo;
	private String erabiltzailea;
	private String pasahitza;
	private ArrayList<Bidaia> Bidaiak=new ArrayList<Bidaia>();
	
	//GETTERS AND SETTERS
	public int getIdAgentzia() {
		return idAgentzia;
	}
	public void setIdAgentzia(int idAgentzia) {
		this.idAgentzia = idAgentzia;
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
	public String getLangile_kod() {
		return langile_kod;
	}
	public void setLangile_kod(String langile_kod) {
		this.langile_kod = langile_kod;
	}
	public String getAgentzia_kod() {
		return agentzia_kod;
	}
	public void setAgentzia_kod(String agentzia_kod) {
		this.agentzia_kod = agentzia_kod;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getErabiltzailea() {
		return erabiltzailea;
	}
	public void setErabiltzailea(String erabiltzailea) {
		this.erabiltzailea = erabiltzailea;
	}
	public String getPasahitza() {
		return pasahitza;
	}
	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}
	public ArrayList<Bidaia> getBidaiak() {
		return Bidaiak;
	}
	public void setBidaiak(ArrayList<Bidaia> bidaiak) {
		Bidaiak = bidaiak;
	}
	
	public void insertarbidaiak(Bidaia b1) {
		Bidaiak.add(b1);
	}
	//TO STRING
	@Override
	public String toString() {
		return "Agentzia [idAgentzia=" + idAgentzia + ", izena=" + izena + ", kolorea=" + kolorea + ", langile_kod="
				+ langile_kod + ", agentzia_kod=" + agentzia_kod + ", logo=" + logo + ", erabiltzailea=" + erabiltzailea
				+ ", pasahitza=" + pasahitza + "]";
	}
	
	//KONSTRUKTOREA
	/*public Agentzia(int idAgentzia, String izena, String kolorea, String langile_kod, String agentzia_kod, String logo,
			String erabiltzailea, String pasahitza, Bidaia[] bidaiak) {
		super();
		this.idAgentzia = idAgentzia;
		this.izena = izena;
		this.kolorea = kolorea;
		this.langile_kod = langile_kod;
		this.agentzia_kod = agentzia_kod;
		this.logo = logo;
		this.erabiltzailea = erabiltzailea;
		this.pasahitza = pasahitza;
		Bidaiak = bidaiak;
	}*/
	
	public Agentzia(String izena, String logo, String kolorea, String erabiltzailea, String pasahitza, String agentziaKod, String langileKod) {
	    this.izena = izena;
	    this.logo = logo;
	    this.kolorea = kolorea;
	    this.erabiltzailea = erabiltzailea;
	    this.pasahitza = pasahitza;
	    this.agentzia_kod = agentziaKod;
	    this.langile_kod = langileKod;
	}

	
	public Agentzia() {
		super();
	}
	

}
