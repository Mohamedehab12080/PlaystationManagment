
package Controller;

import Database.connectionProvider;
import Database.dbOperations;
import java.sql.*;
import Model.productsModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class productsCruds {
    
    
    public static void addProduct(productsModel products)
    {
        Connection con=null;
        PreparedStatement ps=null;
        try {
            con=connectionProvider.getCon();
            ps=con.prepareStatement("insert into Products(productname,price) values(?,?)");
            ps.setString(1, products.getProductname());
            ps.setFloat(2,products.getPrice());
           int result =ps.executeUpdate();
           if(result==0)
           {
               JOptionPane.showMessageDialog(null,"لا يمكن اضافة المنتج");
           }else 
           {
               JOptionPane.showMessageDialog(null,"تمت الاضافة");
           }
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null,e);
        }finally
        {
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
     public static void updateProducts(productsModel products)
    {
        Connection con=null;
        PreparedStatement ps=null;
        try {
            con=connectionProvider.getCon();
            ps=con.prepareStatement("update Products set productname=?,price=? where id=?");
            ps.setString(1, products.getProductname());
            ps.setFloat(2,products.getPrice());
            ps.setInt(3,products.getId());
           int result =ps.executeUpdate();
           if(result==0)
           {
               JOptionPane.showMessageDialog(null,"لا يمكن تعديل المنتج");
           }else 
           {
               JOptionPane.showMessageDialog(null,"تمت التعديل");
           }
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null,e);
        }finally
        {
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
     public static void deleteProduct(String productname)
     {
         try {
                   dbOperations.setDataOrDelete("Delete from products where productname='"+productname+"'","تم الحذف");
         } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);
         }
     }
     public static ArrayList<productsModel> getAllProductsRecords()
     {
         ArrayList<productsModel> list=new ArrayList<>();
         try {
             ResultSet rs=dbOperations.getData("Select * from Products");
             while(rs.next())
             {
                 productsModel product=new productsModel();
                 product.setId(rs.getInt("id"));
                 product.setProductname(rs.getString("productname"));
                 product.setPrice(rs.getInt("price"));
                 list.add(product);
             }
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
         }
         return list;
     }
}

