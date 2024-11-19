/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Interfaza_1 extends javax.swing.JFrame {

    private int x, y;

    public Interfaza_1 {
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        rSButtonForma2 = new rojeru_san.rsbutton.RSButtonForma();
        rSButtonForma1 = new rojeru_san.rsbutton.RSButtonForma();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rSButtonHover3 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover4 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover5 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover2 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();
        jLabel2 = new javax.swing.JLabel();
        rSButtonHover6 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover7 = new rojeru_san.complementos.RSButtonHover();
        jPanel3 = new javax.swing.JPanel();
        rSLabelFecha1 = new rojeru_san.rsdate.RSLabelFecha();
        rSLabelHora1 = new rojeru_san.rsdate.RSLabelHora();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonForma2.setBackground(new java.awt.Color(0, 102, 153));
        rSButtonForma2.setFocusPainted(false);
        rSButtonForma2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonForma2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonForma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, 30, 32));

        rSButtonForma1.setBackground(new java.awt.Color(0, 102, 153));
        rSButtonForma1.setFocusPainted(false);
        rSButtonForma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonForma1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonForma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1114, 0, 30, 32));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEMA DE VENTAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1145, -1));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonHover3.setBackground(new java.awt.Color(255, 102, 102));
        rSButtonHover3.setText("Productos y servicios");
        rSButtonHover3.setColorHover(new java.awt.Color(0, 102, 153));
        rSButtonHover3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rSButtonHover3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        rSButtonHover3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover3ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 230, -1));

        rSButtonHover4.setBackground(new java.awt.Color(255, 102, 102));
        rSButtonHover4.setText("Procesar ventas");
        rSButtonHover4.setColorHover(new java.awt.Color(0, 102, 153));
        rSButtonHover4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rSButtonHover4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        rSButtonHover4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover4ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 170, -1));

        rSButtonHover5.setBackground(new java.awt.Color(255, 102, 102));
        rSButtonHover5.setText("Compras");
        rSButtonHover5.setColorHover(new java.awt.Color(0, 102, 153));
        rSButtonHover5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rSButtonHover5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        rSButtonHover5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover5ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 170, -1));

        rSButtonHover2.setBackground(new java.awt.Color(0, 153, 153));
        rSButtonHover2.setText("Cerar Sesión");
        rSButtonHover2.setColorHover(new java.awt.Color(0, 102, 153));
        rSButtonHover2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rSButtonHover2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(rSButtonHover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 170, -1));

        rSButtonHover1.setBackground(new java.awt.Color(255, 102, 102));
        rSButtonHover1.setText("Proveedores");
        rSButtonHover1.setColorHover(new java.awt.Color(0, 102, 153));
        rSButtonHover1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rSButtonHover1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Reportes");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 180, 40));

        rSButtonHover6.setText("Compras");
        rSButtonHover6.setColorHover(new java.awt.Color(0, 102, 153));
        rSButtonHover6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rSButtonHover6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        rSButtonHover6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover6ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 170, -1));

        rSButtonHover7.setText("Compras");
        rSButtonHover7.setColorHover(new java.awt.Color(0, 102, 153));
        rSButtonHover7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rSButtonHover7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        rSButtonHover7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover7ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 170, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 32, 1145, 40));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        rSLabelFecha1.setForeground(new java.awt.Color(0, 0, 0));
        rSLabelFecha1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        rSLabelHora1.setForeground(new java.awt.Color(0, 0, 0));
        rSLabelHora1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(1056, Short.MAX_VALUE)
                .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(537, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-105, 71, 1250, 565));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonForma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonForma2ActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_rSButtonForma2ActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();

    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        Point ubicacion = MouseInfo.getPointerInfo().getLocation();
        setLocation(ubicacion.x - x, ubicacion.y - y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void rSButtonForma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonForma1ActionPerformed
        cerrar();
    }//GEN-LAST:event_rSButtonForma1ActionPerformed

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
        new Interfaza_2().setVisible(true);
    }//GEN-LAST:event_rSButtonHover1ActionPerformed

    private void rSButtonHover3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover3ActionPerformed
        new Interfaza_3().setVisible(true);
    }//GEN-LAST:event_rSButtonHover3ActionPerformed

    private void rSButtonHover4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover4ActionPerformed
        new Interfaza_4().setVisible(true);
    }//GEN-LAST:event_rSButtonHover4ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void rSButtonHover5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover5ActionPerformed

    private void rSButtonHover6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover6ActionPerformed

    private void rSButtonHover7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover7ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaza_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaza_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaza_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaza_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaza_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private rojeru_san.rsbutton.RSButtonForma rSButtonForma1;
    private rojeru_san.rsbutton.RSButtonForma rSButtonForma2;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover2;
    private rojeru_san.complementos.RSButtonHover rSButtonHover3;
    private rojeru_san.complementos.RSButtonHover rSButtonHover4;
    private rojeru_san.complementos.RSButtonHover rSButtonHover5;
    private rojeru_san.complementos.RSButtonHover rSButtonHover6;
    private rojeru_san.complementos.RSButtonHover rSButtonHover7;
    private rojeru_san.rsdate.RSLabelFecha rSLabelFecha1;
    private rojeru_san.rsdate.RSLabelHora rSLabelHora1;
    // End of variables declaration//GEN-END:variables

    //Validar el cerrar la ventana
    public void cerrar() {
        Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(rootPane, "En realidad desea realizar cerrar la aplicacion", "Mensaje de Confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
        }
    }
}