import java.awt.HeadlessException;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class Room extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Room() throws ClassNotFoundException, SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        Displaytablelec();
        Displaytablelab();
        Displaytablemang();
    }

     private void Displaytablelec() throws ClassNotFoundException, SQLException{
        try{
             Connection con = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL="jdbc:sqlserver://localhost:1433;databaseName=PDB;user=admin;password=2018030020";
        con=DriverManager.getConnection(connectionURL);
        String sql = "SELECT * FROM Lec";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        lec_table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
     private void Displaytablelab() throws ClassNotFoundException, SQLException{
        try{
             Connection con = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL="jdbc:sqlserver://localhost:1433;databaseName=PDB;user=admin;password=2018030020";
        con=DriverManager.getConnection(connectionURL);
        String sql = "SELECT * FROM lab";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        lab_table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
     private void Displaytablemang() throws ClassNotFoundException, SQLException{
        try{
             Connection con = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL="jdbc:sqlserver://localhost:1433;databaseName=PDB;user=admin;password=2018030020";
        con=DriverManager.getConnection(connectionURL);
        String sql = "SELECT * FROM mang";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        mang_table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jrexit = new javax.swing.JLabel();
        jrmin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lecremove = new javax.swing.JButton();
        labB = new javax.swing.JButton();
        lecadd = new javax.swing.JButton();
        jrbback = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lec_table = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        mangadd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        mangremove = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lab_table = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        mang_table = new javax.swing.JTable();
        labadd = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        labremove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rooms Control");

        jrexit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrexit.setForeground(new java.awt.Color(255, 255, 255));
        jrexit.setText("X");
        jrexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrexitMouseClicked(evt);
            }
        });

        jrmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jrmin.setForeground(new java.awt.Color(255, 255, 255));
        jrmin.setText("-");
        jrmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrexit)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrexit))
            .addComponent(jrmin, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        lecremove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lecremove.setText("Remove");
        lecremove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lecremoveMouseClicked(evt);
            }
        });

        labB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labB.setText("Update");
        labB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labBMouseClicked(evt);
            }
        });

        lecadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lecadd.setText("Add");
        lecadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lecaddMouseClicked(evt);
            }
        });
        lecadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecaddActionPerformed(evt);
            }
        });

        jrbback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbback.setText("Back");
        jrbback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbbackMouseClicked(evt);
            }
        });

        lec_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        lec_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lec_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lec_table);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lecture Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Attachment");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lab Number");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Device Number");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Device OS");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Device Power");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Manager Name");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Manager Department");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Room Number");

        mangadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mangadd.setText("Add");
        mangadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mangaddMouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Update");

        mangremove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mangremove.setText("Remove");
        mangremove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mangremoveMouseClicked(evt);
            }
        });

        lab_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        lab_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lab_table);

        mang_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        mang_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mang_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(mang_table);

        labadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labadd.setText("Add");
        labadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labaddMouseClicked(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Update");

        labremove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labremove.setText("Remove");
        labremove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labremoveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(lecadd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labB)
                        .addGap(18, 18, 18)
                        .addComponent(lecremove))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(mangadd)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(mangremove))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(218, 218, 218)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(181, 181, 181)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField3)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(labadd)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton5)
                                    .addGap(18, 18, 18)
                                    .addComponent(labremove))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jrbback))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lecadd)
                            .addComponent(labB)
                            .addComponent(lecremove))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labadd)
                    .addComponent(jButton5)
                    .addComponent(labremove))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mangadd)
                            .addComponent(jButton2)
                            .addComponent(mangremove))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jrbback)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrexitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jrexitMouseClicked

    private void jrminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrminMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jrminMouseClicked

    private void jrbbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbbackMouseClicked
        Acontrol bk=new Acontrol();
        bk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jrbbackMouseClicked

    private void lecremoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecremoveMouseClicked
       try{
            String sql="DELETE FROM Lec WHERE Lec_Number=?";
            String connectionURL="jdbc:sqlserver://localhost:1433;databaseName=PDB;user=admin;password=2018030020";
            con=DriverManager.getConnection(connectionURL);
            ps=con.prepareStatement(sql);
            ps.setString(1,jTextField1.getText());
            ps.executeUpdate();
            Displaytablelec();
        }
        catch(SQLException |HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Acourse.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_lecremoveMouseClicked

    private void labBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labBMouseClicked
        
    }//GEN-LAST:event_labBMouseClicked

    private void lecaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecaddMouseClicked
        try{
            String sql="INSERT INTO Lec (Lec_Number,Attachment) VALUES (?,?)";
            String connectionURL="jdbc:sqlserver://localhost:1433;databaseName=PDB;user=admin;password=2018030020";
            con=DriverManager.getConnection(connectionURL);
            ps=con.prepareStatement(sql);
            ps.setString(1,jTextField1.getText());
            ps.setString(2,jTextField2.getText());
            ps.executeUpdate();
            Displaytablelec();
        }
        catch(SQLException |HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Acourse.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_lecaddMouseClicked

    private void lecaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lecaddActionPerformed

    private void lec_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lec_tableMouseClicked
        int i = lec_table.getSelectedRow();
        TableModel model = lec_table.getModel();
        jTextField1.setText(model.getValueAt(i, 0).toString());
        jTextField2.setText(model.getValueAt(i, 1).toString());
    }//GEN-LAST:event_lec_tableMouseClicked

    private void lab_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_tableMouseClicked
        int i = lab_table.getSelectedRow();
        TableModel model = lab_table.getModel();
        jTextField3.setText(model.getValueAt(i, 0).toString());
        jTextField4.setText(model.getValueAt(i, 1).toString());
        jTextField5.setText(model.getValueAt(i, 2).toString());
        jTextField6.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_lab_tableMouseClicked

    private void mang_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mang_tableMouseClicked
        int i = mang_table.getSelectedRow();
        TableModel model = mang_table.getModel();
        jTextField7.setText(model.getValueAt(i, 0).toString());
        jTextField8.setText(model.getValueAt(i, 1).toString());
        jTextField9.setText(model.getValueAt(i, 2).toString());
    }//GEN-LAST:event_mang_tableMouseClicked

    private void labaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labaddMouseClicked
        try{
            String sql="INSERT INTO lab (lab_number,Device_number,Device_OS,Device_Power) VALUES (?,?,?,?)";
            String connectionURL="jdbc:sqlserver://localhost:1433;databaseName=PDB;user=admin;password=2018030020";
            con=DriverManager.getConnection(connectionURL);
            ps=con.prepareStatement(sql);
            ps.setString(1,jTextField3.getText());
            ps.setString(2,jTextField4.getText());
            ps.setString(3,jTextField5.getText());
            ps.setString(4,jTextField6.getText());
            ps.executeUpdate();
            Displaytablelab();
        }
        catch(SQLException |HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Acourse.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_labaddMouseClicked

    private void labremoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labremoveMouseClicked
            try{
            String sql="DELETE FROM lab WHERE Device_number=?";
            String connectionURL="jdbc:sqlserver://localhost:1433;databaseName=PDB;user=admin;password=2018030020";
            con=DriverManager.getConnection(connectionURL);
            ps=con.prepareStatement(sql);
            ps.setString(1,jTextField4.getText());
            ps.executeUpdate();
            Displaytablelab();
        }
        catch(SQLException |HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Acourse.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }//GEN-LAST:event_labremoveMouseClicked

    private void mangaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mangaddMouseClicked
        try{
            String sql="INSERT INTO mang (manager_name,manager_department,room_number) VALUES (?,?,?)";
            String connectionURL="jdbc:sqlserver://localhost:1433;databaseName=PDB;user=admin;password=2018030020";
            con=DriverManager.getConnection(connectionURL);
            ps=con.prepareStatement(sql);
            ps.setString(1,jTextField7.getText());
            ps.setString(2,jTextField8.getText());
            ps.setString(3,jTextField9.getText());
            ps.executeUpdate();
            Displaytablemang();
        }
        catch(SQLException |HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Acourse.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_mangaddMouseClicked

    private void mangremoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mangremoveMouseClicked
           try{
            String sql="DELETE FROM mang WHERE manager_name=?";
            String connectionURL="jdbc:sqlserver://localhost:1433;databaseName=PDB;user=admin;password=2018030020";
            con=DriverManager.getConnection(connectionURL);
            ps=con.prepareStatement(sql);
            ps.setString(1,jTextField7.getText());
            ps.executeUpdate();
            Displaytablemang();
        }
        catch(SQLException |HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Acourse.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_mangremoveMouseClicked

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
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton jrbback;
    private javax.swing.JLabel jrexit;
    private javax.swing.JLabel jrmin;
    private javax.swing.JButton labB;
    private javax.swing.JTable lab_table;
    private javax.swing.JButton labadd;
    private javax.swing.JButton labremove;
    private javax.swing.JTable lec_table;
    private javax.swing.JButton lecadd;
    private javax.swing.JButton lecremove;
    private javax.swing.JTable mang_table;
    private javax.swing.JButton mangadd;
    private javax.swing.JButton mangremove;
    // End of variables declaration//GEN-END:variables
}
