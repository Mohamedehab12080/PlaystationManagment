
package Controller;

import Database.connectionProvider;
import Database.dbOperations;
import Model.UserModel;
import java.sql.*;
import javax.swing.JOptionPane;

public class userCruds 
{

public static void addUser(UserModel user)
{
   Connection con=null;
   PreparedStatement ps=null;
    try {
        con=connectionProvider.getCon();
        ps=con.prepareStatement("insert into users (name,username,password) values (?,?,?)");
        ps.setString(1, user.getName());
        ps.setString(2, user.getUsername());
        ps.setString(3, user.getPassword());
    } catch (Exception e) {
       JOptionPane.showMessageDialog(null, e);
    }
}

public static UserModel Login(String username,String password)
    {
        UserModel user=null;
        try {
            ResultSet rs=dbOperations.getData("select * from users where username='"+username+"' and password='"+password+"'");
            if(rs.next())
            {
                user=new UserModel();
                user.setName(rs.getString("name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
}
