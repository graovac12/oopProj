package entity;

public abstract class Osoba {
	protected String ime,prezime;
	protected int id;
	Osoba(int id, String ime, String prezime)
	{
		this.id=id;
		this.ime=ime;
		this.prezime=prezime;
	}
	Osoba(String ime, String prezime)
	{
		this.ime=ime;
		this.prezime=prezime;
	}
	protected abstract int getId();
	protected abstract void setId(int id);
	protected abstract String getIme();
	protected abstract void setIme(String ime);
	protected abstract String getPrezime();
	protected abstract void setPrezime(String prezime);
}
