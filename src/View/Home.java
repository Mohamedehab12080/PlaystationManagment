package View;

import Controller.Shutdown;
import Controller.deviceCruds;
import Controller.m;
import Controller.paymentdevicesCruds;
import Controller.prductPaymentCruds;
import Model.paymentDevicesModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Home extends javax.swing.JFrame {

    boolean state1 = false;
    boolean state2 = false;
    boolean state3 = false;
    boolean state4 = false;
    boolean state5 = false;
    boolean state6 = false;
    boolean state7 = false;
    boolean state8 = false;
    boolean state9 = false;
    boolean state10 = false;
    boolean state11 = false;
    boolean state12 = false;
    // At save will get the timewill generate date at the end of save ,
    String date1;// Generate Date at save , stell date at stop for record and get the id with device name and date if time1 ==0 then update this time with the time when stop and start again 
    String date2;
    String date3;
    String date4;
    String date5;
    String date6;
    String date7;
    String date8;
    String date9;
    String date10;
    String date11;
    String date12;
    Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

    String TimeForSent[] = new String[12];
    public Timer t;
    public SimpleDateFormat TimeFormate;
    static SimpleDateFormat timeFormat;
    JTextField txtHoursManual;
    JTextField txtMinutesManual;
    JPanel panelManual;

    String startTime1 = "";
    String startTime2 = "";
    String startTime3 = "";
    String startTime4 = "";
    String startTime5 = "";
    String startTime6 = "";
    String startTime7 = "";
    String startTime8 = "";
    String startTime9 = "";
    String startTime10 = "";
    String startTime11 = "";
    String startTime12 = "";

    String EndTime1 = "";
    String EndTime2 = "";
    String EndTime3 = "";
    String EndTime4 = "";
    String EndTime5 = "";
    String EndTime6 = "";
    String EndTime7 = "";
    String EndTime8 = "";
    String EndTime9 = "";
    String EndTime10 = "";
    String EndTime11 = "";
    String EndTime12 = "";
    static Shutdown sh;
    public static m M;

    public Home() {
        initComponents();
        LiveTime();
        getAllPSNames();

        this.setExtendedState(Home.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(Home.EXIT_ON_CLOSE);
        this.setLayout(null);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a", new Locale("en"));
        this.date1 = df.format(new Date());
        this.date2 = df.format(new Date());
        this.date3 = df.format(new Date());
        this.date4 = df.format(new Date());
        this.date5 = df.format(new Date());
        this.date6 = df.format(new Date());
        this.date7 = df.format(new Date());
        this.date8 = df.format(new Date());
        this.date9 = df.format(new Date());
        this.date10 = df.format(new Date());
        this.date11 = df.format(new Date());
        this.date12 = df.format(new Date());
        M = new m(12, Timer1, Timer2, Timer3, Timer4, Timer5, Timer6, Timer7, Timer8, Timer9, Timer10, Timer11, Timer12);
        M.start();
        String dates[] = {date1, date2, date3, date4, date5, date6, date7, date8, date9, date10, date11, date12};
        sh = new Shutdown(12, dates, id1, id2, id3, id4, id5, id6, id7, id8, id9, id10, id11, id12);
        sh.setMulti(multi_1, multi_2, multi_3, multi_4, multi_5, multi_6, multi_7, multi_8, multi_9, multi_10, multi_11, multi_12);
        sh.setTxtSecond(txtSecond1, txtSecond2, txtSecond3, txtSecond4, txtSecond5, txtSecond6, txtSecond7, txtSecond8, txtSecond9, txtSecond10, txtSecond11, txtSecond12);
        Timer1.setFont(new Font("Segeo UI Emoji", Font.BOLD, 30));
        Timer1.setForeground(new Color(255, 255, 255));
        Timer1.setBackground(new Color(96, 139, 161));
        Shutdown s = sh;
        s.setPriority(10);
        Runtime.getRuntime().addShutdownHook(s);
        forSaveTimerEverySecond();
        Timer2.setFont(new Font("Segeo UI Emoji", Font.BOLD, 30));
        Timer2.setForeground(new Color(255, 255, 255));
        Timer2.setBackground(new Color(96, 139, 161));

        Timer3.setFont(new Font("Segeo UI Emoji", Font.BOLD, 30));
        Timer3.setForeground(new Color(255, 255, 255));
        Timer3.setBackground(new Color(96, 139, 161));

        Timer4.setFont(new Font("Segeo UI Emoji", Font.BOLD, 30));
        Timer4.setForeground(new Color(255, 255, 255));
        Timer4.setBackground(new Color(96, 139, 161));

        Timer5.setFont(new Font("Segeo UI Emoji", Font.BOLD, 30));
        Timer5.setForeground(new Color(255, 255, 255));
        Timer5.setBackground(new Color(96, 139, 161));

        Timer6.setFont(new Font("Segeo UI Emoji", Font.BOLD, 30));
        Timer6.setForeground(new Color(255, 255, 255));
        Timer6.setBackground(new Color(96, 139, 161));

        Timer7.setFont(new Font("Segeo UI Emoji", Font.BOLD, 30));
        Timer7.setForeground(new Color(255, 255, 255));
        Timer7.setBackground(new Color(96, 139, 161));

        Timer8.setFont(new Font("Segeo UI Emoji", Font.BOLD, 30));
        Timer8.setForeground(new Color(255, 255, 255));
        Timer8.setBackground(new Color(96, 139, 161));

        Timer9.setFont(new Font("Segeo UI Emoji", Font.BOLD, 30));
        Timer9.setForeground(new Color(255, 255, 255));
        Timer9.setBackground(new Color(96, 139, 161));

        Timer10.setFont(new Font("Segeo UI Emoji", Font.BOLD, 30));
        Timer10.setForeground(new Color(255, 255, 255));
        Timer10.setBackground(new Color(96, 139, 161));

        Timer11.setFont(new Font("Segeo UI Emoji", Font.BOLD, 30));
        Timer11.setForeground(new Color(255, 255, 255));
        Timer11.setBackground(new Color(96, 139, 161));

        Timer12.setFont(new Font("Segeo UI Emoji", Font.BOLD, 30));
        Timer12.setForeground(new Color(255, 255, 255));
        Timer12.setBackground(new Color(96, 139, 161));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        btnManageDevices = new javax.swing.JButton();
        btndrinksProducts = new javax.swing.JButton();
        btnManageAll = new javax.swing.JButton();
        TimeLable = new javax.swing.JLabel();
        txtTotalDay = new javax.swing.JLabel();
        btnResetTotalDay = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtPSName1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        btnStart1 = new javax.swing.JButton();
        btnStop1 = new javax.swing.JButton();
        btnreset1 = new javax.swing.JButton();
        multi_1 = new javax.swing.JCheckBox();
        btnHand1 = new javax.swing.JButton();
        txtSecond1 = new javax.swing.JCheckBox();
        txtPSName2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        btnStart2 = new javax.swing.JButton();
        btnStop2 = new javax.swing.JButton();
        btnreset2 = new javax.swing.JButton();
        multi_2 = new javax.swing.JCheckBox();
        btnHand2 = new javax.swing.JButton();
        txtSecond2 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel23 = new javax.swing.JPanel();
        btnStart3 = new javax.swing.JButton();
        btnStop3 = new javax.swing.JButton();
        btnreset3 = new javax.swing.JButton();
        multi_3 = new javax.swing.JCheckBox();
        btnHand3 = new javax.swing.JButton();
        txtSecond3 = new javax.swing.JCheckBox();
        txtPSName3 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        btnStart4 = new javax.swing.JButton();
        btnStop4 = new javax.swing.JButton();
        btnreset4 = new javax.swing.JButton();
        multi_4 = new javax.swing.JCheckBox();
        btnHand14 = new javax.swing.JButton();
        txtSecond4 = new javax.swing.JCheckBox();
        txtPSName4 = new javax.swing.JLabel();
        txtPSName5 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        btnStart5 = new javax.swing.JButton();
        btnStop5 = new javax.swing.JButton();
        btnreset5 = new javax.swing.JButton();
        multi_5 = new javax.swing.JCheckBox();
        btnHand15 = new javax.swing.JButton();
        txtSecond5 = new javax.swing.JCheckBox();
        txtPSName6 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        btnStart6 = new javax.swing.JButton();
        btnStop6 = new javax.swing.JButton();
        btnreset6 = new javax.swing.JButton();
        multi_6 = new javax.swing.JCheckBox();
        btnHand16 = new javax.swing.JButton();
        txtSecond6 = new javax.swing.JCheckBox();
        jPanel27 = new javax.swing.JPanel();
        btnStart7 = new javax.swing.JButton();
        btnStop7 = new javax.swing.JButton();
        btnreset7 = new javax.swing.JButton();
        multi_7 = new javax.swing.JCheckBox();
        btnHand17 = new javax.swing.JButton();
        txtSecond7 = new javax.swing.JCheckBox();
        txtPSName7 = new javax.swing.JLabel();
        txtPSName8 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        btnStart8 = new javax.swing.JButton();
        btnStop8 = new javax.swing.JButton();
        btnreset8 = new javax.swing.JButton();
        multi_8 = new javax.swing.JCheckBox();
        btnHand18 = new javax.swing.JButton();
        txtSecond8 = new javax.swing.JCheckBox();
        jPanel29 = new javax.swing.JPanel();
        btnStart9 = new javax.swing.JButton();
        btnStop9 = new javax.swing.JButton();
        btnreset9 = new javax.swing.JButton();
        multi_9 = new javax.swing.JCheckBox();
        btnHand19 = new javax.swing.JButton();
        txtSecond9 = new javax.swing.JCheckBox();
        txtPSName9 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        btnStart10 = new javax.swing.JButton();
        btnStop10 = new javax.swing.JButton();
        btnreset10 = new javax.swing.JButton();
        multi_10 = new javax.swing.JCheckBox();
        btnHand10 = new javax.swing.JButton();
        txtSecond10 = new javax.swing.JCheckBox();
        txtPSName10 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        btnStart11 = new javax.swing.JButton();
        btnStop11 = new javax.swing.JButton();
        btnreset11 = new javax.swing.JButton();
        multi_11 = new javax.swing.JCheckBox();
        btnHand11 = new javax.swing.JButton();
        txtSecond11 = new javax.swing.JCheckBox();
        txtPSName11 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        btnStart12 = new javax.swing.JButton();
        btnStop12 = new javax.swing.JButton();
        btnreset12 = new javax.swing.JButton();
        multi_12 = new javax.swing.JCheckBox();
        btnHand12 = new javax.swing.JButton();
        txtSecond12 = new javax.swing.JCheckBox();
        txtPSName12 = new javax.swing.JLabel();
        Timer1 = new javax.swing.JLabel();
        Timer2 = new javax.swing.JLabel();
        Timer7 = new javax.swing.JLabel();
        Timer8 = new javax.swing.JLabel();
        Timer9 = new javax.swing.JLabel();
        Timer10 = new javax.swing.JLabel();
        Timer11 = new javax.swing.JLabel();
        Timer12 = new javax.swing.JLabel();
        Timer6 = new javax.swing.JLabel();
        Timer5 = new javax.swing.JLabel();
        Timer4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        id3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        id4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        id5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        id6 = new javax.swing.JLabel();
        id7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        id8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        id9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        id10 = new javax.swing.JLabel();
        id11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        id12 = new javax.swing.JLabel();
        Timer3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnDrinks1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        btnsave1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnDrinks4 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        btnsave2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnDrinks3 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        btnsave3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnDrinks6 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        btnsave4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnDrinks7 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        btnsave5 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btnDrinks8 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        btnsave6 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btnDrinks9 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        btnSave7 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btnDrinks10 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        btnSave8 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        btnDrinks11 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        btnSave9 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        btnDrinks12 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        btnSave10 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        btnDrinks13 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        btnSave11 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        btnDrinks14 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        btnSave12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setMaximumSize(new java.awt.Dimension(1296, 768));
        setMinimumSize(new java.awt.Dimension(1296, 768));
        setSize(size.getSize());
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setForeground(new java.awt.Color(60, 63, 65));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/playstation.png"))); // NOI18N
        jLabel4.setText("الأجهزة");

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close Jframe.png"))); // NOI18N
        jLabel34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel34MousePressed(evt);
            }
        });

        btnManageDevices.setBackground(new java.awt.Color(0, 153, 204));
        btnManageDevices.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnManageDevices.setForeground(new java.awt.Color(0, 0, 0));
        btnManageDevices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/place order.png"))); // NOI18N
        btnManageDevices.setText("ادارة الأجهزة");
        btnManageDevices.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageDevices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDevicesActionPerformed(evt);
            }
        });

        btndrinksProducts.setBackground(new java.awt.Color(0, 153, 204));
        btndrinksProducts.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btndrinksProducts.setForeground(new java.awt.Color(0, 0, 0));
        btndrinksProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/soda.png"))); // NOI18N
        btndrinksProducts.setText("المشاريب");
        btndrinksProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndrinksProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndrinksProductsActionPerformed(evt);
            }
        });

        btnManageAll.setBackground(new java.awt.Color(0, 153, 204));
        btnManageAll.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnManageAll.setForeground(new java.awt.Color(0, 0, 0));
        btnManageAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/supplier.png"))); // NOI18N
        btnManageAll.setText("تفاصيل اليوم");
        btnManageAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAllActionPerformed(evt);
            }
        });

        TimeLable.setBackground(new java.awt.Color(204, 255, 255));
        TimeLable.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TimeLable.setForeground(new java.awt.Color(0, 0, 0));
        TimeLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TimeLable.setOpaque(true);

        txtTotalDay.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTotalDay.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalDay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalDay.setText("00");

        btnResetTotalDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reset2.png"))); // NOI18N
        btnResetTotalDay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetTotalDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetTotalDayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(TimeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnManageDevices)
                        .addGap(47, 47, 47)
                        .addComponent(btndrinksProducts)
                        .addGap(51, 51, 51)
                        .addComponent(btnManageAll)
                        .addGap(83, 83, 83)
                        .addComponent(txtTotalDay, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResetTotalDay)
                        .addContainerGap(158, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel34)
                        .addGap(99, 99, 99))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(TimeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(25, 25, 25)
                        .addComponent(btnResetTotalDay))
                    .addComponent(jLabel4)))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btndrinksProducts)
                        .addComponent(btnManageDevices, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnManageAll, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(txtTotalDay, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        getContentPane().add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(96, 139, 161));

        txtPSName1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtPSName1.setForeground(new java.awt.Color(0, 0, 0));
        txtPSName1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/controller.png"))); // NOI18N
        txtPSName1.setText("PS 1");

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

        txtSecond1.setBackground(new java.awt.Color(51, 51, 51));
        txtSecond1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSecond1.setForeground(new java.awt.Color(201, 118, 36));
        txtSecond1.setText("علي ما سبق");
        txtSecond1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel11.add(txtSecond1);

        txtPSName2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtPSName2.setForeground(new java.awt.Color(0, 0, 0));
        txtPSName2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/controller.png"))); // NOI18N
        txtPSName2.setText("PS 2");

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setForeground(new java.awt.Color(60, 63, 65));
        jPanel12.setToolTipText("");
        jPanel12.setLayout(new javax.swing.BoxLayout(jPanel12, javax.swing.BoxLayout.LINE_AXIS));

        btnStart2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play (1).png"))); // NOI18N
        btnStart2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStart2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart2ActionPerformed(evt);
            }
        });
        jPanel12.add(btnStart2);

        btnStop2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stopsmall.png"))); // NOI18N
        btnStop2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStop2ActionPerformed(evt);
            }
        });
        jPanel12.add(btnStop2);

        btnreset2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/resetsmall.png"))); // NOI18N
        btnreset2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset2ActionPerformed(evt);
            }
        });
        jPanel12.add(btnreset2);

        multi_2.setBackground(new java.awt.Color(51, 51, 51));
        multi_2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        multi_2.setForeground(new java.awt.Color(201, 118, 36));
        multi_2.setText("Multi");
        jPanel12.add(multi_2);

        btnHand2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHand2.setForeground(new java.awt.Color(0, 0, 0));
        btnHand2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tapsmall.png"))); // NOI18N
        btnHand2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHand2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHand2ActionPerformed(evt);
            }
        });
        jPanel12.add(btnHand2);

        txtSecond2.setBackground(new java.awt.Color(51, 51, 51));
        txtSecond2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSecond2.setForeground(new java.awt.Color(201, 118, 36));
        txtSecond2.setText("علي ما سبق");
        txtSecond2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtSecond2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecond2ActionPerformed(evt);
            }
        });
        jPanel12.add(txtSecond2);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel23.setBackground(new java.awt.Color(51, 51, 51));
        jPanel23.setForeground(new java.awt.Color(60, 63, 65));
        jPanel23.setToolTipText("");
        jPanel23.setLayout(new javax.swing.BoxLayout(jPanel23, javax.swing.BoxLayout.LINE_AXIS));

        btnStart3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play (1).png"))); // NOI18N
        btnStart3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStart3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart3ActionPerformed(evt);
            }
        });
        jPanel23.add(btnStart3);

        btnStop3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stopsmall.png"))); // NOI18N
        btnStop3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStop3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStop3ActionPerformed(evt);
            }
        });
        jPanel23.add(btnStop3);

        btnreset3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/resetsmall.png"))); // NOI18N
        btnreset3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreset3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset3ActionPerformed(evt);
            }
        });
        jPanel23.add(btnreset3);

        multi_3.setBackground(new java.awt.Color(51, 51, 51));
        multi_3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        multi_3.setForeground(new java.awt.Color(201, 118, 36));
        multi_3.setText("Multi");
        jPanel23.add(multi_3);

        btnHand3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHand3.setForeground(new java.awt.Color(0, 0, 0));
        btnHand3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tapsmall.png"))); // NOI18N
        btnHand3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHand3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHand3ActionPerformed(evt);
            }
        });
        jPanel23.add(btnHand3);

        txtSecond3.setBackground(new java.awt.Color(51, 51, 51));
        txtSecond3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSecond3.setForeground(new java.awt.Color(201, 118, 36));
        txtSecond3.setText("علي ما سبق");
        txtSecond3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel23.add(txtSecond3);

        txtPSName3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtPSName3.setForeground(new java.awt.Color(0, 0, 0));
        txtPSName3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/controller.png"))); // NOI18N
        txtPSName3.setText("PS 3");

        jPanel24.setBackground(new java.awt.Color(51, 51, 51));
        jPanel24.setForeground(new java.awt.Color(60, 63, 65));
        jPanel24.setToolTipText("");
        jPanel24.setLayout(new javax.swing.BoxLayout(jPanel24, javax.swing.BoxLayout.LINE_AXIS));

        btnStart4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play (1).png"))); // NOI18N
        btnStart4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStart4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart4ActionPerformed(evt);
            }
        });
        jPanel24.add(btnStart4);

        btnStop4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stopsmall.png"))); // NOI18N
        btnStop4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStop4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStop4ActionPerformed(evt);
            }
        });
        jPanel24.add(btnStop4);

        btnreset4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/resetsmall.png"))); // NOI18N
        btnreset4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreset4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset4ActionPerformed(evt);
            }
        });
        jPanel24.add(btnreset4);

        multi_4.setBackground(new java.awt.Color(51, 51, 51));
        multi_4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        multi_4.setForeground(new java.awt.Color(201, 118, 36));
        multi_4.setText("Multi");
        jPanel24.add(multi_4);

        btnHand14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHand14.setForeground(new java.awt.Color(0, 0, 0));
        btnHand14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tapsmall.png"))); // NOI18N
        btnHand14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHand14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHand14ActionPerformed(evt);
            }
        });
        jPanel24.add(btnHand14);

        txtSecond4.setBackground(new java.awt.Color(51, 51, 51));
        txtSecond4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSecond4.setForeground(new java.awt.Color(201, 118, 36));
        txtSecond4.setText("علي ما سبق");
        txtSecond4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel24.add(txtSecond4);

        txtPSName4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtPSName4.setForeground(new java.awt.Color(0, 0, 0));
        txtPSName4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/controller.png"))); // NOI18N
        txtPSName4.setText("PS 4");

        txtPSName5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtPSName5.setForeground(new java.awt.Color(0, 0, 0));
        txtPSName5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/controller.png"))); // NOI18N
        txtPSName5.setText("PS 5");

        jPanel25.setBackground(new java.awt.Color(51, 51, 51));
        jPanel25.setForeground(new java.awt.Color(60, 63, 65));
        jPanel25.setToolTipText("");
        jPanel25.setLayout(new javax.swing.BoxLayout(jPanel25, javax.swing.BoxLayout.LINE_AXIS));

        btnStart5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play (1).png"))); // NOI18N
        btnStart5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStart5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart5ActionPerformed(evt);
            }
        });
        jPanel25.add(btnStart5);

        btnStop5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stopsmall.png"))); // NOI18N
        btnStop5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStop5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStop5ActionPerformed(evt);
            }
        });
        jPanel25.add(btnStop5);

        btnreset5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/resetsmall.png"))); // NOI18N
        btnreset5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreset5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset5ActionPerformed(evt);
            }
        });
        jPanel25.add(btnreset5);

        multi_5.setBackground(new java.awt.Color(51, 51, 51));
        multi_5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        multi_5.setForeground(new java.awt.Color(201, 118, 36));
        multi_5.setText("Multi");
        jPanel25.add(multi_5);

        btnHand15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHand15.setForeground(new java.awt.Color(0, 0, 0));
        btnHand15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tapsmall.png"))); // NOI18N
        btnHand15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHand15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHand15ActionPerformed(evt);
            }
        });
        jPanel25.add(btnHand15);

        txtSecond5.setBackground(new java.awt.Color(51, 51, 51));
        txtSecond5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSecond5.setForeground(new java.awt.Color(201, 118, 36));
        txtSecond5.setText("علي ما سبق");
        txtSecond5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel25.add(txtSecond5);

        txtPSName6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtPSName6.setForeground(new java.awt.Color(0, 0, 0));
        txtPSName6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/controller.png"))); // NOI18N
        txtPSName6.setText("PS 6");

        jPanel26.setBackground(new java.awt.Color(51, 51, 51));
        jPanel26.setForeground(new java.awt.Color(60, 63, 65));
        jPanel26.setToolTipText("");
        jPanel26.setLayout(new javax.swing.BoxLayout(jPanel26, javax.swing.BoxLayout.LINE_AXIS));

        btnStart6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play (1).png"))); // NOI18N
        btnStart6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStart6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart6ActionPerformed(evt);
            }
        });
        jPanel26.add(btnStart6);

        btnStop6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stopsmall.png"))); // NOI18N
        btnStop6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStop6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStop6ActionPerformed(evt);
            }
        });
        jPanel26.add(btnStop6);

        btnreset6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/resetsmall.png"))); // NOI18N
        btnreset6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreset6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset6ActionPerformed(evt);
            }
        });
        jPanel26.add(btnreset6);

        multi_6.setBackground(new java.awt.Color(51, 51, 51));
        multi_6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        multi_6.setForeground(new java.awt.Color(201, 118, 36));
        multi_6.setText("Multi");
        jPanel26.add(multi_6);

        btnHand16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHand16.setForeground(new java.awt.Color(0, 0, 0));
        btnHand16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tapsmall.png"))); // NOI18N
        btnHand16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHand16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHand16ActionPerformed(evt);
            }
        });
        jPanel26.add(btnHand16);

        txtSecond6.setBackground(new java.awt.Color(51, 51, 51));
        txtSecond6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSecond6.setForeground(new java.awt.Color(201, 118, 36));
        txtSecond6.setText("علي ما سبق");
        txtSecond6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel26.add(txtSecond6);

        jPanel27.setBackground(new java.awt.Color(51, 51, 51));
        jPanel27.setForeground(new java.awt.Color(60, 63, 65));
        jPanel27.setToolTipText("");
        jPanel27.setLayout(new javax.swing.BoxLayout(jPanel27, javax.swing.BoxLayout.LINE_AXIS));

        btnStart7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play (1).png"))); // NOI18N
        btnStart7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStart7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart7ActionPerformed(evt);
            }
        });
        jPanel27.add(btnStart7);

        btnStop7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stopsmall.png"))); // NOI18N
        btnStop7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStop7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStop7ActionPerformed(evt);
            }
        });
        jPanel27.add(btnStop7);

        btnreset7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/resetsmall.png"))); // NOI18N
        btnreset7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreset7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset7ActionPerformed(evt);
            }
        });
        jPanel27.add(btnreset7);

        multi_7.setBackground(new java.awt.Color(51, 51, 51));
        multi_7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        multi_7.setForeground(new java.awt.Color(201, 118, 36));
        multi_7.setText("Multi");
        jPanel27.add(multi_7);

        btnHand17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHand17.setForeground(new java.awt.Color(0, 0, 0));
        btnHand17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tapsmall.png"))); // NOI18N
        btnHand17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHand17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHand17ActionPerformed(evt);
            }
        });
        jPanel27.add(btnHand17);

        txtSecond7.setBackground(new java.awt.Color(51, 51, 51));
        txtSecond7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSecond7.setForeground(new java.awt.Color(201, 118, 36));
        txtSecond7.setText("علي ما سبق");
        txtSecond7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel27.add(txtSecond7);

        txtPSName7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtPSName7.setForeground(new java.awt.Color(0, 0, 0));
        txtPSName7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/controller.png"))); // NOI18N
        txtPSName7.setText("PS 7");

        txtPSName8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtPSName8.setForeground(new java.awt.Color(0, 0, 0));
        txtPSName8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/controller.png"))); // NOI18N
        txtPSName8.setText("PS 8");

        jPanel28.setBackground(new java.awt.Color(51, 51, 51));
        jPanel28.setForeground(new java.awt.Color(60, 63, 65));
        jPanel28.setToolTipText("");
        jPanel28.setLayout(new javax.swing.BoxLayout(jPanel28, javax.swing.BoxLayout.LINE_AXIS));

        btnStart8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play (1).png"))); // NOI18N
        btnStart8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStart8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart8ActionPerformed(evt);
            }
        });
        jPanel28.add(btnStart8);

        btnStop8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stopsmall.png"))); // NOI18N
        btnStop8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStop8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStop8ActionPerformed(evt);
            }
        });
        jPanel28.add(btnStop8);

        btnreset8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/resetsmall.png"))); // NOI18N
        btnreset8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreset8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset8ActionPerformed(evt);
            }
        });
        jPanel28.add(btnreset8);

        multi_8.setBackground(new java.awt.Color(51, 51, 51));
        multi_8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        multi_8.setForeground(new java.awt.Color(201, 118, 36));
        multi_8.setText("Multi");
        jPanel28.add(multi_8);

        btnHand18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHand18.setForeground(new java.awt.Color(0, 0, 0));
        btnHand18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tapsmall.png"))); // NOI18N
        btnHand18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHand18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHand18ActionPerformed(evt);
            }
        });
        jPanel28.add(btnHand18);

        txtSecond8.setBackground(new java.awt.Color(51, 51, 51));
        txtSecond8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSecond8.setForeground(new java.awt.Color(201, 118, 36));
        txtSecond8.setText("علي ما سبق");
        txtSecond8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel28.add(txtSecond8);

        jPanel29.setBackground(new java.awt.Color(51, 51, 51));
        jPanel29.setForeground(new java.awt.Color(60, 63, 65));
        jPanel29.setToolTipText("");
        jPanel29.setLayout(new javax.swing.BoxLayout(jPanel29, javax.swing.BoxLayout.LINE_AXIS));

        btnStart9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play (1).png"))); // NOI18N
        btnStart9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStart9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart9ActionPerformed(evt);
            }
        });
        jPanel29.add(btnStart9);

        btnStop9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stopsmall.png"))); // NOI18N
        btnStop9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStop9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStop9ActionPerformed(evt);
            }
        });
        jPanel29.add(btnStop9);

        btnreset9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/resetsmall.png"))); // NOI18N
        btnreset9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreset9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset9ActionPerformed(evt);
            }
        });
        jPanel29.add(btnreset9);

        multi_9.setBackground(new java.awt.Color(51, 51, 51));
        multi_9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        multi_9.setForeground(new java.awt.Color(201, 118, 36));
        multi_9.setText("Multi");
        jPanel29.add(multi_9);

        btnHand19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHand19.setForeground(new java.awt.Color(0, 0, 0));
        btnHand19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tapsmall.png"))); // NOI18N
        btnHand19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHand19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHand19ActionPerformed(evt);
            }
        });
        jPanel29.add(btnHand19);

        txtSecond9.setBackground(new java.awt.Color(51, 51, 51));
        txtSecond9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSecond9.setForeground(new java.awt.Color(201, 118, 36));
        txtSecond9.setText("علي ما سبق");
        txtSecond9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel29.add(txtSecond9);

        txtPSName9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtPSName9.setForeground(new java.awt.Color(0, 0, 0));
        txtPSName9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/controller.png"))); // NOI18N
        txtPSName9.setText("PS 9");

        jPanel30.setBackground(new java.awt.Color(51, 51, 51));
        jPanel30.setForeground(new java.awt.Color(60, 63, 65));
        jPanel30.setToolTipText("");
        jPanel30.setLayout(new javax.swing.BoxLayout(jPanel30, javax.swing.BoxLayout.LINE_AXIS));

        btnStart10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play (1).png"))); // NOI18N
        btnStart10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStart10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart10ActionPerformed(evt);
            }
        });
        jPanel30.add(btnStart10);

        btnStop10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stopsmall.png"))); // NOI18N
        btnStop10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStop10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStop10ActionPerformed(evt);
            }
        });
        jPanel30.add(btnStop10);

        btnreset10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/resetsmall.png"))); // NOI18N
        btnreset10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreset10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset10ActionPerformed(evt);
            }
        });
        jPanel30.add(btnreset10);

        multi_10.setBackground(new java.awt.Color(51, 51, 51));
        multi_10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        multi_10.setForeground(new java.awt.Color(201, 118, 36));
        multi_10.setText("Multi");
        jPanel30.add(multi_10);

        btnHand10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHand10.setForeground(new java.awt.Color(0, 0, 0));
        btnHand10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tapsmall.png"))); // NOI18N
        btnHand10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHand10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHand10ActionPerformed(evt);
            }
        });
        jPanel30.add(btnHand10);

        txtSecond10.setBackground(new java.awt.Color(51, 51, 51));
        txtSecond10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSecond10.setForeground(new java.awt.Color(201, 118, 36));
        txtSecond10.setText("علي ما سبق");
        txtSecond10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel30.add(txtSecond10);

        txtPSName10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtPSName10.setForeground(new java.awt.Color(0, 0, 0));
        txtPSName10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/controller.png"))); // NOI18N
        txtPSName10.setText("PS 10");

        jPanel31.setBackground(new java.awt.Color(51, 51, 51));
        jPanel31.setForeground(new java.awt.Color(60, 63, 65));
        jPanel31.setToolTipText("");
        jPanel31.setLayout(new javax.swing.BoxLayout(jPanel31, javax.swing.BoxLayout.LINE_AXIS));

        btnStart11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play (1).png"))); // NOI18N
        btnStart11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStart11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart11ActionPerformed(evt);
            }
        });
        jPanel31.add(btnStart11);

        btnStop11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stopsmall.png"))); // NOI18N
        btnStop11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStop11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStop11ActionPerformed(evt);
            }
        });
        jPanel31.add(btnStop11);

        btnreset11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/resetsmall.png"))); // NOI18N
        btnreset11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreset11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset11ActionPerformed(evt);
            }
        });
        jPanel31.add(btnreset11);

        multi_11.setBackground(new java.awt.Color(51, 51, 51));
        multi_11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        multi_11.setForeground(new java.awt.Color(201, 118, 36));
        multi_11.setText("Multi");
        jPanel31.add(multi_11);

        btnHand11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHand11.setForeground(new java.awt.Color(0, 0, 0));
        btnHand11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tapsmall.png"))); // NOI18N
        btnHand11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHand11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHand11ActionPerformed(evt);
            }
        });
        jPanel31.add(btnHand11);

        txtSecond11.setBackground(new java.awt.Color(51, 51, 51));
        txtSecond11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSecond11.setForeground(new java.awt.Color(201, 118, 36));
        txtSecond11.setText("علي ما سبق");
        txtSecond11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel31.add(txtSecond11);

        txtPSName11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtPSName11.setForeground(new java.awt.Color(0, 0, 0));
        txtPSName11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/controller.png"))); // NOI18N
        txtPSName11.setText("PS 11");

        jPanel32.setBackground(new java.awt.Color(51, 51, 51));
        jPanel32.setForeground(new java.awt.Color(60, 63, 65));
        jPanel32.setToolTipText("");
        jPanel32.setLayout(new javax.swing.BoxLayout(jPanel32, javax.swing.BoxLayout.LINE_AXIS));

        btnStart12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play (1).png"))); // NOI18N
        btnStart12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStart12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart12ActionPerformed(evt);
            }
        });
        jPanel32.add(btnStart12);

        btnStop12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stopsmall.png"))); // NOI18N
        btnStop12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStop12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStop12ActionPerformed(evt);
            }
        });
        jPanel32.add(btnStop12);

        btnreset12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/resetsmall.png"))); // NOI18N
        btnreset12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreset12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset12ActionPerformed(evt);
            }
        });
        jPanel32.add(btnreset12);

        multi_12.setBackground(new java.awt.Color(51, 51, 51));
        multi_12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        multi_12.setForeground(new java.awt.Color(201, 118, 36));
        multi_12.setText("Multi");
        jPanel32.add(multi_12);

        btnHand12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHand12.setForeground(new java.awt.Color(0, 0, 0));
        btnHand12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tapsmall.png"))); // NOI18N
        btnHand12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHand12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHand12ActionPerformed(evt);
            }
        });
        jPanel32.add(btnHand12);

        txtSecond12.setBackground(new java.awt.Color(51, 51, 51));
        txtSecond12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSecond12.setForeground(new java.awt.Color(201, 118, 36));
        txtSecond12.setText("علي ما سبق");
        txtSecond12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel32.add(txtSecond12);

        txtPSName12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtPSName12.setForeground(new java.awt.Color(0, 0, 0));
        txtPSName12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/controller.png"))); // NOI18N
        txtPSName12.setText("PS 12");

        Timer1.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        Timer1.setForeground(new java.awt.Color(255, 255, 255));
        Timer1.setText("00 : 00 : 00 ");

        Timer2.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        Timer2.setForeground(new java.awt.Color(255, 255, 255));
        Timer2.setText("00 : 00 : 00 ");

        Timer7.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        Timer7.setForeground(new java.awt.Color(255, 255, 255));
        Timer7.setText("00 : 00 : 00 ");

        Timer8.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        Timer8.setForeground(new java.awt.Color(255, 255, 255));
        Timer8.setText("00 : 00 : 00 ");

        Timer9.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        Timer9.setForeground(new java.awt.Color(255, 255, 255));
        Timer9.setText("00 : 00 : 00 ");

        Timer10.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        Timer10.setForeground(new java.awt.Color(255, 255, 255));
        Timer10.setText("00 : 00 : 00 ");

        Timer11.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        Timer11.setForeground(new java.awt.Color(255, 255, 255));
        Timer11.setText("00 : 00 : 00 ");

        Timer12.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        Timer12.setForeground(new java.awt.Color(255, 255, 255));
        Timer12.setText("00 : 00 : 00 ");

        Timer6.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        Timer6.setForeground(new java.awt.Color(255, 255, 255));
        Timer6.setText("00 : 00 : 00 ");

        Timer5.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        Timer5.setForeground(new java.awt.Color(255, 255, 255));
        Timer5.setText("00 : 00 : 00 ");

        Timer4.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        Timer4.setForeground(new java.awt.Color(255, 255, 255));
        Timer4.setText("00 : 00 : 00 ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID:");

        id2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id2.setForeground(new java.awt.Color(0, 0, 0));
        id2.setText("0");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ID:");

        id1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id1.setForeground(new java.awt.Color(0, 0, 0));
        id1.setText("0");

        id3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id3.setForeground(new java.awt.Color(0, 0, 0));
        id3.setText("0");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("ID:");

        id4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id4.setForeground(new java.awt.Color(0, 0, 0));
        id4.setText("0");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("ID:");

        id5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id5.setForeground(new java.awt.Color(0, 0, 0));
        id5.setText("0");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("ID:");

        id6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id6.setForeground(new java.awt.Color(0, 0, 0));
        id6.setText("0");

        id7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id7.setForeground(new java.awt.Color(0, 0, 0));
        id7.setText("0");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("ID:");

        id8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id8.setForeground(new java.awt.Color(0, 0, 0));
        id8.setText("0");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("ID:");

        id9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id9.setForeground(new java.awt.Color(0, 0, 0));
        id9.setText("0");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("ID:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("ID:");

        id10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id10.setForeground(new java.awt.Color(0, 0, 0));
        id10.setText("0");

        id11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id11.setForeground(new java.awt.Color(0, 0, 0));
        id11.setText("0");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("ID:");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("ID:");

        id12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id12.setForeground(new java.awt.Color(0, 0, 0));
        id12.setText("0");

        Timer3.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        Timer3.setForeground(new java.awt.Color(255, 255, 255));
        Timer3.setText("00 : 00 : 00 ");

        jPanel1.setBackground(new java.awt.Color(96, 139, 161));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        btnDrinks1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDrinks1.setForeground(new java.awt.Color(0, 0, 0));
        btnDrinks1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/soda (1).png"))); // NOI18N
        btnDrinks1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDrinks1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinks1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDrinks1);

        jLabel26.setText("*******");
        jPanel1.add(jLabel26);

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
        jPanel1.add(btnsave1);

        jPanel3.setBackground(new java.awt.Color(96, 139, 161));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        btnDrinks4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDrinks4.setForeground(new java.awt.Color(0, 0, 0));
        btnDrinks4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/soda (1).png"))); // NOI18N
        btnDrinks4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDrinks4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinks4ActionPerformed(evt);
            }
        });
        jPanel3.add(btnDrinks4);

        jLabel27.setText("*******");
        jPanel3.add(jLabel27);

        btnsave2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsave2.setForeground(new java.awt.Color(0, 0, 0));
        btnsave2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnsave2.setText("حفظ");
        btnsave2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsave2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnsave2);

        jPanel4.setBackground(new java.awt.Color(96, 139, 161));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        btnDrinks3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDrinks3.setForeground(new java.awt.Color(0, 0, 0));
        btnDrinks3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/soda (1).png"))); // NOI18N
        btnDrinks3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDrinks3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinks3ActionPerformed(evt);
            }
        });
        jPanel4.add(btnDrinks3);

        jLabel28.setText("*******");
        jPanel4.add(jLabel28);

        btnsave3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsave3.setForeground(new java.awt.Color(0, 0, 0));
        btnsave3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnsave3.setText("حفظ");
        btnsave3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsave3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsave3ActionPerformed(evt);
            }
        });
        jPanel4.add(btnsave3);

        jPanel6.setBackground(new java.awt.Color(96, 139, 161));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        btnDrinks6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDrinks6.setForeground(new java.awt.Color(0, 0, 0));
        btnDrinks6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/soda (1).png"))); // NOI18N
        btnDrinks6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDrinks6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinks6ActionPerformed(evt);
            }
        });
        jPanel6.add(btnDrinks6);

        jLabel29.setText("*******");
        jPanel6.add(jLabel29);

        btnsave4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsave4.setForeground(new java.awt.Color(0, 0, 0));
        btnsave4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnsave4.setText("حفظ");
        btnsave4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsave4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsave4ActionPerformed(evt);
            }
        });
        jPanel6.add(btnsave4);

        jPanel7.setBackground(new java.awt.Color(96, 139, 161));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        btnDrinks7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDrinks7.setForeground(new java.awt.Color(0, 0, 0));
        btnDrinks7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/soda (1).png"))); // NOI18N
        btnDrinks7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDrinks7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinks7ActionPerformed(evt);
            }
        });
        jPanel7.add(btnDrinks7);

        jLabel30.setText("*******");
        jPanel7.add(jLabel30);

        btnsave5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsave5.setForeground(new java.awt.Color(0, 0, 0));
        btnsave5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnsave5.setText("حفظ");
        btnsave5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsave5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsave5ActionPerformed(evt);
            }
        });
        jPanel7.add(btnsave5);

        jPanel8.setBackground(new java.awt.Color(96, 139, 161));
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        btnDrinks8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDrinks8.setForeground(new java.awt.Color(0, 0, 0));
        btnDrinks8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/soda (1).png"))); // NOI18N
        btnDrinks8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDrinks8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinks8ActionPerformed(evt);
            }
        });
        jPanel8.add(btnDrinks8);

        jLabel31.setText("*******");
        jPanel8.add(jLabel31);

        btnsave6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsave6.setForeground(new java.awt.Color(0, 0, 0));
        btnsave6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnsave6.setText("حفظ");
        btnsave6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsave6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsave6ActionPerformed(evt);
            }
        });
        jPanel8.add(btnsave6);

        jPanel9.setBackground(new java.awt.Color(96, 139, 161));
        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.LINE_AXIS));

        btnDrinks9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDrinks9.setForeground(new java.awt.Color(0, 0, 0));
        btnDrinks9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/soda (1).png"))); // NOI18N
        btnDrinks9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDrinks9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinks9ActionPerformed(evt);
            }
        });
        jPanel9.add(btnDrinks9);

        jLabel32.setText("*******");
        jPanel9.add(jLabel32);

        btnSave7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave7.setForeground(new java.awt.Color(0, 0, 0));
        btnSave7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnSave7.setText("حفظ");
        btnSave7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave7ActionPerformed(evt);
            }
        });
        jPanel9.add(btnSave7);

        jPanel10.setBackground(new java.awt.Color(96, 139, 161));
        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));

        btnDrinks10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDrinks10.setForeground(new java.awt.Color(0, 0, 0));
        btnDrinks10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/soda (1).png"))); // NOI18N
        btnDrinks10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDrinks10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinks10ActionPerformed(evt);
            }
        });
        jPanel10.add(btnDrinks10);

        jLabel33.setText("*******");
        jPanel10.add(jLabel33);

        btnSave8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave8.setForeground(new java.awt.Color(0, 0, 0));
        btnSave8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnSave8.setText("حفظ");
        btnSave8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave8ActionPerformed(evt);
            }
        });
        jPanel10.add(btnSave8);

        jPanel13.setBackground(new java.awt.Color(96, 139, 161));
        jPanel13.setLayout(new javax.swing.BoxLayout(jPanel13, javax.swing.BoxLayout.LINE_AXIS));

        btnDrinks11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDrinks11.setForeground(new java.awt.Color(0, 0, 0));
        btnDrinks11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/soda (1).png"))); // NOI18N
        btnDrinks11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDrinks11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinks11ActionPerformed(evt);
            }
        });
        jPanel13.add(btnDrinks11);

        jLabel35.setText("*******");
        jPanel13.add(jLabel35);

        btnSave9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave9.setForeground(new java.awt.Color(0, 0, 0));
        btnSave9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnSave9.setText("حفظ");
        btnSave9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave9ActionPerformed(evt);
            }
        });
        jPanel13.add(btnSave9);

        jPanel14.setBackground(new java.awt.Color(96, 139, 161));
        jPanel14.setLayout(new javax.swing.BoxLayout(jPanel14, javax.swing.BoxLayout.LINE_AXIS));

        btnDrinks12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDrinks12.setForeground(new java.awt.Color(0, 0, 0));
        btnDrinks12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/soda (1).png"))); // NOI18N
        btnDrinks12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDrinks12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinks12ActionPerformed(evt);
            }
        });
        jPanel14.add(btnDrinks12);

        jLabel36.setText("*******");
        jPanel14.add(jLabel36);

        btnSave10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave10.setForeground(new java.awt.Color(0, 0, 0));
        btnSave10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnSave10.setText("حفظ");
        btnSave10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave10ActionPerformed(evt);
            }
        });
        jPanel14.add(btnSave10);

        jPanel15.setBackground(new java.awt.Color(96, 139, 161));
        jPanel15.setLayout(new javax.swing.BoxLayout(jPanel15, javax.swing.BoxLayout.LINE_AXIS));

        btnDrinks13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDrinks13.setForeground(new java.awt.Color(0, 0, 0));
        btnDrinks13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/soda (1).png"))); // NOI18N
        btnDrinks13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDrinks13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinks13ActionPerformed(evt);
            }
        });
        jPanel15.add(btnDrinks13);

        jLabel37.setText("*******");
        jPanel15.add(jLabel37);

        btnSave11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave11.setForeground(new java.awt.Color(0, 0, 0));
        btnSave11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnSave11.setText("حفظ");
        btnSave11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave11ActionPerformed(evt);
            }
        });
        jPanel15.add(btnSave11);

        jPanel16.setBackground(new java.awt.Color(96, 139, 161));
        jPanel16.setLayout(new javax.swing.BoxLayout(jPanel16, javax.swing.BoxLayout.LINE_AXIS));

        btnDrinks14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDrinks14.setForeground(new java.awt.Color(0, 0, 0));
        btnDrinks14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/soda (1).png"))); // NOI18N
        btnDrinks14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDrinks14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinks14ActionPerformed(evt);
            }
        });
        jPanel16.add(btnDrinks14);

        jLabel38.setText("*******");
        jPanel16.add(jLabel38);

        btnSave12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave12.setForeground(new java.awt.Color(0, 0, 0));
        btnSave12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnSave12.setText("حفظ");
        btnSave12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave12ActionPerformed(evt);
            }
        });
        jPanel16.add(btnSave12);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPSName1)
                        .addGap(12, 12, 12)
                        .addComponent(Timer1)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPSName2)
                        .addGap(12, 12, 12)
                        .addComponent(Timer2)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPSName3)
                        .addGap(12, 12, 12)
                        .addComponent(Timer3)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(id3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPSName4)
                        .addGap(12, 12, 12)
                        .addComponent(Timer4)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)
                        .addComponent(id4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPSName5)
                        .addGap(12, 12, 12)
                        .addComponent(Timer5)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(id5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPSName6)
                        .addGap(12, 12, 12)
                        .addComponent(Timer6)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12)
                        .addGap(6, 6, 6)
                        .addComponent(id6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPSName7)
                        .addGap(12, 12, 12)
                        .addComponent(Timer7)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel13)
                        .addGap(6, 6, 6)
                        .addComponent(id7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtPSName8)
                                .addGap(18, 18, 18)
                                .addComponent(Timer8, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtPSName9)
                                .addGap(18, 18, 18)
                                .addComponent(Timer9, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtPSName10)
                                .addGap(6, 6, 6)
                                .addComponent(Timer10, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtPSName11)
                                .addGap(12, 12, 12)
                                .addComponent(Timer11, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtPSName12)
                                .addGap(6, 6, 6)
                                .addComponent(Timer12, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel23)))
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(96, 96, 96))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPSName1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(Timer1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(id1)))
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtPSName2))
                            .addComponent(Timer2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(id2)))
                        .addGap(6, 6, 6)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPSName3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Timer3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(id3)))
                        .addGap(2, 2, 2)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPSName4)
                            .addComponent(Timer4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(id4))))
                        .addGap(8, 8, 8)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPSName5)
                            .addComponent(Timer5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(id5))))
                        .addGap(6, 6, 6)
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPSName6)
                            .addComponent(Timer6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(id6))))
                        .addGap(5, 5, 5)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPSName7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Timer7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel13))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(id7)))
                        .addGap(6, 6, 6)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(id8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(17, 17, 17))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPSName8)
                                            .addComponent(Timer8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(5, 5, 5)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPSName9)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel16)
                                                    .addComponent(id9))
                                                .addComponent(Timer9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(8, 8, 8)
                                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPSName10)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel17)
                                                    .addComponent(id10))
                                                .addComponent(Timer10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(8, 8, 8)
                                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPSName11)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel18)
                                                    .addComponent(id11))
                                                .addComponent(Timer11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(8, 8, 8)
                                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPSName12)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Timer12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel23)
                                                .addComponent(id12)))
                                        .addGap(8, 8, 8)
                                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(2, 2, 2))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void getAllPSNames() {
        try {
            ArrayList<String> list = deviceCruds.getDevicenames();
            txtPSName1.setText(list.get(0));
            txtPSName2.setText(list.get(1));
            txtPSName3.setText(list.get(2));
            txtPSName4.setText(list.get(3));
            txtPSName5.setText(list.get(4));
            txtPSName6.setText(list.get(5));
            txtPSName7.setText(list.get(6));
            txtPSName8.setText(list.get(7));
            txtPSName9.setText(list.get(8));
            txtPSName10.setText(list.get(9));
            txtPSName11.setText(list.get(10));
            txtPSName12.setText(list.get(11));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void forSaveTimerEverySecond() {
        try {
            ScheduledExecutorService ses = Executors.newScheduledThreadPool(10);
            ses.scheduleAtFixedRate(() -> {
                FileWriter fw = null;
                try {
                    fw = new FileWriter("المفقود.txt");
                } catch (IOException e1) {

                    JOptionPane.showMessageDialog(null, e1);
                }
                try {
                    for (int i = 0; i < M.state.length; i++) {
                        if (M.state[i]) {
                            if (sh.getMulti()[i].isSelected()) {
                                fw.write("Multi PS " + (i + 1) + " : " + M.hours[i] + ":" + M.minuts[i] + ":" + (M.seconds[i] - 1) + "\n");
                                fw.write(System.lineSeparator());
                            } else {
                                fw.write("Single PS " + (i + 1) + " : " + M.hours[i] + ":" + M.minuts[i] + ":" + (M.seconds[i] - 1) + "\n");
                                fw.write(System.lineSeparator());
                            }
                        }
                    }
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                try {
                    fw.close();
                } catch (IOException e) {

                    JOptionPane.showMessageDialog(null, e);
                }
            }, 0, 5, TimeUnit.MINUTES);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void ForAllBtns(int state, String devicename, JButton btnstart, JButton btnreset, JLabel Timer, String date, JLabel ids, JCheckBox Type) {
        M.state[state] = false;
        float MultiPrice = paymentdevicesCruds.getMultiPriceandSingle(devicename, "Multi");
        float SinglePrice = paymentdevicesCruds.getMultiPriceandSingle(devicename, "");
        boolean checkforMulti = false;
        btnstart.setEnabled(true);
        btnreset.setEnabled(true);
        String Time = Timer.getText();
        float timeforCalc = 0;
        int minutes = 0;
        String TimeSent = "";
        try {
            paymentDevicesModel pay = new paymentDevicesModel();
            int id;
            pay.setDeviceName(devicename);
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
                if (minutes > 25 && minutes <= 32) {
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
                TimeSent = Time.charAt(0) + ":" + minutes;
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
                if (minutes > 25 && minutes <= 32) {
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
            if (Type.isSelected()) {
                pay.setHoursType("Multi");
                pay.setHoursprice(MultiPrice);
                pay.setPriceofTime1(timeforCalc * MultiPrice);
                checkforMulti = true;
                JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 1: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * MultiPrice) + "</h2></html>");
            } else {
                pay.setHoursType("Single");
                pay.setHoursprice(SinglePrice);
                pay.setPriceofTime1(timeforCalc * SinglePrice);
                JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 1: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * SinglePrice) + "</h2></html>");
                checkforMulti = false;
            }
            pay.setDate(date);
            try {
                checkonTimesAndaddPaymentForFirst(pay, ids);
            } catch (Exception es) {
                JOptionPane.showMessageDialog(null, es);
            }
// Check for set The Time 1 or 2 or 3 or 4 or 5
            id = Integer.parseInt(ids.getText());
            pay.setId(id);
            ArrayList<paymentDevicesModel> list = paymentdevicesCruds.getTimesRecords(id);
            Iterator<paymentDevicesModel> itr = list.iterator();
            while (itr.hasNext()) {
                paymentDevicesModel payed = itr.next();
                if (payed.getTime1().equals("0")) {
                    pay.setTime2(payed.getTime2());
                    pay.setPriceOfTime2(payed.getPriceOfTime2());
                    pay.setTime3(payed.getTime3());
                    pay.setPriceOfTime3(payed.getPriceOfTime3());
                    pay.setTime4(payed.getTime4());
                    pay.setPriceOfTime4(payed.getPriceOfTime4());
                    pay.setTime5(payed.getTime5());
                    pay.setPriceofTime5(payed.getPriceofTime5());
                    pay.setTime1(TimeSent);
                    if (checkforMulti == true) {
                        pay.setPriceOfTime2(timeforCalc * MultiPrice);
                        JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 1: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * MultiPrice) + "</h2></html>");
                    } else {
                        pay.setPriceOfTime2(timeforCalc * SinglePrice);
                        JOptionPane.showMessageDialog(null, "<html><h2>" + "Time 1: " + TimeSent + "<br> التكلفة:" + new DecimalFormat("##.##").format(timeforCalc * SinglePrice) + "</h2></html>");
                    }
                } else if (payed.getTime2().equals("0")) {
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

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void ForAllSaveBtns(String devicename, String date, String startTime, String endTime, JLabel id, JCheckBox Type, JCheckBox Second, String newDate) {
        startTime = date.substring(11, 22);  //2023-06-24 09:17:23 AM
        paymentDevicesModel pay = new paymentDevicesModel();
        int ids = 0;
        pay.setStartTime(startTime);
//        try {
        float sumofPriceAll = 0;

        if (!id.getText().equals("0")) {
            ids = Integer.parseInt(id.getText());
        } else {
            ids = paymentdevicesCruds.getIdWithDateAndDeviceName(devicename, date);
        }
        String TotalPriceDevid;
        float SinglePrice = paymentdevicesCruds.getMultiPriceandSingle(devicename, "");
        float MultiPrice = paymentdevicesCruds.getMultiPriceandSingle(devicename, "Multi");
        ArrayList<Float> list = paymentdevicesCruds.getAllTimePrice(ids);
        for (int i = 0; i < list.size(); i++) {
            sumofPriceAll += list.get(i);
        }

        pay.setTotalPrice(Float.parseFloat(String.valueOf(sumofPriceAll)));
        if (Type.isSelected()) {
            TotalPriceDevid = String.format("%.2f", sumofPriceAll / MultiPrice);
            JOptionPane.showMessageDialog(null, TotalPriceDevid);
            String minutes = "";
            int minutesf = 0;
            float hours = 0;
            if (TotalPriceDevid.length() >= 4) {
                if (TotalPriceDevid.length() == 5) {
                    TotalPriceDevid = String.valueOf(sumofPriceAll / MultiPrice);
                    minutes = TotalPriceDevid.charAt(3) + "" + TotalPriceDevid.charAt(4);
                    JOptionPane.showMessageDialog(null, TotalPriceDevid + " 1 " + minutes);
                    hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                    minutesf = Integer.parseInt(minutes);

                    if (minutesf <= 15) {
                        pay.setAllTime(String.valueOf(hours));
                        JOptionPane.showMessageDialog(null, minutesf + ": " + TotalPriceDevid);
                    }
                    if (minutesf >= 16 && minutesf <= 21) {
                        pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                    }
                    if (minutesf > 21 && minutesf <= 25) {
                        pay.setAllTime(String.valueOf(hours + 0.15));
                        JOptionPane.showMessageDialog(null, minutesf + ": " + TotalPriceDevid);
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
                } else if (!Character.isDigit(TotalPriceDevid.charAt(1)) && Character.isDigit(TotalPriceDevid.charAt(2)) && Character.isDigit(TotalPriceDevid.charAt(3))) {
                    TotalPriceDevid = String.valueOf(sumofPriceAll / MultiPrice);
                    minutes = TotalPriceDevid.charAt(2) + "" + TotalPriceDevid.charAt(3);
                    JOptionPane.showMessageDialog(null, TotalPriceDevid + " 2  " + minutes);
                    hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                    minutesf = Integer.parseInt(minutes);
                    if (minutesf <= 15) {
                        pay.setAllTime(String.valueOf(hours));
                    }
                    if (minutesf >= 16 && minutesf <= 21) {
                        pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                    }
                    if (minutesf > 21 && minutesf <= 25) {
                        pay.setAllTime(String.valueOf(hours + 0.15));
                        JOptionPane.showMessageDialog(null, minutesf + ": " + TotalPriceDevid);
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
                } else if (Character.isDigit(TotalPriceDevid.charAt(1)) && !Character.isDigit(TotalPriceDevid.charAt(2)) && Character.isDigit(TotalPriceDevid.charAt(3))) {
                    TotalPriceDevid = String.valueOf(sumofPriceAll / MultiPrice);
                    minutes = TotalPriceDevid.charAt(3) + "";
                    minutesf = Integer.parseInt(minutes);
                    JOptionPane.showMessageDialog(null, TotalPriceDevid + " 3  " + minutes);
                    hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));

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

            } else if (TotalPriceDevid.length() == 1) {
                pay.setAllTime(String.valueOf(hours));
            } else if (TotalPriceDevid.length() == 3) {
                TotalPriceDevid = String.valueOf(sumofPriceAll / MultiPrice);
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
            String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / SinglePrice);
            TotalPriceDevid = String.valueOf(sumofPriceAll / SinglePrice);
            JOptionPane.showMessageDialog(null, TotalPriceDevid);
            String minutes = "";
            int minutesf = 0;
            float hours = 0;
            if (TotalPriceDevidForCheck.length() == 4) {
                if (TotalPriceDevidForCheck.charAt(2) != '0') {
                    minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                    JOptionPane.showMessageDialog(null, TotalPriceDevidForCheck + " 2  " + minutes);
                    hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                    minutesf = Integer.parseInt(minutes);
                    if (minutesf <= 5) {
                        pay.setAllTime(String.valueOf(hours));
                    }
                    if (minutesf > 5 && minutesf <= 10) {
                        pay.setAllTime(String.valueOf(hours + 0.5));
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
                } else {
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

            } else if (TotalPriceDevidForCheck.length() == 5) {
                try {
                    minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                    JOptionPane.showMessageDialog(null, TotalPriceDevidForCheck + " 1 " + minutes);
                    hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                    minutesf = Integer.parseInt(minutes);

                    if (minutesf <= 15) {
                        pay.setAllTime(String.valueOf(hours));
                        JOptionPane.showMessageDialog(null, minutesf + ": " + TotalPriceDevid);
                    }
                    if (minutesf >= 16 && minutesf <= 21) {
                        pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                    }
                    if (minutesf > 21 && minutesf <= 25) {
                        pay.setAllTime(String.valueOf(hours + 0.15));
                        JOptionPane.showMessageDialog(null, minutesf + ": " + TotalPriceDevid);
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
        }
        prductPaymentCruds.updatePaymentProductsWithDate(1, devicename, date);
        endTime = newDate.substring(11, 22);
        pay.setEndTime(endTime);
        // function take endTime and PS name get the data where startTime=Parameter EndTime and Type of hours is multi
        // the second part of this function is 
        paymentdevicesCruds.UpdateForSaveAllTimeAndTotalPrice(pay, ids);
        ArrayList<paymentDevicesModel> list1;
        if (Second.isSelected()) {
            if (Type.isSelected()) {
                list1 = paymentdevicesCruds.getAllRecordsForRealTime(devicename, endTime, "Multi");
            } else {
                list1 = paymentdevicesCruds.getAllRecordsForRealTime(devicename, endTime, "Single");
            }
            new ShowPriceDetailsLive(list1, devicename, 1).setVisible(true);
        } else {
            if (Type.isSelected()) {
                list1 = paymentdevicesCruds.getAllRecordsForRealTime(devicename, endTime, "Multi");
            } else {
                list1 = paymentdevicesCruds.getAllRecordsForRealTime(devicename, endTime, "Single");
            }
            new ShowPriceDetailsLive(list1, devicename, 0).setVisible(true);
        }
        //Check on payPro if null
        id.setText("0");

//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        } finally {
//        }
    }

    public void customPanel() {
        txtHoursManual = new JTextField();
        txtHoursManual.setSize(32, 11);
        txtMinutesManual = new JTextField();
        panelManual = new JPanel();
        panelManual.setSize(120, 100);
        panelManual.add(txtHoursManual);
        panelManual.add(new JLabel("الساعات:"));
        panelManual.add(Box.createVerticalStrut(15));
        panelManual.add(txtMinutesManual);
        panelManual.add(new JLabel("الدقائق:"));
        panelManual.setBackground(new Color(96, 139, 161));
    }

    public void LiveTime() {
        TimeZone.setDefault(TimeZone.getTimeZone("Egypt"));
        t = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date dt = new Date();
                timeFormat = new SimpleDateFormat("hh:mm:ss a", new Locale("en"));
                String tt = timeFormat.format(dt);
                TimeLable.setText(tt);
            }
        });
        t.start();
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
    private void btnStart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart1ActionPerformed

        try {
            startTime1 = TimeLable.getText();
            btnsave1.setEnabled(false);
            btnStop1.setEnabled(true);
            btnreset1.setEnabled(false);
            btnStart1.setEnabled(false);
            M.state[0] = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnStart1ActionPerformed

    private void btnManageAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAllActionPerformed
        new paymentDetails().setVisible(true);
    }//GEN-LAST:event_btnManageAllActionPerformed

    private void jLabel34MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MousePressed
        int a = JOptionPane.showConfirmDialog(null, "هل تريد الخروج من البرنامج؟", "اختر", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel34MousePressed

    private void btnStart2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart2ActionPerformed

        btnsave2.setEnabled(false);
        btnStop2.setEnabled(true);
        btnreset2.setEnabled(false);
        btnStart2.setEnabled(false);
        M.state[1] = true;
//        sh.state[1] = true;
    }//GEN-LAST:event_btnStart2ActionPerformed

    private void btnStop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop1ActionPerformed
        ForAllBtns(0, txtPSName1.getText(), btnStart1, btnreset1, Timer1, date1, id1, multi_1);
        btnsave1.setEnabled(true);
        state1 = true;
    }//GEN-LAST:event_btnStop1ActionPerformed

    private void btnStop2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop2ActionPerformed
        ForAllBtns(1, txtPSName2.getText(), btnStart2, btnreset2, Timer2, date2, id2, multi_2);
        btnsave2.setEnabled(true);
        state2 = true;
    }//GEN-LAST:event_btnStop2ActionPerformed

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

    private void btnStart3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart3ActionPerformed
        btnsave3.setEnabled(false);
        btnStop3.setEnabled(true);
        btnreset3.setEnabled(false);
        btnStart3.setEnabled(false);
        M.state[2] = true;
//        sh.state[2] = true;
    }//GEN-LAST:event_btnStart3ActionPerformed

    private void btnStop3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop3ActionPerformed
        ForAllBtns(2, txtPSName3.getText(), btnStart3, btnreset3, Timer3, date3, id3, multi_3);
        btnsave3.setEnabled(true);
        state3 = true;
    }//GEN-LAST:event_btnStop3ActionPerformed

    private void btnStart4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart4ActionPerformed
        btnsave4.setEnabled(false);
        btnStop4.setEnabled(true);
        btnreset4.setEnabled(false);
        btnStart4.setEnabled(false);
        M.state[3] = true;
//        sh.state[3] = true;
    }//GEN-LAST:event_btnStart4ActionPerformed

    private void btnStop4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop4ActionPerformed
        ForAllBtns(3, txtPSName4.getText(), btnStart4, btnreset4, Timer4, date4, id4, multi_4);
        btnsave4.setEnabled(true);
        state4 = true;
    }//GEN-LAST:event_btnStop4ActionPerformed

    private void btnStart5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart5ActionPerformed
        btnStop5.setEnabled(true);
        btnreset5.setEnabled(false);
        btnStart5.setEnabled(false);
        M.state[4] = true;
//        sh.state[4] = true;
        btnsave5.setEnabled(false);
    }//GEN-LAST:event_btnStart5ActionPerformed

    private void btnStop5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop5ActionPerformed
        ForAllBtns(4, txtPSName5.getText(), btnStart5, btnreset5, Timer5, date5, id5, multi_5);
        btnsave5.setEnabled(true);
        state5 = true;
    }//GEN-LAST:event_btnStop5ActionPerformed

    private void btnStart6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart6ActionPerformed
        btnStop6.setEnabled(true);
        btnreset6.setEnabled(false);
        btnStart6.setEnabled(false);
        M.state[5] = true;
//        sh.state[5] = true;
        btnsave6.setEnabled(false);
    }//GEN-LAST:event_btnStart6ActionPerformed

    private void btnStop6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop6ActionPerformed
        ForAllBtns(5, txtPSName6.getText(), btnStart6, btnreset6, Timer6, date6, id6, multi_6);
        btnsave6.setEnabled(true);
        state6 = true;
    }//GEN-LAST:event_btnStop6ActionPerformed

    private void btnStart7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart7ActionPerformed
        btnStop7.setEnabled(true);
        btnreset7.setEnabled(false);
        btnStart7.setEnabled(false);
        M.state[6] = true;
//        sh.state[6] = true;
        btnSave7.setEnabled(false);
    }//GEN-LAST:event_btnStart7ActionPerformed

    private void btnStop7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop7ActionPerformed
        ForAllBtns(6, txtPSName7.getText(), btnStart7, btnreset7, Timer7, date7, id7, multi_7);
        btnSave7.setEnabled(true);
        state7 = true;
    }//GEN-LAST:event_btnStop7ActionPerformed

    private void btnStart8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart8ActionPerformed
        btnStop8.setEnabled(true);
        btnreset8.setEnabled(false);
        btnStart8.setEnabled(false);
        M.state[7] = true;
//        sh.state[7] = true;
        btnSave8.setEnabled(false);
    }//GEN-LAST:event_btnStart8ActionPerformed

    private void btnStop8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop8ActionPerformed
        ForAllBtns(7, txtPSName8.getText(), btnStart8, btnreset8, Timer8, date8, id8, multi_8);
        btnSave8.setEnabled(true);
        state8 = true;
    }//GEN-LAST:event_btnStop8ActionPerformed

    private void btnStart9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart9ActionPerformed
        btnSave9.setEnabled(false);
        btnStop9.setEnabled(true);
        btnreset9.setEnabled(false);
        btnStart9.setEnabled(false);
        M.state[8] = true;
//        sh.state[8] = true;
    }//GEN-LAST:event_btnStart9ActionPerformed

    private void btnStop9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop9ActionPerformed
        ForAllBtns(8, txtPSName9.getText(), btnStart9, btnreset9, Timer9, date9, id9, multi_9);
        btnSave9.setEnabled(true);
        state9 = true;
    }//GEN-LAST:event_btnStop9ActionPerformed

    private void btnStart10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart10ActionPerformed
        btnSave10.setEnabled(false);
        btnStop10.setEnabled(true);
        btnreset10.setEnabled(false);
        btnStart10.setEnabled(false);
        M.state[9] = true;
//        sh.state[9] = true;
    }//GEN-LAST:event_btnStart10ActionPerformed

    private void btnStop10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop10ActionPerformed
        ForAllBtns(9, txtPSName10.getText(), btnStart10, btnreset10, Timer10, date10, id10, multi_10);
        btnSave10.setEnabled(true);
        state10 = true;
    }//GEN-LAST:event_btnStop10ActionPerformed

    private void btnStart11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart11ActionPerformed
        btnSave11.setEnabled(false);
        btnStop11.setEnabled(true);
        btnreset11.setEnabled(false);
        btnStart11.setEnabled(false);
        M.state[10] = true;
//        sh.state[10] = true;
    }//GEN-LAST:event_btnStart11ActionPerformed

    private void btnStop11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop11ActionPerformed
        ForAllBtns(10, txtPSName11.getText(), btnStart11, btnreset11, Timer11, date11, id11, multi_11);
        btnSave11.setEnabled(true);
        state11 = true;
    }//GEN-LAST:event_btnStop11ActionPerformed

    private void btnStart12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart12ActionPerformed
        btnStop12.setEnabled(true);
        btnreset12.setEnabled(false);
        btnStart12.setEnabled(false);
        M.state[11] = true;
//        sh.state[11] = true;
        btnSave12.setEnabled(false);
    }//GEN-LAST:event_btnStart12ActionPerformed

    private void btnStop12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop12ActionPerformed
        ForAllBtns(11, txtPSName12.getText(), btnStart12, btnreset12, Timer12, date12, id12, multi_12);
        btnSave12.setEnabled(true);
        state12 = true;
    }//GEN-LAST:event_btnStop12ActionPerformed

    private void btnManageDevicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDevicesActionPerformed
        new DevicesCrudsView().setVisible(true);
    }//GEN-LAST:event_btnManageDevicesActionPerformed

    private void btndrinksProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndrinksProductsActionPerformed
        new ProductsCrudsView().setVisible(true);
    }//GEN-LAST:event_btndrinksProductsActionPerformed

    private void btnHand16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHand16ActionPerformed
        int hourss;
        int minutes;
        try {
            String a = JOptionPane.showInputDialog(null, "ادخل عدد الساعات", JOptionPane.PLAIN_MESSAGE);
            if (!a.equals("")) {
                hourss = Integer.parseInt(a);
                M.hours[5] = hourss;
//                sh.hours[5] = hourss;
                String b = JOptionPane.showInputDialog(null, "ادخل عدد الدقائق", JOptionPane.PLAIN_MESSAGE);
                if (!b.equals("")) {
                    minutes = Integer.parseInt(b);
                    M.minuts[5] = minutes;
//                    sh.minuts[5] = minutes;
                } else {
                    M.minuts[5] = 0;
//                    sh.minuts[5] = 0;
                }
            } else {
                M.hours[5] = 0;
//                sh.hours[5] = 0;
            }
            M.seconds[5] = 0;
            Timer6.setText(M.hours[5] + ":" + M.minuts[5] + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnHand16ActionPerformed

    private void btnDrinks1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinks1ActionPerformed
        new addDrinksForDevices(txtPSName1.getText(), date1).setVisible(true);
    }//GEN-LAST:event_btnDrinks1ActionPerformed

    private void btnsave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsave1ActionPerformed
        if (state1) {
            state1 = false;
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a", new Locale("en"));
            startTime1 = date1.substring(11, 22);  //2023-06-24 09:17:23 AM
            paymentDevicesModel pay = new paymentDevicesModel();
            int ids = 0;
//        startTime1 = date1.substring(11, 22);  //2023-06-24 09:17:23 AM
            pay.setStartTime(startTime1);

            try {
                float sumofPriceAll = 0;

                if (!id1.getText().equals("0")) {
                    ids = Integer.parseInt(id1.getText());
                } else {
                    ids = paymentdevicesCruds.getIdWithDateAndDeviceName(txtPSName1.getText(), date1);
                }
                String TotalPriceDevid;
                float SinglePrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName1.getText(), "");
                float MultiPrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName1.getText(), "Multi");
                ArrayList<Float> list = paymentdevicesCruds.getAllTimePrice(ids);
                for (int i = 0; i < list.size(); i++) {
                    sumofPriceAll += list.get(i);
                }

                pay.setTotalPrice(Float.parseFloat(String.valueOf(sumofPriceAll)));
                if (multi_1.isSelected()) {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / MultiPrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / MultiPrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }

                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                } else {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / SinglePrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / SinglePrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }

                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                prductPaymentCruds.updatePaymentProductsWithDate(1, txtPSName1.getText(), date1);
                date1 = df.format(new Date());
                EndTime1 = date1.substring(11, 22);
                pay.setEndTime(EndTime1);
                // function take endTime and PS name get the data where startTime=Parameter EndTime and Type of hours is multi
                // the second part of this function is 
                paymentdevicesCruds.UpdateForSaveAllTimeAndTotalPrice(pay, ids);
                ArrayList<paymentDevicesModel> list1;
                if (txtSecond1.isSelected()) {
                    if (multi_1.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName1.getText(), EndTime1, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName1.getText(), EndTime1, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName1.getText(), 1).setVisible(true);
                } else {
                    if (multi_1.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName1.getText(), EndTime1, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName1.getText(), EndTime1, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName1.getText(), 0).setVisible(true);
                }
                //Check on payPro if null
                id1.setText("0");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
            }

        }
    }//GEN-LAST:event_btnsave1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    private void btnDrinks4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinks4ActionPerformed
        new addDrinksForDevices(txtPSName2.getText(), date2).setVisible(true);
    }//GEN-LAST:event_btnDrinks4ActionPerformed

    private void btnsave2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsave2ActionPerformed
        if (state2) {
            state2 = false;
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a", new Locale("en"));
            startTime2 = date2.substring(11, 22);
            paymentDevicesModel pay = new paymentDevicesModel();
            int ids = 0;
            pay.setStartTime(startTime2);

            try {
                float sumofPriceAll = 0;

                if (!id2.getText().equals("0")) {
                    ids = Integer.parseInt(id2.getText());
                } else {
                    ids = paymentdevicesCruds.getIdWithDateAndDeviceName(txtPSName2.getText(), date2);
                }
                String TotalPriceDevid;
                float SinglePrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName2.getText(), "");
                float MultiPrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName2.getText(), "Multi");
                ArrayList<Float> list = paymentdevicesCruds.getAllTimePrice(ids);
                for (int i = 0; i < list.size(); i++) {
                    sumofPriceAll += list.get(i);
                }

                pay.setTotalPrice(Float.parseFloat(String.valueOf(sumofPriceAll)));
                if (multi_2.isSelected()) {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / MultiPrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / MultiPrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }

                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                } else {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / SinglePrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / SinglePrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }

                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                prductPaymentCruds.updatePaymentProductsWithDate(1, txtPSName2.getText(), date2);
                date2 = df.format(new Date());
                EndTime2 = date2.substring(11, 22);
                pay.setEndTime(EndTime2);
                // function take endTime and PS name get the data where startTime=Parameter EndTime and Type of hours is multi
                // the second part of this function is 
                paymentdevicesCruds.UpdateForSaveAllTimeAndTotalPrice(pay, ids);
                ArrayList<paymentDevicesModel> list1;
                if (txtSecond2.isSelected()) {
                    if (multi_2.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName2.getText(), EndTime2, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName2.getText(), EndTime2, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName2.getText(), 1).setVisible(true);
                } else {
                    if (multi_2.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName2.getText(), EndTime2, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName2.getText(), EndTime2, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName2.getText(), 0).setVisible(true);
                }
                //Check on payPro if null
                id2.setText("0");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
            }
    }//GEN-LAST:event_btnsave2ActionPerformed
    }
    private void btnDrinks3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinks3ActionPerformed
        new addDrinksForDevices(txtPSName3.getText(), date3).setVisible(true);
    }//GEN-LAST:event_btnDrinks3ActionPerformed

    private void btnsave3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsave3ActionPerformed
        if (state3) {
            state3 = false;
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a", new Locale("en"));
            startTime3 = date3.substring(11, 22);
            paymentDevicesModel pay = new paymentDevicesModel();
            int ids = 0;
            pay.setStartTime(startTime3);

            try {
                float sumofPriceAll = 0;

                if (!id3.getText().equals("0")) {
                    ids = Integer.parseInt(id3.getText());
                } else {
                    ids = paymentdevicesCruds.getIdWithDateAndDeviceName(txtPSName3.getText(), date3);
                }
                String TotalPriceDevid;
                float SinglePrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName3.getText(), "");
                float MultiPrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName3.getText(), "Multi");
                ArrayList<Float> list = paymentdevicesCruds.getAllTimePrice(ids);
                for (int i = 0; i < list.size(); i++) {
                    sumofPriceAll += list.get(i);
                }

                pay.setTotalPrice(Float.parseFloat(String.valueOf(sumofPriceAll)));
                if (multi_3.isSelected()) {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / MultiPrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / MultiPrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }

                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                } else {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / SinglePrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / SinglePrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }

                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                prductPaymentCruds.updatePaymentProductsWithDate(1, txtPSName3.getText(), date3);
                date3 = df.format(new Date());
                EndTime3 = date3.substring(11, 22);
                pay.setEndTime(EndTime3);
                // function take endTime and PS name get the data where startTime=Parameter EndTime and Type of hours is multi
                // the second part of this function is 
                paymentdevicesCruds.UpdateForSaveAllTimeAndTotalPrice(pay, ids);
                ArrayList<paymentDevicesModel> list1;
                if (txtSecond3.isSelected()) {
                    if (multi_3.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName3.getText(), EndTime3, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName3.getText(), EndTime3, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName3.getText(), 1).setVisible(true);
                } else {
                    if (multi_3.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName3.getText(), EndTime3, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName3.getText(), EndTime3, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName3.getText(), 0).setVisible(true);
                }
                //Check on payPro if null
                id3.setText("0");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
            }
        }
    }//GEN-LAST:event_btnsave3ActionPerformed

    private void btnDrinks6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinks6ActionPerformed
        new addDrinksForDevices(txtPSName4.getText(), date4).setVisible(true);
    }//GEN-LAST:event_btnDrinks6ActionPerformed

    private void btnsave4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsave4ActionPerformed
        if (state4) {
            state4 = false;
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a", new Locale("en"));
            startTime4 = date4.substring(11, 22);
            paymentDevicesModel pay = new paymentDevicesModel();
            int ids = 0;
            pay.setStartTime(startTime4);

            try {
                float sumofPriceAll = 0;

                if (!id4.getText().equals("0")) {
                    ids = Integer.parseInt(id4.getText());
                } else {
                    ids = paymentdevicesCruds.getIdWithDateAndDeviceName(txtPSName4.getText(), date4);
                }
                String TotalPriceDevid;
                float SinglePrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName4.getText(), "");
                float MultiPrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName4.getText(), "Multi");
                ArrayList<Float> list = paymentdevicesCruds.getAllTimePrice(ids);
                for (int i = 0; i < list.size(); i++) {
                    sumofPriceAll += list.get(i);
                }

                pay.setTotalPrice(Float.parseFloat(String.valueOf(sumofPriceAll)));
                if (multi_4.isSelected()) {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / MultiPrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / MultiPrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }

                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                } else {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / SinglePrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / SinglePrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }
                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                prductPaymentCruds.updatePaymentProductsWithDate(1, txtPSName4.getText(), date4);
                date4 = df.format(new Date());
                EndTime4 = date4.substring(11, 22);
                pay.setEndTime(EndTime4);
                // function take endTime and PS name get the data where startTime=Parameter EndTime and Type of hours is multi
                // the second part of this function is 
                paymentdevicesCruds.UpdateForSaveAllTimeAndTotalPrice(pay, ids);
                ArrayList<paymentDevicesModel> list1;
                if (txtSecond4.isSelected()) {
                    if (multi_4.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName4.getText(), EndTime4, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName4.getText(), EndTime4, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName4.getText(), 1).setVisible(true);
                } else {
                    if (multi_4.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName4.getText(), EndTime4, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName4.getText(), EndTime4, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName4.getText(), 0).setVisible(true);
                }
                //Check on payPro if null
                id4.setText("0");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
            }

        }
    }//GEN-LAST:event_btnsave4ActionPerformed

    private void btnDrinks7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinks7ActionPerformed
        new addDrinksForDevices(txtPSName5.getText(), date5).setVisible(true);
    }//GEN-LAST:event_btnDrinks7ActionPerformed

    private void btnsave5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsave5ActionPerformed
        if (state5) {
            state5 = false;
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a", new Locale("en"));
            startTime5 = date5.substring(11, 22);
            paymentDevicesModel pay = new paymentDevicesModel();
            int ids = 0;
            pay.setStartTime(startTime5);

            try {
                float sumofPriceAll = 0;

                if (!id5.getText().equals("0")) {
                    ids = Integer.parseInt(id5.getText());
                } else {
                    ids = paymentdevicesCruds.getIdWithDateAndDeviceName(txtPSName5.getText(), date5);
                }
                String TotalPriceDevid;
                float SinglePrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName5.getText(), "");
                float MultiPrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName5.getText(), "Multi");
                ArrayList<Float> list = paymentdevicesCruds.getAllTimePrice(ids);
                for (int i = 0; i < list.size(); i++) {
                    sumofPriceAll += list.get(i);
                }

                pay.setTotalPrice(Float.parseFloat(String.valueOf(sumofPriceAll)));
                if (multi_5.isSelected()) {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / MultiPrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / MultiPrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }

                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                } else {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / SinglePrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / SinglePrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }
                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                prductPaymentCruds.updatePaymentProductsWithDate(1, txtPSName5.getText(), date5);
                date5 = df.format(new Date());
                EndTime5 = date5.substring(11, 22);
                pay.setEndTime(EndTime5);
                // function take endTime and PS name get the data where startTime=Parameter EndTime and Type of hours is multi
                // the second part of this function is 
                paymentdevicesCruds.UpdateForSaveAllTimeAndTotalPrice(pay, ids);
                ArrayList<paymentDevicesModel> list1;
                if (txtSecond5.isSelected()) {
                    if (multi_5.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName5.getText(), EndTime5, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName5.getText(), EndTime5, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName5.getText(), 1).setVisible(true);
                } else {
                    if (multi_5.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName5.getText(), EndTime5, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName5.getText(), EndTime5, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName5.getText(), 0).setVisible(true);
                }
                //Check on payPro if null
                id5.setText("0");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
            }
        }
    }//GEN-LAST:event_btnsave5ActionPerformed

    private void btnDrinks8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinks8ActionPerformed
        new addDrinksForDevices(txtPSName6.getText(), date6).setVisible(true);
    }//GEN-LAST:event_btnDrinks8ActionPerformed

    private void btnsave6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsave6ActionPerformed
        if (state6) {
            state6 = false;
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a", new Locale("en"));
            startTime6 = date6.substring(11, 22);
            paymentDevicesModel pay = new paymentDevicesModel();
            int ids = 0;
            pay.setStartTime(startTime6);

            try {
                float sumofPriceAll = 0;

                if (!id6.getText().equals("0")) {
                    ids = Integer.parseInt(id6.getText());
                } else {
                    ids = paymentdevicesCruds.getIdWithDateAndDeviceName(txtPSName6.getText(), date6);
                }
                String TotalPriceDevid;
                float SinglePrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName6.getText(), "");
                float MultiPrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName6.getText(), "Multi");
                ArrayList<Float> list = paymentdevicesCruds.getAllTimePrice(ids);
                for (int i = 0; i < list.size(); i++) {
                    sumofPriceAll += list.get(i);
                }

                pay.setTotalPrice(Float.parseFloat(String.valueOf(sumofPriceAll)));
                if (multi_6.isSelected()) {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / MultiPrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / MultiPrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }
                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                } else {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / SinglePrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / SinglePrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }
                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                prductPaymentCruds.updatePaymentProductsWithDate(1, txtPSName6.getText(), date6);
                date6 = df.format(new Date());
                EndTime6 = date6.substring(11, 22);
                pay.setEndTime(EndTime6);
                // function take endTime and PS name get the data where startTime=Parameter EndTime and Type of hours is multi
                // the second part of this function is 
                paymentdevicesCruds.UpdateForSaveAllTimeAndTotalPrice(pay, ids);
                ArrayList<paymentDevicesModel> list1;
                if (txtSecond6.isSelected()) {
                    if (multi_6.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName6.getText(), EndTime6, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName6.getText(), EndTime6, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName6.getText(), 1).setVisible(true);
                } else {
                    if (multi_6.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName6.getText(), EndTime6, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName6.getText(), EndTime6, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName6.getText(), 0).setVisible(true);
                }
                //Check on payPro if null
                id6.setText("0");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
            }
        }
    }//GEN-LAST:event_btnsave6ActionPerformed

    private void btnDrinks9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinks9ActionPerformed
        new addDrinksForDevices(txtPSName7.getText(), date7).setVisible(true);
    }//GEN-LAST:event_btnDrinks9ActionPerformed

    private void btnSave7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave7ActionPerformed
        if (state7) {
            state7 = false;
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a", new Locale("en"));
            startTime7 = date7.substring(11, 22);
            paymentDevicesModel pay = new paymentDevicesModel();
            int ids = 0;
            pay.setStartTime(startTime7);

            try {
                float sumofPriceAll = 0;

                if (!id7.getText().equals("0")) {
                    ids = Integer.parseInt(id7.getText());
                } else {
                    ids = paymentdevicesCruds.getIdWithDateAndDeviceName(txtPSName7.getText(), date7);
                }
                String TotalPriceDevid;
                float SinglePrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName7.getText(), "");
                float MultiPrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName7.getText(), "Multi");
                ArrayList<Float> list = paymentdevicesCruds.getAllTimePrice(ids);
                for (int i = 0; i < list.size(); i++) {
                    sumofPriceAll += list.get(i);
                }

                pay.setTotalPrice(Float.parseFloat(String.valueOf(sumofPriceAll)));
                if (multi_7.isSelected()) {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / MultiPrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / MultiPrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }

                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                } else {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / SinglePrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / SinglePrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }

                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                prductPaymentCruds.updatePaymentProductsWithDate(1, txtPSName7.getText(), date7);
                date7 = df.format(new Date());
                EndTime7 = date7.substring(11, 22);
                pay.setEndTime(EndTime7);
                // function take endTime and PS name get the data where startTime=Parameter EndTime and Type of hours is multi
                // the second part of this function is 
                paymentdevicesCruds.UpdateForSaveAllTimeAndTotalPrice(pay, ids);
                ArrayList<paymentDevicesModel> list1;
                if (txtSecond7.isSelected()) {
                    if (multi_7.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName7.getText(), EndTime7, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName7.getText(), EndTime7, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName7.getText(), 1).setVisible(true);
                } else {
                    if (multi_7.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName7.getText(), EndTime7, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName7.getText(), EndTime7, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName7.getText(), 0).setVisible(true);
                }
                //Check on payPro if null
                id7.setText("0");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
            }
        }
    }//GEN-LAST:event_btnSave7ActionPerformed

    private void btnDrinks10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinks10ActionPerformed
        new addDrinksForDevices(txtPSName8.getText(), date8).setVisible(true);
    }//GEN-LAST:event_btnDrinks10ActionPerformed

    private void btnSave8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave8ActionPerformed
        if (state8) {
            state8 = false;
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a", new Locale("en"));
            startTime8 = date8.substring(11, 22);  //2023-06-24 09:17:23 AM
            paymentDevicesModel pay = new paymentDevicesModel();
            int ids = 0;
            pay.setStartTime(startTime8);
            try {
                float sumofPriceAll = 0;

                if (!id8.getText().equals("0")) {
                    ids = Integer.parseInt(id8.getText());
                } else {
                    ids = paymentdevicesCruds.getIdWithDateAndDeviceName(txtPSName8.getText(), date8);
                }
                String TotalPriceDevid;
                float SinglePrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName8.getText(), "");
                float MultiPrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName8.getText(), "Multi");
                ArrayList<Float> list = paymentdevicesCruds.getAllTimePrice(ids);
                for (int i = 0; i < list.size(); i++) {
                    sumofPriceAll += list.get(i);
                }

                pay.setTotalPrice(Float.parseFloat(String.valueOf(sumofPriceAll)));
                if (multi_8.isSelected()) {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / MultiPrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / MultiPrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }
                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                } else {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / SinglePrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / SinglePrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }
                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                prductPaymentCruds.updatePaymentProductsWithDate(1, txtPSName8.getText(), date8);
                date8 = df.format(new Date());
                EndTime8 = date8.substring(11, 22);
                pay.setEndTime(EndTime8);
                // function take endTime and PS name get the data where startTime=Parameter EndTime and Type of hours is multi
                // the second part of this function is 
                paymentdevicesCruds.UpdateForSaveAllTimeAndTotalPrice(pay, ids);
                ArrayList<paymentDevicesModel> list1;
                if (txtSecond8.isSelected()) {
                    if (multi_8.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName8.getText(), EndTime8, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName8.getText(), EndTime8, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName8.getText(), 1).setVisible(true);
                } else {
                    if (multi_8.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName8.getText(), EndTime8, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName8.getText(), EndTime8, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName8.getText(), 0).setVisible(true);
                }
                //Check on payPro if null
                id8.setText("0");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
            }
        }

    }//GEN-LAST:event_btnSave8ActionPerformed

    private void btnDrinks11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinks11ActionPerformed
        new addDrinksForDevices(txtPSName9.getText(), date9).setVisible(true);
    }//GEN-LAST:event_btnDrinks11ActionPerformed

    private void btnSave9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave9ActionPerformed

        if (state9) {
            state9 = false;
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a", new Locale("en"));
            startTime9 = date9.substring(11, 22);  //2023-06-24 09:17:23 AM
            paymentDevicesModel pay = new paymentDevicesModel();
            int ids = 0;
            pay.setStartTime(startTime9);
            try {
                float sumofPriceAll = 0;

                if (!id9.getText().equals("0")) {
                    ids = Integer.parseInt(id9.getText());
                } else {
                    ids = paymentdevicesCruds.getIdWithDateAndDeviceName(txtPSName9.getText(), date9);
                }
                String TotalPriceDevid;
                float SinglePrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName9.getText(), "");
                float MultiPrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName9.getText(), "Multi");
                ArrayList<Float> list = paymentdevicesCruds.getAllTimePrice(ids);
                for (int i = 0; i < list.size(); i++) {
                    sumofPriceAll += list.get(i);
                }

                pay.setTotalPrice(Float.parseFloat(String.valueOf(sumofPriceAll)));
                if (multi_9.isSelected()) {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / MultiPrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / MultiPrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }
                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                } else {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / SinglePrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / SinglePrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }

                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                prductPaymentCruds.updatePaymentProductsWithDate(1, txtPSName9.getText(), date9);
                date9 = df.format(new Date());
                EndTime9 = date9.substring(11, 22);
                pay.setEndTime(EndTime9);
                // function take endTime and PS name get the data where startTime=Parameter EndTime and Type of hours is multi
                // the second part of this function is 
                paymentdevicesCruds.UpdateForSaveAllTimeAndTotalPrice(pay, ids);
                ArrayList<paymentDevicesModel> list1;
                if (txtSecond9.isSelected()) {
                    if (multi_9.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName9.getText(), EndTime9, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName9.getText(), EndTime9, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName9.getText(), 1).setVisible(true);
                } else {
                    if (multi_9.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName9.getText(), EndTime9, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName9.getText(), EndTime9, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName9.getText(), 0).setVisible(true);
                }
                //Check on payPro if null
                id9.setText("0");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
            }
        }
    }//GEN-LAST:event_btnSave9ActionPerformed

    private void btnDrinks12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinks12ActionPerformed
        new addDrinksForDevices(txtPSName10.getText(), date10).setVisible(true);
    }//GEN-LAST:event_btnDrinks12ActionPerformed

    private void btnSave10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave10ActionPerformed

        if (state10) {
            state10 = false;
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a", new Locale("en"));
            startTime10 = date10.substring(11, 22);  //2023-06-24 09:17:23 AM
            paymentDevicesModel pay = new paymentDevicesModel();
            int ids = 0;
            pay.setStartTime(startTime10);
            try {
                float sumofPriceAll = 0;

                if (!id10.getText().equals("0")) {
                    ids = Integer.parseInt(id10.getText());
                } else {
                    ids = paymentdevicesCruds.getIdWithDateAndDeviceName(txtPSName10.getText(), date10);
                }
                String TotalPriceDevid;
                float SinglePrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName10.getText(), "");
                float MultiPrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName10.getText(), "Multi");
                ArrayList<Float> list = paymentdevicesCruds.getAllTimePrice(ids);
                for (int i = 0; i < list.size(); i++) {
                    sumofPriceAll += list.get(i);
                }

                pay.setTotalPrice(Float.parseFloat(String.valueOf(sumofPriceAll)));
                if (multi_10.isSelected()) {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / MultiPrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / MultiPrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }

                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                } else {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / SinglePrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / SinglePrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }

                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                prductPaymentCruds.updatePaymentProductsWithDate(1, txtPSName10.getText(), date10);
                date10 = df.format(new Date());
                EndTime10 = date10.substring(11, 22);
                pay.setEndTime(EndTime10);
                // function take endTime and PS name get the data where startTime=Parameter EndTime and Type of hours is multi
                // the second part of this function is 
                paymentdevicesCruds.UpdateForSaveAllTimeAndTotalPrice(pay, ids);
                ArrayList<paymentDevicesModel> list1;
                if (txtSecond10.isSelected()) {
                    if (multi_10.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName10.getText(), EndTime10, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName10.getText(), EndTime10, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName10.getText(), 1).setVisible(true);
                } else {
                    if (multi_10.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName10.getText(), EndTime10, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName10.getText(), EndTime10, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName10.getText(), 0).setVisible(true);
                }
                //Check on payPro if null
                id10.setText("0");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
            }
        }

    }//GEN-LAST:event_btnSave10ActionPerformed

    private void btnDrinks13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinks13ActionPerformed

        new addDrinksForDevices(txtPSName11.getText(), date11).setVisible(true);
    }//GEN-LAST:event_btnDrinks13ActionPerformed

    private void btnSave11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave11ActionPerformed

        if (state11) {
            state11 = false;
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a", new Locale("en"));
            startTime11 = date11.substring(11, 22);  //2023-06-24 09:17:23 AM
            paymentDevicesModel pay = new paymentDevicesModel();
            int ids = 0;
            pay.setStartTime(startTime11);
            try {
                float sumofPriceAll = 0;

                if (!id11.getText().equals("0")) {
                    ids = Integer.parseInt(id11.getText());
                } else {
                    ids = paymentdevicesCruds.getIdWithDateAndDeviceName(txtPSName11.getText(), date11);
                }
                String TotalPriceDevid;
                float SinglePrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName11.getText(), "");
                float MultiPrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName11.getText(), "Multi");
                ArrayList<Float> list = paymentdevicesCruds.getAllTimePrice(ids);
                for (int i = 0; i < list.size(); i++) {
                    sumofPriceAll += list.get(i);
                }

                pay.setTotalPrice(Float.parseFloat(String.valueOf(sumofPriceAll)));
                if (multi_11.isSelected()) {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / MultiPrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / MultiPrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }
                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                } else {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / SinglePrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / SinglePrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }

                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                prductPaymentCruds.updatePaymentProductsWithDate(1, txtPSName11.getText(), date11);
                date11 = df.format(new Date());
                EndTime11 = date11.substring(11, 22);
                pay.setEndTime(EndTime11);
                // function take endTime and PS name get the data where startTime=Parameter EndTime and Type of hours is multi
                // the second part of this function is 
                paymentdevicesCruds.UpdateForSaveAllTimeAndTotalPrice(pay, ids);
                ArrayList<paymentDevicesModel> list1;
                if (txtSecond11.isSelected()) {
                    if (multi_11.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName11.getText(), EndTime11, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName11.getText(), EndTime11, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName11.getText(), 1).setVisible(true);
                } else {
                    if (multi_11.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName11.getText(), EndTime11, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName11.getText(), EndTime11, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName11.getText(), 0).setVisible(true);
                }
                //Check on payPro if null
                id11.setText("0");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
            }
        }
    }//GEN-LAST:event_btnSave11ActionPerformed

    private void btnDrinks14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinks14ActionPerformed

        new addDrinksForDevices(txtPSName12.getText(), date12).setVisible(true);
    }//GEN-LAST:event_btnDrinks14ActionPerformed

    private void btnSave12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave12ActionPerformed
        if (state12) {
            state12 = false;
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a", new Locale("en"));
            startTime12 = date12.substring(11, 22);  //2023-06-24 09:17:23 AM
            paymentDevicesModel pay = new paymentDevicesModel();
            int ids = 0;
            pay.setStartTime(startTime12);
            try {
                float sumofPriceAll = 0;

                if (!id12.getText().equals("0")) {
                    ids = Integer.parseInt(id12.getText());
                } else {
                    ids = paymentdevicesCruds.getIdWithDateAndDeviceName(txtPSName12.getText(), date12);
                }
                String TotalPriceDevid;
                float SinglePrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName12.getText(), "");
                float MultiPrice = paymentdevicesCruds.getMultiPriceandSingle(txtPSName12.getText(), "Multi");
                ArrayList<Float> list = paymentdevicesCruds.getAllTimePrice(ids);
                for (int i = 0; i < list.size(); i++) {
                    sumofPriceAll += list.get(i);
                }

                pay.setTotalPrice(Float.parseFloat(String.valueOf(sumofPriceAll)));
                if (multi_12.isSelected()) {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / MultiPrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / MultiPrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }

                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                } else {
                    String TotalPriceDevidForCheck = String.format("%.2f", sumofPriceAll / SinglePrice);
                    TotalPriceDevid = String.valueOf(sumofPriceAll / SinglePrice);
                    String minutes = "";
                    int minutesf = 0;
                    float hours = 0;
                    if (TotalPriceDevidForCheck.length() == 4) {
                        if (TotalPriceDevidForCheck.charAt(2) != '0') {
                            minutes = TotalPriceDevidForCheck.charAt(2) + "" + TotalPriceDevidForCheck.charAt(3);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            minutesf = Integer.parseInt(minutes);
                            if (minutesf <= 5) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf > 5 && minutesf <= 10) {
                                pay.setAllTime(String.valueOf(hours + 0.5));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                        } else {
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0)));
                            pay.setAllTime(String.valueOf(hours));
                        }
                    } else if (TotalPriceDevidForCheck.length() == 5) {
                        try {
                            minutes = TotalPriceDevidForCheck.charAt(3) + "" + TotalPriceDevidForCheck.charAt(TotalPriceDevidForCheck.length() - 1);
                            hours = Float.parseFloat(String.valueOf(TotalPriceDevid.charAt(0) + "" + TotalPriceDevid.charAt(1)));
                            minutesf = Integer.parseInt(minutes);

                            if (minutesf <= 15) {
                                pay.setAllTime(String.valueOf(hours));
                            }
                            if (minutesf >= 16 && minutesf <= 18) {
                                pay.setAllTime(String.valueOf(hours + 0.1) + "0");
                            }
                            if (minutesf > 18 && minutesf <= 25) {
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
                prductPaymentCruds.updatePaymentProductsWithDate(1, txtPSName12.getText(), date12);
                date12 = df.format(new Date());
                EndTime12 = date12.substring(11, 22);
                pay.setEndTime(EndTime12);
                // function take endTime and PS name get the data where startTime=Parameter EndTime and Type of hours is multi
                // the second part of this function is 
                paymentdevicesCruds.UpdateForSaveAllTimeAndTotalPrice(pay, ids);
                ArrayList<paymentDevicesModel> list1;
                if (txtSecond12.isSelected()) {
                    if (multi_12.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName12.getText(), EndTime12, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName12.getText(), EndTime12, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName12.getText(), 1).setVisible(true);
                } else {
                    if (multi_12.isSelected()) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName12.getText(), EndTime12, "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(txtPSName12.getText(), EndTime12, "Single");
                    }
                    new ShowPriceDetailsLive(list1, txtPSName12.getText(), 0).setVisible(true);
                }
                //Check on payPro if null
                id12.setText("0");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
            }
        }
    }//GEN-LAST:event_btnSave12ActionPerformed

    private void btnHand1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHand1ActionPerformed
        // Set the Time manualy from set hour1 and set minutes1 as global vrialbles for device 1
        int hourss;
        int minutes;
        try {
            String a = JOptionPane.showInputDialog(null, "ادخل عدد الساعات", JOptionPane.PLAIN_MESSAGE);
            if (!a.equals("")) {
                hourss = Integer.parseInt(a);
                M.hours[0] = hourss;
//                sh.hours[0] = hourss;
                String b = JOptionPane.showInputDialog(null, "ادخل عدد الدقائق", JOptionPane.PLAIN_MESSAGE);
                if (!b.equals("")) {
                    minutes = Integer.parseInt(b);
                    M.minuts[0] = minutes;
//                    sh.minuts[0] = minutes;
                } else {
                    M.minuts[0] = 0;
//                    sh.minuts[0] = 0;
                }
            } else {
                M.hours[0] = 0;
//                sh.hours[0] = 0;
            }
            M.seconds[0] = 0;
            Timer1.setText(M.hours[0] + ":" + M.minuts[0] + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnHand1ActionPerformed

    private void btnResetTotalDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetTotalDayActionPerformed

        try {
            String subDate = date1.substring(0, 10);
            txtTotalDay.setText(String.valueOf(paymentdevicesCruds.getTotalforDay(subDate)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnResetTotalDayActionPerformed

    private void btnreset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset2ActionPerformed
        try {
            M.hours[1] = 0;
            M.minuts[1] = 0;
            M.seconds[1] = 0;
            Timer2.setText(0 + ":" + 0 + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnreset2ActionPerformed

    private void btnreset3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset3ActionPerformed
        try {
            M.hours[2] = 0;
            M.minuts[2] = 0;
            M.seconds[2] = 0;
            Timer3.setText(0 + ":" + 0 + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnreset3ActionPerformed

    private void btnreset4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset4ActionPerformed
        try {
            M.hours[3] = 0;
            M.minuts[3] = 0;
            M.seconds[3] = 0;
            Timer4.setText(0 + ":" + 0 + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnreset4ActionPerformed

    private void btnreset5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset5ActionPerformed
        try {
            M.hours[4] = 0;
            M.minuts[4] = 0;
            M.seconds[4] = 0;
            Timer5.setText(0 + ":" + 0 + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnreset5ActionPerformed

    private void btnreset6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset6ActionPerformed
        try {
            M.hours[5] = 0;
            M.minuts[5] = 0;
            M.seconds[5] = 0;
            Timer6.setText(0 + ":" + 0 + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnreset6ActionPerformed

    private void btnreset7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset7ActionPerformed
        try {
            M.hours[6] = 0;
            M.minuts[6] = 0;
            M.seconds[6] = 0;
            Timer7.setText(0 + ":" + 0 + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnreset7ActionPerformed

    private void btnreset8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset8ActionPerformed
        try {
            M.hours[7] = 0;
            M.minuts[7] = 0;
            M.seconds[7] = 0;
            Timer8.setText(0 + ":" + 0 + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnreset8ActionPerformed

    private void btnreset9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset9ActionPerformed
        try {
            M.hours[8] = 0;
            M.minuts[8] = 0;
            M.seconds[8] = 0;
            Timer9.setText(0 + ":" + 0 + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnreset9ActionPerformed

    private void btnreset10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset10ActionPerformed
        try {
            M.hours[9] = 0;
            M.minuts[9] = 0;
            M.seconds[9] = 0;
            Timer10.setText(0 + ":" + 0 + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnreset10ActionPerformed

    private void btnreset11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset11ActionPerformed
        try {
            M.hours[10] = 0;
            M.minuts[10] = 0;
            M.seconds[10] = 0;
            Timer11.setText(0 + ":" + 0 + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnreset11ActionPerformed

    private void btnreset12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset12ActionPerformed
        try {
            M.hours[11] = 0;
            M.minuts[11] = 0;
            M.seconds[11] = 0;
            Timer12.setText(0 + ":" + 0 + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnreset12ActionPerformed

    private void btnHand2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHand2ActionPerformed
        // Set the Time manualy from set hour1 and set minutes1 as global vrialbles for device 1
        int hourss;
        int minutes;
        try {
            String a = JOptionPane.showInputDialog(null, "ادخل عدد الساعات", JOptionPane.PLAIN_MESSAGE);
            if (!a.equals("")) {
                hourss = Integer.parseInt(a);
                M.hours[1] = hourss;
//                sh.hours[1] = hourss;
                String b = JOptionPane.showInputDialog(null, "ادخل عدد الدقائق", JOptionPane.PLAIN_MESSAGE);
                if (!b.equals("")) {
                    minutes = Integer.parseInt(b);
                    M.minuts[1] = minutes;
//                    sh.minuts[1] = minutes;
                } else {
                    M.minuts[1] = 0;
//                    sh.minuts[1] = 0;
                }
            } else {
                M.hours[1] = 0;
//                sh.hours[1] = 0;
            }
            M.seconds[1] = 0;
            Timer2.setText(M.hours[1] + ":" + M.minuts[1] + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnHand2ActionPerformed

    private void btnHand3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHand3ActionPerformed
        int hourss;
        int minutes;
        try {
            String a = JOptionPane.showInputDialog(null, "ادخل عدد الساعات", JOptionPane.PLAIN_MESSAGE);
            if (!a.equals("")) {
                hourss = Integer.parseInt(a);
                M.hours[2] = hourss;
//                sh.hours[2] = hourss;
                String b = JOptionPane.showInputDialog(null, "ادخل عدد الدقائق", JOptionPane.PLAIN_MESSAGE);
                if (!b.equals("")) {
                    minutes = Integer.parseInt(b);
                    M.minuts[2] = minutes;
//                    sh.minuts[2] = minutes;
                } else {
                    M.minuts[2] = 0;
//                    sh.minuts[2] = 0;
                }
            } else {
                M.hours[2] = 0;
//                sh.hours[2] = 0;
            }
            M.seconds[2] = 0;
            Timer3.setText(M.hours[2] + ":" + M.minuts[2] + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnHand3ActionPerformed

    private void btnHand14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHand14ActionPerformed
        int hourss;
        int minutes;
        try {
            String a = JOptionPane.showInputDialog(null, "ادخل عدد الساعات", JOptionPane.PLAIN_MESSAGE);
            if (!a.equals("")) {
                hourss = Integer.parseInt(a);
                M.hours[3] = hourss;
//                sh.hours[3] = hourss;
                String b = JOptionPane.showInputDialog(null, "ادخل عدد الدقائق", JOptionPane.PLAIN_MESSAGE);
                if (!b.equals("")) {
                    minutes = Integer.parseInt(b);
                    M.minuts[3] = minutes;
//                    sh.minuts[3] = minutes;
                } else {
                    M.minuts[3] = 0;
//                    sh.minuts[3] = 0;
                }
            } else {
                M.hours[3] = 0;
//                sh.hours[3] = 0;
            }
            M.seconds[3] = 0;
            Timer4.setText(M.hours[3] + ":" + M.minuts[3] + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnHand14ActionPerformed

    private void btnHand15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHand15ActionPerformed
        int hourss;
        int minutes;
        try {
            String a = JOptionPane.showInputDialog(null, "ادخل عدد الساعات", JOptionPane.PLAIN_MESSAGE);
            if (!a.equals("")) {
                hourss = Integer.parseInt(a);
                M.hours[4] = hourss;
//                sh.hours[4] = hourss;
                String b = JOptionPane.showInputDialog(null, "ادخل عدد الدقائق", JOptionPane.PLAIN_MESSAGE);
                if (!b.equals("")) {
                    minutes = Integer.parseInt(b);
                    M.minuts[4] = minutes;
//                    sh.minuts[4] = minutes;
                } else {
                    M.minuts[4] = 0;
//                    sh.minuts[4] = 0;
                }
            } else {
                M.hours[4] = 0;
//                sh.hours[4] = 0;
            }
            M.seconds[4] = 0;
            Timer5.setText(M.hours[4] + ":" + M.minuts[4] + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnHand15ActionPerformed

    private void btnHand17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHand17ActionPerformed
        int hourss;
        int minutes;
        try {
            String a = JOptionPane.showInputDialog(null, "ادخل عدد الساعات", JOptionPane.PLAIN_MESSAGE);
            if (!a.equals("")) {
                hourss = Integer.parseInt(a);
                M.hours[6] = hourss;
//                sh.hours[6] = hourss;
                String b = JOptionPane.showInputDialog(null, "ادخل عدد الدقائق", JOptionPane.PLAIN_MESSAGE);
                if (!b.equals("")) {
                    minutes = Integer.parseInt(b);
                    M.minuts[6] = minutes;
//                    sh.minuts[6] = minutes;
                } else {
                    M.minuts[6] = 0;
//                    sh.minuts[6] = 0;
                }
            } else {
                M.hours[6] = 0;
//                sh.hours[6] = 0;
            }
            M.seconds[6] = 0;
            Timer7.setText(M.hours[6] + ":" + M.minuts[6] + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnHand17ActionPerformed

    private void btnHand18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHand18ActionPerformed
        int hourss;
        int minutes;
        try {
            String a = JOptionPane.showInputDialog(null, "ادخل عدد الساعات", JOptionPane.PLAIN_MESSAGE);
            if (!a.equals("")) {
                hourss = Integer.parseInt(a);
                M.hours[7] = hourss;
//                sh.hours[7] = hourss;
                String b = JOptionPane.showInputDialog(null, "ادخل عدد الدقائق", JOptionPane.PLAIN_MESSAGE);
                if (!b.equals("")) {
                    minutes = Integer.parseInt(b);
                    M.minuts[7] = minutes;
//                    sh.minuts[7] = minutes;
                } else {
                    M.minuts[7] = 0;
//                    sh.minuts[7] = 0;
                }
            } else {
                M.hours[7] = 0;
//                sh.hours[7] = 0;
            }
            M.seconds[7] = 0;
            Timer8.setText(M.hours[7] + ":" + M.minuts[7] + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnHand18ActionPerformed

    private void btnHand19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHand19ActionPerformed
        int hourss;
        int minutes;
        try {
            String a = JOptionPane.showInputDialog(null, "ادخل عدد الساعات", JOptionPane.PLAIN_MESSAGE);
            if (!a.equals("")) {
                hourss = Integer.parseInt(a);
                M.hours[8] = hourss;
//                sh.hours[8] = hourss;
                String b = JOptionPane.showInputDialog(null, "ادخل عدد الدقائق", JOptionPane.PLAIN_MESSAGE);
                if (!b.equals("")) {
                    minutes = Integer.parseInt(b);
                    M.minuts[8] = minutes;
//                    sh.minuts[8] = minutes;
                } else {
                    M.minuts[8] = 0;
//                    sh.minuts[8] = 0;
                }
            } else {
                M.hours[8] = 0;
//                sh.hours[8] = 0;
            }
            M.seconds[8] = 0;
            Timer9.setText(M.hours[8] + ":" + M.minuts[8] + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnHand19ActionPerformed

    private void btnHand10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHand10ActionPerformed
        int hourss;
        int minutes;
        try {
            String a = JOptionPane.showInputDialog(null, "ادخل عدد الساعات", JOptionPane.PLAIN_MESSAGE);
            if (!a.equals("")) {
                hourss = Integer.parseInt(a);
                M.hours[9] = hourss;
//                sh.hours[9] = hourss;
                String b = JOptionPane.showInputDialog(null, "ادخل عدد الدقائق", JOptionPane.PLAIN_MESSAGE);
                if (!b.equals("")) {
                    minutes = Integer.parseInt(b);
                    M.minuts[9] = minutes;
//                    sh.minuts[9] = minutes;
                } else {
                    M.minuts[9] = 0;
//                    sh.minuts[9] = 0;
                }
            } else {
                M.hours[9] = 0;
//                sh.hours[9] = 0;
            }
            M.seconds[9] = 0;
            Timer10.setText(M.hours[9] + ":" + M.minuts[9] + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnHand10ActionPerformed

    private void btnHand11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHand11ActionPerformed
        int hourss;
        int minutes;
        try {
            String a = JOptionPane.showInputDialog(null, "ادخل عدد الساعات", JOptionPane.PLAIN_MESSAGE);
            if (!a.equals("")) {
                hourss = Integer.parseInt(a);
                M.hours[10] = hourss;
//                sh.hours[10] = hourss;
                String b = JOptionPane.showInputDialog(null, "ادخل عدد الدقائق", JOptionPane.PLAIN_MESSAGE);
                if (!b.equals("")) {
                    minutes = Integer.parseInt(b);
                    M.minuts[10] = minutes;
//                    sh.minuts[10] = minutes;
                } else {
                    M.minuts[10] = 0;
//                    sh.minuts[10] = 0;
                }
            } else {
                M.hours[10] = 0;
//                sh.hours[10] = 0;
            }
            M.seconds[10] = 0;
            Timer11.setText(M.hours[10] + ":" + M.minuts[10] + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnHand11ActionPerformed

    private void btnHand12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHand12ActionPerformed
        int hourss;
        int minutes;
        try {
            String a = JOptionPane.showInputDialog(null, "ادخل عدد الساعات", JOptionPane.PLAIN_MESSAGE);
            if (!a.equals("")) {
                hourss = Integer.parseInt(a);
                M.hours[11] = hourss;
//                sh.hours[11] = hourss;
                String b = JOptionPane.showInputDialog(null, "ادخل عدد الدقائق", JOptionPane.PLAIN_MESSAGE);
                if (!b.equals("")) {
                    minutes = Integer.parseInt(b);
                    M.minuts[11] = minutes;
//                    sh.minuts[11] = minutes;
                } else {
                    M.minuts[11] = 0;
//                    sh.minuts[11] = 0;
                }
            } else {
                M.hours[11] = 0;
//                sh.hours[11] = 0;
            }
            M.seconds[11] = 0;
            Timer12.setText(M.hours[11] + ":" + M.minuts[11] + ":" + 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnHand12ActionPerformed

    private void txtSecond2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecond2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecond2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TimeLable;
    private javax.swing.JLabel Timer1;
    private javax.swing.JLabel Timer10;
    private javax.swing.JLabel Timer11;
    private javax.swing.JLabel Timer12;
    private javax.swing.JLabel Timer2;
    private javax.swing.JLabel Timer3;
    private javax.swing.JLabel Timer4;
    private javax.swing.JLabel Timer5;
    private javax.swing.JLabel Timer6;
    private javax.swing.JLabel Timer7;
    private javax.swing.JLabel Timer8;
    private javax.swing.JLabel Timer9;
    private javax.swing.JButton btnDrinks1;
    private javax.swing.JButton btnDrinks10;
    private javax.swing.JButton btnDrinks11;
    private javax.swing.JButton btnDrinks12;
    private javax.swing.JButton btnDrinks13;
    private javax.swing.JButton btnDrinks14;
    private javax.swing.JButton btnDrinks3;
    private javax.swing.JButton btnDrinks4;
    private javax.swing.JButton btnDrinks6;
    private javax.swing.JButton btnDrinks7;
    private javax.swing.JButton btnDrinks8;
    private javax.swing.JButton btnDrinks9;
    private javax.swing.JButton btnHand1;
    private javax.swing.JButton btnHand10;
    private javax.swing.JButton btnHand11;
    private javax.swing.JButton btnHand12;
    private javax.swing.JButton btnHand14;
    private javax.swing.JButton btnHand15;
    private javax.swing.JButton btnHand16;
    private javax.swing.JButton btnHand17;
    private javax.swing.JButton btnHand18;
    private javax.swing.JButton btnHand19;
    private javax.swing.JButton btnHand2;
    private javax.swing.JButton btnHand3;
    private javax.swing.JButton btnManageAll;
    private javax.swing.JButton btnManageDevices;
    private javax.swing.JButton btnResetTotalDay;
    private javax.swing.JButton btnSave10;
    private javax.swing.JButton btnSave11;
    private javax.swing.JButton btnSave12;
    private javax.swing.JButton btnSave7;
    private javax.swing.JButton btnSave8;
    private javax.swing.JButton btnSave9;
    private javax.swing.JButton btnStart1;
    private javax.swing.JButton btnStart10;
    private javax.swing.JButton btnStart11;
    private javax.swing.JButton btnStart12;
    private javax.swing.JButton btnStart2;
    private javax.swing.JButton btnStart3;
    private javax.swing.JButton btnStart4;
    private javax.swing.JButton btnStart5;
    private javax.swing.JButton btnStart6;
    private javax.swing.JButton btnStart7;
    private javax.swing.JButton btnStart8;
    private javax.swing.JButton btnStart9;
    private javax.swing.JButton btnStop1;
    private javax.swing.JButton btnStop10;
    private javax.swing.JButton btnStop11;
    private javax.swing.JButton btnStop12;
    private javax.swing.JButton btnStop2;
    private javax.swing.JButton btnStop3;
    private javax.swing.JButton btnStop4;
    private javax.swing.JButton btnStop5;
    private javax.swing.JButton btnStop6;
    private javax.swing.JButton btnStop7;
    private javax.swing.JButton btnStop8;
    private javax.swing.JButton btnStop9;
    private javax.swing.JButton btndrinksProducts;
    private javax.swing.JButton btnreset1;
    private javax.swing.JButton btnreset10;
    private javax.swing.JButton btnreset11;
    private javax.swing.JButton btnreset12;
    private javax.swing.JButton btnreset2;
    private javax.swing.JButton btnreset3;
    private javax.swing.JButton btnreset4;
    private javax.swing.JButton btnreset5;
    private javax.swing.JButton btnreset6;
    private javax.swing.JButton btnreset7;
    private javax.swing.JButton btnreset8;
    private javax.swing.JButton btnreset9;
    private javax.swing.JButton btnsave1;
    private javax.swing.JButton btnsave2;
    private javax.swing.JButton btnsave3;
    private javax.swing.JButton btnsave4;
    private javax.swing.JButton btnsave5;
    private javax.swing.JButton btnsave6;
    public javax.swing.JLabel id1;
    public javax.swing.JLabel id10;
    public javax.swing.JLabel id11;
    public javax.swing.JLabel id12;
    public javax.swing.JLabel id2;
    public javax.swing.JLabel id3;
    public javax.swing.JLabel id4;
    public javax.swing.JLabel id5;
    public javax.swing.JLabel id6;
    public javax.swing.JLabel id7;
    public javax.swing.JLabel id8;
    public javax.swing.JLabel id9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JCheckBox multi_1;
    public javax.swing.JCheckBox multi_10;
    public javax.swing.JCheckBox multi_11;
    public javax.swing.JCheckBox multi_12;
    public javax.swing.JCheckBox multi_2;
    public javax.swing.JCheckBox multi_3;
    public javax.swing.JCheckBox multi_4;
    public javax.swing.JCheckBox multi_5;
    public javax.swing.JCheckBox multi_6;
    public javax.swing.JCheckBox multi_7;
    public javax.swing.JCheckBox multi_8;
    public javax.swing.JCheckBox multi_9;
    private javax.swing.JLabel txtPSName1;
    private javax.swing.JLabel txtPSName10;
    private javax.swing.JLabel txtPSName11;
    private javax.swing.JLabel txtPSName12;
    private javax.swing.JLabel txtPSName2;
    private javax.swing.JLabel txtPSName3;
    private javax.swing.JLabel txtPSName4;
    private javax.swing.JLabel txtPSName5;
    private javax.swing.JLabel txtPSName6;
    private javax.swing.JLabel txtPSName7;
    private javax.swing.JLabel txtPSName8;
    private javax.swing.JLabel txtPSName9;
    public javax.swing.JCheckBox txtSecond1;
    public javax.swing.JCheckBox txtSecond10;
    public javax.swing.JCheckBox txtSecond11;
    public javax.swing.JCheckBox txtSecond12;
    public javax.swing.JCheckBox txtSecond2;
    public javax.swing.JCheckBox txtSecond3;
    public javax.swing.JCheckBox txtSecond4;
    public javax.swing.JCheckBox txtSecond5;
    public javax.swing.JCheckBox txtSecond6;
    public javax.swing.JCheckBox txtSecond7;
    public javax.swing.JCheckBox txtSecond8;
    public javax.swing.JCheckBox txtSecond9;
    private javax.swing.JLabel txtTotalDay;
    // End of variables declaration//GEN-END:variables

}
