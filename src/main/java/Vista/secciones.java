
package Vista;

import com.Vista.secciones.*;
//import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import Pedido.Factura.PedidoModal;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatLightOwlIJTheme;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.security.Principal;


public class secciones extends javax.swing.JFrame {


    public secciones() {
        initComponents();
        iniMesas();
    }

    private void iniMesas(){
        inicio(new Mesas());
    }
    
    private void inicio(JPanel in){
        in.setPreferredSize(null); 
        in.setSize(Principal.getWidth(), Principal.getHeight());
        Principal.setLayout(new BorderLayout());
        Principal.removeAll();
        Principal.add(in, BorderLayout.CENTER);
        Principal.revalidate();
        Principal.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        Barra = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotonMesas = new javax.swing.JButton();
        BotonGestion = new javax.swing.JButton();
        BotonVentas = new javax.swing.JButton();
        BotonMenu = new javax.swing.JButton();
        BotonUsuarios = new javax.swing.JButton();
        BotonMobiliario = new javax.swing.JButton();
        BotonGastos = new javax.swing.JButton();
        BotonDespliegue = new javax.swing.JButton();
        Principal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        Barra.setBackground(new java.awt.Color(58, 179, 28));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Restaurante");

        BotonMesas.setBackground(new java.awt.Color(58, 179, 28));
        BotonMesas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonMesas.setForeground(new java.awt.Color(255, 255, 255));
        BotonMesas.setText("Mesas");
        BotonMesas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonMesas.setBorderPainted(false);
        BotonMesas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonMesas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonMesas.setIconTextGap(10);
        BotonMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMesasActionPerformed(evt);
            }
        });

        BotonGestion.setBackground(new java.awt.Color(58, 179, 28));
        BotonGestion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonGestion.setForeground(new java.awt.Color(255, 255, 255));
        BotonGestion.setText("Gestion Del Restaurante");
        BotonGestion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonGestion.setBorderPainted(false);
        BotonGestion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGestion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonGestion.setIconTextGap(10);
        BotonGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGestionActionPerformed(evt);
            }
        });

        BotonVentas.setBackground(new java.awt.Color(58, 179, 28));
        BotonVentas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonVentas.setForeground(new java.awt.Color(255, 255, 255));
        BotonVentas.setText("Ventas");
        BotonVentas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonVentas.setBorderPainted(false);
        BotonVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonVentas.setIconTextGap(10);
        BotonVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVentasActionPerformed(evt);
            }
        });

        BotonMenu.setBackground(new java.awt.Color(58, 179, 28));
        BotonMenu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonMenu.setForeground(new java.awt.Color(255, 255, 255));
        BotonMenu.setText("Menú");
        BotonMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonMenu.setBorderPainted(false);
        BotonMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonMenu.setIconTextGap(10);
        BotonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenuActionPerformed(evt);
            }
        });

        BotonUsuarios.setBackground(new java.awt.Color(58, 179, 28));
        BotonUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        BotonUsuarios.setText("Usuarios");
        BotonUsuarios.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonUsuarios.setBorderPainted(false);
        BotonUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonUsuarios.setIconTextGap(10);
        BotonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUsuariosActionPerformed(evt);
            }
        });

        BotonMobiliario.setBackground(new java.awt.Color(58, 179, 28));
        BotonMobiliario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonMobiliario.setForeground(new java.awt.Color(255, 255, 255));
        BotonMobiliario.setText("Mobiliario");
        BotonMobiliario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonMobiliario.setBorderPainted(false);
        BotonMobiliario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonMobiliario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonMobiliario.setIconTextGap(10);
        BotonMobiliario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMobiliarioActionPerformed(evt);
            }
        });

        BotonGastos.setBackground(new java.awt.Color(58, 179, 28));
        BotonGastos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BotonGastos.setForeground(new java.awt.Color(255, 255, 255));
        BotonGastos.setText("Gastos");
        BotonGastos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonGastos.setBorderPainted(false);
        BotonGastos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGastos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonGastos.setIconTextGap(10);
        BotonGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGastosActionPerformed(evt);
            }
        });

        BotonDespliegue.setBackground(new java.awt.Color(58, 179, 28));
        BotonDespliegue.setBorder(null);
        BotonDespliegue.setBorderPainted(false);
        BotonDespliegue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonDespliegueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BarraLayout = new javax.swing.GroupLayout(Barra);
        Barra.setLayout(BarraLayout);
        BarraLayout.setHorizontalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonMesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BotonGestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonMobiliario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(BotonUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonVentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonGastos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(BarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BotonDespliegue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        BarraLayout.setVerticalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonDespliegue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(93, 93, 93)
                .addComponent(BotonMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonGestion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonMobiliario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        Principal.setBackground(new java.awt.Color(255, 255, 255));
        Principal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Principal.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                PrincipalComponentHidden(evt);
            }
        });

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addComponent(Barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMesasActionPerformed
        inicio(new Mesas());
       
    }//GEN-LAST:event_BotonMesasActionPerformed

    private void BotonGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonGestionActionPerformed

    private void BotonVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVentasActionPerformed
        inicio(new Ventas());
    }//GEN-LAST:event_BotonVentasActionPerformed

    private void BotonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenuActionPerformed
        inicio(new Menu());
    }//GEN-LAST:event_BotonMenuActionPerformed

    private void BotonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUsuariosActionPerformed
        inicio(new Usuarios());
    }//GEN-LAST:event_BotonUsuariosActionPerformed

    private void BotonMobiliarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMobiliarioActionPerformed
        inicio(new Mobiliario());
    }//GEN-LAST:event_BotonMobiliarioActionPerformed

    private void BotonGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGastosActionPerformed
        inicio(new Gastos());
    }//GEN-LAST:event_BotonGastosActionPerformed

    private void BotonDespliegueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonDespliegueMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDespliegueMouseClicked

    private void PrincipalComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_PrincipalComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_PrincipalComponentHidden

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatLightOwlIJTheme.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new secciones().setVisible(true);
            }
        });
    }
    
    /*Principal.addComponentListener(new ComponentAdapter() {
    public void componentResized(ComponentEvent e) {
        Component panelActual = Principal.getComponent(0);
        if (panelActual instanceof JPanel) {
            panelActual.setSize(Principal.getWidth(), Principal.getHeight());
            panelActual.revalidate();
            panelActual.repaint();
        }
    }
});*/


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JButton BotonDespliegue;
    private javax.swing.JButton BotonGastos;
    private javax.swing.JButton BotonGestion;
    private javax.swing.JButton BotonMenu;
    private javax.swing.JButton BotonMesas;
    private javax.swing.JButton BotonMobiliario;
    private javax.swing.JButton BotonUsuarios;
    private javax.swing.JButton BotonVentas;
    private javax.swing.JPanel PanelPrincipal;
    public static javax.swing.JPanel Principal;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
