package modeloa;

public class Hiria {

	private String idHirira;
	private String hiria;
	
	//GETTERS AND SETTERS
	public String getIdHirira() {
		return idHirira;
	}
	public void setIdHirira(String idHirira) {
		this.idHirira = idHirira;
	}
	public String getHiria() {
		return hiria;
	}
	public void setHiria(String hiria) {
		this.hiria = hiria;
	}
	
	//KONSTRUKTOREA
	public Hiria(String idHirira, String hiria) {
		super();
		this.idHirira = idHirira;
		this.hiria = hiria;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "Hiria [idHirira=" + idHirira + ", hiria=" + hiria + "]";
	}
}
