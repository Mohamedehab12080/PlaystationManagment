
package View;

import Controller.prductPaymentCruds;
import Model.paymentProductModel;
import Model.productsModel;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class UpdateDrinks extends javax.swing.JFrame {

    int ids;
    public UpdateDrinks() {
        initComponents();
    }
    public UpdateDrinks(String devicename,int ids) {
        initComponents();
        this.ids=ids;
        txtDevicename.setText(devicename);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtProductname = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtProductPrice = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdeviceID = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtQuantityNeeded = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDevicename = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("اسم المنتج:");

        txtProductname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtProductname.setForeground(new java.awt.Color(0, 0, 0));
        txtProductname.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtProductname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductnameActionPerformed(evt);
            }
        });
        txtProductname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductnameKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("اسم الجهاز:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("عدد:");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("سعر المنتج:");

        txtProductPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtProductPrice.setForeground(new java.awt.Color(0, 0, 0));
        txtProductPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtProductPrice.setText("00");
        txtProductPrice.setToolTipText("0.0");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("التكلفة:");

        txtPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(0, 0, 0));
        txtPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrice.setText("00");
        txtPrice.setToolTipText("0.0");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ID:");

        txtdeviceID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtdeviceID.setForeground(new java.awt.Color(0, 0, 0));
        txtdeviceID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdeviceID.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdeviceID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProductPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdeviceID))
                .addGap(42, 42, 42))
        );

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 0, 0));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnSave.setText("تعديل");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtQuantityNeeded.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtQuantityNeeded.setForeground(new java.awt.Color(0, 0, 0));
        txtQuantityNeeded.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityNeededActionPerformed(evt);
            }
        });
        txtQuantityNeeded.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuantityNeededKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/soda.png"))); // NOI18N
        jLabel5.setText("اضافة مشروب لجهاز");

        txtDevicename.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtDevicename.setForeground(new java.awt.Color(0, 0, 0));
        txtDevicename.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close Jframe.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(144, 144, 144)
                .addComponent(jLabel9)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtProductname, javax.swing.GroupLayout.Alignment.LEADING, 0, 157, Short.MAX_VALUE)
                            .addComponent(txtQuantityNeeded)
                            .addComponent(txtDevicename, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtDevicename, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtProductname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtQuantityNeeded, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void getDrinksforCompo()
    {
        try {
            ArrayList<productsModel>list=prductPaymentCruds.getProductnameforCompo();
            Iterator<productsModel>itr=list.iterator();
            while(itr.hasNext())
            {
                productsModel pay=itr.next();
                txtProductname.addItem(pay.getProductname());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void txtProductnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductnameActionPerformed
        try {
            txtProductPrice.setText(String.valueOf( prductPaymentCruds.getproductPrice(txtProductname.getSelectedItem().toString())));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txtProductnameActionPerformed

    private void txtProductnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductnameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductnameKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int quantityneeded;
        int prodPrice;
        int priceOfTake;
        try {
            paymentProductModel pay=new paymentProductModel();
            quantityneeded=Integer.parseInt(txtQuantityNeeded.getText());
            pay.setQuantityneeded(quantityneeded);
            pay.setProductname(String.valueOf(txtProductname.getSelectedItem()));
            prodPrice=Integer.parseInt(String.valueOf(txtProductPrice.getText()));
            pay.setProductprice(prodPrice);
            priceOfTake=Integer.parseInt(txtPrice.getText());
            pay.setPriceofTaken(priceOfTake);
            prductPaymentCruds.UpdatePayemntDrinksWithID(pay, ids);
                  this.dispose();
                  new paymentDetails().dispose();
                    new paymentDetails().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtQuantityNeededActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityNeededActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityNeededActionPerformed

    private void txtQuantityNeededKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityNeededKeyReleased
        int Q=0;
        int p=0;
        try {
            for (int i = 0; i <txtQuantityNeeded.getText().length(); i++) {
                if(Character.isDigit(txtQuantityNeeded.getText().charAt(i)))
                {
                    txtQuantityNeeded.setForeground(new Color(0,255,0));
                    Q=Integer.parseInt(txtQuantityNeeded.getText());
                    p=Integer.parseInt(txtProductPrice.getText());
                    txtPrice.setText(String.valueOf(Q*p));
                }else
                {
                    txtQuantityNeeded.setForeground(new Color(255,0,0));
                }
            }
        }catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null, "قم ب ادخال ارقام فقط");
            txtQuantityNeeded.setForeground(new Color(255,0,0));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txtQuantityNeededKeyReleased

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        this.dispose();
    }//GEN-LAST:event_jLabel9MousePressed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       getDrinksforCompo();
    }//GEN-LAST:event_formComponentShown


    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDrinks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtDevicename;
    private javax.swing.JLabel txtPrice;
    private javax.swing.JLabel txtProductPrice;
    private javax.swing.JComboBox<String> txtProductname;
    private javax.swing.JTextField txtQuantityNeeded;
    private javax.swing.JLabel txtdeviceID;
    // End of variables declaration//GEN-END:variables
}
