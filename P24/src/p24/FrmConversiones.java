/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p24;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author 18PROGB0026
 */
public class FrmConversiones extends javax.swing.JFrame {

    /**
     * Creates new form FrmConversiones
     */
    public FrmConversiones() {
        initComponents();
        this.getContentPane().setBackground(Color.orange);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblMetros = new javax.swing.JLabel();
        txtMetros = new javax.swing.JTextField();
        rbMilimetros = new javax.swing.JRadioButton();
        rbCentimetros = new javax.swing.JRadioButton();
        lblResultado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblHoras = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        rbMinutos = new javax.swing.JRadioButton();
        rbSegundos = new javax.swing.JRadioButton();
        lblConversionH = new javax.swing.JLabel();
        lblResultadoHoras = new javax.swing.JLabel();
        lblTitulokg = new javax.swing.JLabel();
        txtKg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rbKilos = new javax.swing.JRadioButton();
        rbGramos = new javax.swing.JRadioButton();
        txtGrs = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnConvertir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("CONVERSIONES");

        lblMetros.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblMetros.setText("Metros  =");

        txtMetros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMetrosActionPerformed(evt);
            }
        });

        rbMilimetros.setText("Milimetros");
        rbMilimetros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMilimetrosActionPerformed(evt);
            }
        });

        rbCentimetros.setText("Centimetros");
        rbCentimetros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCentimetrosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Conversion");

        lblHoras.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblHoras.setText("Horas  =");

        txtHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorasActionPerformed(evt);
            }
        });

        rbMinutos.setText("Minutos");
        rbMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMinutosActionPerformed(evt);
            }
        });

        rbSegundos.setText("Segundos");
        rbSegundos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSegundosActionPerformed(evt);
            }
        });

        lblConversionH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblConversionH.setText("Conversion");

        lblTitulokg.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblTitulokg.setText("Kilos <--> Gramos");

        txtKg.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("KG");

        rbKilos.setText("KG-------->GRS");
        rbKilos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKilosActionPerformed(evt);
            }
        });

        rbGramos.setText("KG<-------GRS");
        rbGramos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGramosActionPerformed(evt);
            }
        });

        txtGrs.setEnabled(false);
        txtGrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrsActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("GRS");

        btnConvertir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(lblTitulokg, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtKg, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(26, 26, 26)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnConvertir)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbKilos)
                                            .addComponent(rbGramos))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel5))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtGrs, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(rbMinutos)
                                                .addComponent(rbSegundos))
                                            .addGap(58, 58, 58)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblConversionH)
                                                .addComponent(lblResultadoHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rbCentimetros)
                                            .addGap(44, 44, 44)
                                            .addComponent(jLabel3))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblHoras)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(rbMilimetros)
                                                    .addComponent(lblMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(7, 7, 7)
                                            .addComponent(jLabel1)))
                                    .addGap(6, 6, 6))))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMetros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbMilimetros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbCentimetros))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoras)
                    .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConversionH, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbMinutos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSegundos)
                    .addComponent(lblResultadoHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblTitulokg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(rbKilos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbGramos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnConvertir)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbMilimetrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMilimetrosActionPerformed
        rbMilimetros.setSelected(true);
        rbCentimetros.setSelected(false);

        try {
            double Milimetros = Double.parseDouble(txtMetros.getText());
            lblResultado.setText(String.valueOf(Milimetros * 1000));
            txtMetros.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, Debes ingresar un valor!");
        }

    }//GEN-LAST:event_rbMilimetrosActionPerformed

    private void rbCentimetrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCentimetrosActionPerformed
        rbCentimetros.setSelected(true);
        rbMilimetros.setSelected(false);

        try {
            double Centimetros = Double.parseDouble(txtMetros.getText());
            lblResultado.setText(String.valueOf(Centimetros * 100));
            txtMetros.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, Debes ingresar un valor!");
        }
    }//GEN-LAST:event_rbCentimetrosActionPerformed

    private void txtHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorasActionPerformed

    private void rbMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMinutosActionPerformed
        rbMinutos.setSelected(true);
        rbSegundos.setSelected(false);

        try {
            double Minutos = Double.parseDouble(txtHoras.getText());
            lblResultadoHoras.setText(String.valueOf(Minutos * 60));
            txtMetros.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, Debes ingresar un valor!");
        }
    }//GEN-LAST:event_rbMinutosActionPerformed

    private void rbSegundosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSegundosActionPerformed
        rbMinutos.setSelected(false);
        rbSegundos.setSelected(true);

        try {
            double Segundos = Double.parseDouble(txtHoras.getText());
            lblResultadoHoras.setText(String.valueOf(Segundos * 3600));
            txtMetros.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, Debes ingresar un valor!");
        }
    }//GEN-LAST:event_rbSegundosActionPerformed

    private void txtMetrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMetrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMetrosActionPerformed

    private void rbGramosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGramosActionPerformed
        rbKilos.setSelected(false);
        rbGramos.setSelected(true);
        txtGrs.setEnabled(true);

        txtGrs.setText("");

    }//GEN-LAST:event_rbGramosActionPerformed

    private void rbKilosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKilosActionPerformed
        rbKilos.setSelected(true);
        rbGramos.setSelected(false);
        txtKg.setEnabled(true);
        txtKg.setText("");
    }//GEN-LAST:event_rbKilosActionPerformed

    private void txtGrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrsActionPerformed

    }//GEN-LAST:event_txtGrsActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        if (rbKilos.isSelected()) {
           try{
               double Kilos = Double.parseDouble(txtKg.getText());
           
            txtGrs.setText(String.valueOf(Kilos * 1000));
            txtKg.setText("");
            txtKg.setEnabled(false);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, Debes ingresar un valor!");
        }
        }else if (rbGramos.isSelected()) {
            try{
                double Gramos = Double.parseDouble(txtGrs.getText());
            
            txtKg.setText(String.valueOf(Gramos * .001));
            txtGrs.setText("");
            txtGrs.setEnabled(false);
            }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, Debes ingresar un valor!");
        }
        }
        else {
            JOptionPane.showMessageDialog(null, "Error, Debes seleccionar una opcion");
        }
        


    }//GEN-LAST:event_btnConvertirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmConversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConversiones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblConversionH;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblMetros;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblResultadoHoras;
    private javax.swing.JLabel lblTitulokg;
    private javax.swing.JRadioButton rbCentimetros;
    private javax.swing.JRadioButton rbGramos;
    private javax.swing.JRadioButton rbKilos;
    private javax.swing.JRadioButton rbMilimetros;
    private javax.swing.JRadioButton rbMinutos;
    private javax.swing.JRadioButton rbSegundos;
    private javax.swing.JTextField txtGrs;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtKg;
    private javax.swing.JTextField txtMetros;
    // End of variables declaration//GEN-END:variables
}
