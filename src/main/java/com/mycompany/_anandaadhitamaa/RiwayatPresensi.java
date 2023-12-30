/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany._anandaadhitamaa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class RiwayatPresensi extends javax.swing.JInternalFrame {
    Connection conn;
    Statement stmt;
    ResultSet rs;

    /**
     * Creates new form RiwayatPresensi
     */
    public RiwayatPresensi() {
        initComponents();
        this.setBorder(null);
        BasicInternalFrameUI decorate = (BasicInternalFrameUI) this.getUI();
        decorate.setNorthPane(null);
        refresh();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        hadir = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        izin = new javax.swing.JButton();
        alpha = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        riwayat = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        id1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        riwayat1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        keluar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Riwayat Presensi");

        jLabel2.setText("ID");
        jLabel2.setToolTipText("");

        hadir.setText("Hadir");
        hadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hadirActionPerformed(evt);
            }
        });

        izin.setText("Izin");
        izin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izinActionPerformed(evt);
            }
        });

        alpha.setText("Alpha");
        alpha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alphaActionPerformed(evt);
            }
        });

        riwayat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(riwayat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(hadir)
                                .addGap(18, 18, 18)
                                .addComponent(izin)
                                .addGap(18, 18, 18)
                                .addComponent(alpha))
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 244, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alpha)
                    .addComponent(izin)
                    .addComponent(hadir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Masuk", jPanel1);

        riwayat1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(riwayat1);

        jLabel3.setText("ID");
        jLabel3.setToolTipText("");

        keluar.setText("Selesai");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(keluar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(250, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(keluar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Keluar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hadirActionPerformed
        // TODO add your handling code here:
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select 1 from peserta_didik where id = '" + id.getText() + "'");
            if (!rs.next()) { JOptionPane.showMessageDialog(this, "ID peserta didik tidak valid"); rs.close(); return; }
            
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select 1 from presensi where id_pesertadidik = '" + id.getText() + "' and tanggal_presensi = CURDATE() and status_presensi IS NOT NULL");
            if (rs.next()) { JOptionPane.showMessageDialog(this, "Data presensi sudah ada"); rs.close(); return; }
            
            stmt = conn.createStatement();
            stmt.executeUpdate("insert into presensi (uuid, id_pesertadidik, tanggal_presensi, waktu_masuk, status_presensi, keterangan) values (md5(NOW()), '" + id.getText() + "', CURDATE(), CURRENT_TIME(), 'Masuk', 'Sedang KBM')");
            stmt.close();
            
            id.setText("");
            JOptionPane.showMessageDialog(this, "Presensi berhasil");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
        refresh();
    }//GEN-LAST:event_hadirActionPerformed

    private void izinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izinActionPerformed
        // TODO add your handling code here:
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select 1 from peserta_didik where id = '" + id.getText() + "'");
            if (!rs.next()) { JOptionPane.showMessageDialog(this, "ID peserta didik tidak valid"); rs.close(); return; }
            
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select 1 from presensi where id_pesertadidik = '" + id.getText() + "' and tanggal_presensi = CURDATE() and status_presensi IS NOT NULL");
            if (rs.next()) { JOptionPane.showMessageDialog(this, "Data presensi sudah ada"); rs.close(); return; }
            
            stmt = conn.createStatement();
            stmt.executeUpdate("insert into presensi (uuid, id_pesertadidik, tanggal_presensi, waktu_masuk, waktu_Keluar, status_presensi, keterangan) values (md5(NOW()), '" + id.getText() + "', CURDATE(), CURRENT_TIME(), CURRENT_TIME(), 'Izin', 'Izin Tidak Masuk')");
            stmt.close();
            
            id.setText("");
            JOptionPane.showMessageDialog(this, "Presensi berhasil");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
        refresh();
    }//GEN-LAST:event_izinActionPerformed

    private void alphaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alphaActionPerformed
        // TODO add your handling code here:
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select 1 from peserta_didik where id = '" + id.getText() + "'");
            if (!rs.next()) { JOptionPane.showMessageDialog(this, "ID peserta didik tidak valid"); rs.close(); return; }
            
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select 1 from presensi where id_pesertadidik = '" + id.getText() + "' and tanggal_presensi = CURDATE() and status_presensi IS NOT NULL");
            if (rs.next()) { JOptionPane.showMessageDialog(this, "Data presensi sudah ada"); rs.close(); return; }
            
            stmt = conn.createStatement();
            stmt.executeUpdate("insert into presensi (uuid, id_pesertadidik, tanggal_presensi, waktu_masuk, waktu_keluar, status_presensi, keterangan) values (md5(NOW()), '" + id.getText() + "', CURDATE(), CURRENT_TIME(), CURRENT_TIME(), 'Alpha', 'Tanpa Keterangan')");
            stmt.close();
            
            id.setText("");
            JOptionPane.showMessageDialog(this, "Presensi berhasil");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
        refresh();
    }//GEN-LAST:event_alphaActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select 1 from peserta_didik where id = '" + id1.getText() + "'");
            if (!rs.next()) { JOptionPane.showMessageDialog(this, "ID peserta didik tidak valid"); rs.close(); return; }
            
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select 1 from presensi where id_pesertadidik = '" + id1.getText() + "' and tanggal_presensi = CURDATE() and status_presensi = 'Masuk'");
            if (!rs.next()) { JOptionPane.showMessageDialog(this, "Peserta didik belum masuk"); rs.close(); return; }
            
            stmt = conn.createStatement();
            stmt.executeUpdate("update presensi set waktu_keluar = CURRENT_TIME(), keterangan = 'Selesai KBM' where id_pesertadidik = '" + id1.getText() + "'");
            stmt.close();
            
            id1.setText("");
            JOptionPane.showMessageDialog(this, "Presensi berhasil");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
        refresh();
    }//GEN-LAST:event_keluarActionPerformed

    private void refresh(){
        try {
            conn = LoginScereen.conn;
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select id_pesertadidik, (select nama from peserta_didik where id = id_pesertadidik) as 'Nama',tanggal_presensi,waktu_masuk,keterangan from presensi ORDER BY tanggal_presensi DESC LIMIT 20");
            
            DefaultTableModel model = new DefaultTableModel();
            
            model.addColumn("ID");
            model.addColumn("Nama");
            model.addColumn("Tanggal");
            model.addColumn("Masuk");
            model.addColumn("Keterangan");
            
            riwayat.setModel(model);
            
            while (rs.next()) {
                Object[] rowData = new Object[rs.getMetaData().getColumnCount()];
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) { rowData[i - 1] = rs.getObject(i); }
                model.addRow(rowData);
            }
            
            rs.close();
            stmt.close();
        } catch (SQLException e) { System.out.println(e.getMessage()); }
        
        try {
            conn = LoginScereen.conn;
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select id_pesertadidik, (select nama from peserta_didik where id = id_pesertadidik) as 'Nama',tanggal_presensi,waktu_keluar,keterangan from presensi ORDER BY tanggal_presensi DESC LIMIT 20");
            
            DefaultTableModel model = new DefaultTableModel();
            
            model.addColumn("ID");
            model.addColumn("Nama");
            model.addColumn("Tanggal");
            model.addColumn("Keluar");
            model.addColumn("Keterangan");
            
            riwayat1.setModel(model);
            
            while (rs.next()) {
                Object[] rowData = new Object[rs.getMetaData().getColumnCount()];
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) { rowData[i - 1] = rs.getObject(i); }
                model.addRow(rowData);
            }
            
            rs.close();
            stmt.close();
        } catch (SQLException e) { System.out.println(e.getMessage()); }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alpha;
    private javax.swing.JButton hadir;
    private javax.swing.JTextField id;
    private javax.swing.JTextField id1;
    private javax.swing.JButton izin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton keluar;
    private javax.swing.JTable riwayat;
    private javax.swing.JTable riwayat1;
    // End of variables declaration//GEN-END:variables
}