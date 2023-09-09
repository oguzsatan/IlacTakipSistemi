
package ilac_takip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oğuz Kaan Satan
 */
public class Ilac_takip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            System.out.println("Bağlandı");
            Statement s=con.createStatement();
            ResultSet rs =s.executeQuery("SELECT * FROM ilac");
        } catch (SQLException ex) {
            Logger.getLogger(Ilac_takip.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
