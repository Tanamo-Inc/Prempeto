package ui;

import javax.swing.ImageIcon;
import javax.swing.JDialog;


public class About_us extends JDialog  {

    /**
     * Creates new form About_us
     */
    public About_us() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/ic.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        but_title3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About us");
        setResizable(false);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Myriad Pro", 0, 19)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("\nPREMPETO\n\n      Tanamo Inc. is a startup software development company based in Ghana.\n Tanamo Inc. focuses on the little details that bring utmost satisfaction \nto our clients.We are into Mobile and Desktop App development, Website development, \nAnimations and Photo Designs.\nThe company targets any customer that wishes to take their business to the next \nlevel by providing you with the application that makes your cutomers feel special.\nWe develop and nurture your idea into reality. If you have just a vague idea you \nwant to bring to the software pool, just contact us to help you bring the best out of it.\n                    \nPrempeh II Library,KNUST(Prempeto)\nVersion: Prempeto 1.00\n\nEmail Us: tanamoinc@gmail.com\nFacebook :tanamoinc\nTwitter  : tanamoinc\nPhone    : 0241136074\nWebsites :www.tanamoinc.com/a\n\n© 2017 Tanamo Inc. All right reserved.");
        jScrollPane1.setViewportView(jTextArea1);

        but_title3.setBackground(new java.awt.Color(255, 255, 255));
        but_title3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        but_title3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                but_title3MouseDragged(evt);
            }
        });
        but_title3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                but_title3MousePressed(evt);
            }
        });
        but_title3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        but_title3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addComponent(but_title3, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(but_title3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );

        setBounds(0, 0, 842, 529);
    }// </editor-fold>//GEN-END:initComponents

    private void but_title3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_title3MouseDragged
        // TODO add your handling code here:

    }//GEN-LAST:event_but_title3MouseDragged

    private void but_title3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_title3MousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_but_title3MousePressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new About_us().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel but_title3;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}