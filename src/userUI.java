import database.konekdatabase;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class userUI extends javax.swing.JFrame {

    public static userUI Instance;
    public JTextField kk;    
    
        public void getExit(){
        int confirm =JOptionPane.showConfirmDialog(this,"Anda yakin ingin keluar dari login ?","Keluar Aplikasi",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION){
        System.exit(0);
            }
        if(confirm == JOptionPane.NO_OPTION){   
            }
        }
        
        private void setTabletiket(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Kode Tiket");
        model.addColumn("Jenis Tiket");
        model.addColumn("Kode Konser");
        model.addColumn("Jumlah Seat");
        model.addColumn("Harga");
       
        try{
            //Ambil data dari Database
            int no = 1;
            String sql = "SELECT * FROM tiket";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo", "root", "");
            Statement st = con.createStatement();
            ResultSet res = st.executeQuery(sql);
            //Menampilkan Tabel
            while(res.next()){
                model.addRow(new Object[]{no++, res.getString(1),
                                                res.getString(2),
                                                res.getString(3),
                                                res.getString(4),
                                                res.getString(5)
                                                }); 
            }
            tab_daftartiket.setModel(model);
            
        }catch(SQLException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
    
        private void setTablejadwal(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Kode Konser");
        model.addColumn("Nama Konser");
        model.addColumn("Artis");
        model.addColumn("Tanggal");
        model.addColumn("Lokasi");
        model.addColumn("Status");
        try{
            //Ambil data dari Database
            int no = 1;
            String sql = "SELECT * FROM year";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo", "root", "");
            Statement st = con.createStatement();
            ResultSet res = st.executeQuery(sql);
            //Menampilkan Tabel
            while(res.next()){
                model.addRow(new Object[]{no++, res.getString(1),
                                                res.getString(2),
                                                res.getString(3),
                                                res.getString(4),
                                                res.getString(5),
                                                res.getString(6)}); 
            }
            tab_jadwalkonser.setModel(model);
            
        }catch(SQLException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
    /**
     * Creates new form NewJFrame
     */
    public userUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTablejadwal();
        setTabletiket();
        Instance = this;
        kk = kodetiket;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_daftartiket = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_jadwalkonser = new javax.swing.JTable();
        login_user = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        teks_username = new javax.swing.JTextField();
        teks_pass = new javax.swing.JTextField();
        teks_kodetiket = new javax.swing.JTextField();
        kodetiket = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 51, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 1, true));

        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setName(""); // NOI18N

        tab_daftartiket.setBackground(new java.awt.Color(255, 204, 153));
        tab_daftartiket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Tiket", "Jenis Tiket", "Kode Konser", "Jumlah Seat", "Harga"
            }
        ));
        jScrollPane2.setViewportView(tab_daftartiket);

        jTabbedPane1.addTab("Daftar Tiket", jScrollPane2);

        tab_jadwalkonser.setBackground(new java.awt.Color(255, 204, 204));
        tab_jadwalkonser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode Konser", "Nama Konser", "Artis", "Tanggal", "Lokasi", "Status"
            }
        ));
        tab_jadwalkonser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tab_jadwalkonser.setInheritsPopupMenu(true);
        tab_jadwalkonser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_jadwalkonserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab_jadwalkonser);
        tab_jadwalkonser.getAccessibleContext().setAccessibleName("");
        tab_jadwalkonser.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Jadwal Konser", jScrollPane1);

        login_user.setText("LOGIN USER UNTUK MEMBELI");
        login_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_userMouseClicked(evt);
            }
        });
        login_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_userActionPerformed(evt);
            }
        });

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        teks_username.setBackground(new java.awt.Color(255, 255, 204));
        teks_username.setText("Username");
        teks_username.setBorder(null);

        teks_pass.setBackground(new java.awt.Color(255, 255, 204));
        teks_pass.setText("Password");
        teks_pass.setBorder(null);

        teks_kodetiket.setBackground(new java.awt.Color(255, 204, 153));
        teks_kodetiket.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        teks_kodetiket.setText("Kode Tiket");
        teks_kodetiket.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        teks_kodetiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teks_kodetiketActionPerformed(evt);
            }
        });

        kodetiket.setBackground(new java.awt.Color(255, 204, 153));
        kodetiket.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kodetiket.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kodetiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodetiketActionPerformed(evt);
            }
        });

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Kopi Senja Sans", 0, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Weverse Ticket Portal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(teks_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(teks_username, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(teks_kodetiket, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kodetiket, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(login_user)
                                        .addGap(15, 15, 15)))
                                .addGap(18, 18, 18)
                                .addComponent(exit)))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(teks_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(teks_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(teks_kodetiket, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kodetiket, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_user, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit))
                .addGap(32, 32, 32))
        );

        username.getAccessibleContext().setAccessibleName("");
        username.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_userActionPerformed
        
        try {
            String sql = "select * from tiket where kode_tiket ='"+kodetiket.getText()+"'";
            java.sql.Connection conn = (Connection)konekdatabase.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet res = pstm.executeQuery(sql);
            //String value1 = res.getString("kodetiket");
            
            if(res.next()&&username.getText().equals("user")&&password.getText().equals("123")){
                BELI_TIKETNYA bl = new BELI_TIKETNYA();
                bl.setVisible(true);
                bl.pack();
                bl.setLocationRelativeTo(null);
                this.dispose();
                BELI_TIKETNYA.Instance.code.setText(kodetiket.getText());
                BELI_TIKETNYA.Instance.namecon.setText(res.getString("kode_konser"));
                BELI_TIKETNYA.Instance.jt.setText(res.getString("jenis_tiket"));
                BELI_TIKETNYA.Instance.h.setText(res.getString("harga"));
                
        }
        else {
            JOptionPane.showMessageDialog(null, "DATA TIDAK VALID");}
            } 
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_login_userActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void teks_kodetiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teks_kodetiketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teks_kodetiketActionPerformed

    private void kodetiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodetiketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodetiketActionPerformed

    private void login_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_userMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_login_userMouseClicked

    private void tab_jadwalkonserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_jadwalkonserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tab_jadwalkonserMouseClicked

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        getExit();
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(userUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField kodetiket;
    private javax.swing.JButton login_user;
    private javax.swing.JPasswordField password;
    private javax.swing.JTable tab_daftartiket;
    private javax.swing.JTable tab_jadwalkonser;
    private javax.swing.JTextField teks_kodetiket;
    private javax.swing.JTextField teks_pass;
    private javax.swing.JTextField teks_username;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
