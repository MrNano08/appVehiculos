package gui;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();

        //Inicia el programa en pantalla completa
        this.setExtendedState(MAXIMIZED_BOTH);
        
        //
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/company.png"));
        this.setIconImage(icon.getImage());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuVehiculos = new javax.swing.JMenu();
        mnuVehiculosGestion = new javax.swing.JMenuItem();
        mnuBuscar = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenu();
        mnuSalirSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setToolTipText("");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 904, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        mnuVehiculos.setText("Vehículos");

        mnuVehiculosGestion.setText("Gestión Vehículos");
        mnuVehiculosGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVehiculosGestionActionPerformed(evt);
            }
        });
        mnuVehiculos.add(mnuVehiculosGestion);

        mnuBuscar.setText("Buscar");
        mnuBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBuscarActionPerformed(evt);
            }
        });
        mnuVehiculos.add(mnuBuscar);

        jMenuBar1.add(mnuVehiculos);

        mnuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit_32x32.png"))); // NOI18N
        mnuSalir.setText("Salir");

        mnuSalirSalir.setText("Salir");
        mnuSalirSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirSalirActionPerformed(evt);
            }
        });
        mnuSalir.add(mnuSalirSalir);

        jMenuBar1.add(mnuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuVehiculosGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVehiculosGestionActionPerformed
        frmVehiculos frmVehi = new frmVehiculos();
        escritorio.add(frmVehi);
        frmVehi.show();
    }//GEN-LAST:event_mnuVehiculosGestionActionPerformed

    private void mnuSalirSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirSalirActionPerformed
        int resp = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de salir?", "Salir",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resp == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_mnuSalirSalirActionPerformed

    private void mnuBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBuscarActionPerformed
        frmConsultasVehiculo frmbuscar = new frmConsultasVehiculo();
        escritorio.add(frmbuscar);
        frmbuscar.show();
    }//GEN-LAST:event_mnuBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuBuscar;
    private javax.swing.JMenu mnuSalir;
    private javax.swing.JMenuItem mnuSalirSalir;
    private javax.swing.JMenu mnuVehiculos;
    private javax.swing.JMenuItem mnuVehiculosGestion;
    // End of variables declaration//GEN-END:variables
}