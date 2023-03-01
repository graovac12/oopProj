package run;

import java.util.ArrayList;


import baza.Database;
import entity.IzvodjenjePredstave;
import entity.Karta;
import entity.Osoblje;
import entity.OsobljePredstave;
import entity.PosjetilacPozorista;
import entity.Pozoriste;
import entity.Predstava;
import entity.RadnikPozorista;
import entity.Status;
import entity.Zanr;
import java.util.Date;


public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		/*ArrayList<Osoblje> l = Database.getOsoblje();
        
        for(Osoblje osoblje: l){
        	System.out.println(osoblje);
        }
		
        Osoblje o = new Osoblje("Zdravko", "Coli", 6);
        Database.addOsoblje(o);
        l = Database.getOsoblje();
        
        for(Osoblje osoblje: l){
        	System.out.println(osoblje);
        	
        	
        }*/
		//PosjetilacPozorista p=new PosjetilacPozorista("Marko","Marko","marko123","1234");
		//tabase.addPosjetilacPozorista(p);
		System.out.println(Database.getRadnikPozorista(1));
		Date datum=new Date();
		datum.setYear(2023-1900);
		datum.setMonth(7-1);
		datum.setDate(21);
		datum.setHours(14);
		datum.setMinutes(00);
		datum.setSeconds(00);
		//Database.addIzvodjenjePredstave(new IzvodjenjePredstave(Database.getPredstava(1),Database.getPozoriste(1),4000,datum));	
		//System.out.println(Database.getIzvodjenjePredstave(6));	
		Database.addKarta(new Karta(Database.getIzvodjenjePredstave(5),Status.K_NE_KORISTECI_AP,Database.getPosjetilacPozorista(1),1));
		System.out.println(Database.getKarta(1));
    }
}
