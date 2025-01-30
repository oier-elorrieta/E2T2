package modeloa;

import java.util.Date;

public class Bidaia {
	private int identifikatzailea;
	private String izena;
	private String deskribapena;
	private String mota;
	private Date dataJoan;
	private Date dataEtor;
	private int iraupenJoan;
	private int iraupenEtor;
	private String helmugaHerri;
	private String herriDeskribapena;
	private Ekitaldi[] ekitaldiak;
	
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
	
	public Date getDataJoan() {
		return dataJoan;
	}
	public void setDataJoan(Date dataJoan) {
		this.dataJoan = dataJoan;
	}
	public Date getDataEtor() {
		return dataEtor;
	}
	public void setDataEtor(Date dataEtor) {
		this.dataEtor = dataEtor;
	}
	public int getIraupenJoan() {
		return iraupenJoan;
	}
	public void setIraupenJoan(int iraupenJoan) {
		this.iraupenJoan = iraupenJoan;
	}
	public int getIraupenEtor() {
		return iraupenEtor;
	}
	public void setIraupenEtor(int iraupenEtor) {
		this.iraupenEtor = iraupenEtor;
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
	public Ekitaldi[] getEkitaldiak() {
		return ekitaldiak;
	}
	public void setEkitaldiak(Ekitaldi[] ekitaldiak) {
		this.ekitaldiak = ekitaldiak;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "Bidaia [identifikatzailea=" + identifikatzailea + ", izena=" + izena + ", deskribapena=" + deskribapena
				+ ", mota=" + mota + ", dataJoan=" + dataJoan + ", dataEtor=" + dataEtor + ", iraupenJoan="
				+ iraupenJoan + ", iraupenEtor=" + iraupenEtor + ", helmugaHerri=" + helmugaHerri
				+ ", herriDeskribapena=" + herriDeskribapena + "]";
	}
	
	//KONSTRUKTOREA
	public Bidaia(int identifikatzailea, String izena, String deskribapena, String mota, Date dataJoan, Date dataEtor,
			int iraupenJoan, int iraupenEtor, String helmugaHerri, String herriDeskribapena, Ekitaldi[] ekitaldiak) {
		super();
		this.identifikatzailea = identifikatzailea;
		this.izena = izena;
		this.deskribapena = deskribapena;
		this.mota = mota;
		this.dataJoan = dataJoan;
		this.dataEtor = dataEtor;
		this.iraupenJoan = iraupenJoan;
		this.iraupenEtor = iraupenEtor;
		this.helmugaHerri = helmugaHerri;
		this.herriDeskribapena = herriDeskribapena;
		this.ekitaldiak = ekitaldiak;
	}
	
	
	
	
	
}
