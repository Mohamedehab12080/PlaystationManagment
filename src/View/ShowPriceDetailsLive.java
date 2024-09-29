package View;

import Controller.m;
import Controller.paymentdevicesCruds;
import Controller.prductPaymentCruds;
import Model.paymentDevicesModel;
import Model.paymentProductModel;
import TOOLS.TableCustom;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ShowPriceDetailsLive extends javax.swing.JFrame {

    String DateMulti;
    String DateSingle;
    ArrayList<paymentDevicesModel> payDeList = null;
    ArrayList<paymentProductModel> payProList = null;
    ArrayList<paymentDevicesModel> payDeListMulti = null;
    int type = 0;

    public ShowPriceDetailsLive() {
        initComponents();
    }
//      public ShowPriceDetailsLive(ArrayList<paymentDevicesModel> payDeList,ArrayList<paymentProductModel> payProList,ArrayList<paymentDevicesModel>payDeListMulti,String devicename) {
//        initComponents();
//       this.payDeList=payDeList;
//        this.payProList=payProList;
//        this.payDeListMulti=payDeListMulti;
//        DeviceNameLabel.setText(devicename);
//        TOOLS.TableCustom.apply(jScrollPane1, TableCustom.TableType.MULTI_LINE);
//    }
//       public ShowPriceDetailsLive(ArrayList<paymentDevicesModel> payDeList,ArrayList<paymentProductModel> payProList,String devicename) {
//        initComponents();
//       this.payDeList=payDeList;
//        this.payProList=payProList;
//        DeviceNameLabel.setText(devicename);
//        TOOLS.TableCustom.apply(jScrollPane1, TableCustom.TableType.MULTI_LINE);
//    }
    m M;
    int more;
    int id1s = 0;
    int id2s = 0;

    public ShowPriceDetailsLive(ArrayList<paymentDevicesModel> payDeList, String devicename, int type) {
        initComponents();
        this.payDeList = payDeList;
        DeviceNameLabel.setText(devicename);
        txtDevicename2.setText(devicename);
        this.type = type;
        TOOLS.TableCustom.apply(jScrollPane1, TableCustom.TableType.MULTI_LINE);
        M = new m(1, Timer1);
        M.start();
    }

    public ShowPriceDetailsLive(String devicename, int id1, int id2, int more) {
        initComponents();
        DeviceNameLabel.setText(devicename);
        txtDevicename2.setText(devicename);
        this.more = more;
        this.id1s = id1;
        this.id2s = id2;
        TOOLS.TableCustom.apply(jScrollPane1, TableCustom.TableType.MULTI_LINE);
        M = new m(1, Timer1);
        M.start();
    }

    public void checkonTimesAndaddPaymentForFirst(paymentDevicesModel pays, JLabel labelid) {
        try {
            ArrayList<paymentDevicesModel> list = paymentdevicesCruds.checkonTimesAndaddPaymentForFirst(pays);
            Iterator<paymentDevicesModel> itr = list.iterator();
            while (itr.hasNext()) {
                paymentDevicesModel pay = itr.next();
                labelid.setText(String.valueOf(pay.getId()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public ShowPriceDetailsLive(ArrayList<paymentDevicesModel> payDeList, String devicename) {
        initComponents();
        this.payDeList = payDeList;
        DeviceNameLabel.setText(devicename);
        TOOLS.TableCustom.apply(jScrollPane1, TableCustom.TableType.MULTI_LINE);
    }

    public void getAllRecordsForDevicerealTimes() {
        if (payDeList != null) {
            Iterator<paymentDevicesModel> itr = payDeList.iterator();
            while (itr.hasNext()) {
                paymentDevicesModel paydev = itr.next();
                txtID1.setText(String.valueOf(paydev.getId()));
                txtStartTime.setText(paydev.getStartTime());
                txtEndTime.setText(paydev.getEndTime());
                txthoursType1.setText(paydev.getHoursType());
                txtTime1.setText(String.valueOf(paydev.getTime1()));
                txtPriceofTime1.setText(String.valueOf(paydev.getPriceofTime1()));
                txtTime2.setText(String.valueOf(paydev.getTime2()));
                txtPriceofTime2.setText(String.valueOf(paydev.getPriceOfTime2()));
                txtTime3.setText(String.valueOf(paydev.getTime3()));
                txtPriceofTime3.setText(String.valueOf(paydev.getPriceOfTime3()));
                txtTime4.setText(String.valueOf(paydev.getTime4()));
                txtPriceofTime4.setText(String.valueOf(paydev.getPriceOfTime4()));
                txtTime5.setText(String.valueOf(paydev.getTime5()));
                txtPriceofTime5.setText(String.valueOf(paydev.getPriceofTime5()));
                txtTotalTime.setText(paydev.getAllTime());
                txtTotalTimePrice.setText(String.valueOf(paydev.getTotalPrice()));
            }
        }
    }

    public void getAllRecordsForDevicTimesWithid() {
        try {
            ArrayList<paymentDevicesModel> list = paymentdevicesCruds.getAllRecordsForTimesWithID(id1s);
            Iterator<paymentDevicesModel> itr = list.iterator();
            while (itr.hasNext()) {
                paymentDevicesModel paydev = itr.next();
                txtID1.setText(String.valueOf(paydev.getId()));
                txtStartTime.setText(paydev.getStartTime());
                txtEndTime.setText(paydev.getEndTime());
                txthoursType1.setText(paydev.getHoursType());
                txtTime1.setText(String.valueOf(paydev.getTime1()));
                txtPriceofTime1.setText(String.valueOf(paydev.getPriceofTime1()));
                txtTime2.setText(String.valueOf(paydev.getTime2()));
                txtPriceofTime2.setText(String.valueOf(paydev.getPriceOfTime2()));
                txtTime3.setText(String.valueOf(paydev.getTime3()));
                txtPriceofTime3.setText(String.valueOf(paydev.getPriceOfTime3()));
                txtTime4.setText(String.valueOf(paydev.getTime4()));
                txtPriceofTime4.setText(String.valueOf(paydev.getPriceOfTime4()));
                txtTime5.setText(String.valueOf(paydev.getTime5()));
                txtPriceofTime5.setText(String.valueOf(paydev.getPriceofTime5()));
                txtTotalTime.setText(paydev.getAllTime());
                txtTotalTimePrice.setText(String.valueOf(paydev.getTotalPrice()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void getAllRecordsForDeviceSecondTimes() {
        ArrayList<paymentDevicesModel> list = paymentdevicesCruds.getAllrecordsForSecondTime(DeviceNameLabel.getText(), txtStartTime.getText(), txthoursType1.getText());
        Iterator<paymentDevicesModel> itr = list.iterator();
        while (itr.hasNext()) {
            paymentDevicesModel paydev = itr.next();
            txtID2.setText(String.valueOf(paydev.getId()));
            txtStartTime2.setText(paydev.getStartTime());
            txtEndTime2.setText(paydev.getEndTime());
            txtHoursType2.setText(paydev.getHoursType());
            txtTime21.setText(String.valueOf(paydev.getTime1()));
            txtPriceofTime21.setText(String.valueOf(paydev.getPriceofTime1()));
            txtTime22.setText(String.valueOf(paydev.getTime2()));
            txtPriceofTime22.setText(String.valueOf(paydev.getPriceOfTime2()));
            txtTime23.setText(String.valueOf(paydev.getTime3()));
            txtPriceofTime23.setText(String.valueOf(paydev.getPriceOfTime3()));
            txtTime24.setText(String.valueOf(paydev.getTime4()));
            txtPriceofTime24.setText(String.valueOf(paydev.getPriceOfTime4()));
            txtTime25.setText(String.valueOf(paydev.getTime5()));
            txtPriceofTime25.setText(String.valueOf(paydev.getPriceofTime5()));
            txtTotalTime2.setText(paydev.getAllTime());
            txtTotalTimePrice2.setText(String.valueOf(paydev.getTotalPrice()));
//              if(paydev.getHoursType().equals("Multi"))
//              {
//                  DateMulti=paydev.getDate();
//              }else
//              {
//                  DateSingle=paydev.getDate();
//              }
        }
    }

    public void getAllRecordsForDeviceSecondTimesWithID() {
        ArrayList<paymentDevicesModel> list = paymentdevicesCruds.getAllRecordsForTimesWithID(id2s);
        Iterator<paymentDevicesModel> itr = list.iterator();
        while (itr.hasNext()) {
            paymentDevicesModel paydev = itr.next();
            txtID2.setText(String.valueOf(paydev.getId()));
            txtStartTime2.setText(paydev.getStartTime());
            txtEndTime2.setText(paydev.getEndTime());
            txtHoursType2.setText(paydev.getHoursType());
            txtTime21.setText(String.valueOf(paydev.getTime1()));
            txtPriceofTime21.setText(String.valueOf(paydev.getPriceofTime1()));
            txtTime22.setText(String.valueOf(paydev.getTime2()));
            txtPriceofTime22.setText(String.valueOf(paydev.getPriceOfTime2()));
            txtTime23.setText(String.valueOf(paydev.getTime3()));
            txtPriceofTime23.setText(String.valueOf(paydev.getPriceOfTime3()));
            txtTime24.setText(String.valueOf(paydev.getTime4()));
            txtPriceofTime24.setText(String.valueOf(paydev.getPriceOfTime4()));
            txtTime25.setText(String.valueOf(paydev.getTime5()));
            txtPriceofTime25.setText(String.valueOf(paydev.getPriceofTime5()));
            txtTotalTime2.setText(paydev.getAllTime());
            txtTotalTimePrice2.setText(String.valueOf(paydev.getTotalPrice()));
//              if(paydev.getHoursType().equals("Multi"))
//              {
//                  DateMulti=paydev.getDate();
//              }else
//              {
//                  DateSingle=paydev.getDate();
//              }
        }
    }

    public void getAllRecordsofProduct() {
        try {
            int id1 = Integer.parseInt(txtID1.getText());
            int id2 = Integer.parseInt(txtID2.getText());
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            ArrayList<paymentProductModel> list1 = paymentdevicesCruds.getRecordsofDrinksWithDevicenameandDate(DeviceNameLabel.getText(), txtStartTime.getText());
            Iterator<paymentProductModel> itr1 = list1.iterator();
            ArrayList<paymentProductModel> list2;
            Iterator<paymentProductModel> itr2 = null;
            if (!txtID2.getText().equals("0")) {
                list2 = paymentdevicesCruds.getRecordsofDrinksWithDevicenameandDate(DeviceNameLabel.getText(), txtStartTime2.getText());
                itr2 = list2.iterator();
                while (itr1.hasNext() && itr2.hasNext()) {
                    paymentProductModel paypro = itr1.next();
                    paymentProductModel paypro2 = itr2.next();
                    if (paypro.getProductname().equals(paypro2.getProductname())) {
                        dtm.addRow(new Object[]{
                            paypro.getProductname(),
                            paypro.getProductprice(),
                            paypro.getQuantityneeded() + paypro2.getQuantityneeded(),
                            paypro.getPriceofTaken() + paypro2.getPriceofTaken()
                        });
                    } else {
                        dtm.addRow(new Object[]{
                            paypro.getProductname(),
                            paypro.getProductprice(),
                            paypro.getQuantityneeded(),
                            paypro.getPriceofTaken()
                        });
                        dtm.addRow(new Object[]{
                            paypro2.getProductname(),
                            paypro2.getProductprice(),
                            paypro2.getQuantityneeded(),
                            paypro2.getPriceofTaken()
                        });
                    }
                }
                while (itr1.hasNext()) {
                    paymentProductModel paypro = itr1.next();
                    DeviceNameLabel.setText(paypro.getDeviceName());
                    dtm.addRow(new Object[]{
                        paypro.getProductname(),
                        paypro.getProductprice(),
                        paypro.getQuantityneeded(),
                        paypro.getPriceofTaken()
                    });
                }
                while (itr2.hasNext()) {
                    paymentProductModel paypro2 = itr2.next();
                    DeviceNameLabel.setText(paypro2.getDeviceName());
                    dtm.addRow(new Object[]{
                        paypro2.getProductname(),
                        paypro2.getProductprice(),
                        paypro2.getQuantityneeded(),
                        paypro2.getPriceofTaken()
                    });
                }
            } else {
                while (itr1.hasNext()) {
                    paymentProductModel paypro = itr1.next();
                    DeviceNameLabel.setText(paypro.getDeviceName());
                    dtm.addRow(new Object[]{
                        paypro.getProductname(),
                        paypro.getProductprice(),
                        paypro.getQuantityneeded(),
                        paypro.getPriceofTaken()
                    });
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void setTotalPriceforDrinks() {
        float sum = 0;
        try {
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                sum += Float.parseFloat(jTable1.getValueAt(i, 3).toString());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        txtTotalDrinksPrice.setText(String.valueOf(sum));
    }

    public void setTotalofAllPrice() {
        try {
            txtTotalOfAll.setText(String.valueOf(new DecimalFormat("##.##").format(Float.parseFloat(txtTotalTimePrice2.getText()) + Float.parseFloat(txtTotalTimePrice.getText()) + Float.parseFloat(txtTotalDrinksPrice.getText()))));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        DeviceNameLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        txtTotalDrinksPrice = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtTotalOfAll = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        txthoursType1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtStartTime = new javax.swing.JLabel();
        txtEndTime = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtTime1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPriceofTime1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTime2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPriceofTime2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtTime3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPriceofTime3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPriceofTime4 = new javax.swing.JLabel();
        txtTime4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtPriceofTime5 = new javax.swing.JLabel();
        txtTime5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTotalTime = new javax.swing.JLabel();
        txtTotalTimePrice = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtTime21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtPriceofTime21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtTime22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtPriceofTime22 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtTime23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtPriceofTime23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtPriceofTime24 = new javax.swing.JLabel();
        txtTime24 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        txtPriceofTime25 = new javax.swing.JLabel();
        txtTime25 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtTotalTime2 = new javax.swing.JLabel();
        txtTotalTimePrice2 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtStartTime2 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtEndTime2 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtHoursType2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtID2 = new javax.swing.JLabel();
        txtID1 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        btnStart1 = new javax.swing.JButton();
        btnStop1 = new javax.swing.JButton();
        btnreset1 = new javax.swing.JButton();
        multi_1 = new javax.swing.JCheckBox();
        btnHand1 = new javax.swing.JButton();
        Timer1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        txtDevicename2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnDrinks1 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        btnsave1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clock.png"))); // NOI18N
        jLabel2.setText("الوقت");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/soda.png"))); // NOI18N
        jLabel3.setText("المشاريب");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        DeviceNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeviceNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        DeviceNameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/controller.png"))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "المشروب", "السعر", "العدد", "التكلفة"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane1);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("تكلفة المشاريب الكلية:");

        txtTotalDrinksPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTotalDrinksPrice.setForeground(new java.awt.Color(0, 153, 0));
        txtTotalDrinksPrice.setText("0.0");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 204));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salary.png"))); // NOI18N
        jLabel19.setText("TOTAL:");

        txtTotalOfAll.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTotalOfAll.setForeground(new java.awt.Color(0, 153, 51));
        txtTotalOfAll.setText("0.0");

        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClose.setForeground(new java.awt.Color(0, 0, 0));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        btnClose.setText("خروج");
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        txthoursType1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txthoursType1.setForeground(new java.awt.Color(0, 0, 0));
        txthoursType1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Start Time:");

        txtStartTime.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtStartTime.setForeground(new java.awt.Color(0, 0, 0));
        txtStartTime.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtStartTime.setText("00:00:00");

        txtEndTime.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtEndTime.setForeground(new java.awt.Color(0, 0, 0));
        txtEndTime.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtEndTime.setText("00:00:00");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("End Time:");

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTime1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTime1.setForeground(new java.awt.Color(0, 0, 0));
        txtTime1.setText("00:00");
        jPanel2.add(txtTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 6, 98, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Time1:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        txtPriceofTime1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPriceofTime1.setForeground(new java.awt.Color(0, 102, 204));
        txtPriceofTime1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPriceofTime1.setText("0.0");
        jPanel2.add(txtPriceofTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 38, 98, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("تكلفة:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 38, -1, -1));

        txtTime2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTime2.setForeground(new java.awt.Color(0, 0, 0));
        txtTime2.setText("00:00");
        jPanel2.add(txtTime2, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 69, 98, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Time2:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 69, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("تكلفة:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 101, -1, -1));

        txtPriceofTime2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPriceofTime2.setForeground(new java.awt.Color(0, 102, 204));
        txtPriceofTime2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPriceofTime2.setText("0.0");
        jPanel2.add(txtPriceofTime2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 101, 98, -1));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTime3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTime3.setForeground(new java.awt.Color(0, 0, 0));
        txtTime3.setText("00:00");
        jPanel3.add(txtTime3, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 6, 98, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Time3:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        txtPriceofTime3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPriceofTime3.setForeground(new java.awt.Color(0, 102, 204));
        txtPriceofTime3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPriceofTime3.setText("0.0");
        jPanel3.add(txtPriceofTime3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 38, 98, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("تكلفة:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 38, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("تكلفة:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 101, -1, -1));

        txtPriceofTime4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPriceofTime4.setForeground(new java.awt.Color(0, 102, 204));
        txtPriceofTime4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPriceofTime4.setText("0.0");
        jPanel3.add(txtPriceofTime4, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 101, 98, -1));

        txtTime4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTime4.setForeground(new java.awt.Color(0, 0, 0));
        txtTime4.setText("00:00");
        jPanel3.add(txtTime4, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 69, 98, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Time4:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 69, -1, -1));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("تكلفة:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 32, -1, -1));

        txtPriceofTime5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPriceofTime5.setForeground(new java.awt.Color(0, 102, 204));
        txtPriceofTime5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPriceofTime5.setText("0.0");
        jPanel4.add(txtPriceofTime5, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 32, 98, -1));

        txtTime5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTime5.setForeground(new java.awt.Color(0, 0, 0));
        txtTime5.setText("00:00");
        jPanel4.add(txtTime5, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 6, 98, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Time5:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Total Time:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 63, -1, -1));

        txtTotalTime.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTotalTime.setForeground(new java.awt.Color(0, 153, 51));
        txtTotalTime.setText("00:00");
        jPanel4.add(txtTotalTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 63, 81, -1));

        txtTotalTimePrice.setBackground(new java.awt.Color(0, 0, 0));
        txtTotalTimePrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTotalTimePrice.setForeground(new java.awt.Color(204, 0, 0));
        txtTotalTimePrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalTimePrice.setText("0.0");
        txtTotalTimePrice.setOpaque(true);
        jPanel4.add(txtTotalTimePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 94, 81, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("التكلفة الكلية:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 94, -1, -1));

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTime21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTime21.setForeground(new java.awt.Color(0, 0, 0));
        txtTime21.setText("00:00");
        jPanel5.add(txtTime21, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 6, 98, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Time1:");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        txtPriceofTime21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPriceofTime21.setForeground(new java.awt.Color(0, 102, 204));
        txtPriceofTime21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPriceofTime21.setText("0.0");
        jPanel5.add(txtPriceofTime21, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 38, 98, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("تكلفة:");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 38, -1, -1));

        txtTime22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTime22.setForeground(new java.awt.Color(0, 0, 0));
        txtTime22.setText("00:00");
        jPanel5.add(txtTime22, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 69, 98, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Time2:");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 69, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("تكلفة:");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 101, -1, -1));

        txtPriceofTime22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPriceofTime22.setForeground(new java.awt.Color(0, 102, 204));
        txtPriceofTime22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPriceofTime22.setText("0.0");
        jPanel5.add(txtPriceofTime22, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 101, 98, -1));

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTime23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTime23.setForeground(new java.awt.Color(0, 0, 0));
        txtTime23.setText("00:00");
        jPanel6.add(txtTime23, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 6, 98, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Time3:");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        txtPriceofTime23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPriceofTime23.setForeground(new java.awt.Color(0, 102, 204));
        txtPriceofTime23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPriceofTime23.setText("0.0");
        jPanel6.add(txtPriceofTime23, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 38, 98, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("تكلفة:");
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 38, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("تكلفة:");
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 101, -1, -1));

        txtPriceofTime24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPriceofTime24.setForeground(new java.awt.Color(0, 102, 204));
        txtPriceofTime24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPriceofTime24.setText("0.0");
        jPanel6.add(txtPriceofTime24, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 101, 98, -1));

        txtTime24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTime24.setForeground(new java.awt.Color(0, 0, 0));
        txtTime24.setText("00:00");
        jPanel6.add(txtTime24, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 69, 98, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Time4:");
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 69, -1, -1));

        jPanel7.setBackground(new java.awt.Color(204, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("تكلفة:");
        jPanel7.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 32, -1, -1));

        txtPriceofTime25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPriceofTime25.setForeground(new java.awt.Color(0, 102, 204));
        txtPriceofTime25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPriceofTime25.setText("0.0");
        jPanel7.add(txtPriceofTime25, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 32, 98, -1));

        txtTime25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTime25.setForeground(new java.awt.Color(0, 0, 0));
        txtTime25.setText("00:00");
        jPanel7.add(txtTime25, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 6, 98, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Time5:");
        jPanel7.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Total Time:");
        jPanel7.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 63, -1, -1));

        txtTotalTime2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTotalTime2.setForeground(new java.awt.Color(0, 153, 51));
        txtTotalTime2.setText("00:00");
        jPanel7.add(txtTotalTime2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 63, 81, -1));

        txtTotalTimePrice2.setBackground(new java.awt.Color(0, 0, 0));
        txtTotalTimePrice2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTotalTimePrice2.setForeground(new java.awt.Color(204, 0, 0));
        txtTotalTimePrice2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalTimePrice2.setText("0.0");
        txtTotalTimePrice2.setOpaque(true);
        jPanel7.add(txtTotalTimePrice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 94, 81, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("التكلفة الكلية:");
        jPanel7.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 94, -1, -1));

        txtStartTime2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtStartTime2.setForeground(new java.awt.Color(0, 0, 0));
        txtStartTime2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtStartTime2.setText("00:00:00");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Start Time:");

        txtEndTime2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtEndTime2.setForeground(new java.awt.Color(0, 0, 0));
        txtEndTime2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtEndTime2.setText("00:00:00");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("End Time:");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtHoursType2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtHoursType2.setForeground(new java.awt.Color(0, 0, 0));
        txtHoursType2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID:");

        txtID2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtID2.setForeground(new java.awt.Color(0, 0, 0));
        txtID2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtID2.setText("0");

        txtID1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtID1.setForeground(new java.awt.Color(0, 0, 0));
        txtID1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtID1.setText("0");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("ID:");

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setForeground(new java.awt.Color(60, 63, 65));
        jPanel11.setToolTipText("");
        jPanel11.setLayout(new javax.swing.BoxLayout(jPanel11, javax.swing.BoxLayout.LINE_AXIS));

        btnStart1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play (1).png"))); // NOI18N
        btnStart1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart1ActionPerformed(evt);
            }
        });
        jPanel11.add(btnStart1);

        btnStop1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stopsmall.png"))); // NOI18N
        btnStop1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStop1ActionPerformed(evt);
            }
        });
        jPanel11.add(btnStop1);

        btnreset1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/resetsmall.png"))); // NOI18N
        btnreset1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset1ActionPerformed(evt);
            }
        });
        jPanel11.add(btnreset1);

        multi_1.setBackground(new java.awt.Color(51, 51, 51));
        multi_1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        multi_1.setForeground(new java.awt.Color(201, 118, 36));
        multi_1.setText("Multi");
        jPanel11.add(multi_1);

        btnHand1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHand1.setForeground(new java.awt.Color(0, 0, 0));
        btnHand1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tapsmall.png"))); // NOI18N
        btnHand1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHand1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHand1ActionPerformed(evt);
            }
        });
        jPanel11.add(btnHand1);

        Timer1.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        Timer1.setForeground(new java.awt.Color(0, 0, 0));
        Timer1.setText("00 : 00 : 00 ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ID:");

        id1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id1.setForeground(new java.awt.Color(0, 0, 0));
        id1.setText("0");

        txtDevicename2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtDevicename2.setForeground(new java.awt.Color(0, 0, 0));
        txtDevicename2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/controller.png"))); // NOI18N

        jPanel8.setBackground(new java.awt.Color(204, 255, 255));
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        btnDrinks1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDrinks1.setForeground(new java.awt.Color(0, 0, 0));
        btnDrinks1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/soda (1).png"))); // NOI18N
        btnDrinks1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDrinks1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinks1ActionPerformed(evt);
            }
        });
        jPanel8.add(btnDrinks1);

        jLabel37.setText("*******");
        jPanel8.add(jLabel37);

        btnsave1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsave1.setForeground(new java.awt.Color(0, 0, 0));
        btnsave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnsave1.setText("حفظ");
        btnsave1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsave1ActionPerformed(evt);
            }
        });
        jPanel8.add(btnsave1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DeviceNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStartTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtID1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(txthoursType1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 5, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEndTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStartTime2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEndTime2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtID2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtHoursType2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDevicename2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Timer1)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)
                                .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(212, 212, 212))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(104, 104, 104)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel19)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtTotalOfAll, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtTotalDrinksPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel18))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(228, 228, 228)
                                .addComponent(jLabel3)))
                        .addGap(74, 74, 74))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DeviceNameLabel))
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(txtStartTime2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(txtEndTime2))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txthoursType1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel38)
                                                        .addComponent(txtID1)))
                                                .addGap(44, 44, 44)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel20)
                                                    .addComponent(txtStartTime))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel21)
                                                    .addComponent(txtEndTime)))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel1)
                                                    .addComponent(txtID2))
                                                .addComponent(txtHoursType2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 5, Short.MAX_VALUE)))
                                .addContainerGap())
                            .addComponent(jSeparator1)))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDevicename2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Timer1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(id1)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalDrinksPrice)
                    .addComponent(jLabel18))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtTotalOfAll))
                .addGap(36, 36, 36)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try {
            if (more == 1) {
                getAllRecordsForDevicTimesWithid();
                getAllRecordsForDeviceSecondTimesWithID();
                getAllRecordsofProduct();
                setTotalPriceforDrinks();
                setTotalofAllPrice();
            } else if (type == 1 && more == 0) {
                getAllRecordsForDevicerealTimes();
                getAllRecordsForDeviceSecondTimes();
                getAllRecordsofProduct();
                setTotalPriceforDrinks();
                setTotalofAllPrice();
            } else {
                getAllRecordsForDevicerealTimes();
                getAllRecordsofProduct();
                setTotalPriceforDrinks();
                setTotalofAllPrice();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed

        if (M.state[0] == false) {
            this.dispose();
        } else {
            JOptionPane.showConfirmDialog(null, "لا يمكن الخروج فيه تايم شغال", "تحذير", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnStart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart1ActionPerformed

        try {
            btnStop1.setEnabled(true);
            btnreset1.setEnabled(false);
            btnStart1.setEnabled(false);
            M.state[0] = true;
            if (multi_1.isSelected()) {
                if (txthoursType1.getText().equals("Multi")) {
                    id1.setText(txtID1.getText());
                } else {
                    id1.setText(txtID2.getText());
                }
            } else {
                if (txthoursType1.getText().equals("Single")) {
                    id1.setText(txtID1.getText());
                } else {
                    id1.setText(txtID2.getText());
                }
            }
        } catch (Exception e) {
        }
        ////        if(id1.getText().equals("0"))
        ////        {
        ////            paymentDevicesModel pay=new paymentDevicesModel();
        ////            pay.setDate(date1);
        ////            pay.setDeviceName("PS 1");
        ////            paymentdevicesCruds.InitializeDeviceTimer(pay);
        ////        }
        ////          id1.setText(String.valueOf(paymentdevicesCruds.getIDwithEndTimeandDeviceName("PS 1")));
        //        state1 = true;
        //        Thread times = new Thread() {
        //            int seconds = 0;
        //            @Override
        //            public void run() {
        //                for (;;) {
        //                    if (state1 == true) {
        //                        try {
        //                            sleep(1000);
        //                            if (seconds >= 60) {
        //                                seconds = 0;
        //                                minutes1 ++;
        //                            }
        //                            if (minutes1 >= 60) {
        //                                minutes1 = 0;
        //                                hours1++;
        //                            }
        //                            seconds++;
        //                            Timer1.setText(hours1 + ":" + minutes1 + ":" + seconds);
        //                        } catch (Exception e) {
        //                            JOptionPane.showMessageDialog(null, e);
        //                        }
        //                    } else {
        //                        break;
        //                    }
        //                }
        //            }
        //        };
        //        times.start();
    }//GEN-LAST:event_btnStart1ActionPerformed

    private void btnStop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop1ActionPerformed
        M.state[0] = false;
        float MultiPrice = paymentdevicesCruds.getMultiPriceandSingle(DeviceNameLabel.getText(), "Multi");
        float SinglePrice = paymentdevicesCruds.getMultiPriceandSingle(DeviceNameLabel.getText(), "");
        boolean checkforMulti = false;
        btnStart1.setEnabled(true);
        btnreset1.setEnabled(true);
        String Time = Timer1.getText();
        float TimeForCalcAll = 0;
        float timeforCalc = 0;
        float priceOfOneTime = 0;
        int minutes = 0;
        String TimeSent = "";
        try {
            paymentDevicesModel pay = new paymentDevicesModel();
            int id;
            pay.setDeviceName(DeviceNameLabel.getText());
            if (Time.charAt(0) != '0' && Time.charAt(2) != '0' && Time.charAt(3) != ':') {
                minutes = Integer.parseInt(Time.charAt(2) + "" + Time.charAt(3));
                float Hour = Float.parseFloat("" + Time.charAt(0));
                if (minutes <= 17) {
                    if (minutes > 10) {
                        timeforCalc = Float.parseFloat(String.valueOf(Hour + 0.25));
                        minutes = 15;
                    } else if (minutes >= 6) {
                        timeforCalc = Float.parseFloat(String.valueOf(Hour + 0.16));
                        minutes = 10;
                    }
                }
                if (minutes > 17 && minutes < 23) {
                    timeforCalc = Float.parseFloat(String.valueOf(Hour + 0.35));
                    minutes = 20;
                }
                if (minutes >= 23 && minutes <= 25) {
                    timeforCalc = Float.parseFloat(String.valueOf(Hour + 0.4));
                    minutes = 25;
                }
                if (minutes > 25 && minutes <=32) {
                    timeforCalc = Float.parseFloat(String.valueOf(Hour + 0.5));
                    minutes = 30;
                }
                if (minutes > 32 && minutes <= 35) {
                    timeforCalc = Float.parseFloat(String.valueOf(Hour + 0.59));
                    minutes = 35;
                }
                if (minutes > 35 && minutes <= 40) {
                    timeforCalc = Float.parseFloat(String.valueOf(Hour + 0.65));
                    minutes = 40;
                }
                if (minutes > 40 && minutes <= 45) {
                    timeforCalc = Float.parseFloat(String.valueOf(Hour + 0.75));
                    minutes = 45;
                }
                if (minutes > 45 && minutes <= 50) {
                    timeforCalc = Float.parseFloat(String.valueOf(Hour + 0.85));
                    minutes = 50;
                }
                if (minutes > 50 && minutes <= 60) {
                    timeforCalc = Hour + 1;
                    minutes = 0;
                }
                TimeSent = Time.charAt(0) + ":" + String.valueOf(Time.charAt(2) + "" + Time.charAt(3));
            }
            if (Time.charAt(0) != '0' && Time.charAt(2) != '0' && Time.charAt(3) == ':') {
                float Hour = Float.parseFloat("" + Time.charAt(0));
                minutes = Integer.parseInt(Time.charAt(2) + "");
                if (minutes >= 6) {
                    timeforCalc = Float.parseFloat(String.valueOf(Hour + 0.16));
                    minutes = 10;
                } else if (minutes < 6) {
                    timeforCalc = Float.parseFloat(String.valueOf(Hour + 0.1));
                    minutes = 5;
                }
                TimeSent = Time.charAt(0) + ":" + minutes;
            }
            if (Time.charAt(0) != '0' && Time.charAt(2) == '0' && Time.charAt(3) == ':') {
                float Hour = Float.parseFloat("" + Time.charAt(0));
                timeforCalc = Hour;
                TimeSent = "" + Hour;
            }
            if (Time.charAt(0) == '0' && Time.charAt(2) != '0' && Time.charAt(3) != ':') {
                minutes = Integer.parseInt(Time.charAt(2) + "" + Time.charAt(3));
                if (minutes <= 17) {
                    if (minutes > 10) {
                        timeforCalc = Float.parseFloat(String.valueOf(0.25));
                        minutes = 15;
//                        JOptionPane.showMessageDialog(null, "Worked");
                    } else if (minutes >= 6) {
                        timeforCalc = Float.parseFloat(String.valueOf(0.16));
                        minutes = 10;
                    }
                }
                if (minutes > 17 && minutes < 23) {
                    timeforCalc = Float.parseFloat(String.valueOf(0.35));
                    minutes = 20;
                }
                if (minutes >= 23 && minutes <= 25) {
                    timeforCalc = Float.parseFloat(String.valueOf(0.4));
                    minutes = 25;
                }
                if (minutes > 25 && minutes <=32) {
                    timeforCalc = Float.parseFloat(String.valueOf(0.5));
                    minutes = 30;
                }
                if (minutes > 32 && minutes <= 35) {
                    timeforCalc = Float.parseFloat(String.valueOf(0.59));
                    minutes = 35;
                }
                if (minutes > 35 && minutes <= 40) {
                    timeforCalc = Float.parseFloat(String.valueOf(0.65));
                    minutes = 40;
                }
                if (minutes > 40 && minutes <= 45) {
                    timeforCalc = Float.parseFloat(String.valueOf(0.75));
                    minutes = 45;
                }
                if (minutes > 45 && minutes <= 50) {
                    timeforCalc = Float.parseFloat(String.valueOf(0.85));
                    minutes = 50;
                }
                if (minutes > 50 && minutes <= 60) {
                    timeforCalc = 1;
                    minutes = 59;
                }
                TimeSent = String.valueOf(minutes);
            }
            if (Time.charAt(0) == '0' && Time.charAt(2) != '0' && Time.charAt(3) == ':') {
                minutes = Integer.parseInt("" + Time.charAt(2));
                if (minutes <= 9) {
                    if (minutes >= 6) {
                        timeforCalc = Float.parseFloat(String.valueOf(0.16));
                        minutes = 10;
                    } else if (minutes < 6) {
                        timeforCalc = Float.parseFloat(String.valueOf(0.1));
                        minutes = 5;
                    }
                }
                TimeSent = String.valueOf(minutes);
            }

            pay.setTime1(TimeSent);
            if (multi_1.isSelected()) {
                pay.setHoursType("Multi");
                pay.setHoursprice(MultiPrice);
                checkforMulti = true;
            } else {
                pay.setHoursType("Single");
                pay.setHoursprice(SinglePrice);
                checkforMulti = false;
            }
// Check for set The Time 1 or 2 or 3 or 4 or 5
            id = Integer.parseInt(id1.getText());
            pay.setId(id);
            ArrayList<paymentDevicesModel> list = paymentdevicesCruds.getTimesRecords(id);
            Iterator<paymentDevicesModel> itr = list.iterator();
            while (itr.hasNext()) {
                paymentDevicesModel payed = itr.next();
                if (!payed.getTime1().equals("0")) {

                    if (payed.getTime2().equals("0")) {
                        pay.setTime1(payed.getTime1());
                        pay.setPriceofTime1(payed.getPriceofTime1());
                        pay.setTime3(payed.getTime3());
                        pay.setPriceOfTime3(payed.getPriceOfTime3());
                        pay.setTime4(payed.getTime4());
                        pay.setPriceOfTime4(payed.getPriceOfTime4());
                        pay.setTime5(payed.getTime5());
                        pay.setPriceofTime5(payed.getPriceofTime5());
                        pay.setTime2(TimeSent);
                        if (checkforMulti == true) {
                            pay.setPriceOfTime2(timeforCalc * MultiPrice);
                            JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 2: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * MultiPrice) + "</h2></html>");
                        } else {
                            pay.setPriceOfTime2(timeforCalc * SinglePrice);
                            JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 2: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * SinglePrice) + "</h2></html>");
                        }

                    } else if (payed.getTime3().equals("0")) {
                        pay.setTime1(payed.getTime1());
                        pay.setPriceofTime1(payed.getPriceofTime1());
                        pay.setTime2(payed.getTime2());
                        pay.setPriceOfTime2(payed.getPriceOfTime2());
                        pay.setTime4(payed.getTime4());
                        pay.setPriceOfTime4(payed.getPriceOfTime4());
                        pay.setTime5(payed.getTime5());
                        pay.setPriceofTime5(payed.getPriceofTime5());
                        pay.setTime3(TimeSent);
                        if (checkforMulti == true) {
                            pay.setPriceOfTime3(timeforCalc * MultiPrice);
                            JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 3: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * MultiPrice) + "</h2></html>");
                        } else {
                            pay.setPriceOfTime3(timeforCalc * SinglePrice);
                            JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 3: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * SinglePrice) + "</h2></html>");
                        }
                    } else if (payed.getTime4().equals("0")) {
                        pay.setTime1(payed.getTime1());
                        pay.setPriceofTime1(payed.getPriceofTime1());
                        pay.setTime2(payed.getTime2());
                        pay.setPriceOfTime2(payed.getPriceOfTime2());
                        pay.setTime3(payed.getTime3());
                        pay.setPriceOfTime3(payed.getPriceOfTime3());
                        pay.setTime4(payed.getTime4());
                        pay.setPriceOfTime4(payed.getPriceOfTime4());
                        pay.setTime5(payed.getTime5());
                        pay.setPriceofTime5(payed.getPriceofTime5());
                        pay.setTime4(TimeSent);
                        if (checkforMulti == true) {
                            pay.setPriceOfTime4(timeforCalc * MultiPrice);
                            JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 4: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * MultiPrice) + "</h2></html>");
                        } else {
                            pay.setPriceOfTime4(timeforCalc * SinglePrice);
                            JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 4: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * SinglePrice) + "</h2></html>");
                        }
                    } else if (payed.getTime5().equals("0")) {
                        pay.setTime1(payed.getTime1());
                        pay.setPriceofTime1(payed.getPriceofTime1());
                        pay.setTime2(payed.getTime2());
                        pay.setPriceOfTime2(payed.getPriceOfTime2());
                        pay.setTime3(payed.getTime3());
                        pay.setPriceOfTime3(payed.getPriceOfTime3());
                        pay.setTime4(payed.getTime4());
                        pay.setPriceOfTime4(payed.getPriceOfTime4());
                        pay.setTime5(TimeSent);
                        if (checkforMulti == true) {
                            pay.setPriceofTime5(timeforCalc * MultiPrice);
                            JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 5: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * MultiPrice) + "</h2></html>");
                        } else {
                            pay.setPriceofTime5(timeforCalc * SinglePrice);
                            JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 5: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * SinglePrice) + "</h2></html>");
                        }
                    } else {
                        pay.setTime1(payed.getTime1());
                        pay.setPriceofTime1(payed.getPriceofTime1());
                        pay.setTime2(payed.getTime2());
                        pay.setPriceOfTime2(payed.getPriceOfTime2());
                        pay.setTime3(payed.getTime3());
                        pay.setPriceOfTime3(payed.getPriceOfTime3());
                        pay.setTime4(payed.getTime4());
                        pay.setPriceOfTime4(payed.getPriceOfTime4());
                        pay.setTime5(payed.getTime5());
                        pay.setPriceofTime5(payed.getPriceofTime5());
                    }
                    paymentdevicesCruds.UpdatePaymentForTimes(pay, id);
                }
                /// Update Remaining and Calculate of totalTime and Total Price and price for every time 
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnStop1ActionPerformed

    private void btnreset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset1ActionPerformed
        try {
            M.hours[0] = 0;
            M.minuts[0] = 0;
            M.seconds[0] = 0;
            Timer1.setText(0 + ":" + 0 + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnreset1ActionPerformed

    private void btnHand1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHand1ActionPerformed
        // Set the Time manualy from set hour1 and set minutes1 as global vrialbles for device 1
        int hourss;
        int minutes;
        try {
            String a = JOptionPane.showInputDialog(null, "ادخل عدد الساعات", JOptionPane.PLAIN_MESSAGE);
            if (!a.equals("")) {
                hourss = Integer.parseInt(a);
                M.hours[0] = hourss;
                String b = JOptionPane.showInputDialog(null, "ادخل عدد الدقائق", JOptionPane.PLAIN_MESSAGE);
                if (!b.equals("")) {
                    minutes = Integer.parseInt(b);
                    M.minuts[0] = minutes;
                } else {
                    M.minuts[0] = 0;
                }
            } else {
                M.hours[0] = 0;
            }
            M.seconds[0] = 0;
            Timer1.setText(M.hours[0] + ":" + M.minuts[0] + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnHand1ActionPerformed

    private void btnDrinks1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinks1ActionPerformed
        int id = Integer.parseInt(id1.getText());
        if (multi_1.isSelected()) {
            new addDrinksForDevices(DeviceNameLabel.getText(), paymentdevicesCruds.getDateWithID(id)).setVisible(true);
        } else {
            new addDrinksForDevices(DeviceNameLabel.getText(), paymentdevicesCruds.getDateWithID(id)).setVisible(true);
        }
    }//GEN-LAST:event_btnDrinks1ActionPerformed

    private void btnsave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsave1ActionPerformed
        paymentDevicesModel pay = new paymentDevicesModel();
        String EndTime1;
        int ids = 0;

        try {
            ids = Integer.parseInt(id1.getText());
            float sumofPriceAll = 0;
            String TotalPriceDevid;
            float SinglePrice = paymentdevicesCruds.getMultiPriceandSingle(DeviceNameLabel.getText(), "");
            float MultiPrice = paymentdevicesCruds.getMultiPriceandSingle(DeviceNameLabel.getText(), "Multi");
            ArrayList<Float> list = paymentdevicesCruds.getAllTimePrice(ids);
            for (int i = 0; i < list.size(); i++) {
                sumofPriceAll += list.get(i);
            }

            pay.setTotalPrice(Float.parseFloat(String.valueOf(sumofPriceAll)));
            if (multi_1.isSelected()) {
                if (txthoursType1.getText().equals("Multi")) {
                    pay.setStartTime(txtStartTime.getText());
                    pay.setEndTime(txtEndTime.getText());
                    EndTime1 = txtEndTime.getText();
                } else {
                    pay.setStartTime(txtStartTime2.getText());
                    pay.setEndTime(txtEndTime2.getText());
                    EndTime1 = txtEndTime2.getText();
                }
              String TotalPriceDevidForCheck=String.format("%.2f", sumofPriceAll / MultiPrice);
                TotalPriceDevid = String.valueOf(sumofPriceAll / MultiPrice);
                String minutes = "";
                int minutesf = 0;
                float hours = 0;
                if (TotalPriceDevidForCheck.length() == 4) {
                    if (TotalPriceDevidForCheck.charAt(2)!='0') {
                        minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                        hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                        minutesf = Integer.parseInt(minutes);
                        if(minutesf<=5)
                        {
                            pay.setAllTime(String.valueOf(hours));
                        }
                        if (minutesf>5&&minutesf <= 10) {
                            pay.setAllTime(String.valueOf(hours+0.5));
                        }
                        if (minutesf >= 16 && minutesf <= 21) {
                            pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                        }
                        if (minutesf > 21 && minutesf <= 25) {
                            pay.setAllTime(String.valueOf(hours + 0.15));
                        }
                        if (minutesf > 25 && minutesf <= 35) {
                            pay.setAllTime(String.valueOf(hours + 0.2) + "0");
                        }
                        if (minutesf > 35 && minutesf < 45) {
                            pay.setAllTime(String.valueOf(hours + 0.25));
                        }
                        if (minutesf >= 45 && minutesf < 58) {
                            pay.setAllTime(String.valueOf(hours + 0.3) + "0");
                        }
                        if (minutesf >= 58 && minutesf <= 64) {
                            pay.setAllTime(String.valueOf(hours + 0.35));
                        }
                        if (minutesf > 64 && minutesf <= 70) {
                            pay.setAllTime(String.valueOf(hours + 0.4) + "0");
                        }
                        if (minutesf > 70 && minutesf <= 80) {
                            pay.setAllTime(String.valueOf(hours + 0.45));
                        }
                        if (minutesf > 80 && minutesf <= 90) {
                            pay.setAllTime(String.valueOf(hours + 0.5) + "0");
                        }
                        if (minutesf > 90 && minutesf <= 99) {
                            pay.setAllTime(String.valueOf(hours + 1));
                        }
                        }else
                        {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }
//                     else if (Character.isDigit(TotalPriceDevid.charAt(1))&&!Character.isDigit(TotalPriceDevid.charAt(2))&&Character.isDigit(TotalPriceDevid.charAt(3))) {
//                        minutes = TotalPriceDevid.charAt(3) + "";
//                        minutesf = Integer.parseInt(minutes);
//                        JOptionPane.showMessageDialog(null, TotalPriceDevid + " 3  " + minutes);
//                        hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
//                        
//                        if (minutesf == 0) {
//                            pay.setAllTime(String.valueOf(hours));
//                        }
//                        if (minutesf == 1) {
//                            pay.setAllTime(String.valueOf(hours + 0.5));
//                        }
//                        if (minutesf == 2) {
//                            pay.setAllTime(String.valueOf(hours + 0.1) + "0");
//                        }
//                        if (minutesf == 3) {
//                            pay.setAllTime(String.valueOf(hours + 0.2) + "0");
//                        }
//                        if (minutesf == 4) {
//                            pay.setAllTime(String.valueOf(hours + 0.25));
//                            JOptionPane.showMessageDialog(null, minutesf + ": " + TotalPriceDevid);
//                        }
//                        if (minutesf == 5) {
//                            pay.setAllTime(String.valueOf(hours + 0.3) + "0");
//                        }
//                        if (minutesf == 6) {
//                            pay.setAllTime(String.valueOf(hours + 0.4) + "0");
//                        }
//                        if (minutesf == 7) {
//                            pay.setAllTime(String.valueOf(hours + 0.45));
//                        }
//                        if (minutesf == 8) {
//                            pay.setAllTime(String.valueOf(hours + 0.5) + "0");
//                        }
//                        if (minutesf == 9) {
//                            pay.setAllTime(String.valueOf(hours + 1));
//                        }
//                        
//                    }
                    
                }else  if (TotalPriceDevidForCheck.length()==5) {
                    try {
                          minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length()-1);
                        hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                        minutesf = Integer.parseInt(minutes);
                        
                        if (minutesf <= 15) {
                            pay.setAllTime(String.valueOf(hours));
                        }
                        if (minutesf >= 16 && minutesf <= 21) {
                            pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                        }
                        if (minutesf > 21 && minutesf <= 25) {
                            pay.setAllTime(String.valueOf(hours + 0.15));
                        }
                        if (minutesf > 25 && minutesf <= 35) {
                            pay.setAllTime(String.valueOf(hours + 0.2) + "0");
                        }
                        if (minutesf > 35 && minutesf < 45) {
                            pay.setAllTime(String.valueOf(hours + 0.25));
                        }
                        if (minutesf >= 45 && minutesf < 58) {
                            pay.setAllTime(String.valueOf(hours + 0.3) + "0");
                        }
                        if (minutesf >= 58 && minutesf <= 64) {
                            pay.setAllTime(String.valueOf(hours + 0.35));
                        }
                        if (minutesf > 64 && minutesf <= 70) {
                            pay.setAllTime(String.valueOf(hours + 0.4) + "0");
                        }
                        if (minutesf > 70 && minutesf <= 80) {
                            pay.setAllTime(String.valueOf(hours + 0.45));
                        }
                        if (minutesf > 80 && minutesf <= 90) {
                            pay.setAllTime(String.valueOf(hours + 0.5) + "0");
                        }
                        if (minutesf > 90 && minutesf <= 99) {
                            pay.setAllTime(String.valueOf(hours + 1));
                        }
                    } catch (Exception e) {
                    }
                } else if (TotalPriceDevidForCheck.length() == 1) {
                    pay.setAllTime(String.valueOf(hours));
                } else if (TotalPriceDevidForCheck.length() == 3) {
                    minutes = TotalPriceDevid.charAt(2) + "";
                    minutesf = Integer.parseInt(minutes);
                    hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                    if (minutesf == 0) {
                        pay.setAllTime(String.valueOf(hours));
                    }
                    if (minutesf == 1) {
                        pay.setAllTime(String.valueOf(hours + 0.5));
                    }
                    if (minutesf == 2) {
                        pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                    }
                    if (minutesf == 3) {
                        pay.setAllTime(String.valueOf(hours + 0.2) + "0");
                    }
                    if (minutesf == 4) {
                        pay.setAllTime(String.valueOf(hours + 0.25));
                        JOptionPane.showMessageDialog(null, minutesf + ": " + TotalPriceDevid);
                    }
                    if (minutesf == 5) {
                        pay.setAllTime(String.valueOf(hours + 0.3) + "0");
                    }
                    if (minutesf == 6) {
                        pay.setAllTime(String.valueOf(hours + 0.4) + "0");
                    }
                    if (minutesf == 7) {
                        pay.setAllTime(String.valueOf(hours + 0.45));
                    }
                    if (minutesf == 8) {
                        pay.setAllTime(String.valueOf(hours + 0.5) + "0");
                    }
                    if (minutesf == 9) {
                        pay.setAllTime(String.valueOf(hours + 1));
                    }
                    
                }
            
            } else {
                if (txthoursType1.getText().equals("Single")) {
                    pay.setStartTime(txtStartTime.getText());
                    pay.setEndTime(txtEndTime.getText());
                    EndTime1 = txtEndTime.getText();
                } else {
                    pay.setStartTime(txtStartTime2.getText());
                    pay.setEndTime(txtEndTime2.getText());
                    EndTime1 = txtEndTime2.getText();
                }
                 String TotalPriceDevidForCheck=String.format("%.2f", sumofPriceAll / SinglePrice);
                TotalPriceDevid = String.valueOf(sumofPriceAll / SinglePrice);
                String minutes = "";
                int minutesf = 0;
                float hours = 0;
                if (TotalPriceDevidForCheck.length() == 4) {
                    if (TotalPriceDevidForCheck.charAt(2)!='0') {
                        minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                        hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                        minutesf = Integer.parseInt(minutes);
                        if(minutesf<=5)
                        {
                            pay.setAllTime(String.valueOf(hours));
                        }
                        if (minutesf>5&&minutesf <= 10) {
                            pay.setAllTime(String.valueOf(hours+0.5));
                        }
                        if (minutesf >= 16 && minutesf <= 21) {
                            pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                        }
                        if (minutesf > 21 && minutesf <= 25) {
                            pay.setAllTime(String.valueOf(hours + 0.15));
                        }
                        if (minutesf > 25 && minutesf <= 35) {
                            pay.setAllTime(String.valueOf(hours + 0.2) + "0");
                        }
                        if (minutesf > 35 && minutesf < 45) {
                            pay.setAllTime(String.valueOf(hours + 0.25));
                        }
                        if (minutesf >= 45 && minutesf < 58) {
                            pay.setAllTime(String.valueOf(hours + 0.3) + "0");
                        }
                        if (minutesf >= 58 && minutesf <= 64) {
                            pay.setAllTime(String.valueOf(hours + 0.35));
                        }
                        if (minutesf > 64 && minutesf <= 70) {
                            pay.setAllTime(String.valueOf(hours + 0.4) + "0");
                        }
                        if (minutesf > 70 && minutesf <= 80) {
                            pay.setAllTime(String.valueOf(hours + 0.45));
                        }
                        if (minutesf > 80 && minutesf <= 90) {
                            pay.setAllTime(String.valueOf(hours + 0.5) + "0");
                        }
                        if (minutesf > 90 && minutesf <= 99) {
                            pay.setAllTime(String.valueOf(hours + 1));
                        }
                        }else
                        {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }
//                     else if (Character.isDigit(TotalPriceDevid.charAt(1))&&!Character.isDigit(TotalPriceDevid.charAt(2))&&Character.isDigit(TotalPriceDevid.charAt(3))) {
//                        minutes = TotalPriceDevid.charAt(3) + "";
//                        minutesf = Integer.parseInt(minutes);
//                        JOptionPane.showMessageDialog(null, TotalPriceDevid + " 3  " + minutes);
//                        hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
//                        
//                        if (minutesf == 0) {
//                            pay.setAllTime(String.valueOf(hours));
//                        }
//                        if (minutesf == 1) {
//                            pay.setAllTime(String.valueOf(hours + 0.5));
//                        }
//                        if (minutesf == 2) {
//                            pay.setAllTime(String.valueOf(hours + 0.1) + "0");
//                        }
//                        if (minutesf == 3) {
//                            pay.setAllTime(String.valueOf(hours + 0.2) + "0");
//                        }
//                        if (minutesf == 4) {
//                            pay.setAllTime(String.valueOf(hours + 0.25));
//                            JOptionPane.showMessageDialog(null, minutesf + ": " + TotalPriceDevid);
//                        }
//                        if (minutesf == 5) {
//                            pay.setAllTime(String.valueOf(hours + 0.3) + "0");
//                        }
//                        if (minutesf == 6) {
//                            pay.setAllTime(String.valueOf(hours + 0.4) + "0");
//                        }
//                        if (minutesf == 7) {
//                            pay.setAllTime(String.valueOf(hours + 0.45));
//                        }
//                        if (minutesf == 8) {
//                            pay.setAllTime(String.valueOf(hours + 0.5) + "0");
//                        }
//                        if (minutesf == 9) {
//                            pay.setAllTime(String.valueOf(hours + 1));
//                        }
//                        
//                    }
                    
                }else  if (TotalPriceDevidForCheck.length()==5) {
                    try {
                          minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length()-1);
                        hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                        minutesf = Integer.parseInt(minutes);
                        
                        if (minutesf <= 15) {
                            pay.setAllTime(String.valueOf(hours));
                        }
                        if (minutesf >= 16 && minutesf <= 21) {
                            pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                        }
                        if (minutesf > 21 && minutesf <= 25) {
                            pay.setAllTime(String.valueOf(hours + 0.15));
                        }
                        if (minutesf > 25 && minutesf <= 35) {
                            pay.setAllTime(String.valueOf(hours + 0.2) + "0");
                        }
                        if (minutesf > 35 && minutesf < 45) {
                            pay.setAllTime(String.valueOf(hours + 0.25));
                        }
                        if (minutesf >= 45 && minutesf < 58) {
                            pay.setAllTime(String.valueOf(hours + 0.3) + "0");
                        }
                        if (minutesf >= 58 && minutesf <= 64) {
                            pay.setAllTime(String.valueOf(hours + 0.35));
                        }
                        if (minutesf > 64 && minutesf <= 70) {
                            pay.setAllTime(String.valueOf(hours + 0.4) + "0");
                        }
                        if (minutesf > 70 && minutesf <= 80) {
                            pay.setAllTime(String.valueOf(hours + 0.45));
                        }
                        if (minutesf > 80 && minutesf <= 90) {
                            pay.setAllTime(String.valueOf(hours + 0.5) + "0");
                        }
                        if (minutesf > 90 && minutesf <= 99) {
                            pay.setAllTime(String.valueOf(hours + 1));
                        }
                    } catch (Exception e) {
                    }
                } else if (TotalPriceDevidForCheck.length() == 1) {
                    pay.setAllTime(String.valueOf(hours));
                } else if (TotalPriceDevidForCheck.length() == 3) {
                    minutes = TotalPriceDevid.charAt(2) + "";
                    minutesf = Integer.parseInt(minutes);
                    hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                    if (minutesf == 0) {
                        pay.setAllTime(String.valueOf(hours));
                    }
                    if (minutesf == 1) {
                        pay.setAllTime(String.valueOf(hours + 0.5));
                    }
                    if (minutesf == 2) {
                        pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                    }
                    if (minutesf == 3) {
                        pay.setAllTime(String.valueOf(hours + 0.2) + "0");
                    }
                    if (minutesf == 4) {
                        pay.setAllTime(String.valueOf(hours + 0.25));
                    }
                    if (minutesf == 5) {
                        pay.setAllTime(String.valueOf(hours + 0.3) + "0");
                    }
                    if (minutesf == 6) {
                        pay.setAllTime(String.valueOf(hours + 0.4) + "0");
                    }
                    if (minutesf == 7) {
                        pay.setAllTime(String.valueOf(hours + 0.45));
                    }
                    if (minutesf == 8) {
                        pay.setAllTime(String.valueOf(hours + 0.5) + "0");
                    }
                    if (minutesf == 9) {
                        pay.setAllTime(String.valueOf(hours + 1));
                    }
                    
                }
            }
            prductPaymentCruds.updatePaymentProductsWithDate(1, DeviceNameLabel.getText(), paymentdevicesCruds.getDateWithID(ids));
            paymentdevicesCruds.UpdateForSaveAllTimeAndTotalPrice(pay, ids);
            int id11 = Integer.parseInt(txtID1.getText());
            int id12 = Integer.parseInt(txtID2.getText());
            new ShowPriceDetailsLive(DeviceNameLabel.getText(), id11, id12, 1).setVisible(true);
            setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
        }
    }//GEN-LAST:event_btnsave1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowPriceDetailsLive().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DeviceNameLabel;
    private javax.swing.JLabel Timer1;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDrinks1;
    private javax.swing.JButton btnHand1;
    private javax.swing.JButton btnStart1;
    private javax.swing.JButton btnStop1;
    private javax.swing.JButton btnreset1;
    private javax.swing.JButton btnsave1;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JCheckBox multi_1;
    private javax.swing.JLabel txtDevicename2;
    private javax.swing.JLabel txtEndTime;
    private javax.swing.JLabel txtEndTime2;
    private javax.swing.JLabel txtHoursType2;
    private javax.swing.JLabel txtID1;
    private javax.swing.JLabel txtID2;
    private javax.swing.JLabel txtPriceofTime1;
    private javax.swing.JLabel txtPriceofTime2;
    private javax.swing.JLabel txtPriceofTime21;
    private javax.swing.JLabel txtPriceofTime22;
    private javax.swing.JLabel txtPriceofTime23;
    private javax.swing.JLabel txtPriceofTime24;
    private javax.swing.JLabel txtPriceofTime25;
    private javax.swing.JLabel txtPriceofTime3;
    private javax.swing.JLabel txtPriceofTime4;
    private javax.swing.JLabel txtPriceofTime5;
    private javax.swing.JLabel txtStartTime;
    private javax.swing.JLabel txtStartTime2;
    private javax.swing.JLabel txtTime1;
    private javax.swing.JLabel txtTime2;
    private javax.swing.JLabel txtTime21;
    private javax.swing.JLabel txtTime22;
    private javax.swing.JLabel txtTime23;
    private javax.swing.JLabel txtTime24;
    private javax.swing.JLabel txtTime25;
    private javax.swing.JLabel txtTime3;
    private javax.swing.JLabel txtTime4;
    private javax.swing.JLabel txtTime5;
    private javax.swing.JLabel txtTotalDrinksPrice;
    private javax.swing.JLabel txtTotalOfAll;
    private javax.swing.JLabel txtTotalTime;
    private javax.swing.JLabel txtTotalTime2;
    private javax.swing.JLabel txtTotalTimePrice;
    private javax.swing.JLabel txtTotalTimePrice2;
    private javax.swing.JLabel txthoursType1;
    // End of variables declaration//GEN-END:variables
}
