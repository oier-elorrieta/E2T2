package modeloa;

public class Herrialdeak {
	
	private String idHerrialdeak;
	private String herrialdeak;
	 
	//GETTERS AND SETTERS
	public String getIdHerrialdeak() {
		return idHerrialdeak;
	}
	public void setIdHerrialdeak(String idHerrialdeak) {
		this.idHerrialdeak = idHerrialdeak;
	}
	public String getHerrialdeak() {
		return herrialdeak;
	}
	
	//KONSTRUKTOREA
	public void setHerrialdeak(String herrialdeak) {
		this.herrialdeak = herrialdeak;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "Herrialdeak [idHerrialdeak=" + idHerrialdeak + ", herrialdeak=" + herrialdeak + "]";
	}
	public Herrialdeak(String idHerrialdeak, String herrialdeak) {
		super();
		this.idHerrialdeak = idHerrialdeak;
		this.herrialdeak = herrialdeak;
	}
	 
}

