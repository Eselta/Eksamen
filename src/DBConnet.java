import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

/**
 * Created by eselta on 12/15/15.
 */
public class DBConnet {

    Statement stmt;
    String url = "jdbc:mysql://localhost/CafeDB";
    String sql1, sql2, sql3;

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
        connect();
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

    public void opretLøntrin(){
        
    }






}