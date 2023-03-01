package entity;

import java.util.ArrayList;

public class Karta {
	public static ArrayList<Karta> sveKarte;
	private int id,brojKarta;
	
	private Status status;
	private PosjetilacPozorista posjetilacPozorista;
	private IzvodjenjePredstave izvodjenjePredstave;
	public Karta(int id,IzvodjenjePredstave izvodjenje, Status status,PosjetilacPozorista posjetilac, int BrojKarta)
	{
		this.id=id;
		this.izvodjenjePredstave=izvodjenje;
		this.posjetilacPozorista=posjetilac;
		this.brojKarta=BrojKarta;
		this.status=status;
	}
	public Karta(IzvodjenjePredstave izvodjenje,Status status ,PosjetilacPozorista posjetilac, int BrojKarta)
	{
		this.izvodjenjePredstave=izvodjenje;
		this.posjetilacPozorista=posjetilac;
		this.brojKarta=BrojKarta;
		this.status=status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getBrojKarta() {
		return brojKarta;
	}
	public void setBrojKarta(int BrojKarta) {
		this.brojKarta = BrojKarta;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public static ArrayList<Karta> getSveKarte() {
		return sveKarte;
	}
	public static void setSveKarte(ArrayList<Karta> sveKarte) {
		Karta.sveKarte = sveKarte;
	}
	public PosjetilacPozorista getPosjetilacPozorista() {
		return posjetilacPozorista;
	}
	public void setPosjetilacPozorista(PosjetilacPozorista posjetilacPozorista) {
		this.posjetilacPozorista = posjetilacPozorista;
	}
	public IzvodjenjePredstave getIzvodjenjePredstave() {
		return izvodjenjePredstave;
	}
	public void setIzvodjenjePredstave(IzvodjenjePredstave izvodjenjePredstave) {
		this.izvodjenjePredstave = izvodjenjePredstave;
	}
	@Override
	public String toString() {
		return "Karta [id=" + id + ", brojKarta=" + brojKarta + ", status=" + status + ", posjetilacPozorista="
				+ posjetilacPozorista + ", izvodjenjePredstave=" + izvodjenjePredstave + "]";
	}
	
}
