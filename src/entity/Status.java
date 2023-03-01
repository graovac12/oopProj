package entity;

public enum Status {
	K_NE_KORISTECI_AP(0),
	R_NIJE_PREUZETA(1),
	R_PREUZETA(2),
	NEAKTIVNO(3);
	int br;
	Status(int br)
	{
		this.br=br;
	}
	public static Status getStatusBroj(int br)
	{
		switch(br)
		{
		case 0: return Status.K_NE_KORISTECI_AP;
		case 1: return Status.R_NIJE_PREUZETA;
		case 2: return Status.R_PREUZETA;
		default: return Status.NEAKTIVNO;
		}
	}
	public int getBr() {
		return br;
	}
	public void setBr(int br) {
		this.br = br;
	}
	@Override
	public String toString() {
		switch(this.br)
		{
		case 0: return "Kupljena putem aplikacije";
		case 1: return "Rezervacija nije preuzeta";
		case 2: return "Rezervacija preuzeta";
		default: return null;
		}
	}
	
}
