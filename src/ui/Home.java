/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import core.Hints;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author proxc
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/ic.png")).getImage());

        txt_searches.setUI(new Hints("Search", true));
        CurrentDat();

    }

    private void CurrentDat() {
        Calendar calen = new GregorianCalendar();
        int month = calen.get(Calendar.MONTH);
        int year = calen.get(Calendar.YEAR);
        int day = calen.get(Calendar.DAY_OF_MONTH);
        date.setText("Date " + year + "/" + (month + 1) + "/" + day);

    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        but_title = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txt_searches = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        but_about = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        but_home = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        but_theses = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        but_alexa = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        but_members = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        but_books = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Prempeh II Library");
        setLocationByPlatform(true);
        setResizable(false);

        main_panel.setBackground(new java.awt.Color(251, 244, 2));
        main_panel.setMinimumSize(new java.awt.Dimension(860, 600));
        main_panel.setPreferredSize(new java.awt.Dimension(854, 600));
        main_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        but_title.setBackground(new java.awt.Color(141, 0, 0));
        but_title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                but_titleMouseDragged(evt);
            }
        });
        but_title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                but_titleMousePressed(evt);
            }
        });
        but_title.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/knustlogo.png"))); // NOI18N
        but_title.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 450, -1));

        txt_searches.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_searches.setBorder(null);
        txt_searches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchesActionPerformed(evt);
            }
        });
        but_title.add(txt_searches, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 220, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_search.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });
        but_title.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 40, 30));

        main_panel.add(but_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 220));

        but_about.setBackground(new java.awt.Color(255, 255, 255));
        but_about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but_aboutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but_aboutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                but_aboutMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 0));
        jLabel2.setText("About Us");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aboutus.png"))); // NOI18N

        javax.swing.GroupLayout but_aboutLayout = new javax.swing.GroupLayout(but_about);
        but_about.setLayout(but_aboutLayout);
        but_aboutLayout.setHorizontalGroup(
            but_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(but_aboutLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(but_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(but_aboutLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        but_aboutLayout.setVerticalGroup(
            but_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(but_aboutLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        main_panel.add(but_about, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 140, 120));

        but_home.setBackground(new java.awt.Color(255, 255, 255));
        but_home.setPreferredSize(new java.awt.Dimension(150, 150));
        but_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but_homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but_homeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                but_homeMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 0));
        jLabel3.setText("Home");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N

        javax.swing.GroupLayout but_homeLayout = new javax.swing.GroupLayout(but_home);
        but_home.setLayout(but_homeLayout);
        but_homeLayout.setHorizontalGroup(
            but_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(but_homeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, but_homeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(51, 51, 51))
        );
        but_homeLayout.setVerticalGroup(
            but_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(but_homeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main_panel.add(but_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 140, 120));

        but_theses.setBackground(new java.awt.Color(255, 255, 255));
        but_theses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but_thesesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but_thesesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                but_thesesMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 0));
        jLabel5.setText("Theses");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/theses.png"))); // NOI18N

        javax.swing.GroupLayout but_thesesLayout = new javax.swing.GroupLayout(but_theses);
        but_theses.setLayout(but_thesesLayout);
        but_thesesLayout.setHorizontalGroup(
            but_thesesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(but_thesesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(45, 45, 45))
            .addGroup(but_thesesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        but_thesesLayout.setVerticalGroup(
            but_thesesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(but_thesesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main_panel.add(but_theses, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 140, 120));

        but_alexa.setBackground(new java.awt.Color(255, 255, 255));
        but_alexa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but_alexaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but_alexaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                but_alexaMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 0));
        jLabel7.setText("Alexandria");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alexa.png"))); // NOI18N

        javax.swing.GroupLayout but_alexaLayout = new javax.swing.GroupLayout(but_alexa);
        but_alexa.setLayout(but_alexaLayout);
        but_alexaLayout.setHorizontalGroup(
            but_alexaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(but_alexaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, but_alexaLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(28, 28, 28))
        );
        but_alexaLayout.setVerticalGroup(
            but_alexaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(but_alexaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main_panel.add(but_alexa, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 140, 120));

        but_members.setBackground(new java.awt.Color(255, 255, 255));
        but_members.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but_membersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but_membersMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                but_membersMousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 0));
        jLabel9.setText("Members");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_manage.png"))); // NOI18N
        jLabel10.setMaximumSize(new java.awt.Dimension(80, 80));
        jLabel10.setMinimumSize(new java.awt.Dimension(80, 80));
        jLabel10.setPreferredSize(new java.awt.Dimension(80, 80));

        javax.swing.GroupLayout but_membersLayout = new javax.swing.GroupLayout(but_members);
        but_members.setLayout(but_membersLayout);
        but_membersLayout.setHorizontalGroup(
            but_membersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, but_membersLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(but_membersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(41, 41, 41))
        );
        but_membersLayout.setVerticalGroup(
            but_membersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(but_membersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(16, 16, 16))
        );

        main_panel.add(but_members, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 140, 120));

        but_books.setBackground(new java.awt.Color(255, 255, 255));
        but_books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but_booksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but_booksMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                but_booksMousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 0));
        jLabel11.setText("Monitoring");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/spy.png"))); // NOI18N

        javax.swing.GroupLayout but_booksLayout = new javax.swing.GroupLayout(but_books);
        but_books.setLayout(but_booksLayout);
        but_booksLayout.setHorizontalGroup(
            but_booksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(but_booksLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(but_booksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(but_booksLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11))
                    .addComponent(jLabel12))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        but_booksLayout.setVerticalGroup(
            but_booksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(but_booksLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(8, 8, 8))
        );

        main_panel.add(but_books, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 140, 120));

        date.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        date.setForeground(new java.awt.Color(51, 0, 0));
        date.setToolTipText("click me");
        date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dateMousePressed(evt);
            }
        });
        main_panel.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 590, 140, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(876, 654));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void but_homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_homeMouseEntered
        // TODO add your handling code here:
        setColor(but_home);
    }//GEN-LAST:event_but_homeMouseEntered

    private void but_homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_homeMouseExited
        // TODO add your handling code here:
        resetColor(but_home);
    }//GEN-LAST:event_but_homeMouseExited

    int xx, xy;
    private void but_titleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_titleMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_but_titleMousePressed

    private void but_titleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_titleMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_but_titleMouseDragged

    private void but_thesesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_thesesMouseEntered
        // TODO add your handling code here:
        setColor(but_theses);
    }//GEN-LAST:event_but_thesesMouseEntered

    private void but_thesesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_thesesMouseExited
        // TODO add your handling code here:
        resetColor(but_theses);
    }//GEN-LAST:event_but_thesesMouseExited

    private void but_alexaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_alexaMouseEntered
        // TODO add your handling code here
        setColor(but_alexa);
    }//GEN-LAST:event_but_alexaMouseEntered

    private void but_alexaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_alexaMouseExited
        // TODO add your handling code here:
        resetColor(but_alexa);
    }//GEN-LAST:event_but_alexaMouseExited

    private void but_membersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_membersMouseEntered
        // TODO add your handling code here:
        setColor(but_members);
    }//GEN-LAST:event_but_membersMouseEntered

    private void but_membersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_membersMouseExited
        // TODO add your handling code here:
        resetColor(but_members);

    }//GEN-LAST:event_but_membersMouseExited

    private void but_booksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_booksMouseEntered
        // TODO add your handling code here:
        setColor(but_books);
    }//GEN-LAST:event_but_booksMouseEntered

    private void but_booksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_booksMouseExited
        // TODO add your handling code here:
        resetColor(but_books);
    }//GEN-LAST:event_but_booksMouseExited

    private void but_aboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_aboutMouseEntered
        // TODO add your handling code here:
        setColor(but_about);
    }//GEN-LAST:event_but_aboutMouseEntered

    private void but_aboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_aboutMouseExited
        // TODO add your handling code here:
        resetColor(but_about);
    }//GEN-LAST:event_but_aboutMouseExited

    private void but_homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_homeMousePressed
        // TODO add your handling code here:
        try {

            String URL = "https://library.knust.edu.gh/";

            Desktop.getDesktop().browse(java.net.URI.create(URL));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_but_homeMousePressed

    private void but_thesesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_thesesMousePressed
        // TODO add your handling code here:
        //just a sample.
        close();
        new Theses().show();
    }//GEN-LAST:event_but_thesesMousePressed

    private void txt_searchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchesActionPerformed

    private void but_alexaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_alexaMousePressed
        // TODO add your handling code here:
        try {

            String URL = "http://192.168.1.173/#";

            Desktop.getDesktop().browse(java.net.URI.create(URL));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_but_alexaMousePressed

    private void but_aboutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_aboutMousePressed
        //close();
        new About_us().show();        // TODO add your handling code here:
    }//GEN-LAST:event_but_aboutMousePressed

    private void but_membersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_membersMousePressed
        try {

            String URL = "https://mail.knust.edu.gh/";

            Desktop.getDesktop().browse(java.net.URI.create(URL));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_but_membersMousePressed

    private void but_booksMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_booksMousePressed

        JLabel jUserName = new JLabel("Identity");
        JTextField userName = new JTextField();
        JLabel jPassword = new JLabel("Secret Code");
        JPasswordField password = new JPasswordField();
        Object[] ob = {jUserName, userName, jPassword, password};
        int result = JOptionPane.showConfirmDialog(null, ob, "Authorization", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String s1 = userName.getText();
            String s2 = password.getText();
            //Here is some validation code

            if (s1.equalsIgnoreCase("tanamo")) {
                JOptionPane.showMessageDialog(null, "Loading....");
              //my logic code goes here.
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Contact Admin.");
            }

        }

    }//GEN-LAST:event_but_booksMousePressed

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        // TODO add your handling code here:
        try {
            String search = "#q=" + txt_searches.getText().trim();
            search = search.replaceAll(" ", "+");
            String url = "http:////www.google.com//" + search;
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            // System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_jLabel16MousePressed

    private void dateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMousePressed

    }//GEN-LAST:event_dateMousePressed

    public void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(197, 197, 197));
    }

    public void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(240, 240, 240));
    }

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
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }

                UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel but_about;
    private javax.swing.JPanel but_alexa;
    private javax.swing.JPanel but_books;
    private javax.swing.JPanel but_home;
    private javax.swing.JPanel but_members;
    private javax.swing.JPanel but_theses;
    private javax.swing.JPanel but_title;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel main_panel;
    private javax.swing.JTextField txt_searches;
    // End of variables declaration//GEN-END:variables
}
