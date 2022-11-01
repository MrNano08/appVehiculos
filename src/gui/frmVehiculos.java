package gui;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.Vehiculo;
import logica.GestorVehiculo;

public class frmVehiculos extends javax.swing.JInternalFrame {

    GestorVehiculo gestorVehiculo;

    /**
     * Creates new form frmCategorias
     */
    public frmVehiculos() {
        initComponents();
        gestorVehiculo = new GestorVehiculo();
        gestorVehiculo.recuperarDeArchivo();
        cargarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        winVehiculo = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtKilometraje = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        barraHerramientas = new javax.swing.JToolBar();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();

        winVehiculo.setAlwaysOnTop(true);

        jLabel1.setText("Matricula:");

        jLabel2.setText("Marca:");

        txtCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapacidadActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Guardar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel4.setText("Datos Vehículo");

        jLabel5.setText("Capacidad:");

        jLabel6.setText("Modelo:");

        txtKilometraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKilometrajeActionPerformed(evt);
            }
        });

        jLabel7.setText("Kilometraje:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCapacidad)
                                .addComponent(txtMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                .addComponent(txtMarca)
                                .addComponent(txtModelo)
                                .addComponent(txtKilometraje))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(btnSalvar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout winVehiculoLayout = new javax.swing.GroupLayout(winVehiculo.getContentPane());
        winVehiculo.getContentPane().setLayout(winVehiculoLayout);
        winVehiculoLayout.setHorizontalGroup(
            winVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        winVehiculoLayout.setVerticalGroup(
            winVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestión de vehículos");
        setFrameIcon(null);

        barraHerramientas.setRollover(true);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnGuardar);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setFocusable(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnEditar);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnEliminar);

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/printmgr.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setFocusable(false);
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnImprimir);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit_32x32.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.setFocusable(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnCerrar);

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATRICULA", "MARCA", "MODELO", "CAPACIDAD", "KILOMETRAJE"
            }
        ));
        jScrollPane1.setViewportView(tblVehiculos);

        lblTotal.setText("Total: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(barraHerramientas, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblTotal)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapacidadActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        winVehiculo.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        winVehiculo.setSize(450, 350);
        winVehiculo.setTitle("Guardar");
        ImageIcon img = new ImageIcon(getClass().getResource("/img/save.png"));
        winVehiculo.setIconImage(img.getImage());
        txtMatricula.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtCapacidad.setText("");
        txtCapacidad.setEditable(true);
        txtKilometraje.setText("");
        

        winVehiculo.setLocationRelativeTo(tblVehiculos);
        winVehiculo.setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int fila = tblVehiculos.getSelectedRow();
        if (fila != -1) {
            winVehiculo.setSize(560, 660);
            winVehiculo.setTitle("Editar");
            ImageIcon img = new ImageIcon(getClass().getResource("/img/edit.png"));
            winVehiculo.setIconImage(img.getImage());
            txtMatricula.setText(tblVehiculos.getValueAt(fila, 0).toString());
            txtMarca.setText(tblVehiculos.getValueAt(fila, 1).toString());
            txtModelo.setText(tblVehiculos.getValueAt(fila, 2).toString());
            txtCapacidad.setText(tblVehiculos.getValueAt(fila, 3).toString());
            txtKilometraje.setText(tblVehiculos.getValueAt(fila, 4).toString());
            //txtCapacidad.setEditable(false);
            
            winVehiculo.setLocationRelativeTo(tblVehiculos);
            winVehiculo.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "seleccione el vehículo a editar",
                    "Editar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String error = validarEntrada();
        if (error.equals("")) {//no hay errores
            Vehiculo vehiculo = new Vehiculo();
            vehiculo.setMatricula(txtMatricula.getText().toUpperCase());
            vehiculo.setMarca(txtMarca.getText().toUpperCase());
            vehiculo.setModelo(Integer.parseInt(txtModelo.getText()));
            vehiculo.setCapacidad(Integer.parseInt(txtCapacidad.getText()));
            vehiculo.setKilometraje(Integer.parseInt(txtKilometraje.getText()));

            if (winVehiculo.getTitle().equals("Guardar")) {
                if (gestorVehiculo.existe(vehiculo.getMatricula())) {
                    JOptionPane.showMessageDialog(winVehiculo, "Vehículo ya registrado",
                            "Guardar", JOptionPane.ERROR_MESSAGE);
                } else {
                    gestorVehiculo.guardar(vehiculo);
                    gestorVehiculo.guardarEnArchivo();
                    winVehiculo.dispose();
                    cargarDatos();
                }
            } else {//desea editar
                gestorVehiculo.editar(vehiculo);
                gestorVehiculo.guardarEnArchivo();
                winVehiculo.dispose();
                cargarDatos();
            }
        } else {
            JOptionPane.showMessageDialog(winVehiculo, error, "Guardar",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tblVehiculos.getSelectedRow();
        if (fila != -1) {
            String matricula = tblVehiculos.getValueAt(fila, 0).toString();
            int resp = JOptionPane.showConfirmDialog(rootPane,
                    "¿Esta seguro de eliminar el vehículo seleccionado?", "Eliminar",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (resp == JOptionPane.YES_OPTION) {
                gestorVehiculo.eliminar(matricula);
                gestorVehiculo.guardarEnArchivo();
                cargarDatos();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione el vehículo a eliminar",
                    "Eliminar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        gestorVehiculo.cargarReporte();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void txtKilometrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKilometrajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKilometrajeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barraHerramientas;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblVehiculos;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtKilometraje;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JDialog winVehiculo;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {
        tblVehiculos.setModel(gestorVehiculo.obtenerModeloTabla());
        lblTotal.setText("Total: " + tblVehiculos.getRowCount());
    }

    private String validarEntrada() {

        if (txtMatricula.getText().trim().equals("")) {
            txtMatricula.requestFocus();
            return "Digite la matricula del vehículo";
        }

        if (txtMarca.getText().trim().equals("")) {
            txtMarca.requestFocus();
            return "Digite la marca del vehículo";
        }

        if (txtModelo.getText().trim().equals("")) {
            txtModelo.requestFocus();
            return "Digite el modelo del vehículo";
        } else {
            try {
                Integer.parseInt(txtModelo.getText());
            } catch (NumberFormatException e) {
                txtModelo.requestFocus();
                return "El modelo del vehículo debe de digitarse en forma númerica";
            }
        }

        if (txtCapacidad.getText().trim().equals("")) {
            txtCapacidad.requestFocus();
            return "Digite la capacidad del vehículo";
        } else {
            try {
                Integer.parseInt(txtCapacidad.getText());
            } catch (NumberFormatException e) {
                txtCapacidad.requestFocus();
                return "La capacidad del vehículo debe de digitarse en forma númerica";
            }
        }

        if (txtKilometraje.getText().trim().equals("")) {
            txtKilometraje.requestFocus();
            return "Digite el kilometraje del vehículo";
        } else {
            try {
                Integer.parseInt(txtKilometraje.getText());
            } catch (NumberFormatException e) {
                txtKilometraje.requestFocus();
                return "El kilometraje del vehículo debe de digitarse en forma númerica";
            }
        }

        return "";
    }

}
