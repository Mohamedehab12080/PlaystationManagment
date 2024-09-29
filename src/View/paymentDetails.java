package View;

import Controller.deviceCruds;
import Controller.paymentdevicesCruds;
import Controller.prductPaymentCruds;
import Model.paymentDevicesModel;
import Model.paymentProductModel;
import TOOLS.TableCustom;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class paymentDetails extends javax.swing.JFrame {

    boolean state = false;

    public paymentDetails() {
        initComponents();
        TOOLS.TableCustom.apply(jScrollPane1, TableCustom.TableType.MULTI_LINE);
        TOOLS.TableCustom.apply(jScrollPane2, TableCustom.TableType.MULTI_LINE);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", new Locale("en"));
        Date todayDate = new Date();
        String date = df.format(todayDate);
        txtTodayDate.setText(date);
        txtSearchDateTime.setEnabled(false);
        txtSearchDateDrinks.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtSearchDateTime = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTodayDate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTotalTimes = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTotalDrinks = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtAllTotal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDeleteMonth = new javax.swing.JButton();
        txtYear = new javax.swing.JComboBox<>();
        txtMonth = new javax.swing.JComboBox<>();
        txtSearchPS = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtReturnCloses = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtReturn = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSearchDateDrinks = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(96, 139, 161));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "اسم الجهاز", "Time1", "Time2", "Time3", "Time4", "Time5", "نوع التايم", "السعر", "التايم الكلي", "التكلفة", "التاريخ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "اسم الجهاز", "اسم المنتج", "سعر المنتج", "الكمية", "التكلفة"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable2MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        txtSearchDateTime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSearchDateTime.setForeground(new java.awt.Color(0, 0, 0));
        txtSearchDateTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " " }));
        txtSearchDateTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchDateTimeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("بحث بالتاريخ تايم:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("تاريخ اليوم:");

        txtTodayDate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTodayDate.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salary.png"))); // NOI18N
        jLabel4.setText("Total:");

        txtTotalTimes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTotalTimes.setForeground(new java.awt.Color(0, 102, 51));
        txtTotalTimes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalTimes.setText("0.0");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salary.png"))); // NOI18N
        jLabel6.setText("Total:");

        txtTotalDrinks.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTotalDrinks.setForeground(new java.awt.Color(0, 102, 51));
        txtTotalDrinks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalDrinks.setText("0.0");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/verify users.png"))); // NOI18N
        jButton1.setText("تفعيل");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtAllTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtAllTotal.setForeground(new java.awt.Color(0, 102, 51));
        txtAllTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAllTotal.setText("0.0");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 51));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reports.png"))); // NOI18N
        jLabel9.setText("All TOTAL:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close Jframe.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view edit delete product.png"))); // NOI18N
        jLabel7.setText("تفاصيل اليوم");

        txtDeleteMonth.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDeleteMonth.setForeground(new java.awt.Color(0, 0, 0));
        txtDeleteMonth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/small delete.png"))); // NOI18N
        txtDeleteMonth.setText("حذف شهر");
        txtDeleteMonth.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtDeleteMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeleteMonthActionPerformed(evt);
            }
        });

        txtYear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtYear.setForeground(new java.awt.Color(0, 0, 0));
        txtYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028" }));
        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });

        txtMonth.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMonth.setForeground(new java.awt.Color(0, 0, 0));
        txtMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        txtMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMonthActionPerformed(evt);
            }
        });

        txtSearchPS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSearchPS.setForeground(new java.awt.Color(0, 0, 0));
        txtSearchPS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " " }));
        txtSearchPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPSActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("بحث بالجهاز:");

        txtReturnCloses.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtReturnCloses.setForeground(new java.awt.Color(0, 0, 0));
        txtReturnCloses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/place order.png"))); // NOI18N
        txtReturnCloses.setText("اعادة لما فصل ");
        txtReturnCloses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtReturnCloses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReturnClosesActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        jButton2.setText("خروج");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtReturn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtReturn.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("بحث بالتاريخ مشاريب:");

        txtSearchDateDrinks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSearchDateDrinks.setForeground(new java.awt.Color(0, 0, 0));
        txtSearchDateDrinks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " " }));
        txtSearchDateDrinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchDateDrinksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDeleteMonth)
                                        .addGap(100, 100, 100)
                                        .addComponent(jButton1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAllTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtSearchDateDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtSearchPS, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSearchDateTime, javax.swing.GroupLayout.Alignment.LEADING, 0, 217, Short.MAX_VALUE)
                                        .addComponent(txtTodayDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(409, 409, 409)
                .addComponent(txtReturnCloses)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(149, 149, 149))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtReturnCloses, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtSearchDateDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(57, 57, 57)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDeleteMonth)
                    .addComponent(jLabel2)
                    .addComponent(txtSearchDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTodayDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtReturn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearchPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTotalDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAllTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTotalTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void getAllTimesRecordsWithdate(String date) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            ArrayList<paymentDevicesModel> list = paymentdevicesCruds.getAllRecordsTimewithDate(date);
            Iterator<paymentDevicesModel> itr = list.iterator();
            while (itr.hasNext()) {
                paymentDevicesModel pay = itr.next();
                dtm.addRow(new Object[]{
                    pay.getId(),
                    pay.getDeviceName(),
                    pay.getTime1(),
                    pay.getTime2(),
                    pay.getTime3(),
                    pay.getTime4(),
                    pay.getTime5(),
                    pay.getHoursType(),
                    pay.getHoursprice(),
                    pay.getAllTime(),
                    pay.getTotalPrice(),
                    pay.getDate()//2023-06-22 07:19:47 PM
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void setTotalTimes() {
        float sum = 0;
        try {
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                sum += Float.parseFloat(String.valueOf(jTable1.getValueAt(i, 10)));
            }
            txtTotalTimes.setText(String.valueOf(Math.round(sum)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void getAllDrinksrecords(String date) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setRowCount(0);
            ArrayList<paymentProductModel> list = prductPaymentCruds.getAllPaymentRecordswithDate(date);
            Iterator<paymentProductModel> itr = list.iterator();
            while (itr.hasNext()) {
                paymentProductModel pay = itr.next();
                dtm.addRow(new Object[]{
                    pay.getId(),
                    pay.getDeviceName(),
                    pay.getProductname(),
                    pay.getProductprice(),
                    pay.getQuantityneeded(),
                    pay.getPriceofTaken()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void getAllDrinksWithDeviceName(String devicename, String date) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setRowCount(0);
            ArrayList<paymentProductModel> list = prductPaymentCruds.getAllPaymentDrinksWithDevicename(devicename, date);
            Iterator<paymentProductModel> itr = list.iterator();
            while (itr.hasNext()) {
                paymentProductModel pay = itr.next();
                dtm.addRow(new Object[]{
                    pay.getId(),
                    pay.getDeviceName(),
                    pay.getProductname(),
                    pay.getProductprice(),
                    pay.getQuantityneeded(),
                    pay.getPriceofTaken()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void getAllDrinksWithDeviceNameandDateForSearch(String devicename, String date) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setRowCount(0);
            ArrayList<paymentProductModel> list = prductPaymentCruds.getAllPaymentRecordswithDatePayedIs1andName(devicename, date);
            Iterator<paymentProductModel> itr = list.iterator();
            while (itr.hasNext()) {
                paymentProductModel pay = itr.next();
                dtm.addRow(new Object[]{
                    pay.getId(),
                    pay.getDeviceName(),
                    pay.getProductname(),
                    pay.getProductprice(),
                    pay.getQuantityneeded(),
                    pay.getPriceofTaken()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void getAllDrinksrecordsForSearch(String date) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setRowCount(0);
            ArrayList<paymentProductModel> list = prductPaymentCruds.getAllPaymentRecordswithDatePayedIs1(date);
            Iterator<paymentProductModel> itr = list.iterator();
            while (itr.hasNext()) {
                paymentProductModel pay = itr.next();
                dtm.addRow(new Object[]{
                    pay.getId(),
                    pay.getDeviceName(),
                    pay.getProductname(),
                    pay.getProductprice(),
                    pay.getQuantityneeded(),
                    pay.getPriceofTaken()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void setTotalDrinks() {
        float sum = 0;
        try {
            for (int i = 0; i < jTable2.getRowCount(); i++) {
                sum += Float.parseFloat(String.valueOf(jTable2.getValueAt(i, 5)));
            }
            txtTotalDrinks.setText(String.valueOf(Math.round(sum)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void setAllTotal() {
        txtAllTotal.setText(String.valueOf(Math.round(Float.parseFloat(txtTotalDrinks.getText()) + Float.parseFloat(txtTotalTimes.getText()))));
    }

    public void getAllRecordsOfTimeForMonth(String year, String Month) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            ArrayList<paymentDevicesModel> list = paymentdevicesCruds.getAllRecordsForMonth(year, Month);
            Iterator<paymentDevicesModel> itr = list.iterator();
            while (itr.hasNext()) {
                paymentDevicesModel pay = itr.next();
                dtm.addRow(new Object[]{
                    pay.getId(),
                    pay.getDeviceName(),
                    pay.getTime1(),
                    pay.getTime2(),
                    pay.getTime3(),
                    pay.getTime4(),
                    pay.getTime5(),
                    pay.getHoursType(),
                    pay.getHoursprice(),
                    pay.getAllTime(),
                    pay.getTotalPrice(),
                    pay.getDate()//2023-06-22 07:19:47 PM
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void getAllRecordsOfTimeFordevicename(String devicename, String date) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            ArrayList<paymentDevicesModel> list = paymentdevicesCruds.getAllRecordsFordevicename(devicename, date);
            Iterator<paymentDevicesModel> itr = list.iterator();
            while (itr.hasNext()) {
                paymentDevicesModel pay = itr.next();
                dtm.addRow(new Object[]{
                    pay.getId(),
                    pay.getDeviceName(),
                    pay.getTime1(),
                    pay.getTime2(),
                    pay.getTime3(),
                    pay.getTime4(),
                    pay.getTime5(),
                    pay.getHoursType(),
                    pay.getHoursprice(),
                    pay.getAllTime(),
                    pay.getTotalPrice(),
                    pay.getDate()//2023-06-22 07:19:47 PM
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void getAllRecordsOfTimeFordevicenameLost(String devicename, String date) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            ArrayList<paymentDevicesModel> list = paymentdevicesCruds.getAllRecordsFordevicenameLost(devicename, date);
            Iterator<paymentDevicesModel> itr = list.iterator();
            while (itr.hasNext()) {
                paymentDevicesModel pay = itr.next();
                dtm.addRow(new Object[]{
                    pay.getId(),
                    pay.getDeviceName(),
                    pay.getTime1(),
                    pay.getTime2(),
                    pay.getTime3(),
                    pay.getTime4(),
                    pay.getTime5(),
                    pay.getHoursType(),
                    pay.getHoursprice(),
                    pay.getAllTime(),
                    pay.getTotalPrice(),
                    pay.getDate()//2023-06-22 07:19:47 PM
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void getAllRecordsOfTimeFordevicenameReturned(String date) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            ArrayList<paymentDevicesModel> list = paymentdevicesCruds.getAllRecordsFordevicename(date);
            Iterator<paymentDevicesModel> itr = list.iterator();
            while (itr.hasNext()) {
                paymentDevicesModel pay = itr.next();
                dtm.addRow(new Object[]{
                    pay.getId(),
                    pay.getDeviceName(),
                    pay.getTime1(),
                    pay.getTime2(),
                    pay.getTime3(),
                    pay.getTime4(),
                    pay.getTime5(),
                    pay.getHoursType(),
                    pay.getHoursprice(),
                    pay.getAllTime(),
                    pay.getTotalPrice(),
                    pay.getDate()//2023-06-22 07:19:47 PM
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void getAllRecordsOfTimeFordevicenameMonthly(String devicename, String year, String Month) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            ArrayList<paymentDevicesModel> list = paymentdevicesCruds.getAllRecordsFordevicenameMonthly(devicename, year, Month);
            Iterator<paymentDevicesModel> itr = list.iterator();
            while (itr.hasNext()) {
                paymentDevicesModel pay = itr.next();
                dtm.addRow(new Object[]{
                    pay.getId(),
                    pay.getDeviceName(),
                    pay.getTime1(),
                    pay.getTime2(),
                    pay.getTime3(),
                    pay.getTime4(),
                    pay.getTime5(),
                    pay.getHoursType(),
                    pay.getHoursprice(),
                    pay.getAllTime(),
                    pay.getTotalPrice(),
                    pay.getDate()//2023-06-22 07:19:47 PM
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void setDatesForDrinks() {
        try {
            ArrayList<String> list = paymentdevicesCruds.getAllDatesforCompoDrinks();
            for (int i = 0; i < list.size(); i++) {
              
                txtSearchDateDrinks.addItem(list.get(i));
            }
//             if(list.size()==1)
//                {
//                    txtSearchDate.addItem(list.get(0));
//                }
//             else 
//             {
//                  for (int i = 0; i <list.size(); i++) {
//                if(i==list.size()-1)
//                {
//                     txtSearchDate.addItem(list.get(i));
//                }else if(i<list.size()-1)
//                {
//                    if(!list.get(i).equals(list.get(i+1)))
//                        {
//                            txtSearchDate.addItem(list.get(i));
//                            txtSearchDate.addItem(list.get(i+1));
//                        }
//                }
//             }
//             }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void setDates() {
        try {
            ArrayList<String> list = paymentdevicesCruds.getAllDatesforCompo();
//            txtSearchDate.removeAllItems();
            for (int i = 0; i < list.size(); i++) {
                txtSearchDateTime.addItem(list.get(i));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void setPSNames()
    {
        ArrayList<String>list=deviceCruds.getDevicenames();
        for (int i = 0; i <list.size();i++) {
            txtSearchPS.addItem(list.get(i));
        }
    }
    public void getAllDrinksrecords(String year, String Month) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setRowCount(0);
            ArrayList<paymentProductModel> list = paymentdevicesCruds.getAllRecordsForDrinksofMonth(year, Month);
            Iterator<paymentProductModel> itr = list.iterator();
            while (itr.hasNext()) {
                paymentProductModel pay = itr.next();
                dtm.addRow(new Object[]{
                    pay.getId(),
                    pay.getDeviceName(),
                    pay.getProductname(),
                    pay.getProductprice(),
                    pay.getQuantityneeded(),
                    pay.getPriceofTaken()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        setDates();
        setDatesForDrinks();
        setPSNames();
        getAllTimesRecordsWithdate(txtTodayDate.getText());
        getAllDrinksrecords(txtTodayDate.getText());
        setTotalTimes();
        setTotalDrinks();
    }//GEN-LAST:event_formComponentShown

    private void txtSearchDateTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchDateTimeActionPerformed
        getAllDrinksrecordsForSearch(txtSearchDateTime.getSelectedItem().toString());
        getAllTimesRecordsWithdate(txtSearchDateTime.getSelectedItem().toString());
        setTotalDrinks();
        setTotalTimes();
        setAllTotal();
        txtReturn.setText("");
    }//GEN-LAST:event_txtSearchDateTimeActionPerformed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        this.dispose();
    }//GEN-LAST:event_jLabel5MousePressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // When select deivce row will set Drinks values in table drinks with date of devicepayment as a parameter for method get drinks with date

        try {
            ArrayList<paymentDevicesModel> list1;
            int index = jTable1.getSelectedRow();
            TableModel tm = jTable1.getModel();
            String devicename = tm.getValueAt(index, 1).toString();
            String hoursType = tm.getValueAt(index, 7).toString();
            String AllTimes = tm.getValueAt(index, 10).toString();
            String Date = tm.getValueAt(index, 11).toString();

            int ids = Integer.parseInt(String.valueOf(tm.getValueAt(index, 0)));
            ArrayList<Float> priceList = paymentdevicesCruds.getAllTimePrice(ids);
            ArrayList<String> SecondTimeList = new ArrayList<>();
            ArrayList<paymentDevicesModel> paylist;
            float sum = 0;
            for (int i = 0; i < priceList.size(); i++) {
                sum += priceList.get(i);
            }
            if (AllTimes.equals("0.0")) {
                int a = JOptionPane.showConfirmDialog(null, "هل تريد عرض تفاصيل التكلفة ل جهاز:" + devicename, "اختر", JOptionPane.YES_NO_OPTION);
                if (a == 0) {
                    getAllDrinksWithDeviceName(devicename, txtTodayDate.getText());
                    setTotalDrinks();
                    txtTotalTimes.setText("" + Math.round(sum));
                    txtAllTotal.setText("" + (Math.round(sum + Integer.parseInt(txtTotalDrinks.getText()))));
                    if (hoursType.equals("Multi")) {
                        JOptionPane.showMessageDialog(jTable1, "<html><h4>" + devicename + "Multi:<br><br>" + "Time 1: " + String.valueOf(tm.getValueAt(index, 2)) + "<br> التكلفة:" + priceList.get(0)
                                + "<br><br>Time 2: " + String.valueOf(tm.getValueAt(index, 3)) + "<br> التكلفة: " + priceList.get(1) + "<br><br>Time 3: " + String.valueOf(tm.getValueAt(index, 4)) + "<br> التكلفة: " + priceList.get(2)
                                + "<br><br>Time 4: " + String.valueOf(tm.getValueAt(index, 5)) + "<br> التكلفة: " + priceList.get(3) + "<br><br>Time5:  " + String.valueOf(tm.getValueAt(index, 6)) + "<br> التكلفة: " + priceList.get(4)
                                + "<br><br> التكلفة الكلية: " + Math.round(sum) + "</h4></html>");
                        paylist = paymentdevicesCruds.getAllrecordsForSecondTime(devicename, String.valueOf(Date.subSequence(11, 22)), "Multi");
                    } else {
                        JOptionPane.showMessageDialog(jTable1, "<html><h4>" + devicename + "Single:<br><br>" + "Time 1: " + String.valueOf(tm.getValueAt(index, 2)) + "<br> التكلفة:" + priceList.get(0)
                                + "<br><br>Time 2: " + String.valueOf(tm.getValueAt(index, 3)) + "<br> التكلفة: " + priceList.get(1) + "<br><br>Time 3: " + String.valueOf(tm.getValueAt(index, 4)) + "<br> التكلفة: " + priceList.get(2)
                                + "<br><br>Time 4: " + String.valueOf(tm.getValueAt(index, 5)) + "<br> التكلفة: " + priceList.get(3) + "<br><br>Time5:  " + String.valueOf(tm.getValueAt(index, 6)) + "<br> التكلفة: " + priceList.get(4)
                                + "<br><br> التكلفة الكلية: " + Math.round(sum) + "</h4></html>");
                        paylist = paymentdevicesCruds.getAllrecordsForSecondTime(devicename, String.valueOf(Date.subSequence(11, 22)), "Single");
                    }
                    if (!paylist.isEmpty()) {
                        Iterator<paymentDevicesModel> itr = paylist.iterator();

                        while (itr.hasNext()) {
                            paymentDevicesModel pay = itr.next();
                            SecondTimeList.add(pay.getHoursType()); // 0  
                            SecondTimeList.add(pay.getTime1()); // 1    
                            SecondTimeList.add(String.valueOf(pay.getPriceofTime1()));// 2
                            SecondTimeList.add(pay.getTime2()); //3 
                            SecondTimeList.add(String.valueOf(pay.getPriceOfTime2())); // 4 
                            SecondTimeList.add(pay.getTime3());// 5
                            SecondTimeList.add(String.valueOf(pay.getPriceOfTime3()));// 6
                            SecondTimeList.add(pay.getTime4());// 7 
                            SecondTimeList.add(String.valueOf(pay.getPriceOfTime4()));// 8 
                            SecondTimeList.add(pay.getTime5());// 9
                            SecondTimeList.add(String.valueOf(pay.getPriceofTime5()));// 10 
                            SecondTimeList.add(String.valueOf(pay.getTotalPrice()));// 11 
                        }
                        JOptionPane.showMessageDialog(jTable1, "<html><h4>" + devicename + "(" + SecondTimeList.get(0) + "):<br><br>" + "Time 1: " + SecondTimeList.get(1) + "<br> التكلفة:" + SecondTimeList.get(2)
                                + "<br><br>Time 2: " + SecondTimeList.get(3) + "<br> التكلفة: " + SecondTimeList.get(4) + "<br><br>Time 3: " + SecondTimeList.get(5) + "<br> التكلفة: " + SecondTimeList.get(6)
                                + "<br><br>Time 4: " + SecondTimeList.get(7) + "<br> التكلفة: " + SecondTimeList.get(8) + "<br><br>Time5:  " + SecondTimeList.get(9) + "<br> التكلفة: " + SecondTimeList.get(10)
                                + "<br><br> التكلفة الكلية: " + SecondTimeList.get(11) + "</h4></html>");

                    }
                } else {
                    int b = JOptionPane.showConfirmDialog(null, "هل تريد الحذف؟", "اختر", JOptionPane.YES_NO_OPTION);
                    if (b == 0) {
                        paymentdevicesCruds.deletePaymentDevicesWithId(ids);
                    }
                }
            } else {
                int a = JOptionPane.showConfirmDialog(null, "هل تريد عرض تفاصيل التكلفة ل جهاز:" + devicename, "اختر", JOptionPane.YES_NO_OPTION);
                if (a == 0) {
                    if (hoursType.equals("Multi")) {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(devicename, paymentdevicesCruds.getEndTime(ids), "Multi");
                    } else {
                        list1 = paymentdevicesCruds.getAllRecordsForRealTime(devicename, paymentdevicesCruds.getEndTime(ids), "Single");
                    }
                    new ShowPriceDetailsLive(list1, devicename, 1).setVisible(true); //Check on payPro if null
                } else {
                    int b = JOptionPane.showConfirmDialog(null, "هل تريد الحذف؟", "اختر", JOptionPane.YES_NO_OPTION);
                    if (b == 0) {
                        paymentdevicesCruds.deletePaymentDevicesWithId(ids);
                        this.dispose();
                        new paymentDetails().setVisible(true);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseEntered

    private void txtDeleteMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeleteMonthActionPerformed
        try {
            int a = JOptionPane.showConfirmDialog(null, "<html><h2>سيتم حذف شهر:" + txtMonth.getSelectedItem() + "بالكامل</h2></html>", "تحذير", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (a == 0) {
                paymentdevicesCruds.deleteDrinksandTimesWithMonth(String.valueOf(txtYear.getSelectedItem()), String.valueOf(txtMonth.getSelectedItem()));
                this.dispose();
                new paymentDetails().setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txtDeleteMonthActionPerformed

    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearActionPerformed

    private void txtMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMonthActionPerformed
        getAllRecordsOfTimeForMonth(String.valueOf(txtYear.getSelectedItem()), String.valueOf(txtMonth.getSelectedItem()));
        getAllDrinksrecords(String.valueOf(txtYear.getSelectedItem()), String.valueOf(txtMonth.getSelectedItem()));
        setTotalDrinks();
        setTotalTimes();
        setAllTotal();
        txtReturn.getText();
    }//GEN-LAST:event_txtMonthActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (state == false) {
            state = true;
            jButton1.setIcon(new ImageIcon("E:\\Java Work Projects\\Play\\Images\\verify users.png"));
            jButton1.setText("تفعيل");
            txtSearchDateTime.setEnabled(false);
            txtSearchDateDrinks.setEnabled(false);
        } else {
            state = false;
            jButton1.setIcon(new ImageIcon("E:\\Java Work Projects\\Play\\Images\\small clear.png"));
            jButton1.setText("تعطيل");
            txtSearchDateTime.setEnabled(true);
            txtSearchDateDrinks.setEnabled(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MousePressed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        try {
            int index = jTable2.getSelectedRow();
            TableModel tm = jTable2.getModel();
            String devicename = tm.getValueAt(index, 1).toString();
            int ids = Integer.parseInt(String.valueOf(tm.getValueAt(index, 0)));
            int a = JOptionPane.showConfirmDialog(null, "هل تريد التعديل؟", "اختر", JOptionPane.YES_NO_OPTION);
            if (a == 0) {
                new UpdateDrinks(devicename, ids).setVisible(true);
            } else {
                int b = JOptionPane.showConfirmDialog(null, "هل تريد الحذف؟", "اختر", JOptionPane.YES_NO_OPTION);
                if (b == 0) {
                    paymentdevicesCruds.deletePaymentDrinksWithid(ids);
                    this.dispose();
                    new paymentDetails().setVisible(true);
                }
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jTable2MouseClicked

    private void txtSearchPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPSActionPerformed
        try {
      
            
            if (txtSearchDateTime.isEnabled() && txtSearchDateTime.getSelectedIndex() != 0 &&txtReturn.getText().equals("")) {
                getAllDrinksWithDeviceName(String.valueOf(txtSearchPS.getSelectedItem()), String.valueOf(txtSearchDateTime.getSelectedItem()));
                getAllRecordsOfTimeFordevicename(String.valueOf(txtSearchPS.getSelectedItem()), String.valueOf(txtSearchDateTime.getSelectedItem()));
                setTotalDrinks();
                setTotalTimes();           
            } else if (txtSearchDateDrinks.isEnabled() && txtSearchDateDrinks.getSelectedIndex() != 0 &&txtReturn.getText().equals("")) {
                getAllDrinksWithDeviceName(String.valueOf(txtSearchPS.getSelectedItem()), String.valueOf(txtSearchDateDrinks.getSelectedItem()));
                getAllRecordsOfTimeFordevicename(String.valueOf(txtSearchPS.getSelectedItem()), String.valueOf(txtSearchDateDrinks.getSelectedItem()));
                setTotalDrinks();
                setTotalTimes();           
            }
            else  if (!txtSearchDateTime.isEnabled() &&txtSearchDateTime.getSelectedIndex()==0&&txtReturn.getText().equals("")) {
                getAllDrinksWithDeviceName(String.valueOf(txtSearchPS.getSelectedItem()), String.valueOf(txtTodayDate.getText()));
                getAllRecordsOfTimeFordevicename(String.valueOf(txtSearchPS.getSelectedItem()), String.valueOf(txtTodayDate.getText()));
                setTotalDrinks();
                setTotalTimes();
            }
            else if (!txtSearchDateTime.isEnabled() && !txtReturn.getText().equals("")) {
                getAllDrinksWithDeviceName(String.valueOf(txtSearchPS.getSelectedItem()), txtTodayDate.getText());
                getAllRecordsOfTimeFordevicenameLost(String.valueOf(txtSearchPS.getSelectedItem()), txtTodayDate.getText());
                setTotalDrinks();
                setTotalTimes();
            } 
            else if (!txtSearchDateTime.isEnabled() && txtReturn.getText().equals("")) {
                getAllDrinksWithDeviceName(String.valueOf(txtSearchPS.getSelectedItem()), txtTodayDate.getText());
                getAllRecordsOfTimeFordevicename(String.valueOf(txtSearchPS.getSelectedItem()), txtTodayDate.getText());
                setTotalDrinks();
                setTotalTimes();
            } else if (txtMonth.getSelectedIndex() != 0) {
                getAllRecordsOfTimeFordevicenameMonthly(String.valueOf(txtSearchPS.getSelectedItem()), String.valueOf(txtYear.getSelectedItem()), String.valueOf(txtMonth.getSelectedItem()));
                setTotalDrinks();
                setTotalTimes();
                setAllTotal();
            } 
//            }  if (!txtSearchDate.isEnabled()&&txtReturn.equals("")) {
//                getAllDrinksWithDeviceName(String.valueOf(txtSearchPS.getSelectedItem()), String.valueOf(txtSearchDate.getSelectedItem()));
//                getAllRecordsOfTimeFordevicename(String.valueOf(txtSearchPS.getSelectedItem()), String.valueOf(txtSearchDate.getSelectedItem()));
//                setTotalDrinks();
//                setTotalTimes();
//                JOptionPane.showMessageDialog(null, "A7A 1");
//            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txtSearchPSActionPerformed

    private void txtReturnClosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReturnClosesActionPerformed
        try {
            getAllRecordsOfTimeFordevicenameReturned(txtTodayDate.getText());
            txtReturn.setText("return");
        } catch (Exception e) {

        }
    }//GEN-LAST:event_txtReturnClosesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseEntered

    }//GEN-LAST:event_jTable2MouseEntered

    private void txtSearchDateDrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchDateDrinksActionPerformed
        getAllDrinksrecords(txtSearchDateDrinks.getSelectedItem().toString());
        setTotalDrinks();
        txtReturn.setText("");
    }//GEN-LAST:event_txtSearchDateDrinksActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(paymentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paymentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paymentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paymentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paymentDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel txtAllTotal;
    private javax.swing.JButton txtDeleteMonth;
    private javax.swing.JComboBox<String> txtMonth;
    private javax.swing.JLabel txtReturn;
    private javax.swing.JButton txtReturnCloses;
    private javax.swing.JComboBox<String> txtSearchDateDrinks;
    private javax.swing.JComboBox<String> txtSearchDateTime;
    private javax.swing.JComboBox<String> txtSearchPS;
    private javax.swing.JLabel txtTodayDate;
    private javax.swing.JLabel txtTotalDrinks;
    private javax.swing.JLabel txtTotalTimes;
    private javax.swing.JComboBox<String> txtYear;
    // End of variables declaration//GEN-END:variables
}
