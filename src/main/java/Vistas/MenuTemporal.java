/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author omarperez
 */
public class MenuTemporal extends javax.swing.JFrame {

    /**
     * Creates new form MenuTemporal
     */
    public MenuTemporal() {
        initComponents();
        setLocationRelativeTo(null); // Centrar en la pantalla

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCliente = new javax.swing.JButton();
        jButtonEmpleado = new javax.swing.JButton();
        jButtonAcompañante = new javax.swing.JButton();
        jButtonTipoHabitacion = new javax.swing.JButton();
        jButtonHabitacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCliente.setText("CLIENTES");
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });

        jButtonEmpleado.setText("EMPLEADOS");
        jButtonEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmpleadoActionPerformed(evt);
            }
        });

        jButtonAcompañante.setText("ACOMPAÑANTES");
        jButtonAcompañante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcompañanteActionPerformed(evt);
            }
        });

        jButtonTipoHabitacion.setText("TIPOS DE HABITACIONES");
        jButtonTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTipoHabitacionActionPerformed(evt);
            }
        });

        jButtonHabitacion.setText("HABITACIONES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonTipoHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAcompañante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButtonCliente)
                .addGap(18, 18, 18)
                .addComponent(jButtonEmpleado)
                .addGap(18, 18, 18)
                .addComponent(jButtonAcompañante)
                .addGap(18, 18, 18)
                .addComponent(jButtonTipoHabitacion)
                .addGap(18, 18, 18)
                .addComponent(jButtonHabitacion)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
        this.dispose();
        CRUDCliente crud = new CRUDCliente();
        crud.setVisible(true);
    }//GEN-LAST:event_jButtonClienteActionPerformed

    private void jButtonEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpleadoActionPerformed
        this.dispose();
        CRUDEmpleado crud = new CRUDEmpleado();
        crud.setVisible(true);
    }//GEN-LAST:event_jButtonEmpleadoActionPerformed

    private void jButtonAcompañanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcompañanteActionPerformed
        this.dispose();
        CRUDAcompañante crud = new CRUDAcompañante();
        crud.setVisible(true);
    }//GEN-LAST:event_jButtonAcompañanteActionPerformed

    private void jButtonTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTipoHabitacionActionPerformed
        this.dispose();
        CRUDTipoHabitacion crud = new CRUDTipoHabitacion();
        crud.setVisible(true);
    }//GEN-LAST:event_jButtonTipoHabitacionActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTemporal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcompañante;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonEmpleado;
    private javax.swing.JButton jButtonHabitacion;
    private javax.swing.JButton jButtonTipoHabitacion;
    // End of variables declaration//GEN-END:variables
}
