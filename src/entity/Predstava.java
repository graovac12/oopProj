package entity;

public class Predstava {
	@Override
	public String toString() {
		return "Predstava [id=" + id + ", naziv=" + naziv + ", zanr=" + zanr + "]";
	}
	private int id;
	private String naziv;
	private Zanr zanr;
	
	public Predstava(String naziv, Zanr zanr)
	{
		this.naziv=naziv;
		this.zanr=zanr;
	}
	public Predstava(int id, String naziv, int zanr)
	{
		this.id=id;
		this.naziv=naziv;
		this.zanr=Zanr.vratiPremaBroju(zanr);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Zanr getZanr() {
		return zanr;
	}
	public void setZanr(Zanr zanr) {
		this.zanr = zanr;
	}
}
