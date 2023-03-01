package entity;

public class PosjetilacPozorista extends Osoba {
	private String korisnickoIme,lozinka;
	
	public PosjetilacPozorista(int id, String ime, String prezime, String korisnickoIme,String lozinka)
	{
		super(id,ime,prezime);
		this.korisnickoIme=korisnickoIme;
		this.lozinka=lozinka;
	}
	public PosjetilacPozorista(String ime, String prezime, String korisnickoIme,String lozinka)
	{
		super(ime,prezime);
		this.korisnickoIme=korisnickoIme;
		this.lozinka=lozinka;
	}
	@Override
	public String toString() {
		return "PosjetilacPozorista [korisnickoIme=" + korisnickoIme + ", lozinka=" + lozinka + "]";
	}
	public String getKorisnickoIme() {
		return korisnickoIme;
	}
	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}
	public String getLozinka() {
		return lozinka;
	}
	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id=id;
		
	}
		public String getIme() {
			return ime;
	}
	
	public void setIme(String ime) {
	
		this.ime=ime;
	}
		
	public String getPrezime() {
		
		return prezime;
	}
	public void setPrezime(String prezime) {
		
		this.prezime=prezime;
	}
}
