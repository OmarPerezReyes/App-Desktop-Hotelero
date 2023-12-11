/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author omarperez
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form MenuTemporal
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(null); // Centrar en la pantalla
      

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelbackground = new javax.swing.JPanel();
        jPanelMenu = new javax.swing.JPanel();
        jButtonAcompañante = new javax.swing.JButton();
        jButtonHabitacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonCliente = new javax.swing.JButton();
        jButtonEmpleado = new javax.swing.JButton();
        jButtonTipoHabitacion = new javax.swing.JButton();
        jButtonCerrarSesion = new javax.swing.JButton();
        jPanelContenido = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelbackground.setBackground(new java.awt.Color(255, 255, 255));

        jPanelMenu.setBackground(new java.awt.Color(211, 197, 174));

        jButtonAcompañante.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButtonAcompañante.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAcompañante.setText("Acompañantes");
        jButtonAcompañante.setBorder(null);
        jButtonAcompañante.setBorderPainted(false);
        jButtonAcompañante.setContentAreaFilled(false);
        jButtonAcompañante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcompañante.setFocusPainted(false);
        jButtonAcompañante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcompañanteActionPerformed(evt);
            }
        });

        jButtonHabitacion.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButtonHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHabitacion.setText("Habitaciones");
        jButtonHabitacion.setBorder(null);
        jButtonHabitacion.setBorderPainted(false);
        jButtonHabitacion.setContentAreaFilled(false);
        jButtonHabitacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonHabitacion.setFocusPainted(false);
        jButtonHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHabitacionActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/hotel-san-agustin-riviera-lima-peru.png"))); // NOI18N

        jButtonCliente.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButtonCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCliente.setText("Clientes");
        jButtonCliente.setBorder(null);
        jButtonCliente.setBorderPainted(false);
        jButtonCliente.setContentAreaFilled(false);
        jButtonCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCliente.setFocusPainted(false);
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });

        jButtonEmpleado.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButtonEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEmpleado.setText("Empleados");
        jButtonEmpleado.setBorder(null);
        jButtonEmpleado.setBorderPainted(false);
        jButtonEmpleado.setContentAreaFilled(false);
        jButtonEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEmpleado.setFocusPainted(false);
        jButtonEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmpleadoActionPerformed(evt);
            }
        });

        jButtonTipoHabitacion.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButtonTipoHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTipoHabitacion.setText("Tipos de Habitaciones");
        jButtonTipoHabitacion.setBorder(null);
        jButtonTipoHabitacion.setBorderPainted(false);
        jButtonTipoHabitacion.setContentAreaFilled(false);
        jButtonTipoHabitacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonTipoHabitacion.setFocusPainted(false);
        jButtonTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTipoHabitacionActionPerformed(evt);
            }
        });

        jButtonCerrarSesion.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButtonCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCerrarSesion.setText("Cerrar sesión");
        jButtonCerrarSesion.setBorder(null);
        jButtonCerrarSesion.setBorderPainted(false);
        jButtonCerrarSesion.setContentAreaFilled(false);
        jButtonCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCerrarSesion.setFocusPainted(false);
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCerrarSesion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonHabitacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonTipoHabitacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonAcompañante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(jButtonCliente)
                .addGap(18, 18, 18)
                .addComponent(jButtonAcompañante)
                .addGap(18, 18, 18)
                .addComponent(jButtonEmpleado)
                .addGap(18, 18, 18)
                .addComponent(jButtonTipoHabitacion)
                .addGap(18, 18, 18)
                .addComponent(jButtonHabitacion)
                .addGap(18, 18, 18)
                .addComponent(jButtonCerrarSesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelContenido.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContenido.setPreferredSize(new java.awt.Dimension(703, 504));

        jLabel2.setText("BIENVENIDO");

        javax.swing.GroupLayout jPanelContenidoLayout = new javax.swing.GroupLayout(jPanelContenido);
        jPanelContenido.setLayout(jPanelContenidoLayout);
        jPanelContenidoLayout.setHorizontalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );
        jPanelContenidoLayout.setVerticalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel2)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelbackgroundLayout = new javax.swing.GroupLayout(jPanelbackground);
        jPanelbackground.setLayout(jPanelbackgroundLayout);
        jPanelbackgroundLayout.setHorizontalGroup(
            jPanelbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelbackgroundLayout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelbackgroundLayout.setVerticalGroup(
            jPanelbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelbackgroundLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelbackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelbackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
        CRUDCliente crud = new CRUDCliente();
        showJPanel(crud);
    }//GEN-LAST:event_jButtonClienteActionPerformed

    private void jButtonEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpleadoActionPerformed
        CRUDEmpleado crud = new CRUDEmpleado();
        showJPanel(crud);
    }//GEN-LAST:event_jButtonEmpleadoActionPerformed

    private void jButtonAcompañanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcompañanteActionPerformed
        CRUDAcompañante crud = new CRUDAcompañante();
        showJPanel(crud);
    }//GEN-LAST:event_jButtonAcompañanteActionPerformed

    private void jButtonTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTipoHabitacionActionPerformed
        CRUDTipoHabitacion crud = new CRUDTipoHabitacion();
        showJPanel(crud);
    }//GEN-LAST:event_jButtonTipoHabitacionActionPerformed

    private void jButtonHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHabitacionActionPerformed
        CRUDHabitacion crud = new CRUDHabitacion();
        showJPanel(crud);
    }//GEN-LAST:event_jButtonHabitacionActionPerformed

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        this.dispose();
        Main main = new Main();
        main.setLocationRelativeTo(null);
        main.setVisible(true);
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    public static void main(String args[]) {
          try {
            // Establecer el aspecto Nimbus al principio del programa
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
               java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
        } catch (Exception e) {
            // Manejar la excepción si no se puede establecer el aspecto
            e.printStackTrace();
        }
     
    }
    
    private void showJPanel(JPanel crud){
          try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
        }
        crud.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

        crud.setSize(703, 504);
        crud.setLocation(0,0);
        jPanelContenido.removeAll();
        jPanelContenido.add(crud);
        jPanelContenido.revalidate();
        jPanelContenido.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcompañante;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonEmpleado;
    private javax.swing.JButton jButtonHabitacion;
    private javax.swing.JButton jButtonTipoHabitacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelContenido;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelbackground;
    // End of variables declaration//GEN-END:variables
}
