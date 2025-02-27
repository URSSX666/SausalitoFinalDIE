
package Vista;


public class grupo extends javax.swing.JFrame {


    public grupo() {
        initComponents();
        iniMesas();
    }

    private void iniMesas(){
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Boton_Ventas = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Boton_Mesas = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Boton_Menu = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Boton_Usuarios = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Boton_Mobiliario = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        Boton_Gastos = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(58, 179, 28));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_Ventas.setBackground(new java.awt.Color(47, 143, 23));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ventas");

        javax.swing.GroupLayout Boton_VentasLayout = new javax.swing.GroupLayout(Boton_Ventas);
        Boton_Ventas.setLayout(Boton_VentasLayout);
        Boton_VentasLayout.setHorizontalGroup(
            Boton_VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton_VentasLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Boton_VentasLayout.setVerticalGroup(
            Boton_VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton_VentasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(Boton_Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 210, 40));

        Boton_Mesas.setBackground(new java.awt.Color(58, 179, 28));
        Boton_Mesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_MesasMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Mesas");

        javax.swing.GroupLayout Boton_MesasLayout = new javax.swing.GroupLayout(Boton_Mesas);
        Boton_Mesas.setLayout(Boton_MesasLayout);
        Boton_MesasLayout.setHorizontalGroup(
            Boton_MesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton_MesasLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel10))
        );
        Boton_MesasLayout.setVerticalGroup(
            Boton_MesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton_MesasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        jPanel3.add(Boton_Mesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 240, 40));

        Boton_Menu.setBackground(new java.awt.Color(58, 179, 28));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Menú");

        javax.swing.GroupLayout Boton_MenuLayout = new javax.swing.GroupLayout(Boton_Menu);
        Boton_Menu.setLayout(Boton_MenuLayout);
        Boton_MenuLayout.setHorizontalGroup(
            Boton_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton_MenuLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Boton_MenuLayout.setVerticalGroup(
            Boton_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton_MenuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(Boton_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 200, -1));

        Boton_Usuarios.setBackground(new java.awt.Color(58, 179, 28));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Usuarios");

        javax.swing.GroupLayout Boton_UsuariosLayout = new javax.swing.GroupLayout(Boton_Usuarios);
        Boton_Usuarios.setLayout(Boton_UsuariosLayout);
        Boton_UsuariosLayout.setHorizontalGroup(
            Boton_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton_UsuariosLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Boton_UsuariosLayout.setVerticalGroup(
            Boton_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton_UsuariosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(Boton_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 200, -1));

        Boton_Mobiliario.setBackground(new java.awt.Color(58, 179, 28));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Mobiliario");

        javax.swing.GroupLayout Boton_MobiliarioLayout = new javax.swing.GroupLayout(Boton_Mobiliario);
        Boton_Mobiliario.setLayout(Boton_MobiliarioLayout);
        Boton_MobiliarioLayout.setHorizontalGroup(
            Boton_MobiliarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton_MobiliarioLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Boton_MobiliarioLayout.setVerticalGroup(
            Boton_MobiliarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton_MobiliarioLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        jPanel3.add(Boton_Mobiliario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 200, -1));

        Boton_Gastos.setBackground(new java.awt.Color(58, 179, 28));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Gastos");

        javax.swing.GroupLayout Boton_GastosLayout = new javax.swing.GroupLayout(Boton_Gastos);
        Boton_Gastos.setLayout(Boton_GastosLayout);
        Boton_GastosLayout.setHorizontalGroup(
            Boton_GastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton_GastosLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Boton_GastosLayout.setVerticalGroup(
            Boton_GastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton_GastosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        jPanel3.add(Boton_Gastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 200, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RESTAURANTE");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 40));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText(" Gestion del restaurante");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 240, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_MesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_MesasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_MesasMouseClicked

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
            java.util.logging.Logger.getLogger(grupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(grupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(grupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(grupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new grupo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Boton_Gastos;
    private javax.swing.JPanel Boton_Menu;
    private javax.swing.JPanel Boton_Mesas;
    private javax.swing.JPanel Boton_Mobiliario;
    private javax.swing.JPanel Boton_Usuarios;
    private javax.swing.JPanel Boton_Ventas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
