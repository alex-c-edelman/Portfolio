// Alex Edelman --- 02/08/2015 --- Launch.java
// CTU Online --- SWE400 --- Individual Project 5

package swe400.jdbc;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class Launch extends javax.swing.JFrame 
{
    // create an instance of DAO.java
    private DAO dao;
    
    // Constructor
    public Launch() 
    {
        initComponents();
        try 
        {
            dao = new JDBC();
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(this, "Could connect to the database");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        LoadCustButton = new javax.swing.JButton();
        LoadProdButton = new javax.swing.JButton();
        CreateButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Field 1");

        jLabel2.setText("Field 2");

        jLabel3.setText("Field 3");

        jLabel4.setText("Field 4");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Customer");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Product");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        LoadCustButton.setText("Load Customer");
        LoadCustButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadCustButtonActionPerformed(evt);
            }
        });

        LoadProdButton.setText("Load Product");
        LoadProdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadProdButtonActionPerformed(evt);
            }
        });

        CreateButton.setText("Create");
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jRadioButton1)
                .addGap(92, 92, 92)
                .addComponent(jRadioButton2)
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(CreateButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UpdateButton)
                            .addGap(44, 44, 44)
                            .addComponent(DeleteButton))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addComponent(LoadCustButton)
                            .addGap(69, 69, 69)
                            .addComponent(LoadProdButton))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoadCustButton)
                    .addComponent(LoadProdButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateButton)
                    .addComponent(UpdateButton)
                    .addComponent(DeleteButton))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Can't figure out how to get rid of the line below this...
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed
    
    // Load the customer table into the jTextArea
    private void LoadCustButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadCustButtonActionPerformed
        List<Customer> customers;
        try 
        {
            customers = dao.cReadAll();
            jTextArea1.setText("");
            for (Customer c : customers)
            {
                jTextArea1.append("#" + Integer.toString(c.getId()));
                jTextArea1.append(" " + c.getName());
                jTextArea1.append(" -- Login: " + c.getLogin());
                jTextArea1.append(" -- Password: ****\n");
            }
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(this, "Could not load from the databaase");
        }
    }//GEN-LAST:event_LoadCustButtonActionPerformed

    // Use radio buttons to decide which table is going to have a record added... if/else
    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        if(jRadioButton1.isSelected())
        {
            try 
            {
                Customer c = new Customer();
                int id = Integer.parseInt(this.jTextField1.getText());
                c.setId(id);
                c.setName(jTextField2.getText());
                c.setLogin(jTextField3.getText());
                c.setPassword(jTextField4.getText());

                dao.cCreate(c);
                LoadCustButtonActionPerformed(evt);
            } catch (Exception ex) 
            {
                JOptionPane.showMessageDialog(this, "Your customer was not created");
            }
        } else if (jRadioButton2.isSelected())
        {
           try 
            {
                Product p = new Product();
                int id = Integer.parseInt(this.jTextField1.getText());
                p.setId(id);
                p.setName(jTextField2.getText());
                p.setDescription(jTextField3.getText());
                p.setPrice(Double.parseDouble(jTextField4.getText()));

                dao.pCreate(p);
                LoadProdButtonActionPerformed(evt);
            } catch (Exception ex) 
            {
                JOptionPane.showMessageDialog(this, "Your product was not created");
            }
        }
    }//GEN-LAST:event_CreateButtonActionPerformed
    
    // Load the product table into the jTextArea
    private void LoadProdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadProdButtonActionPerformed
        List<Product> products;
        try 
        {
            products = dao.pReadAll();
            jTextArea1.setText("");
            for (Product p : products)
            {
                jTextArea1.append("#" + Integer.toString(p.getId()));
                jTextArea1.append(" " + p.getName());
                jTextArea1.append(" \"" + p.getDescription());
                jTextArea1.append("\" -- $" + p.getPrice());
                jTextArea1.append("\n");
            }
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(this, "Could not load from the databaase");
        }
    }//GEN-LAST:event_LoadProdButtonActionPerformed
    
    // Set the labels to the appropriate text
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jLabel1.setText("ID");
        jLabel2.setText("Name");
        jLabel3.setText("Login");
        jLabel4.setText("Password");
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jLabel1.setText("ID");
        jLabel2.setText("Name");
        jLabel3.setText("Description");
        jLabel4.setText("Price");
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    // Perform an update to the appropriate table using radio buttons
    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        if(jRadioButton1.isSelected())
        {
            try 
            {
                Customer c = new Customer();
                int id = Integer.parseInt(this.jTextField1.getText());
                c.setId(id);
                c.setName(jTextField2.getText());
                c.setLogin(jTextField3.getText());
                c.setPassword(jTextField4.getText());

                dao.cUpdate(c);
                LoadCustButtonActionPerformed(evt);
            } catch (Exception ex) 
            {
                JOptionPane.showMessageDialog(this, "Your customer was not updated");
            }
        } else if (jRadioButton2.isSelected())
        {
           try 
            {
                Product p = new Product();
                int id = Integer.parseInt(this.jTextField1.getText());
                p.setId(id);
                p.setName(jTextField2.getText());
                p.setDescription(jTextField3.getText());
                p.setPrice(Double.parseDouble(jTextField4.getText()));

                dao.pUpdate(p);
                LoadProdButtonActionPerformed(evt);
            } catch (Exception ex) 
            {
                JOptionPane.showMessageDialog(this, "Your product was not updated");
            }
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed
    
    // Delete a record from the appropriate table using radio buttons
    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        if (jRadioButton1.isSelected())
        {
            try 
            {
                dao.cDelete(Integer.parseInt(jTextField1.getText()));
                LoadCustButtonActionPerformed(evt);
            } catch (Exception ex) 
            {
                JOptionPane.showMessageDialog(this, "Your id could not be deleted");
            }
        } else if (jRadioButton2.isSelected())
        {
            try 
            {
                dao.pDelete(Integer.parseInt(jTextField1.getText()));
                LoadProdButtonActionPerformed(evt);
            } catch (Exception ex) 
            {
                JOptionPane.showMessageDialog(this, "Your id could not be deleted");
            }
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Launch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Launch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Launch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Launch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Launch().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton LoadCustButton;
    private javax.swing.JButton LoadProdButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
