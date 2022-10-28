
package databaseConnection;
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnect {
    public static Connection con;
    public static Statement st;
    static{
        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingdb"+"?useSSL=false&allowPublicKeyRetrieval=true","root","tiger");
           st=con.createStatement();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
        }
    }
    
}
