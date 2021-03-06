/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Azaelmglw
 */
public class ViewMain extends javax.swing.JFrame {

    /**
     * Creates new form ViewMain
     */
    public ViewMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnl_fondo = new javax.swing.JPanel();
        jlb_encabezado = new javax.swing.JLabel();
        jmb_barra_menu = new javax.swing.JMenuBar();
        jme_archivo = new javax.swing.JMenu();
        jmi_verificacion_usuario = new javax.swing.JMenuItem();
        jmi_admin = new javax.swing.JMenuItem();
        jmi_vendedor = new javax.swing.JMenuItem();
        jmi_salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));

        jpnl_fondo.setBackground(new java.awt.Color(51, 51, 51));

        jlb_encabezado.setBackground(new java.awt.Color(51, 51, 51));
        jlb_encabezado.setFont(new java.awt.Font("PakType Naskh Basic", 1, 48)); // NOI18N
        jlb_encabezado.setForeground(new java.awt.Color(204, 204, 204));
        jlb_encabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_encabezado.setText("MD5_MVC");

        javax.swing.GroupLayout jpnl_fondoLayout = new javax.swing.GroupLayout(jpnl_fondo);
        jpnl_fondo.setLayout(jpnl_fondoLayout);
        jpnl_fondoLayout.setHorizontalGroup(
            jpnl_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl_fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlb_encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnl_fondoLayout.setVerticalGroup(
            jpnl_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl_fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlb_encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
        );

        jme_archivo.setText("Archivo");
        jme_archivo.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N

        jmi_verificacion_usuario.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jmi_verificacion_usuario.setText("Verificación de Usuario");
        jme_archivo.add(jmi_verificacion_usuario);

        jmi_admin.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jmi_admin.setText("Admin");
        jme_archivo.add(jmi_admin);

        jmi_vendedor.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jmi_vendedor.setText("Vendedor");
        jme_archivo.add(jmi_vendedor);

        jmi_salir.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jmi_salir.setText("Salir");
        jme_archivo.add(jmi_salir);

        jmb_barra_menu.add(jme_archivo);

        setJMenuBar(jmb_barra_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnl_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnl_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jlb_encabezado;
    public javax.swing.JMenuBar jmb_barra_menu;
    public javax.swing.JMenu jme_archivo;
    public javax.swing.JMenuItem jmi_admin;
    public javax.swing.JMenuItem jmi_salir;
    public javax.swing.JMenuItem jmi_vendedor;
    public javax.swing.JMenuItem jmi_verificacion_usuario;
    public javax.swing.JPanel jpnl_fondo;
    // End of variables declaration//GEN-END:variables
}
