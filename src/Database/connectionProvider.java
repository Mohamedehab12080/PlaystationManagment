
package Database;

import java.sql.*;
import javax.swing.JOptionPane;

public class connectionProvider
{
     static Connection con=null;
       public static Connection getCon(){
        try{
              Class.forName("com.mysql.cj.jdbc.Driver");
              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/playstationmanagement","root","25251436");
            return con;
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Message",JOptionPane.ERROR_MESSAGE);
            return null;
        }
        }
}
