package Vistas;

import Modelos.InicioSesionListener;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

/**
 *
 * @author omarperez
 */
public class Main extends javax.swing.JFrame implements InicioSesionListener {
    private String tipoUsuario = null;
    private boolean bandera = true;

    public Main() {
        initComponents();
        setLocationRelativeTo(null); // Centrar en la pantalla
        IniciarSesion vista = new IniciarSesion();
        vista.setInicioSesionListener(this); 
        showJPanel(vista);
        this.jButtonHoriz.setText("Registrar cliente");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelbackground = new javax.swing.JPanel();
        jPanelMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonHoriz = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jPanelContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelbackground.setBackground(new java.awt.Color(255, 255, 255));

        jPanelMenu.setBackground(new java.awt.Color(211, 197, 174));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/hotel-san-agustin-riviera-lima-peru-inicio.png"))); // NOI18N

        jButtonHoriz.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButtonHoriz.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHoriz.setText("Nuevo cliente");
        jButtonHoriz.setBorder(null);
        jButtonHoriz.setBorderPainted(false);
        jButtonHoriz.setContentAreaFilled(false);
        jButtonHoriz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonHoriz.setFocusPainted(false);
        jButtonHoriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHorizActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.setBorder(null);
        jButtonSalir.setBorderPainted(false);
        jButtonSalir.setContentAreaFilled(false);
        jButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalir.setFocusPainted(false);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonHoriz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(jButtonSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(jButtonHoriz)
                .addGap(221, 221, 221)
                .addComponent(jButtonSalir)
                .addGap(27, 27, 27))
        );

        jPanelContenido.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContenido.setPreferredSize(new java.awt.Dimension(703, 504));

        javax.swing.GroupLayout jPanelContenidoLayout = new javax.swing.GroupLayout(jPanelContenido);
        jPanelContenido.setLayout(jPanelContenidoLayout);
        jPanelContenidoLayout.setHorizontalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );
        jPanelContenidoLayout.setVerticalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelbackgroundLayout = new javax.swing.GroupLayout(jPanelbackground);
        jPanelbackground.setLayout(jPanelbackgroundLayout);
        jPanelbackgroundLayout.setHorizontalGroup(
            jPanelbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelbackgroundLayout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jPanelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanelbackgroundLayout.setVerticalGroup(
            jPanelbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
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

    private void jButtonHorizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHorizActionPerformed
        if (bandera) {
            bandera = false;
            RegistrarCliente vista = new RegistrarCliente();
            showJPanel(vista);
            this.jButtonHoriz.setText("Iniciar Sesión");
        } else {
            bandera = true;
            IniciarSesion vista = new IniciarSesion();
            vista.setInicioSesionListener(this); 
            showJPanel(vista);
            this.jButtonHoriz.setText("Registrar cliente");
        }
    }//GEN-LAST:event_jButtonHorizActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    public static void main(String args[]) {
        try {
            // Establecer el aspecto Nimbus al principio del programa
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Main().setVisible(true);
                }
            });
        } catch (Exception e) {
            // Manejar la excepción si no se puede establecer el aspecto
            e.printStackTrace();
        }

    }

    private void showJPanel(JPanel crud) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
        }
        crud.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

        crud.setSize(703, 504);
        crud.setLocation(0, 0);
        jPanelContenido.removeAll();
        jPanelContenido.add(crud);
        jPanelContenido.revalidate();
        jPanelContenido.repaint();
    }

    @Override
    public void onInicioSesionExitoso() {
        this.dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonHoriz;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelContenido;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelbackground;
    // End of variables declaration//GEN-END:variables

    public void onTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void onIdUsuario(int idUsuario) {
        Menu menu = new Menu(tipoUsuario, idUsuario);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }
}
