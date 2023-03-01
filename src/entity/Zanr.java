package entity;

public enum Zanr {
	KOMEDIJA(0),
	FARSA(1),
	SATIRA(2),
	KOMEDIJA_RESTAURACIJE(3),
	TRAGEDIJA(4),
	ISTORIJA(5),
	MJUZIKL(6);
	
	private int br;
	Zanr(int br)
	{
		this.setBr(br);
	}
	public static Zanr vratiPremaBroju(int br)
	{
		switch(br) {
			case 0: return Zanr.KOMEDIJA;
			case 1: return Zanr.FARSA;
			case 2: return Zanr.SATIRA;
			case 3: return Zanr.KOMEDIJA_RESTAURACIJE;
			case 4: return Zanr.TRAGEDIJA;
			case 5: return Zanr.ISTORIJA;
			case 6: return Zanr.MJUZIKL;
			default: return null;
	}
	}
	
	public int getBr() {
		return br;
	}
	public void setBr(int br) {
		this.br = br;
	}
	public String toString()
	{
		switch(this.br)
		{
		case 0: return "Komedija";
		case 1: return "Farsa";
		case 2: return "Satira";
		case 3: return "Komedija restauracije";
		case 4: return "Tragedija";
		case 5: return "Istorija";
		case 6: return "Mjuzikl";
		default: return null;
		}
	}
}
