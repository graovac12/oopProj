package entity;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class IzvodjenjePredstave {
	private int id;
	private Predstava predstava;
	private Pozoriste pozoriste;
	private float cijena;
	private GregorianCalendar datumVrijeme;
	public IzvodjenjePredstave(int id,Predstava predstava,Pozoriste pozoriste, float cijena, GregorianCalendar datumVrijeme)
	{
		this.id=id;
		this.predstava=predstava;
		this.pozoriste=pozoriste;
		this.cijena=cijena;
		this.datumVrijeme=datumVrijeme;
	}
	public IzvodjenjePredstave(Predstava predstava,Pozoriste pozoriste, float cijena, GregorianCalendar datumVrijeme)
	{
		this.predstava=predstava;
		this.pozoriste=pozoriste;
		this.cijena=cijena;
		this.datumVrijeme=datumVrijeme;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Predstava getPredstava() {
		return predstava;
	}
	public void setPredstava(Predstava predstava) {
		this.predstava = predstava;
	}
	public Pozoriste getPozoriste() {
		return pozoriste;
	}
	public void setPozoriste(Pozoriste pozoriste) {
		this.pozoriste = pozoriste;
	}
	@SuppressWarnings("deprecation")
	@Override
	public String toString() {
	
		return "IzvodjenjePredstave [id=" + id + ", predstava=" + predstava + ", pozoriste=" + pozoriste + ", cijena="
				+ cijena + ", datumVrijeme=" + datumVrijeme.get(Calendar.DATE)+ " "+ datumVrijeme.get(Calendar.MONTH)+ " "+ datumVrijeme.get(Calendar.YEAR)+ " "
						+ datumVrijeme.get(Calendar.HOUR_OF_DAY)+ " "+ datumVrijeme.get(Calendar.MINUTE)+ "]";
	}
	public float getCijena() {
		return cijena;
	}
	public void setCijena(float cijena) {
		this.cijena = cijena;
	}
	public GregorianCalendar getDatumVrijeme() {
		return datumVrijeme;
	}
	public void setDatumVrijeme(GregorianCalendar datumVrijeme) {
		this.datumVrijeme = datumVrijeme;
	}
	
	
}
