package baza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import entity.Status;
import entity.IzvodjenjePredstave;
import entity.Karta;
import entity.Osoblje;
import entity.OsobljePredstave;
import entity.Pozoriste;
import entity.Predstava;
import entity.RadnikPozorista;
import entity.PosjetilacPozorista;
public class Database {
	private static ArrayList<Pozoriste> svaPozorista=getPozoriste();
	private static ArrayList<PosjetilacPozorista> sviPosjetioci=getPosjetilacPozorista();
	private static ArrayList<Predstava> svePredstave=getPredstava();
	private static ArrayList<Osoblje> osoblje=getOsoblje();
	private static String DB_user = "root";
	private static String DB_password = "1234";
	private static String connectionUrl;
	private static int port = 3306;
	private static String DB_name = "projektni";
	private static Connection connection;
	
	public static void DBConnect() throws SQLException {
		connectionUrl = "jdbc:mysql://localhost" + ":" + port + "/" + DB_name;
		connection = DriverManager.getConnection(connectionUrl, DB_user, DB_password);
	}
	
	public static ArrayList<Osoblje> getOsoblje() {
		
		ArrayList<Osoblje> l = new ArrayList<Osoblje>();
		ResultSet resultSet = null;
		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "SELECT * FROM osoblje";
            resultSet = statement.executeQuery(SQLQuery);
            
            while (resultSet.next()) {
            	Osoblje o = new Osoblje(
            			resultSet.getInt("id"),
            			resultSet.getString("ime"),
            			resultSet.getString(3),
            			Integer.parseInt(resultSet.getString(4)));
            	l.add(o);
            }
            
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
	}
	
	public static Osoblje getOsoblje(int id) {
		
		Osoblje o = null;
		ResultSet resultSet = null;
		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "SELECT * FROM osoblje WHERE id="+id;
            resultSet = statement.executeQuery(SQLQuery);
            
            while (resultSet.next()) {
            	o = new Osoblje(
            			resultSet.getInt("id"),
            			resultSet.getString("ime"),
            			resultSet.getString(3),
            			Integer.parseInt(resultSet.getString(4)));
            }
            
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return o;
	}
	
	public static void addOsoblje(Osoblje o) {
		
		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "INSERT INTO osoblje (ime, prezime, tip) VALUE ("
					+ "'" + o.getIme() + "', "
					+ "'" + o.getPrezime() + "', "
					+ o.getTip() + ")";
			System.out.println(SQLQuery);
            statement.executeUpdate(SQLQuery);
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Predstava getPredstava(int id)
	{
		Predstava o = null;
		ResultSet resultSet = null;
		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "SELECT * FROM predstava WHERE id="+id;
            resultSet = statement.executeQuery(SQLQuery);
            
            while (resultSet.next()) {
            	o = new Predstava(
            			resultSet.getInt("id"),
            			resultSet.getString("naziv"),
            			resultSet.getInt("zanr"));
            }
            
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return o;
	}
	public static ArrayList<Predstava> getPredstava()
	{
		ArrayList<Predstava> o = new ArrayList<Predstava>();
		ResultSet resultSet = null;
		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "SELECT * FROM predstava";
            resultSet = statement.executeQuery(SQLQuery);
            
            while (resultSet.next()) {
            	Predstava p = new Predstava(
            			resultSet.getInt("id"),
            			resultSet.getString("naziv"),
            			resultSet.getInt("zanr"));
            	o.add(p);
            }
            
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return o;
	}
	public static void addPredstava(Predstava o)
	{

		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "INSERT INTO predstava (naziv,zanr) VALUE ("
					+ "'" + o.getNaziv() + "', "
					+ "'" + o.getZanr().getBr() + "')";
			System.out.println(SQLQuery);
            statement.executeUpdate(SQLQuery);
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Pozoriste getPozoriste(int id)
	{
		Pozoriste o = null;
		ResultSet resultSet = null;
		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "SELECT * FROM pozoriste WHERE id="+id;
            resultSet = statement.executeQuery(SQLQuery);
            
            while (resultSet.next()) {
            	o = new Pozoriste(
            			resultSet.getInt("id"),
            			resultSet.getString("naziv"),
            			resultSet.getString("grad"),
            			resultSet.getInt("broj_sjedista"));
            }
            
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return o;
	}
	public static ArrayList<Pozoriste> getPozoriste()
	{
		ArrayList<Pozoriste> o = new ArrayList<Pozoriste>();
		ResultSet resultSet = null;
		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "SELECT * FROM pozoriste";
            resultSet = statement.executeQuery(SQLQuery);
            
            while (resultSet.next()) {
            	Pozoriste p = new Pozoriste(
            			resultSet.getInt("id"),
            			resultSet.getString("naziv"),
            			resultSet.getString("grad"),
            			resultSet.getInt("broj_sjedista"));
            	o.add(p);
            }
            
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return o;
	}
	public static void addPozoriste(Pozoriste o)
	{
		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "INSERT INTO pozoriste (naziv,grad,broj_sjedista) VALUE ("
					+ "'" + o.getNaziv() + "', "
					+ "'" + o.getGrad() +"',"
					+o.getBrojSjedista() +")";
			System.out.println(SQLQuery);
            statement.executeUpdate(SQLQuery);
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static PosjetilacPozorista getPosjetilacPozorista(int id)
	{
		PosjetilacPozorista o = null;
		ResultSet resultSet = null;
		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "SELECT * FROM posjetilac_pozorista WHERE id="+id;
            resultSet = statement.executeQuery(SQLQuery);
            
            while (resultSet.next()) {
            	o = new PosjetilacPozorista(
            			resultSet.getInt("id"),
            			resultSet.getString("ime"),
            			resultSet.getString("prezime"),
            			resultSet.getString("korisincko_ime"),
            			resultSet.getString("lozinka"));
            }
            
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return o;
	}
	public static ArrayList<PosjetilacPozorista> getPosjetilacPozorista()
	{
		ArrayList<PosjetilacPozorista> o = new ArrayList<PosjetilacPozorista>();
		ResultSet resultSet = null;
		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "SELECT * FROM posjetilac_pozorista";
            resultSet = statement.executeQuery(SQLQuery);
            
            while (resultSet.next()) {
            	PosjetilacPozorista p = new PosjetilacPozorista(
            			resultSet.getInt("id"),
            			resultSet.getString("ime"),
            			resultSet.getString("prezime"),
            			resultSet.getString("korisincko_ime"),
            			resultSet.getString("lozinka"));
            	o.add(p);
            }
            
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return o;
	}
	public static void addPosjetilacPozorista(PosjetilacPozorista o)
	{
		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "INSERT INTO posjetilac_pozorista (ime,prezime,korisincko_ime,lozinka) VALUE ("
					+ "'" + o.getIme() + "', "
					+ "'" + o.getPrezime() +"', '"
					+o.getKorisnickoIme() +"', '"
					+o.getLozinka()+"')";
			System.out.println(SQLQuery);
            statement.executeUpdate(SQLQuery);
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static OsobljePredstave getOsobljePredstave(int id)
	{
		OsobljePredstave o = null;	
		ResultSet resultSet = null;
		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "SELECT * FROM osoblje_predstave WHERE id="+id;
            resultSet = statement.executeQuery(SQLQuery);
            
            while (resultSet.next()) {
            	o = new OsobljePredstave(
            			resultSet.getInt("id"),
            			Database.getOsoblje(resultSet.getInt("osoblje_id")),
            			Database.getPredstava(resultSet.getInt("predstava_id")));
            }
            
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return o;
	}
	
	public static ArrayList<OsobljePredstave> getOsobljePredstave()
	{
		ArrayList<OsobljePredstave> o = new ArrayList<OsobljePredstave>();
		ResultSet resultSet = null;
		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "SELECT * FROM osoblje_predstave";
            resultSet = statement.executeQuery(SQLQuery);
            
            while (resultSet.next()) {
            	OsobljePredstave p = new OsobljePredstave(
            			resultSet.getInt("id"),
            			Database.getOsoblje(resultSet.getInt("osoblje_id")),
            			Database.getPredstava(resultSet.getInt("predstava_id")));
            	o.add(p);
            }
            
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return o;
	}
	public static void addOsobljePredstave(OsobljePredstave o)
	{
		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "INSERT INTO osoblje_predstave (osoblje_id,predstava_id) VALUE ("
					+ "'" + o.getOsoblje().getId() + "', "
					+ "'" + o.getPredstava().getId() +"')";
			System.out.println(SQLQuery);
            statement.executeUpdate(SQLQuery);
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static  RadnikPozorista getRadnikPozorista(int id)
	{
		RadnikPozorista o = null;	
		ResultSet resultSet = null;
		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "SELECT * FROM radnik_pozorista WHERE id="+id;
            resultSet = statement.executeQuery(SQLQuery);
            
            while (resultSet.next()) {
            	o = new RadnikPozorista(
            			resultSet.getInt("id"),
            			Database.getPozoriste(resultSet.getInt("pozoriste_id")),
            			resultSet.getString("ime"),
            			resultSet.getString("prezime"),
            			resultSet.getString("korisnicko_ime"),
            			resultSet.getString("lozinka"));
            }
            
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return o;
	}
	public static ArrayList<RadnikPozorista> getRadnikPozorista()
	{
			
		ResultSet resultSet = null;
		ArrayList<RadnikPozorista> l=new ArrayList<RadnikPozorista>();
		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "SELECT * FROM radnik_pozorista";
            resultSet = statement.executeQuery(SQLQuery);
            
            while (resultSet.next()) {
            	RadnikPozorista o = new RadnikPozorista(
            			resultSet.getInt("id"),
            			Database.getPozoriste(resultSet.getInt("pozoriste_id")),
            			resultSet.getString("ime"),
            			resultSet.getString("prezime"),
            			resultSet.getString("korisnicko_ime"),
            			resultSet.getString("lozinka"));
            	l.add(o);
            }
            
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
	}
	public static void addRadnikPozorista(RadnikPozorista o)
	{
		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "INSERT INTO radnik_pozorista (pozoriste_id,ime,prezime,korisnicko_ime,lozinka) VALUE ("
					+ "'" + o.getPozoristeId().getId() + "', "
					+ "'" + o.getIme()+ "', "
					+ "'" + o.getPrezime() + "', "
					+ "'" + o.getKorisnickoIme() + "', "
					+ "'" + o.getLozinka() +"')";
			System.out.println(SQLQuery);
            statement.executeUpdate(SQLQuery);
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	public static IzvodjenjePredstave getIzvodjenjePredstave(int id)
	{
		IzvodjenjePredstave o = null;	
		ResultSet resultSet = null;
		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "SELECT * FROM izvodjenje_predstave WHERE id="+id;
            resultSet = statement.executeQuery(SQLQuery);
            
            while (resultSet.next()) {
            	GregorianCalendar c=new GregorianCalendar();
            	int y=Integer.parseInt(resultSet.getString("datum_i_vrijeme").substring(0,4));
            	int m=Integer.parseInt(resultSet.getString("datum_i_vrijeme").substring(5,7));
            	int d=Integer.parseInt(resultSet.getString("datum_i_vrijeme").substring(8,10));
            	int hh=Integer.parseInt(resultSet.getString("datum_i_vrijeme").substring(11,13));
            	int mm=Integer.parseInt(resultSet.getString("datum_i_vrijeme").substring(14,16));
            	c.set(y, m, d, hh, mm);
            	o = new IzvodjenjePredstave(
            			resultSet.getInt("id"),
            			Database.getPredstava(resultSet.getInt("predstava_id")),
            			Database.getPozoriste(resultSet.getInt("pozoriste_id")),
            			resultSet.getFloat("cijena"),
            			c);
            }
            
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return o;
	}
	public static ArrayList<IzvodjenjePredstave> getIzvodjenjePredstave()
	{
		
		ResultSet resultSet = null;
		ArrayList<IzvodjenjePredstave> l=new ArrayList<IzvodjenjePredstave>();
		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "SELECT * FROM izvodjenje_predstave";
			java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            resultSet = statement.executeQuery(SQLQuery);
            
            while (resultSet.next()) {
            	GregorianCalendar c=new GregorianCalendar();
            	int y=Integer.parseInt(resultSet.getString("datum_i_vrijeme").substring(0,4));
            	int m=Integer.parseInt(resultSet.getString("datum_i_vrijeme").substring(5,7));
            	int d=Integer.parseInt(resultSet.getString("datum_i_vrijeme").substring(9,11));
            	int hh=Integer.parseInt(resultSet.getString("datum_i_vrijeme").substring(13,15));
            	int mm=Integer.parseInt(resultSet.getString("datum_i_vrijeme").substring(17,19));
            	c.set(y, m, d, hh, mm);
            	java.sql.Date datum=resultSet.getDate("datum_i_vrijeme");
            	IzvodjenjePredstave o = new IzvodjenjePredstave(
            			resultSet.getInt("id"),
            			Database.getPredstava(resultSet.getInt("predstava_id")),
            			Database.getPozoriste(resultSet.getInt("pozoriste_id")),
            			resultSet.getFloat("cijena"),
            			c);
            	l.add(o);
            	
            }
            
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
	}
	public static void addIzvodjenjePredstave(IzvodjenjePredstave o)
	{
		try {
			DBConnect();
			java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			String datum=sdf.format(o.getDatumVrijeme());
			Statement statement = connection.createStatement();
			String SQLQuery = "INSERT INTO izvodjenje_predstave (predstava_id,pozoriste_id,cijena,datum_i_vrijeme) VALUE ("
					+ "'" + o.getPredstava().getId() + "', "
					+ "'" + o.getPozoriste().getId() +"', '"
					+o.getCijena() +"', '"
					+datum+"')";
			System.out.println(SQLQuery);
            statement.executeUpdate(SQLQuery);
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Karta getKarta(int id)
	{
		Karta o = null;	
		ResultSet resultSet = null;
		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "SELECT * FROM karta WHERE id="+id;
            resultSet = statement.executeQuery(SQLQuery);
            
            while (resultSet.next()) {
            	o = new Karta(
            			resultSet.getInt("id"),
            			Database.getIzvodjenjePredstave((resultSet.getInt("izvodjenje_predstave_id"))),
            			Status.getStatusBroj(resultSet.getInt("status")),
            			Database.getPosjetilacPozorista(resultSet.getInt("posjetilac_id")),
            			resultSet.getInt("broj_karta"));
            }
            
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return o;
	}
	
	public static ArrayList<Karta> getKarta()
	{
		ResultSet resultSet = null;
		ArrayList<Karta> l=new ArrayList<Karta>();
		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "SELECT * FROM karta";
            resultSet = statement.executeQuery(SQLQuery);
            
            while (resultSet.next()) {
            	Karta o = new Karta(
            			resultSet.getInt("id"),
            			Database.getIzvodjenjePredstave((resultSet.getInt("izvodjenje_predstave_id"))),
            			Status.getStatusBroj(resultSet.getInt("status")),
            			Database.getPosjetilacPozorista(resultSet.getInt("posjetilac_id")),
            			resultSet.getInt("broj_karta"));
            	l.add(o);
            }
            
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
	}
	public static void addKarta(Karta o) {
		try {
			DBConnect();
			Statement statement = connection.createStatement();
			String SQLQuery = "INSERT INTO karta (izvodjenje_predstave_id,status,posjetilac_id,broj_karta) VALUE ("
					+ "'" + o.getIzvodjenjePredstave().getId() + "', "
					+ "'" + o.getStatus().getBr()+ "', "
					+ "'" + o.getPosjetilacPozorista().getId() + "', "
					+ "'" + o.getBrojKarta() +"')";
			System.out.println(SQLQuery);
            statement.executeUpdate(SQLQuery);
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
}
