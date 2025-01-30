package modeloa;

public class Aireportua {
	
	private String idAireportua;
	private String aireportua;
	
	//GETTERS AND SETTERS
	public String getIdAireportua() {
		return idAireportua;
	}
	public void setIdAireportua(String idAireportua) {
		this.idAireportua = idAireportua;
	}
	public String getAireportua() {
		return aireportua;
	}
	public void setAireportua(String aireportua) {
		this.aireportua = aireportua;
	}
	
	//KONTRUKTOREA
	public Aireportua(String idAireportua, String aireportua) {
		super();
		this.idAireportua = idAireportua;
		this.aireportua = aireportua;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "Aireportua [idAireportua=" + idAireportua + ", aireportua=" + aireportua + "]";
	}
	
}
