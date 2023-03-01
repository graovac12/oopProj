package entity;

public class Osoblje extends Osoba{
	
		private int tip;
	
	public Osoblje(String ime, String prezime, int tip){
		super(ime,prezime);
		this.setTip(tip);
	}
	
	public Osoblje(int id, String ime, String prezime, int tip){
		super(id,ime,prezime);
		this.setTip(tip);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getTip() {
		return tip;
	}
	public void setTip(int tip) {
		this.tip = tip;
	}
	public String toString(){
		return this.getIme() + " " + this.getPrezime();
	}
}
