import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by eselta on 12/15/15.
 */
public class DBConnect {

    private Statement stmt;
    private String url = "jdbc:mysql://localhost/CafeDB";
    private String sql1, sql2;
    private static DBConnect dbCon;

    //Private constructor for at sikre at der kun er den ene forbindelse til databasen, Singleton.
    private DBConnect(){
        connect();
    }

    public static DBConnect getInstance(){
        if(dbCon != null){
            return dbCon;
        }else{
            dbCon = new DBConnect();
        }
        return dbCon;
    }

    public void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "");
            //System.out.println(url);
            //System.out.println(con);

            stmt = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }


    }

    //alle funktioner der involvere at oprette eller slette data i tdatabasen
    public void opretMedarbejder(String fornavn, String efternavn, String adresse, String tlf, String stilling, String løntrin, String kontoNr, String regNr){

        sql1 = "INSERT INTO medarbejder(2, 3, 4, 5, 6, 7) VALUES('"+fornavn+"', '"+efternavn+"', '"+adresse+"', '"+tlf+"', '"+stilling+"', '"+løntrin+"')";

        try{
            stmt.execute(sql1);
            ResultSet rs = stmt.executeQuery("SELECT ID FROM medarbejder WHERE Fornavn LIKE '"+fornavn+"' AND WHERE Efternavn LIKE'"+efternavn+"' AND Adresse LIKE '"+adresse+"' AND Telefon_Nr LIKE '"+tlf+"'");
            int id = rs.getInt("ID");
            sql2 = "INSERT INTO Konti(1, 2, 3) VALUES('"+id+"','"+kontoNr+"', '"+regNr+"')";
            stmt.execute(sql2);
            System.out.println("Medrabejder oprettet");
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void opretLøntrin(String navn, int sats){
        sql1 = "INSERT INTO Løntrin VALUES(NULL, '"+navn+"','"+sats+"')";
        try{
            stmt.execute(sql1);
            System.out.println("Løntrin Oprettet.");
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void sletMedarbejder(String fornavn, String efternavn){
        try{
            sql2 = "DELETE FROM medarbejder WHERE ID = "+hentId(fornavn, efternavn)+"";
            stmt.execute(sql2);
            System.out.println("medarbejder slettet");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    //-----------------------------------------------------------------------------------
    //alle funktioner til at hente data ud af database starter her
    public List<String> hentNavne(){
        List<String> navneListe = new ArrayList<>();
        sql1 = "SELECT Fornavn, Efternavn FROM medarbejder";
        try{
            ResultSet set = stmt.executeQuery(sql1);
            while(set.next()){
                String nuværendeRække = set.getString(1)+" "+set.getString(2);
                navneListe.add(nuværendeRække);
            }

        }catch (Exception e){
            System.out.println(e);
        }
        return navneListe;
    }

    public int hentId(String fornavn, String efternavn){
        String Id = null;
        int id = 0;
        sql1 = "SELECT ID FROM medarbejder WHERE Fornavn LIKE '"+fornavn+"' AND Efternavn LIKE'"+efternavn+"'";
        try{
            ResultSet set = stmt.executeQuery(sql1);
            while(set.next()){
                Id = set.getString(1);
            }
            id = Integer.parseInt(Id);
        }catch (Exception e){
            System.out.println(e);
        }
        return id;

    }

    public String hentadresse(String fornavn, String efternavn){
        String adresse = null;
        sql1 = "SELECT Adresse FROM medarbejder WHERE ID = "+hentId(fornavn, efternavn)+"";
        try{
            ResultSet rs = stmt.executeQuery(sql1);
            while(rs.next()){
                adresse = rs.getString(1);
            }
        }catch (Exception e){
            System.out.println(e);
        }

        return adresse;
    }

    public String hentTelefonNr(String fornavn, String efternavn){
        String adresse = null;
        sql1 = "SELECT Telefon_nr FROM medarbejder WHERE ID = "+hentId(fornavn, efternavn)+"";
        try{
            ResultSet rs = stmt.executeQuery(sql1);
            while(rs.next()){
                adresse = rs.getString(1);
            }
        }catch (Exception e){
            System.out.println(e);
        }

        return adresse;
    }

    public String hentRegNr(String fornavn, String efternavn){
        String reg = null;
        sql1 = "SELECT reg_nr FROM Konti WHERE ID = "+hentId(fornavn, efternavn)+"";
        try{
            ResultSet rs = stmt.executeQuery(sql1);
            while(rs.next()){
                reg = rs.getString(1);
            }
        }catch (Exception e){
            System.out.println(e);
        }

        return reg;
    }

    public String hentKontoNr(String fornavn, String efternavn){
        String konto = null;
        sql1 = "SELECT konto_nr FROM Konti WHERE ID = "+hentId(fornavn, efternavn)+"";
        try{
            ResultSet rs = stmt.executeQuery(sql1);
            while(rs.next()){
                konto = rs.getString(1);
            }
        }catch (Exception e){
            System.out.println(e);
        }

        return konto;
    }

    public List<String> hentLøntrin(){
        sql1 = "SELECT trinNavn FROM Løntrin";
        List<String> løntrin = new ArrayList<>();
        try{
            ResultSet rs = stmt.executeQuery(sql1);
            while(rs.next()){
                String temp = rs.getString(1);
                løntrin.add(temp);
            }

        }catch(Exception e){
            System.out.println(e);
        }
        return løntrin;
    }

    public String hentStilling(String fornavn, String efternavn){
        String stilling = null;
        sql1 = "SELECT Stilling FROM medarbejder WHERE ID = '"+hentId(fornavn, efternavn)+"'";
        try{
            ResultSet rs = stmt.executeQuery(sql1);
            while(rs.next()){
                stilling = rs.getString(1);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return stilling;
    }
    //-----------------------------------------------------------------------------------

    //alle funktioner til at redigere i databasen findes herunder

    public void redigerMedarbejder(String fornavn, String efternavn, String adresse, String tlf,
                                   String stilling, String løntrin, String kontoNr, String regNr){

        sql1 = "UPDATE medarbejder SET Fornavn='"+fornavn+"', Efternavn ='"+efternavn+"', Adresse ='"+adresse+"', " +
                "Telefon_nr ='"+tlf+"', Stilling ='"+stilling+"', Løntrin ='"+løntrin+"' WHERE ID = "+hentId(fornavn, efternavn)+"";


        sql2 = "UPDATE Konti SET Konto_nr = '"+kontoNr+"', Reg_nr = '"+regNr+"' WHERE ID = "+hentId(fornavn, efternavn)+"";

        try{
            stmt.execute(sql1);
            stmt.execute(sql2);
        }catch (Exception e){
            System.out.println(e);
        }
    }

}