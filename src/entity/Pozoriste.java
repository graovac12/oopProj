package entity;

import java.util.ArrayList;
import java.util.HashSet;


public class Pozoriste implements Comparable<Pozoriste>{
	private static HashSet<Pozoriste> svaPozorista;
	private int id;
	private String naziv,grad;
	private int brojSjedista;
	
	public Pozoriste(int id,String naziv, String grad,int brojSjedista)
	{
		this.id=id;
		this.naziv=naziv;
		this.grad=grad;
	}
	public Pozoriste(String naziv,String grad,int brojSjedista)
	{
		this.naziv=naziv;
		this.grad=grad;
	}
	public int getId()
	{
		return this.id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setNaziv(String naziv)
	{
		this.naziv=naziv;
	}
	public String getNaziv()
	{
		return naziv;
	}
	public String getGrad() {
		return grad;
	}
	public void setGrad(String grad) {
		this.grad = grad;
	}
	public int getBrojSjedista() {
		return brojSjedista;
	}
	public void setBrojSjedista(int brojSjedista) {
		this.brojSjedista = brojSjedista;
	}
	@Override
	public String toString() {
		return "Pozoriste [id=" + id + ", naziv=" + naziv + ", grad=" + grad + ", brojSjedista=" + brojSjedista + "]";
	}
	public int compareTo(Pozoriste o) {
		if(this.id==o.getId()&&this.getGrad().trim().compareTo(o.getGrad().trim())==0&&this.getNaziv().trim().compareTo(o.getGrad().trim())==0&&this.id==o.id)
			return 0;
		else
			return -1;
	}
}
