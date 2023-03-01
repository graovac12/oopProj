package entity;

public class RadnikPozorista extends Osoba{
	private Pozoriste pozoristeId;
	private String korisnickoIme,lozinka;
	public RadnikPozorista(int id,Pozoriste pozoristeId,String ime, String prezime, String korisnickoIme,String lozinka)
	{
		super(id,ime,prezime);
		this.pozoristeId=pozoristeId;
		this.korisnickoIme=korisnickoIme;
		this.lozinka=lozinka;
	}
	public RadnikPozorista(Pozoriste pozoristeId,String ime, String prezime, String korisnickoIme,String lozinka)
	{
		super(ime,prezime);
		this.pozoristeId=pozoristeId;
		this.korisnickoIme=korisnickoIme;
		this.lozinka=lozinka;
		
	}
	
	public int getId() {
		return id;
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
	public void setKorisnickoIme(String korisnickoIme)
	{
		this.korisnickoIme=korisnickoIme;
	}
	public String getKorisnickoIme()
	{
		return korisnickoIme;
	}
	public void setLozinka(String lozinka)
	{
		this.lozinka=lozinka;
	}
	public String getLozinka()
	{
		return this.lozinka;
	}
	public void setPozoristeId(Pozoriste pozoristeId)
	{
		this.pozoristeId=pozoristeId;
	}
	public Pozoriste getPozoristeId()
	{
		return this.pozoristeId;
	}
	@Override
	public String toString() {
		return "RadnikPozorista [pozoristeId=" + pozoristeId + ", korisnickoIme=" + korisnickoIme + ", lozinka="
				+ lozinka + "]";
	}
	
}
