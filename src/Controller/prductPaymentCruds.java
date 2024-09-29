
package Controller;

import Database.connectionProvider;
import Database.dbOperations;
import Model.paymentProductModel;
import Model.productsModel;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class prductPaymentCruds {
    
    public static void addPaymentProduct(paymentProductModel product)
    {
        Connection con=null;
        PreparedStatement ps=null;
        try {
            con=connectionProvider.getCon();
            ps=con.prepareStatement("insert into PaymentProduct(productname,devicename,productprice,Quantityneeded,priceoftaken,Date,payed,dayDate) values(?,?,?,?,?,?,?,?)");
            ps.setString(1, product.getProductname());
            ps.setString(2,product.getDeviceName());
            ps.setInt(3,product.getProductprice());
            ps.setInt(4, product.getQuantityneeded());
            ps.setInt(5,product.getPriceofTaken());
            ps.setString(6, product.getDate());
            ps.setInt(7,product.getPayed());
            ps.setString(8, product.getDate().substring(0, 10));
            int result=ps.executeUpdate();
            if(result==0)
            {
                JOptionPane.showMessageDialog(null,"لم يتم الاضافة");
            }else 
            {
                JOptionPane.showMessageDialog(null, "تمت الاضافة");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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
    public static void updatePaymentProduct(paymentProductModel product)
    {
        Connection con=null;
        PreparedStatement ps=null;
        try {
            con=connectionProvider.getCon();
            ps=con.prepareStatement("update PaymentProduct set productname=?,productprice=?,Quantityneeded=?,priceoftaken=?,Date=? where id=? and productname=?");
            ps.setString(1,product.getProductname());
            ps.setFloat(2,product.getProductprice());
            ps.setFloat(2,product.getQuantityneeded());
            ps.setFloat(4, product.getPriceofTaken());
            ps.setString(5,product.getDate());
            ps.setInt(6, product.getId());
            ps.setString(7, product.getProductname());
            ps.setString(8, product.getDate());
            int result=ps.executeUpdate();
            if(result==0)
            {
                JOptionPane.showMessageDialog(null,"لم يتم التعديل");
            }else 
            {
                JOptionPane.showMessageDialog(null, "تمت التعديل");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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
    public static ArrayList<paymentProductModel> getAllPaymentRecordswithProductName(String productname)
    {
        ArrayList<paymentProductModel>list=new ArrayList<>();
        try {
            ResultSet rs=dbOperations.getData("Select * from PaymentProduct where  productname='"+productname+"'");
            while(rs.next())
            {
                paymentProductModel pay=new paymentProductModel();
                pay.setId(rs.getInt("id"));
                pay.setProductname(rs.getString("productname"));
                pay.setProductprice(rs.getInt("productprice"));
                pay.setQuantityneeded(rs.getInt("Quantityneeded"));
                pay.setPriceofTaken(rs.getInt("priceoftaken"));
                pay.setDate(rs.getString("Date"));
                list.add(pay);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    public static void updatePaymentProductsWithDate(int payed,String devicename,String date)
    {
        Connection con=null;
        PreparedStatement ps=null;
        try {
           con=connectionProvider.getCon();
           ps=con.prepareStatement("update PaymentProduct set payed=? where devicename=? and date =?");
           ps.setInt(1,payed);
           ps.setString(2, devicename);
           ps.setString(3,date);
           if(ps.executeUpdate()==0)
           {
               
           }else 
           {
               JOptionPane.showMessageDialog(null, "تم مشاريب");
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static ArrayList<paymentProductModel> getAllPaymentRecordswithDate(String date)
    {
        ArrayList<paymentProductModel>list=new ArrayList<>();
        try {//Select devicename,productname,sum(productprice) as productprice,sum(Quantityneeded) as Quantityneeded,sum(priceoftaken) as priceofTaken from PaymentProduct where date ='"+date+"' group by productname
            ResultSet rs=dbOperations.getData("Select * from PaymentProduct where payed=0 and date like'"+date+"____________%'");
            while(rs.next())
            {
                paymentProductModel pay=new paymentProductModel();
                pay.setId(rs.getInt("id"));
                pay.setProductname(rs.getString("productname"));
                 pay.setDeviceName(rs.getString("deviceName"));
                pay.setProductprice(rs.getInt("productprice"));
                pay.setQuantityneeded(rs.getInt("Quantityneeded"));
                pay.setPriceofTaken(rs.getInt("priceoftaken"));
                list.add(pay);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    public static ArrayList<paymentProductModel> getAllPaymentDrinksWithDevicename(String devicename,String date)
    {
        ArrayList<paymentProductModel>list=new ArrayList<>();
        try {//Select devicename,productname,sum(productprice) as productprice,sum(Quantityneeded) as Quantityneeded,sum(priceoftaken) as priceofTaken from PaymentProduct where date ='"+date+"' group by productname
            ResultSet rs=dbOperations.getData("Select * from PaymentProduct where payed=0 and deviceName='"+devicename+"' and date like'"+date+"____________%'");
            while(rs.next())
            {
                paymentProductModel pay=new paymentProductModel();
                pay.setId(rs.getInt("id"));
                pay.setProductname(rs.getString("productname"));
                 pay.setDeviceName(rs.getString("deviceName"));
                pay.setProductprice(rs.getInt("productprice"));
                pay.setQuantityneeded(rs.getInt("Quantityneeded"));
                pay.setPriceofTaken(rs.getInt("priceoftaken"));
                list.add(pay);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    public static ArrayList<paymentProductModel> getAllPaymentRecordswithDatePayedIs1(String date)
    {
        ArrayList<paymentProductModel>list=new ArrayList<>();
        try {//Select devicename,productname,sum(productprice) as productprice,sum(Quantityneeded) as Quantityneeded,sum(priceoftaken) as priceofTaken from PaymentProduct where date ='"+date+"' group by productname
            ResultSet rs=dbOperations.getData("Select * from PaymentProduct where payed=1 and date like'"+date+"____________%'");
            while(rs.next())
            {
                paymentProductModel pay=new paymentProductModel();
                pay.setId(rs.getInt("id"));
                pay.setProductname(rs.getString("productname"));
                 pay.setDeviceName(rs.getString("deviceName"));
                pay.setProductprice(rs.getInt("productprice"));
                pay.setQuantityneeded(rs.getInt("Quantityneeded"));
                pay.setPriceofTaken(rs.getInt("priceoftaken"));
                list.add(pay);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
     public static ArrayList<paymentProductModel> getAllPaymentRecordswithDatePayedIs1andName(String devicename ,String date)
    {
        ArrayList<paymentProductModel>list=new ArrayList<>();
        try {//Select devicename,productname,sum(productprice) as productprice,sum(Quantityneeded) as Quantityneeded,sum(priceoftaken) as priceofTaken from PaymentProduct where date ='"+date+"' group by productname
            ResultSet rs=dbOperations.getData("Select * from PaymentProduct where payed=1 and devicename='"+devicename+"' and date like'"+date+"____________%'");
            while(rs.next())
            {
                paymentProductModel pay=new paymentProductModel();
                pay.setId(rs.getInt("id"));
                pay.setProductname(rs.getString("productname"));
                 pay.setDeviceName(rs.getString("deviceName"));
                pay.setProductprice(rs.getInt("productprice"));
                pay.setQuantityneeded(rs.getInt("Quantityneeded"));
                pay.setPriceofTaken(rs.getInt("priceoftaken"));
                list.add(pay);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
   
    public static ArrayList<paymentProductModel> getAllPaymentProductWithNameandDate(String productname,String date)
    {
        ArrayList<paymentProductModel>list=new ArrayList<>();
        try {
            ResultSet rs=dbOperations.getData("Select * from PaymentProduct where  productname='"+productname+"'and Date like'"+date+"____________%'");
            while(rs.next()){
                paymentProductModel pay=new paymentProductModel();
                pay.setId(rs.getInt("id"));
                pay.setProductname(rs.getString("product productname"));
                pay.setProductprice(rs.getInt("productprice"));
                pay.setQuantityneeded(rs.getInt("Quantityneeded"));
                pay.setPriceofTaken(rs.getInt("priceoftaken"));
                pay.setDate(rs.getString("Date"));
                list.add(pay);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    public static ArrayList<productsModel> getProductnameforCompo()
    {
        ArrayList<productsModel>list=new ArrayList<>();
        try {
            ResultSet rs=dbOperations.getData("select productname from products");
            while(rs.next()){
                productsModel product=new productsModel();
                product.setProductname(rs.getString("productname"));
                list.add(product);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    
   
    public static int getproductPrice(String productname)
    {
        int productprice=0;
        try {
            ResultSet rs=dbOperations.getData("select price from products where productname='"+productname+"'");
            while(rs.next())
            {
                productprice=rs.getInt("price");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return productprice;
    }
        public static void UpdatePayemntDrinksWithID(paymentProductModel pay,int id)
    {
        Connection con=null;
        PreparedStatement ps=null;
        try {
           con=connectionProvider.getCon();
           ps=con.prepareStatement("update PaymentProduct set productname=?,productprice=?,Quantityneeded=?,priceoftaken=? where id=?");
           ps.setString(1,pay.getProductname());
           ps.setInt(2, pay.getProductprice());
           ps.setInt(3,pay.getQuantityneeded());
           ps.setInt(4,pay.getPriceofTaken());
           ps.setInt(5,id);
           if(ps.executeUpdate()==0)
           {
               JOptionPane.showMessageDialog(null, "لديك خطأ");
           }else 
           {
               JOptionPane.showMessageDialog(null, "تم مشاريب");
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
