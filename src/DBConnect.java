import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

/**
 * Created by eselta on 12/15/15.
 */
public class DBConnect {

    Statement stmt;
    String url = "jdbc:mysql://localhost/CafeDB";
    String sql1, sql2, sql3;
    private static DBConnect dbCon;

    private DBConnect(){
        connect();
    }

    public static DBConnect getInstance()
    {
        if(dbCon != null)
        {
            return dbCon;
        }
        else
        {
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

    public void opretMedarbejder(String fornavn, String efternavn, String adresse, String tlf, String stilling, int løntrin, String kontoNr, String regNr){
        
        sql1 = "INSERT INTO medarbejder(2, 3, 4, 5, 6, 7) VALUES('"+fornavn+"', '"+efternavn+"', '"+adresse+"', '"+tlf+"', '"+stilling+"', '"+løntrin+"')";
        sql2 = "INSERT INTO Konti(2, 3) VALUES('"+kontoNr+"', '"+regNr+"')";
        try{
            stmt.execute(sql1);
            stmt.execute(sql2);
            System.out.println("Medrabejder oprettet");
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void opretLøntrin(String navn, double sats){
        sql1 = "INSERT INTO Løntrin(2, 3) VALUES('"+navn+"','"+sats+"')";
        try{
            stmt.execute(sql1);
            System.out.println("Løntrin Oprettet.");
        }catch(Exception e){
            System.out.println(e);
        }
    }






}