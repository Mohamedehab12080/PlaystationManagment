package Controller;

import Database.connectionProvider;
import Database.dbOperations;
import Model.devicesModel;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

public class deviceCruds {

    public static void addDevice(devicesModel device) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = connectionProvider.getCon();
            ps = con.prepareStatement("insert into devices (devicename,priceofSingle,priceofMulti) values(?,?,?)");
            ps.setString(1, device.getDeviceName());
            ps.setFloat(2, device.getPriceofSingle());
            ps.setFloat(3, device.getPriceofMulti());
            int result = ps.executeUpdate();
            if (result == 0) {
                JOptionPane.showMessageDialog(null, "لم يتم الاضافة");
            } else {
                JOptionPane.showMessageDialog(null, "تم الاضافة");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public static void updateDevice(devicesModel device) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = connectionProvider.getCon();
            ps = con.prepareStatement("update devices set devicename=?,priceofSingle=?,priceofMulti=? where id=?");
            ps.setString(1, device.getDeviceName());
            ps.setFloat(2, device.getPriceofSingle());
            ps.setFloat(3, device.getPriceofMulti());
            ps.setInt(4, device.getId());
            int result = ps.executeUpdate();
            if (result == 0) {
                JOptionPane.showMessageDialog(null, "لم يتم التعديل");
            } else {
                JOptionPane.showMessageDialog(null, "تم التعديل");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public static void Delete(int deviceId) {
        try {
            dbOperations.setDataOrDelete("delete from devices where id=" + deviceId, "تم الحذف");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static ArrayList<devicesModel> getDevicesRecords() {
        ArrayList<devicesModel> list = new ArrayList<>();
        try {
            ResultSet rs = dbOperations.getData("select * from devices");
            while (rs.next()) {
                devicesModel device = new devicesModel();
                device.setId(rs.getInt("id"));
                device.setDeviceName(rs.getString("devicename"));
                device.setPriceofSingle(rs.getFloat("priceofSingle"));
                device.setPriceofMulti(rs.getFloat("priceofMulti"));
                list.add(device);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }

    public static ArrayList<String> getDevicenames() {
        ArrayList<String> list = new ArrayList<>();
        try {
            ResultSet rs = dbOperations.getData("select devicename from devices order by id");
            while (rs.next()) {
                list.add(rs.getString("devicename"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
}
