/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package currencyconverterproject;

import javax.swing.JOptionPane;

/**
 *
 * @author haziq
 */
public class ConvertConverter extends javax.swing.JFrame {

    /**
     * Creates new form Converter
     */
    
    public ConvertConverter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLogout = new javax.swing.JButton();
        jTransfer = new javax.swing.JButton();
        jConvert = new javax.swing.JButton();
        jAbout = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtxtAmount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboFrom = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboTo = new javax.swing.JComboBox<>();
        jbtnConvert = new javax.swing.JButton();
        jbtnClear = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        JlabelResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Currency Converter");
        setBackground(new java.awt.Color(51, 255, 204));
        setBounds(new java.awt.Rectangle(500, 150, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HAF Currency Converter");

        jLogout.setBackground(new java.awt.Color(204, 204, 255));
        jLogout.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLogout.setText("Logout");
        jLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutActionPerformed(evt);
            }
        });

        jTransfer.setBackground(new java.awt.Color(204, 204, 255));
        jTransfer.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jTransfer.setText("Transfer");
        jTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTransferActionPerformed(evt);
            }
        });

        jConvert.setBackground(new java.awt.Color(204, 204, 255));
        jConvert.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jConvert.setText("Convert");
        jConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConvertActionPerformed(evt);
            }
        });

        jAbout.setBackground(new java.awt.Color(204, 204, 255));
        jAbout.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jAbout.setText("About");
        jAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAboutActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setText("Amount  :");

        jtxtAmount.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jtxtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtAmountActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setText("From :");

        jComboFrom.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jComboFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MYR", "SGD", "LAK", "PHP", "IDR", "BND", "THB", "VND", "KHR", "MMK" }));
        jComboFrom.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jComboFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboFromActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel9.setText("To :");

        jComboTo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jComboTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SGD", "LAK", "PHP", "IDR", "BND", "THB", "VND", "KHR", "MMK", "MYR" }));

        jbtnConvert.setBackground(new java.awt.Color(204, 204, 255));
        jbtnConvert.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jbtnConvert.setText("Convert");
        jbtnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConvertActionPerformed(evt);
            }
        });

        jbtnClear.setBackground(new java.awt.Color(255, 102, 102));
        jbtnClear.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jbtnClear.setText("Clear");
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Result:");

        JlabelResult.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JlabelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jAbout)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jConvert)
                                .addGap(18, 18, 18)
                                .addComponent(jTransfer)
                                .addGap(18, 18, 18)
                                .addComponent(jLogout)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtnConvert)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnClear)
                                .addGap(52, 52, 52))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAbout)
                    .addComponent(jConvert)
                    .addComponent(jTransfer)
                    .addComponent(jLogout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnConvert)
                    .addComponent(jbtnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(JlabelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConvertActionPerformed
        try{
        float convert=0 ;
        float amount = Float.parseFloat(jtxtAmount.getText());
        String fromcountry = jComboFrom.getSelectedItem().toString();
        String tocountry = jComboTo.getSelectedItem().toString();

       if(isNumberValid(amount)){
        switch(fromcountry){
            case"MYR" : MYRConvert(tocountry,fromcountry,convert,amount);
            break;
            case"BND" : BNDConvert(tocountry,fromcountry,convert,amount);
            break;
            case"SGD" : SGDConvert(tocountry,fromcountry,convert,amount);
            break;
            case"VND" : VNDConvert(tocountry,fromcountry,convert,amount);
            break;
            case"MMK" : MMKConvert(tocountry,fromcountry,convert,amount);
            break;
            case"IDR" : IDRConvert(tocountry,fromcountry,convert,amount);
            break;
            case"LAK" : LAKConvert(tocountry,fromcountry,convert,amount);
            break;
            case"KHR" : KHRConvert(tocountry,fromcountry,convert,amount);
            break;
            case"PHP" : PHPConvert(tocountry,fromcountry,convert,amount);
            break;
            case"THB" : THBConvert(tocountry,fromcountry,convert,amount);
            break;
        }}}
        catch(NumberFormatException ex){
         JOptionPane.showMessageDialog(null,"Please Enter Value");
        }  catch (NegativeValue ex) {
            JOptionPane.showMessageDialog(null,"Please enter the positive value only");
        }
    }//GEN-LAST:event_jbtnConvertActionPerformed

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
        jtxtAmount.setText("");
        JlabelResult.setText("");
    }//GEN-LAST:event_jbtnClearActionPerformed

    private void jAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAboutActionPerformed
         new AboutConverter().setVisible(true);
         super.dispose();
    }//GEN-LAST:event_jAboutActionPerformed

    private void jConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConvertActionPerformed
          new ConvertConverter().setVisible(true);
          super.dispose();
    }//GEN-LAST:event_jConvertActionPerformed

    private void jTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTransferActionPerformed
          new TransferConverter().setVisible(true);
          super.dispose();
    }//GEN-LAST:event_jTransferActionPerformed

    private void jLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutActionPerformed
        new LoginConverter().setVisible(true);
        super.dispose();
    }//GEN-LAST:event_jLogoutActionPerformed

    private void jtxtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtAmountActionPerformed

    private void jComboFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboFromActionPerformed
    
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
            java.util.logging.Logger.getLogger(ConvertConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConvertConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConvertConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConvertConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConvertConverter().setVisible(true);
            }
        });
    }

  private void MYRConvert(String tocountry,String fromcountry,float convert,float amount) throws NumberFormatException
    {  
        if("MYR".equals(fromcountry) && "BND".equals(tocountry)){
         convert = (float) (amount * 0.31); 
        }
        else if("MYR".equals(fromcountry) && "SGD".equals(tocountry)){
         convert = (float) (amount * 0.32);
        }
        else if("MYR".equals(fromcountry) && "MMK".equals(tocountry)){
         convert = (float)(amount * 422.53);
        }
        else if("MYR".equals(fromcountry) && "IDR".equals(tocountry)){
         convert = (float) (amount * 3320.26);
        }
        else if("MYR".equals(fromcountry) && "VND".equals(tocountry)){
         convert = (float) (amount * 5297.44);
        }
         else if("MYR".equals(fromcountry) && "KHR".equals(tocountry)){
         convert = (float) (amount * 927.38);
        }
          else if("MYR".equals(fromcountry) && "LAK".equals(tocountry)){
         convert = (float) (amount * 3069.48);
        }
          else if("MYR".equals(fromcountry) && "PHP".equals(tocountry)){
         convert = (float) (amount * 11.95);
        }
          else if("MYR".equals(fromcountry) && "THB".equals(tocountry)){
         convert = (float) (amount * 7.80);
        }
        
         JlabelResult.setText( amount +" " + fromcountry +" = "+ String.valueOf(convert)+" " +tocountry); 
    }
  
  private void PHPConvert(String tocountry,String fromcountry,float convert,float amount) throws NumberFormatException
    {
         if("PHP".equals(fromcountry) && "MYR".equals(tocountry)){
         convert = (float) (amount * 0.084); 
        }
        else if("PHP".equals(fromcountry) && "BND".equals(tocountry)){
         convert = (float) (amount * 0.026);
        }
        else if("PHP".equals(fromcountry) && "SGD".equals(tocountry)){
         convert = (float)(amount * 0.026);
        }
        else if("PHP".equals(fromcountry) && "MMK".equals(tocountry)){
         convert = (float) (amount * 35.36);
        }
         else if("PHP".equals(fromcountry) && "IDR".equals(tocountry)){
         convert = (float) (amount * 277.87);
        }
         else if("PHP".equals(fromcountry) && "KHR".equals(tocountry)){
         convert = (float) (amount * 0.31);
        }
          else if("PHP".equals(fromcountry) && "VND".equals(tocountry)){
         convert = (float) (amount * 443.34);
        }
          else if("PHP".equals(fromcountry) && "LAK".equals(tocountry)){
         convert = (float) (amount * 257.05);
        }
          else if("PHP".equals(fromcountry) && "THB".equals(tocountry)){
         convert = (float) (amount * 0.65);
        }
         JlabelResult.setText( amount +" " + fromcountry +" = "+ String.valueOf(convert)+" " +tocountry); 
    }
  
  private void THBConvert(String tocountry,String fromcountry,float convert,float amount) throws NumberFormatException
    {
         if("THB".equals(fromcountry) && "MYR".equals(tocountry)){
         convert = (float) (amount * 0.13); 
        }
        else if("THB".equals(fromcountry) && "BND".equals(tocountry)){
         convert = (float) (amount * 0.040);
        }
        else if("THB".equals(fromcountry) && "SGD".equals(tocountry)){
         convert = (float)(amount * 0.040);
        }
        else if("THB".equals(fromcountry) && "MMK".equals(tocountry)){
         convert = (float) (amount * 54.29);
        }
         else if("THB".equals(fromcountry) && "IDR".equals(tocountry)){
         convert = (float) (amount * 426.63);
        }
         else if("THB".equals(fromcountry) && "KHR".equals(tocountry)){
         convert = (float) (amount * 119.16);
        }
          else if("THB".equals(fromcountry) && "VND".equals(tocountry)){
         convert = (float) (amount * 680.68);
        }
          else if("THB".equals(fromcountry) && "LAK".equals(tocountry)){
         convert = (float) (amount * 394.66);
        }
          else if("THB".equals(fromcountry) && "PHP".equals(tocountry)){
         convert = (float) (amount * 1.54);
        }
         JlabelResult.setText( amount +" " + fromcountry +" = "+ String.valueOf(convert)+" " +tocountry); 
    }
  
  private void BNDConvert(String tocountry,String fromcountry,float convert,float amount) throws NumberFormatException
    {
        if("BND".equals(fromcountry) && "MYR".equals(tocountry)){
         convert = (float) (amount * 3.20); 
        }
        else if("BND".equals(fromcountry) && "SGD".equals(tocountry)){
         convert = (float) (amount * 1.00);
        }
        else if("BND".equals(fromcountry) && "MMK".equals(tocountry)){
         convert = (float)(amount * 1351.87);
        }
        else if("BND".equals(fromcountry) && "IDR".equals(tocountry)){
         convert = (float) (amount * 10622.99);
        }
         else if("BND".equals(fromcountry) && "VND".equals(tocountry)){
         convert = (float) (amount * 16948.90);
        }
         else if("BND".equals(fromcountry) && "KHR".equals(tocountry)){
         convert = (float) (amount * 2967.11);
        }
          else if("BND".equals(fromcountry) && "LAK".equals(tocountry)){
         convert = (float) (amount * 9827.04);
        }
          else if("BND".equals(fromcountry) && "PHP".equals(tocountry)){
         convert = (float) (amount * 38.23);
        }
          else if("BND".equals(fromcountry) && "THB".equals(tocountry)){
         convert = (float) (amount * 24.90);
        }
        
         JlabelResult.setText( amount +" " + fromcountry +" = "+ String.valueOf(convert)+" " +tocountry);  
    }
  
  private void SGDConvert(String tocountry,String fromcountry,float convert,float amount) throws NumberFormatException
    {
        if("SGD".equals(fromcountry) && "MYR".equals(tocountry)){
         convert = (float) (amount * 3.19); 
        }
        else if("SGD".equals(fromcountry) && "BND".equals(tocountry)){
         convert = (float) (amount * 1.00);
        }
        else if("SGD".equals(fromcountry) && "MMK".equals(tocountry)){
         convert = (float)(amount * 1346.14);
        }
        else if("SGD".equals(fromcountry) && "IDR".equals(tocountry)){
         convert = (float) (amount * 10577.96);
        }
         else if("SGD".equals(fromcountry) && "VND".equals(tocountry)){
         convert = (float) (amount * 16877.05);
        }
         else if("SGD".equals(fromcountry) && "KHR".equals(tocountry)){
         convert = (float) (amount * 2954.53);
        }
          else if("SGD".equals(fromcountry) && "LAK".equals(tocountry)){
         convert = (float) (amount * 9785.38);
        }
          else if("SGD".equals(fromcountry) && "PHP".equals(tocountry)){
         convert = (float) (amount * 38.07);
        }
          else if("SGD".equals(fromcountry) && "THB".equals(tocountry)){
         convert = (float) (amount * 24.79);
        }
        
         JlabelResult.setText( amount +" " + fromcountry +" = "+ String.valueOf(convert)+" " +tocountry);  
    }
  
  private void LAKConvert(String tocountry,String fromcountry,float convert,float amount) throws NumberFormatException
    {
         if("LAK".equals(fromcountry) && "MYR".equals(tocountry)){
         convert = (float) (amount * 0.00033); 
        }
        else if("LAK".equals(fromcountry) && "BND".equals(tocountry)){
         convert = (float) (amount * 0.00010);
        }
        else if("LAK".equals(fromcountry) && "SGD".equals(tocountry)){
         convert = (float)(amount * 0.00010);
        }
        else if("LAK".equals(fromcountry) && "MMK".equals(tocountry)){
         convert = (float) (amount * 0.14);
        }
         else if("LAK".equals(fromcountry) && "IDR".equals(tocountry)){
         convert = (float) (amount * 1.10);
        }
         else if("LAK".equals(fromcountry) && "KHR".equals(tocountry)){
         convert = (float) (amount * 0.31);
        }
          else if("LAK".equals(fromcountry) && "VND".equals(tocountry)){
         convert = (float) (amount * 1.75);
        }
          else if("LAK".equals(fromcountry) && "PHP".equals(tocountry)){
         convert = (float) (amount * 0.0039);
        }
          else if("LAK".equals(fromcountry) && "THB".equals(tocountry)){
         convert = (float) (amount * 0.0026);
        }
         JlabelResult.setText( amount +" " + fromcountry +" = "+ String.valueOf(convert)+" " +tocountry); 
    }
  
    private void MMKConvert(String tocountry,String fromcountry,float convert,float amount) throws NumberFormatException
    {
       if("MMK".equals(fromcountry) && "MYR".equals(tocountry)){
         convert = (float) (amount * 0.0024); 
        }
        else if("MMK".equals(fromcountry) && "BND".equals(tocountry)){
         convert = (float) (amount * 0.00074);
        }
        else if("MMK".equals(fromcountry) && "SGD".equals(tocountry)){
         convert = (float)(amount * 0.00074);
        }
        else if("MMK".equals(fromcountry) && "IDR".equals(tocountry)){
         convert = (float) (amount * 7.86);
        }
         else if("MMK".equals(fromcountry) && "VND".equals(tocountry)){
         convert = (float) (amount * 12.54);
        }
         else if("MMK".equals(fromcountry) && "KHR".equals(tocountry)){
         convert = (float) (amount * 2.20);
        }
          else if("MMK".equals(fromcountry) && "LAK".equals(tocountry)){
         convert = (float) (amount * 7.27);
        }
          else if("MMK".equals(fromcountry) && "PHP".equals(tocountry)){
         convert = (float) (amount * 0.028);
        }
          else if("MMK".equals(fromcountry) && "THB".equals(tocountry)){
         convert = (float) (amount * 0.018);
        }
         JlabelResult.setText( amount +" " + fromcountry +" = "+ String.valueOf(convert)+" " +tocountry);  
    }
    private void IDRConvert(String tocountry,String fromcountry,float convert,float amount) throws NumberFormatException
    {
         if("IDR".equals(fromcountry) && "MYR".equals(tocountry)){
         convert = (float) (amount * 0.00030); 
        }
        else if("IDR".equals(fromcountry) && "BND".equals(tocountry)){
         convert = (float) (amount * 0.000094);
        }
        else if("IDR".equals(fromcountry) && "SGD".equals(tocountry)){
         convert = (float)(amount * 0.000095);
        }
        else if("IDR".equals(fromcountry) && "MMK".equals(tocountry)){
         convert = (float) (amount * 0.13);
        }
         else if("IDR".equals(fromcountry) && "VND".equals(tocountry)){
         convert = (float) (amount * 1.60);
        }
         else if("IDR".equals(fromcountry) && "KHR".equals(tocountry)){
         convert = (float) (amount * 0.28);
        }
          else if("IDR".equals(fromcountry) && "LAK".equals(tocountry)){
         convert = (float) (amount * 0.93);
        }
          else if("IDR".equals(fromcountry) && "PHP".equals(tocountry)){
         convert = (float) (amount * 0.0036);
        }
          else if("IDR".equals(fromcountry) && "THB".equals(tocountry)){
         convert = (float) (amount * 0.0023);
        }
         JlabelResult.setText( amount +" " + fromcountry +" = "+ String.valueOf(convert)+" " +tocountry); 
    }
    
      private void VNDConvert(String tocountry,String fromcountry,float convert,float amount) throws NumberFormatException
    {
         if("VND".equals(fromcountry) && "MYR".equals(tocountry)){
         convert = (float) (amount * 0.00019); 
        }
        else if("VND".equals(fromcountry) && "BND".equals(tocountry)){
         convert = (float) (amount * 0.000059);
        }
        else if("VND".equals(fromcountry) && "SGD".equals(tocountry)){
         convert = (float)(amount * 0.000059);
        }
        else if("VND".equals(fromcountry) && "MMK".equals(tocountry)){
         convert = (float) (amount * 0.080);
        }
         else if("VND".equals(fromcountry) && "IDR".equals(tocountry)){
         convert = (float) (amount * 0.63);
        }
         else if("VND".equals(fromcountry) && "KHR".equals(tocountry)){
         convert = (float) (amount * 0.18);
        }
          else if("VND".equals(fromcountry) && "LAK".equals(tocountry)){
         convert = (float) (amount * 0.58);
        }
          else if("VND".equals(fromcountry) && "PHP".equals(tocountry)){
         convert = (float) (amount * 0.0023);
        }
          else if("VND".equals(fromcountry) && "THB".equals(tocountry)){
         convert = (float) (amount * 0.0015);
        }
         JlabelResult.setText( amount +" " + fromcountry +" = "+ String.valueOf(convert)+" " +tocountry); 
    }
      
      private void KHRConvert(String tocountry,String fromcountry,float convert,float amount) throws NumberFormatException
    {  
        if("KHR".equals(fromcountry) && "BND".equals(tocountry)){
         convert = (float) (amount * 0.00034); 
        }
        else if("KHR".equals(fromcountry) && "SGD".equals(tocountry)){
         convert = (float) (amount * 0.00034);
        }
        else if("KHR".equals(fromcountry) && "MMK".equals(tocountry)){
         convert = (float)(amount * 0.46);
        }
        else if("KHR".equals(fromcountry) && "IDR".equals(tocountry)){
         convert = (float) (amount * 3.58);
        }
        else if("KHR".equals(fromcountry) && "VND".equals(tocountry)){
         convert = (float) (amount * 5.72);
        }
         else if("KHR".equals(fromcountry) && "MYR".equals(tocountry)){
         convert = (float) (amount * 0.0011);
        }
          else if("KHR".equals(fromcountry) && "LAK".equals(tocountry)){
         convert = (float) (amount * 3.31);
        }
          else if("KHR".equals(fromcountry) && "PHP".equals(tocountry)){
         convert = (float) (amount * 0.013);
        }
          else if("KHR".equals(fromcountry) && "THB".equals(tocountry)){
         convert = (float) (amount * 0.0084);
        }
        
         JlabelResult.setText( amount +" " + fromcountry +" = "+ String.valueOf(convert)+" " +tocountry); 
    }
      
       private static boolean isNumberValid(float amount) 
            throws NegativeValue ,ArithmeticException{
        
     if(amount <= 0){
     throw new NegativeValue ();   
     }
       else{
     return true
             ;}
        
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelResult;
    private javax.swing.JButton jAbout;
    private javax.swing.JComboBox<String> jComboFrom;
    private javax.swing.JComboBox<String> jComboTo;
    private javax.swing.JButton jConvert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jLogout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jTransfer;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnConvert;
    private javax.swing.JTextField jtxtAmount;
    // End of variables declaration//GEN-END:variables
}