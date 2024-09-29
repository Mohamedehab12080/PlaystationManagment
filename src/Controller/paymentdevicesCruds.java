package Controller;

import Database.connectionProvider;
import Database.dbOperations;
import Model.paymentDevicesModel;
import Model.paymentProductModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class paymentdevicesCruds {

    public static ArrayList<paymentDevicesModel> checkonTimesAndaddPaymentForFirst(paymentDevicesModel pays) {
        ArrayList<paymentDevicesModel> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        try {
            ResultSet rs = dbOperations.getData("Select  id,devicename,Date from PaymentDevices where devicename='" + pays.getDeviceName() + "' and date='" + pays.getDate() + "'");
            if (rs.next()) {
                paymentDevicesModel pay = new paymentDevicesModel();
                pay.setId(rs.getInt("id"));
                pay.setDeviceName(rs.getString("devicename"));
                pay.setDate(rs.getString("Date"));
                list.add(pay);
            } else {
                con = connectionProvider.getCon();
                ps = con.prepareStatement("insert into PaymentDevices (devicename,Time1,priceofTime1,hoursType,hoursprice,Date,dayDate) values(?,?,?,?,?,?,?)");
                ps.setString(1, pays.getDeviceName());
                ps.setString(2, pays.getTime1());
                ps.setFloat(3, pays.getPriceofTime1());
                ps.setString(4, pays.getHoursType());
                ps.setFloat(5, pays.getHoursprice());
                ps.setString(6, pays.getDate());
                ps.setString(7, pays.getDate().substring(0, 10));
                int result = ps.executeUpdate();
                if (result == 0) {
                    JOptionPane.showMessageDialog(null, "لا يمكن التسجيل");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }

    public static void deletePaymentDevicesWithId(int id) {
        try {
            dbOperations.setDataOrDelete("Delete from PaymentDevices where id=" + id, "تم الحذف");
        } catch (Exception e) {
        }

    }

    public static ArrayList<paymentDevicesModel> InitializeDeviceTimer(paymentDevicesModel pays) {
        ArrayList<paymentDevicesModel> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = connectionProvider.getCon();
            ps = con.prepareStatement("insert into PaymentDevices (devicename,Date) values(?,?)");
            ps.setString(1, pays.getDeviceName());
            ps.setString(2, pays.getDate());
            int result = ps.executeUpdate();
            if (result == 0) {
                JOptionPane.showMessageDialog(null, "لا يمكن التسجيل");
            } else {
                JOptionPane.showMessageDialog(null, "تم البدء");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }

    public static void UpdatePaymentForTimes(paymentDevicesModel pay, int id) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = connectionProvider.getCon();
            ps = con.prepareStatement("update PaymentDevices set Time1=?,priceofTime1=?,Time2=?,priceofTime2=?,Time3=?,priceofTime3=?,Time4=?,priceofTime4=?,Time5=?,priceofTime5=? where id=?");
            ps.setString(1, pay.getTime1());
            ps.setFloat(2, pay.getPriceofTime1());
            ps.setString(3, pay.getTime2());
            ps.setFloat(4, pay.getPriceOfTime2());
            ps.setString(5, pay.getTime3());
            ps.setFloat(6, pay.getPriceOfTime3());
            ps.setString(7, pay.getTime4());
            ps.setFloat(8, pay.getPriceOfTime4());
            ps.setString(9, pay.getTime5());
            ps.setFloat(10, pay.getPriceofTime5());
            ps.setInt(11, id);
            int result = ps.executeUpdate();
            if (result == 0) {
                JOptionPane.showMessageDialog(null, "لم يتم الاضافة");
            } else {
//               JOptionPane.showMessageDialog(null, "تم التسجيل");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static ArrayList<Float> getAllTimePrice(int id) {
        ArrayList<Float> list = new ArrayList<>();
        try {
            ResultSet rs = dbOperations.getData("select priceofTime1,priceofTime2,priceofTime3,priceofTime4,priceofTime5 from paymentdevices where id=" + id);
            while (rs.next()) {
                list.add(rs.getFloat("priceofTime1"));
                list.add(rs.getFloat("priceofTime2"));
                list.add(rs.getFloat("priceofTime3"));
                list.add(rs.getFloat("priceofTime4"));
                list.add(rs.getFloat("priceofTime5"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sss");
        }
        return list;
    }
//     public static ArrayList<Float> getAllTimCount(int id)
//    {
//        ArrayList<Float> list=new ArrayList<>();
//        try {
//            ResultSet rs=dbOperations.getData("select Time1,Time2,Time3,Time4,Time5 where id="+id);
//            while(rs.next())
//            { // 1.15
//                    float hour1=0;
//                   float Minutes1=0;
//                   float hour2=0;
//                   float Minutes2=0;
//                   float hour3=0;
//                   float Minutes3=0;
//                   float hour4=0;
//                   float Minutes4=0;
//                   float hour5=0;
//                   float Minutes5=0;
//                if(String.valueOf(rs.getFloat("Time1")).length()==4&&String.valueOf(rs.getFloat("Time2")).length()==4&&
//                        String.valueOf(rs.getFloat("Time3")).length()==4&&String.valueOf(rs.getFloat("Time4")).length()==4
//                        &&String.valueOf(rs.getFloat("Time5")).length()==4)
//                {
//                   hour1=Float.parseFloat(String.valueOf(rs.getFloat("Time1")).charAt(0)+"");
//                   Minutes1=Float.parseFloat(String.valueOf(rs.getFloat("Time1")).substring(2,4));
//                   hour2=Float.parseFloat(String.valueOf(rs.getFloat("Time2")).charAt(0)+"");
//                   Minutes2=Float.parseFloat(String.valueOf(rs.getFloat("Time2")).substring(2,4));
//                   hour3=Float.parseFloat(String.valueOf(rs.getFloat("Time3")).charAt(0)+"");
//                   Minutes3=Float.parseFloat(String.valueOf(rs.getFloat("Time3")).substring(2,4));
//                    hour4=Float.parseFloat(String.valueOf(rs.getFloat("Time4")).charAt(0)+"");
//                   Minutes4=Float.parseFloat(String.valueOf(rs.getFloat("Time4")).substring(2,4));
//                   hour5=Float.parseFloat(String.valueOf(rs.getFloat("Time5")).charAt(0)+"");
//                   Minutes5=Float.parseFloat(String.valueOf(rs.getFloat("Time5")).substring(2,4));
//                   
//                   if(Minutes1<=17)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour1+0.25)));
//                   }
//                   if(Minutes1>17&&Minutes1<=23)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour1+0.33)));
//                   }
//                     if(Minutes1>23&&Minutes1<=27)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour1+0.4)));
//                   }
//                       if(Minutes1>27&&Minutes1<=33)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour1+0.5)));
//                   }
//                   if(Minutes1>33&&Minutes1<=37)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour1+0.65)));
//                   }
//                     if(Minutes1>37&&Minutes1<=47)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour1+0.75)));
//                   }
//                     if(Minutes1>47&&Minutes1<=59)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour1+1)));
//                   }
//                     
//                     
//                    if(Minutes2<=17)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour2+0.25)));
//                   }
//                   if(Minutes2>17&&Minutes2<=23)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour2+0.33)));
//                   }
//                     if(Minutes2>23&&Minutes2<=27)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour2+0.4)));
//                   }
//                       if(Minutes2>27&&Minutes2<=33)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour2+0.5)));
//                   }
//                   if(Minutes2>33&&Minutes2<=37)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour2+0.65)));
//                   }
//                     if(Minutes2>37&&Minutes2<=47)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour2+0.75)));
//                   }
//                     if(Minutes2>47&&Minutes2<=59)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour2+1)));
//                   }
//                     
//                     
//                     
//                    if(Minutes3<=17)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour3+0.25)));
//                   }
//                   if(Minutes3>17&&Minutes3<=23)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour3+0.33)));
//                   }
//                     if(Minutes3>23&&Minutes3<=27)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour3+0.4)));
//                   }
//                       if(Minutes3>27&&Minutes3<=33)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour3+0.5)));
//                   }
//                   if(Minutes3>33&&Minutes3<=37)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour3+0.65)));
//                   }
//                     if(Minutes3>37&&Minutes3<=47)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour3+0.75)));
//                   }
//                     if(Minutes3>47&&Minutes3<=59)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour3+1)));
//                   }
//                     
//                     
//                    if(Minutes4<=17)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour4+0.25)));
//                   }
//                   if(Minutes4>17&&Minutes4<=23)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour4+0.33)));
//                   }
//                     if(Minutes4>23&&Minutes4<=27)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour4+0.4)));
//                   }
//                       if(Minutes4>27&&Minutes4<=33)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour4+0.5)));
//                   }
//                   if(Minutes4>33&&Minutes4<=37)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour4+0.65)));
//                   }
//                     if(Minutes4>37&&Minutes4<=47)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour4+0.75)));
//                   }
//                     if(Minutes4>47&&Minutes4<=59)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour4+1)));
//                   }
//                     
//                       if(Minutes5<=17)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour5+0.25)));
//                   }
//                   if(Minutes5>17&&Minutes5<=23)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour5+0.33)));
//                   }
//                     if(Minutes5>23&&Minutes5<=27)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour5+0.4)));
//                   }
//                       if(Minutes5>27&&Minutes5<=33)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour5+0.5)));
//                   }
//                   if(Minutes5>33&&Minutes5<=37)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour5+0.65)));
//                   }
//                     if(Minutes5>37&&Minutes5<=47)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour5+0.75)));
//                   }
//                     if(Minutes5>47&&Minutes5<=59)
//                   {
//                       list.add(Float.parseFloat(String.valueOf(hour5+1)));
//                   }
//                   
//                }
//        }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//        return list;
//    }

    public static void UpdateForSaveAllTimeAndTotalPrice(paymentDevicesModel pay, int id) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = connectionProvider.getCon();
            ps = con.prepareStatement("update PaymentDevices set AllTime=?,totalPrice=?,startTime=?,endTime=? where id=?");
            ps.setString(1, pay.getAllTime());
            ps.setFloat(2,Float.parseFloat(String.valueOf(Math.ceil(pay.getTotalPrice()))));
            ps.setString(3, pay.getStartTime());
            ps.setString(4, pay.getEndTime());
            ps.setInt(5, id);
            int result = ps.executeUpdate();
            if (result == 0) {
                JOptionPane.showMessageDialog(null, "لم يتم الاضافة");
            } else {
//               JOptionPane.showMessageDialog(null, "تم التسجيل");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
            }
        }
    }

    public static ArrayList<paymentDevicesModel> getTimesRecords(int id) {
        ArrayList<paymentDevicesModel> list = new ArrayList<>();
        try {
            ResultSet rs = dbOperations.getData("select id,startTime,endTime,Time1,priceofTime1,Time2,priceofTime2,Time3,priceofTime3,Time4,priceofTime4,Time5,priceofTime5,hoursType,AllTime,totalPrice from PaymentDevices where id=" + id);
            while (rs.next()) {
                paymentDevicesModel pay = new paymentDevicesModel();
                pay.setStartTime(rs.getString("startTime"));
                pay.setEndTime(rs.getString("endTime"));
                pay.setId(rs.getInt("id"));
                pay.setTime1(rs.getString("Time1"));
                pay.setPriceofTime1(rs.getFloat("priceofTime1"));
                pay.setTime2(rs.getString("Time2"));
                pay.setPriceOfTime2(rs.getFloat("priceofTime2"));
                pay.setTime3(rs.getString("Time3"));
                pay.setPriceOfTime3(rs.getFloat("priceofTime3"));
                pay.setTime4(rs.getString("Time4"));
                pay.setPriceOfTime4(rs.getFloat("priceofTime4"));
                pay.setTime5(rs.getString("Time5"));
                pay.setPriceofTime5(rs.getFloat("priceofTime5"));
                pay.setAllTime(rs.getString("AllTime"));
                pay.setTotalPrice(rs.getFloat("totalPrice"));
                pay.setHoursType(rs.getString("hoursType"));
                list.add(pay);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }

    public static String getEndTime(int id) {
        String end = "";
        try {
            ResultSet rs = dbOperations.getData("select endTime from PaymentDevices where id=" + id);
            while (rs.next()) {
                end = rs.getString("endTime");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return end;
    }

    public static ArrayList<paymentDevicesModel> getAllRecordsForRealTime(String Psname, String endTime, String hourstype) {
        ArrayList<paymentDevicesModel> list = new ArrayList<>();
        ResultSet rss;
        try {
            if (hourstype.equals("Single")) {
                rss = dbOperations.getData("select * from PaymentDevices where devicename='" + Psname + "' and endTime='" + endTime + "' and hoursType='Single'");
                while (rss.next()) {

                    paymentDevicesModel pay = new paymentDevicesModel();
                    pay.setId(rss.getInt("id"));
                    pay.setStartTime(rss.getString("startTime"));
                    pay.setEndTime(rss.getString("endTime"));
                    pay.setTime1(rss.getString("Time1"));
                    pay.setPriceofTime1(rss.getFloat("priceofTime1"));
                    pay.setTime2(rss.getString("Time2"));
                    pay.setPriceOfTime2(rss.getFloat("priceofTime2"));
                    pay.setTime3(rss.getString("Time3"));
                    pay.setPriceOfTime3(rss.getFloat("priceofTime3"));
                    pay.setTime4(rss.getString("Time4"));
                    pay.setPriceOfTime4(rss.getFloat("priceofTime4"));
                    pay.setTime5(rss.getString("Time5"));
                    pay.setPriceofTime5(rss.getFloat("priceofTime5"));
                    pay.setAllTime(rss.getString("AllTime"));
                    pay.setTotalPrice(rss.getFloat("totalPrice"));
                    pay.setHoursType(rss.getString("hoursType"));
                    list.add(pay);
                }
            } else {
                rss = dbOperations.getData("select * from PaymentDevices where devicename='" + Psname + "' and endTime='" + endTime + "' and hoursType='Multi'");
                while (rss.next()) {

                    paymentDevicesModel pay = new paymentDevicesModel();
                    pay.setId(rss.getInt("id"));
                    pay.setStartTime(rss.getString("startTime"));
                    pay.setEndTime(rss.getString("endTime"));
                    pay.setTime1(rss.getString("Time1"));
                    pay.setPriceofTime1(rss.getFloat("priceofTime1"));
                    pay.setTime2(rss.getString("Time2"));
                    pay.setPriceOfTime2(rss.getFloat("priceofTime2"));
                    pay.setTime3(rss.getString("Time3"));
                    pay.setPriceOfTime3(rss.getFloat("priceofTime3"));
                    pay.setTime4(rss.getString("Time4"));
                    pay.setPriceOfTime4(rss.getFloat("priceofTime4"));
                    pay.setTime5(rss.getString("Time5"));
                    pay.setPriceofTime5(rss.getFloat("priceofTime5"));
                    pay.setAllTime(rss.getString("AllTime"));
                    pay.setTotalPrice(rss.getFloat("totalPrice"));
                    pay.setHoursType(rss.getString("hoursType"));
                    list.add(pay);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
 public static ArrayList<paymentDevicesModel> getAllRecordsForTimesWithID(int id) {
        ArrayList<paymentDevicesModel> list = new ArrayList<>();
        ResultSet rss;
        try {
                rss = dbOperations.getData("select * from PaymentDevices where id="+id);
                while (rss.next()) {
                    paymentDevicesModel pay = new paymentDevicesModel();
                    pay.setId(rss.getInt("id"));
                    pay.setStartTime(rss.getString("startTime"));
                    pay.setEndTime(rss.getString("endTime"));
                    pay.setTime1(rss.getString("Time1"));
                    pay.setPriceofTime1(rss.getFloat("priceofTime1"));
                    pay.setTime2(rss.getString("Time2"));
                    pay.setPriceOfTime2(rss.getFloat("priceofTime2"));
                    pay.setTime3(rss.getString("Time3"));
                    pay.setPriceOfTime3(rss.getFloat("priceofTime3"));
                    pay.setTime4(rss.getString("Time4"));
                    pay.setPriceOfTime4(rss.getFloat("priceofTime4"));
                    pay.setTime5(rss.getString("Time5"));
                    pay.setPriceofTime5(rss.getFloat("priceofTime5"));
                    pay.setAllTime(rss.getString("AllTime"));
                    pay.setTotalPrice(rss.getFloat("totalPrice"));
                    pay.setHoursType(rss.getString("hoursType"));
                    list.add(pay);
                }
            }
              catch(Exception e)
              {
                JOptionPane.showMessageDialog(null, e);
             }
        return list;
 }
    public static ArrayList<paymentDevicesModel> getAllRecordsForRealTimeforclosed(String Psname, String endTime, String hourstype) {
        ArrayList<paymentDevicesModel> list = new ArrayList<>();
        ResultSet rss;
        try {
            if (hourstype.equals("Single")) {
                rss = dbOperations.getData("select * from PaymentDevices where devicename='" + Psname + "' and endTime='" + endTime + "' and hoursType='Single'");
                while (rss.next()) {
                    paymentDevicesModel pay = new paymentDevicesModel();
                    pay.setId(rss.getInt("id"));
                    pay.setStartTime(rss.getString("startTime"));
                    pay.setEndTime(rss.getString("endTime"));
                    pay.setTime1(rss.getString("Time1"));
                    pay.setPriceofTime1(rss.getFloat("priceofTime1"));
                    pay.setTime2(rss.getString("Time2"));
                    pay.setPriceOfTime2(rss.getFloat("priceofTime2"));
                    pay.setTime3(rss.getString("Time3"));
                    pay.setPriceOfTime3(rss.getFloat("priceofTime3"));
                    pay.setTime4(rss.getString("Time4"));
                    pay.setPriceOfTime4(rss.getFloat("priceofTime4"));
                    pay.setTime5(rss.getString("Time5"));
                    pay.setPriceofTime5(rss.getFloat("priceofTime5"));
                    pay.setAllTime(rss.getString("AllTime"));
                    pay.setTotalPrice(rss.getFloat("totalPrice"));
                    pay.setHoursType(rss.getString("hoursType"));
                    list.add(pay);
                }
            } else {
                rss = dbOperations.getData("select * from PaymentDevices where devicename='" + Psname + "' and endTime='" + endTime + "' and hoursType='Multi'");
                while (rss.next()) {

                    paymentDevicesModel pay = new paymentDevicesModel();
                    pay.setId(rss.getInt("id"));
                    pay.setStartTime(rss.getString("startTime"));
                    pay.setEndTime(rss.getString("endTime"));
                    pay.setTime1(rss.getString("Time1"));
                    pay.setPriceofTime1(rss.getFloat("priceofTime1"));
                    pay.setTime2(rss.getString("Time2"));
                    pay.setPriceOfTime2(rss.getFloat("priceofTime2"));
                    pay.setTime3(rss.getString("Time3"));
                    pay.setPriceOfTime3(rss.getFloat("priceofTime3"));
                    pay.setTime4(rss.getString("Time4"));
                    pay.setPriceOfTime4(rss.getFloat("priceofTime4"));
                    pay.setTime5(rss.getString("Time5"));
                    pay.setPriceofTime5(rss.getFloat("priceofTime5"));
                    pay.setAllTime(rss.getString("AllTime"));
                    pay.setTotalPrice(rss.getFloat("totalPrice"));
                    pay.setHoursType(rss.getString("hoursType"));
                    list.add(pay);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }

    public static ArrayList<paymentDevicesModel> getAllrecordsForSecondTime(String Psname, String startTime, String hoursType) {
        ArrayList<paymentDevicesModel> list = new ArrayList<>();
        try {
            if (hoursType.equals("Single")) {
                ResultSet rss = dbOperations.getData("select * from PaymentDevices where devicename='" + Psname + "' and endTime='" + startTime + "' and hoursType='Multi'");

                while (rss.next()) {
                    paymentDevicesModel pay = new paymentDevicesModel();
                    pay.setId(rss.getInt("id"));
                    pay.setStartTime(rss.getString("startTime"));
                    pay.setEndTime(rss.getString("endTime"));
                    pay.setTime1(rss.getString("Time1"));
                    pay.setPriceofTime1(rss.getFloat("priceofTime1"));
                    pay.setTime2(rss.getString("Time2"));
                    pay.setPriceOfTime2(rss.getFloat("priceofTime2"));
                    pay.setTime3(rss.getString("Time3"));
                    pay.setPriceOfTime3(rss.getFloat("priceofTime3"));
                    pay.setTime4(rss.getString("Time4"));
                    pay.setPriceOfTime4(rss.getFloat("priceofTime4"));
                    pay.setTime5(rss.getString("Time5"));
                    pay.setPriceofTime5(rss.getFloat("priceofTime5"));
                    pay.setAllTime(rss.getString("AllTime"));
                    pay.setTotalPrice(rss.getFloat("totalPrice"));
                    pay.setHoursType(rss.getString("hoursType"));
                    pay.setDate(rss.getString("Date"));
                    list.add(pay);
                }

            } else {
                ResultSet rss = dbOperations.getData("select * from PaymentDevices where devicename='" + Psname + "' and endTime='" + startTime + "' and hoursType='Single'");

                while (rss.next()) {
                    paymentDevicesModel pay = new paymentDevicesModel();
                    pay.setId(rss.getInt("id"));
                    pay.setStartTime(rss.getString("startTime"));
                    pay.setEndTime(rss.getString("endTime"));
                    pay.setTime1(rss.getString("Time1"));
                    pay.setPriceofTime1(rss.getFloat("priceofTime1"));
                    pay.setTime2(rss.getString("Time2"));
                    pay.setPriceOfTime2(rss.getFloat("priceofTime2"));
                    pay.setTime3(rss.getString("Time3"));
                    pay.setPriceOfTime3(rss.getFloat("priceofTime3"));
                    pay.setTime4(rss.getString("Time4"));
                    pay.setPriceOfTime4(rss.getFloat("priceofTime4"));
                    pay.setTime5(rss.getString("Time5"));
                    pay.setPriceofTime5(rss.getFloat("priceofTime5"));
                    pay.setAllTime(rss.getString("AllTime"));
                    pay.setTotalPrice(rss.getFloat("totalPrice"));
                    pay.setHoursType(rss.getString("hoursType"));
                    pay.setDate(rss.getString("Date"));
                    list.add(pay);
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
//     public static ArrayList<String> getAllrecordsForSecondTimeForClosed(String Psname,String startTime,String hoursType)
//    {
//        ArrayList<String>list=new ArrayList<>();
//        try {
//          if(hoursType.equals("Single"))
//          {
//              ResultSet rss =dbOperations.getData("select * from PaymentDevices where devicename='"+Psname+"' and endTime='"+startTime+"' and hoursType='Multi'");
//             
//                      while(rss.next())
//                      {
//                          list.add(String.valueOf(rss.getInt("id")));
//                          list.add(rss.getString("startTime"));
//                          list.add(rss.getString("endTime"));
//                          list.add(rss.get)
//                      }  
//          
//          }else 
//          {
//              ResultSet rss =dbOperations.getData("select * from PaymentDevices where devicename='"+Psname+"' and endTime='"+startTime+"' and hoursType='Single'");
//                 
//                      while(rss.next())
//                      {
//                          paymentDevicesModel pay=new paymentDevicesModel();
//                          pay.setId(rss.getInt("id"));
//                          pay.setStartTime(rss.getString("startTime"));
//                          pay.setEndTime(rss.getString("endTime"));
//                          pay.setTime1(rss.getString("Time1"));
//                          pay.setPriceofTime1(rss.getFloat("priceofTime1"));
//                          pay.setTime2(rss.getString("Time2"));
//                          pay.setPriceOfTime2(rss.getFloat("priceofTime2"));
//                          pay.setTime3(rss.getString("Time3"));
//                          pay.setPriceOfTime3(rss.getFloat("priceofTime3"));
//                          pay.setTime4(rss.getString("Time4"));
//                          pay.setPriceOfTime4(rss.getFloat("priceofTime4"));
//                          pay.setTime5(rss.getString("Time5"));
//                          pay.setPriceofTime5(rss.getFloat("priceofTime5"));
//                          pay.setAllTime(rss.getString("AllTime"));
//                          pay.setTotalPrice(rss.getFloat("totalPrice"));
//                          pay.setHoursType(rss.getString("hoursType"));
//                          pay.setDate(rss.getString("Date"));
//                          list.add(pay);
//                      } 
//
//        }
//        }catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//        return list;
//    }

    public static String getDateWithID(int id) {
        String date = "";
        try {
            ResultSet rs = dbOperations.getData("Select date from PaymentDevices where id=" + id);
            while (rs.next()) {
                date = rs.getString("Date");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return date;
    }

    public static ArrayList<String> getAllDatesforCompo() {
        ArrayList<String> list = new ArrayList<>();
        try {
            ResultSet rs = dbOperations.getData("Select distinct dayDate from paymentdevices");
            while (rs.next()) {
                list.add(rs.getString("dayDate"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
     public static ArrayList<String> getAllDatesforCompoDrinks() {
        ArrayList<String> list = new ArrayList<>();
        try {
            ResultSet rs = dbOperations.getData("Select distinct dayDate from paymentproduct where payed=0");
            while (rs.next()) {
                list.add(rs.getString("dayDate"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }

    public static ArrayList<paymentDevicesModel> getAllRecordsTimewithDate(String date) {
        ArrayList<paymentDevicesModel> list = new ArrayList<>();
        try {
            ResultSet rs = dbOperations.getData("select id,devicename,Time1,Time2,Time3,Time4,Time5,AllTime,hoursType,hoursprice,totalPrice,Date from PaymentDevices where AllTime is NOT NULL and Date like'" + date + "____________%' order by id");
            while (rs.next()) {
                paymentDevicesModel pay = new paymentDevicesModel();
                pay.setId(rs.getInt("id"));
                pay.setDeviceName(rs.getString("devicename"));
                pay.setTime1(rs.getString("Time1"));
                pay.setTime2(rs.getString("Time2"));
                pay.setTime3(rs.getString("Time3"));
                pay.setTime4(rs.getString("Time4"));
                pay.setTime5(rs.getString("Time5"));
                pay.setHoursType(rs.getString("hoursType"));
                pay.setHoursprice(rs.getFloat("hoursprice"));
                pay.setAllTime(rs.getString("AllTime"));
                pay.setTotalPrice(rs.getFloat("totalPrice"));
                pay.setDate(rs.getString("Date"));
                list.add(pay);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }

    public static int getIdWithDateAndDeviceName(String DeviceName, String date) {
        int ids = 0;
        try {
            ResultSet rs = dbOperations.getData("Select id from paymentdevices where devicename='" + DeviceName + "' and date='" + date + "'");
            if (rs.next()) {
                ids = rs.getInt("id");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ids;
    }

    public static ArrayList<paymentProductModel> getRecordsofDrinksWithDevicenameandDate(String devicename, String date) {
        ArrayList<paymentProductModel> list = new ArrayList<>();
        try {
            ResultSet rs2 = dbOperations.getData("select productname,deviceName,productprice,sum(Quantityneeded) as Quantityneeded,sum(priceoftaken) as priceoftaken from PaymentProduct where deviceName='" + devicename + "' and date like '__________%" + date + "' group by productname");
            while (rs2.next()) {
                paymentProductModel payPr = new paymentProductModel();
                payPr.setProductname(rs2.getString("productname"));
                payPr.setDeviceName(rs2.getString("deviceName"));
                payPr.setProductprice(rs2.getInt("productprice"));
                payPr.setPriceofTaken(rs2.getInt("priceoftaken"));
                payPr.setQuantityneeded(rs2.getInt("Quantityneeded"));
                list.add(payPr);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }

    public static int getLastId() {
        int id = 0;
        try {
            ResultSet rs = dbOperations.getData("Select id from paymentdevices Order by id Desc Limit 1");
            while (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return id;
    }

    public static int getIDwithEndTimeandDeviceName(String devicename) {
        int id = 0;
        try {
            ResultSet rs = dbOperations.getData("select id from paymentdevices where devicename='" + devicename + "' and AllTime IS NULL");
            if (rs.next()) {
                id = rs.getInt("id");
            } else {
                rs = dbOperations.getData("select id from paymentdevices where devicename='" + devicename + "' Order by id Desc Limit 1");
                if (rs.next()) {
                    id = rs.getInt("id") + 1;
                } else {
                    id = getLastId() + 1;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return id;
    }

    public static ArrayList<paymentProductModel> getAllRecordsForDrinksofMonth(String year, String Month) {
        ArrayList<paymentProductModel> list = new ArrayList<>();
        try {
            ResultSet rs2 = dbOperations.getData("select * from PaymentProduct where payed=1 and Date like'" + year + "_" + Month + "_______________%'");
            while (rs2.next()) {
                paymentProductModel payPr = new paymentProductModel();
                payPr.setId(rs2.getInt("id"));
                payPr.setProductname(rs2.getString("productname"));
                payPr.setDeviceName(rs2.getString("deviceName"));
                payPr.setProductprice(rs2.getInt("productprice"));
                payPr.setPriceofTaken(rs2.getInt("priceoftaken"));
                payPr.setQuantityneeded(rs2.getInt("Quantityneeded"));
                payPr.setDate(rs2.getString("Date"));
                list.add(payPr);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }

    public static float getMultiPriceandSingle(String deviceName, String Type) {
        float result = 0;
        try {
            ResultSet rs = dbOperations.getData("select priceofSingle,priceofMulti from devices where devicename='" + deviceName + "'");
            if (rs.next()) {
                if (Type.equals("Multi")) {
                    result = rs.getFloat("priceofMulti");
                } else {
                    result = rs.getFloat("priceofSingle");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return result;
    }

    public static float getTotalforDay(String date) {
        float total1 = 0;
        try { //2023-06-22 07:15:22 PM
            ResultSet rs = dbOperations.getData("select sum(totalPrice) as totalPrice from paymentdevices where date like'" + date + "____________%'");
            if (rs.next()) {
                total1 = rs.getFloat("totalPrice");
                ResultSet rss = dbOperations.getData("select sum(priceoftaken) as priceoftaken from paymentproduct where date like'" + date + "____________%' and payed=1");
                if (rss.next()) {
                    total1 += rss.getFloat("priceoftaken");
                }
            }

        } catch (Exception e) {
        }
        return Math.round(total1);
    }

    public static ArrayList<paymentDevicesModel> getAllRecordsForMonth(String year, String Month) {
        ArrayList<paymentDevicesModel> list = new ArrayList<>();
        try {
            ResultSet rs = dbOperations.getData("select id,devicename,Time1,Time2,Time3,Time4,Time5,AllTime,hoursType,hoursprice,totalPrice,Date from PaymentDevices where  Date like'" + year + "_" + Month + "_______________%'");
            while (rs.next()) {
                paymentDevicesModel pay = new paymentDevicesModel();
                pay.setId(rs.getInt("id"));
                pay.setDeviceName(rs.getString("devicename"));
                pay.setTime1(rs.getString("Time1"));
                pay.setTime2(rs.getString("Time2"));
                pay.setTime3(rs.getString("Time3"));
                pay.setTime4(rs.getString("Time4"));
                pay.setTime5(rs.getString("Time5"));
                pay.setHoursType(rs.getString("hoursType"));
                pay.setHoursprice(rs.getFloat("hoursprice"));
                pay.setAllTime(rs.getString("AllTime"));
                pay.setTotalPrice(rs.getFloat("totalPrice"));
                pay.setDate(rs.getString("Date"));
                list.add(pay);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }

    public static ArrayList<paymentDevicesModel> getAllRecordsFordevicename(String devicename, String date) {
        ArrayList<paymentDevicesModel> list = new ArrayList<>();
        try {
            ResultSet rs = dbOperations.getData("select id,devicename,Time1,Time2,Time3,Time4,Time5,AllTime,hoursType,hoursprice,totalPrice,Date from PaymentDevices where Date like'" + date + "____________%' and devicename='" + devicename + "'");
            while (rs.next()) {
                paymentDevicesModel pay = new paymentDevicesModel();
                pay.setId(rs.getInt("id"));
                pay.setDeviceName(rs.getString("devicename"));
                pay.setTime1(rs.getString("Time1"));
                pay.setTime2(rs.getString("Time2"));
                pay.setTime3(rs.getString("Time3"));
                pay.setTime4(rs.getString("Time4"));
                pay.setTime5(rs.getString("Time5"));
                pay.setHoursType(rs.getString("hoursType"));
                pay.setHoursprice(rs.getFloat("hoursprice"));
                pay.setAllTime(rs.getString("AllTime"));
                pay.setTotalPrice(rs.getFloat("totalPrice"));
                pay.setDate(rs.getString("Date"));
                list.add(pay);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }

    public static ArrayList<paymentDevicesModel> getAllRecordsFordevicenameLost(String devicename, String date) {
        ArrayList<paymentDevicesModel> list = new ArrayList<>();
        try {
            ResultSet rs = dbOperations.getData("select id,devicename,Time1,Time2,Time3,Time4,Time5,AllTime,hoursType,hoursprice,totalPrice,Date from PaymentDevices where AllTime is NULL and Date like'" + date + "____________%'  and devicename='" + devicename + "'");
            while (rs.next()) {
                paymentDevicesModel pay = new paymentDevicesModel();
                pay.setId(rs.getInt("id"));
                pay.setDeviceName(rs.getString("devicename"));
                pay.setTime1(rs.getString("Time1"));
                pay.setTime2(rs.getString("Time2"));
                pay.setTime3(rs.getString("Time3"));
                pay.setTime4(rs.getString("Time4"));
                pay.setTime5(rs.getString("Time5"));
                pay.setHoursType(rs.getString("hoursType"));
                pay.setHoursprice(rs.getFloat("hoursprice"));
                pay.setAllTime(rs.getString("AllTime"));
                pay.setTotalPrice(rs.getFloat("totalPrice"));
                pay.setDate(rs.getString("Date"));
                list.add(pay);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }

    public static ArrayList<paymentDevicesModel> getAllRecordsFordevicename(String date) {
        ArrayList<paymentDevicesModel> list = new ArrayList<>();
        try {
            ResultSet rs = dbOperations.getData("select id,devicename,Time1,Time2,Time3,Time4,Time5,AllTime,hoursType,hoursprice,totalPrice,Date from PaymentDevices where AllTime is null and Date like'" + date + "____________%'");
            while (rs.next()) {
                paymentDevicesModel pay = new paymentDevicesModel();
                pay.setId(rs.getInt("id"));
                pay.setDeviceName(rs.getString("devicename"));
                pay.setTime1(rs.getString("Time1"));
                pay.setTime2(rs.getString("Time2"));
                pay.setTime3(rs.getString("Time3"));
                pay.setTime4(rs.getString("Time4"));
                pay.setTime5(rs.getString("Time5"));
                pay.setHoursType(rs.getString("hoursType"));
                pay.setHoursprice(rs.getFloat("hoursprice"));
                pay.setAllTime(rs.getString("AllTime"));
                pay.setTotalPrice(rs.getFloat("totalPrice"));
                pay.setDate(rs.getString("Date"));
                list.add(pay);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }

    public static ArrayList<paymentDevicesModel> getAllRecordsFordevicenameMonthly(String devicename, String year, String Month) {
        ArrayList<paymentDevicesModel> list = new ArrayList<>();
        try {
            ResultSet rs = dbOperations.getData("select id,devicename,Time1,Time2,Time3,Time4,Time5,AllTime,hoursType,hoursprice,totalPrice,Date from PaymentDevices where devicename='" + devicename + "' and  Date like'" + year + "_" + Month + "_______________%'");
            while (rs.next()) {
                paymentDevicesModel pay = new paymentDevicesModel();
                pay.setId(rs.getInt("id"));
                pay.setDeviceName(rs.getString("devicename"));
                pay.setTime1(rs.getString("Time1"));
                pay.setTime2(rs.getString("Time2"));
                pay.setTime3(rs.getString("Time3"));
                pay.setTime4(rs.getString("Time4"));
                pay.setTime5(rs.getString("Time5"));
                pay.setHoursType(rs.getString("hoursType"));
                pay.setHoursprice(rs.getFloat("hoursprice"));
                pay.setAllTime(rs.getString("AllTime"));
                pay.setTotalPrice(rs.getFloat("totalPrice"));
                pay.setDate(rs.getString("Date"));
                list.add(pay);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }

    public static void deleteDrinksandTimesWithMonth(String year, String Month) {
        try {
            dbOperations.setDataOrDelete("delete from paymentdevices where Date like'" + year + "_" + Month + "_______________%'", "تم حذف شهر:" + Month);
            dbOperations.setDataOrDelete("delete from paymentproduct where Date like'" + year + "_" + Month + "_______________%'", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void deletePaymentDrinksWithid(int id) {
        try {
            dbOperations.setDataOrDelete("delete from paymentproduct where id=" + id, "تم الحذف");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
