package entity;

public class OsobljePredstave {
	private int id;
	private Osoblje osoblje;
	private Predstava predstava;
	
	public OsobljePredstave(int id,Osoblje osoblje, Predstava predstava)
	{
		this.id=id;
		this.osoblje=osoblje;
		this.predstava=predstava;
	}
	public OsobljePredstave(Osoblje osoblje, Predstava predstava)
	{
		this.osoblje=osoblje;
		this.predstava=predstava;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "OsobljePredstave [id=" + id + ", osoblje=" + osoblje + ", predstava=" + predstava + "]";
	}
	public void setId(int id) {
		this.id = id;
	}

	public Osoblje getOsoblje() {
		return osoblje;
	}
	public void setOsoblje(Osoblje osoblje) {
		this.osoblje = osoblje;
	}
	public Predstava getPredstava() {
		return predstava;
	}
	public void setPredstava(Predstava predstava) {
		this.predstava = predstava;
	}
}
