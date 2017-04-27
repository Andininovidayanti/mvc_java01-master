/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.view;

import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
import java.util.List; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.swing.JButton; 
import javax.swing.JComboBox; 
import javax.swing.JOptionPane; 
import javax.swing.JTable; 
import javax.swing.JTextField; 
import javax.swing.table.DefaultTableModel; 
import pack.control.c_koneksi; 
import pack.control.controllerToko; 
import pack.model.m_toko; 

/**
 *
 * @author Andini Novidayanti
 */
public class home extends javax.swing.JFrame {
    controllerToko ctoko;
    List<m_toko>listdata = new ArrayList<>();

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        ctoko = new controllerToko (this);
        ctoko.isiTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtNama = new javax.swing.JTextField();
        TxtHarga = new javax.swing.JTextField();
        TxtKodee = new javax.swing.JTextField();
        CbJenis = new javax.swing.JComboBox<>();
        Btn_Ubah = new javax.swing.JButton();
        Btn_Bersih = new javax.swing.JButton();
        Btn_Hapus = new javax.swing.JButton();
        Btn_Keluar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        CbKategori = new javax.swing.JComboBox<>();
        Btn_Simpan = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        CbCari = new javax.swing.JComboBox<>();
        Btn_Cari = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Data Barang di Toko");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(410, 30, 300, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Admin Toko :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 10, 130, 40);

        txtNama.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txtNama);
        txtNama.setBounds(130, 10, 170, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 990, 100);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nama Barang");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(110, 100, 150, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Kategori Barang");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(110, 160, 160, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Jenis Packaging");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(110, 220, 160, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Harga");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(110, 280, 110, 20);
        jPanel2.add(TxtNama);
        TxtNama.setBounds(280, 90, 330, 40);
        jPanel2.add(TxtHarga);
        TxtHarga.setBounds(280, 270, 330, 40);
        jPanel2.add(TxtKodee);
        TxtKodee.setBounds(280, 30, 330, 40);

        CbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pack", "Plastik" }));
        jPanel2.add(CbJenis);
        CbJenis.setBounds(280, 210, 330, 40);

        Btn_Ubah.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_Ubah.setText("Ubah");
        Btn_Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UbahActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Ubah);
        Btn_Ubah.setBounds(730, 90, 140, 40);

        Btn_Bersih.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_Bersih.setText("Bersihkan");
        Btn_Bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BersihActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Bersih);
        Btn_Bersih.setBounds(730, 150, 140, 40);

        Btn_Hapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_Hapus.setText("Hapus");
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Hapus);
        Btn_Hapus.setBounds(730, 210, 140, 40);

        Btn_Keluar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_Keluar.setText("Keluar");
        Btn_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_KeluarActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Keluar);
        Btn_Keluar.setBounds(730, 270, 140, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Kode Barang");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(110, 40, 140, 20);

        CbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Barang lainnya" }));
        jPanel2.add(CbKategori);
        CbKategori.setBounds(280, 150, 330, 40);

        Btn_Simpan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_Simpan.setText("Simpan");
        Btn_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SimpanActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Simpan);
        Btn_Simpan.setBounds(730, 30, 140, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 110, 990, 340);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Pencarian Berdasarkan Kategori Makanan");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(160, 460, 310, 30);

        CbCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(CbCari);
        CbCari.setBounds(470, 460, 180, 30);

        Btn_Cari.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_Cari.setText("Cari");
        Btn_Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CariActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Cari);
        Btn_Cari.setBounds(680, 460, 100, 30);

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setLayout(null);

        Tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Kategori", "Packaging", "Harga"
            }
        ));
        jScrollPane1.setViewportView(Tabel1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(170, 10, 690, 320);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 510, 990, 340);

        setSize(new java.awt.Dimension(1006, 910));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SimpanActionPerformed
        // TODO add your handling code here:
        ctoko.SimpanData();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_SimpanActionPerformed

    private void Btn_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UbahActionPerformed
        // TODO add your handling code here:
        ctoko.Ubah();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_UbahActionPerformed

    private void Btn_BersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BersihActionPerformed
        // TODO add your handling code here:
        ctoko.Reset();
    }//GEN-LAST:event_Btn_BersihActionPerformed

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
        // TODO add your handling code here:
        ctoko.Hapus();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_HapusActionPerformed

    private void Btn_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_KeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Btn_KeluarActionPerformed

    private void Btn_CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CariActionPerformed
        // TODO add your handling code here:
        ctoko.CariKategori();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_CariActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String Halouser = login.useraktif;
        txtNama.setText(Halouser);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    public Object getTxtKode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public JTextField getTxtKodee(){
                return TxtKodee;
    }
    public JTextField getTxtNama(){
        return TxtNama;
    }
    public JTextField getTxtHarga(){
        return TxtHarga;
    }
    public JComboBox getCbKategori(){
        return CbKategori;
    }
    public JComboBox getCbJenis(){
        return CbJenis;
    }
    public JComboBox getCbCariKategori(){
        return CbCari;
    }
    public JButton getButtonHapus(){
        return Btn_Hapus;
    }
    
    public JButton getButtonBersih(){
        return Btn_Bersih;
    }
    public JButton getButtonSimpan(){
        return Btn_Simpan;
    }
    public JButton getButtonUbah(){
        return Btn_Ubah;
    }
    public JButton getButtonKeluar(){
        return Btn_Keluar;
    }
    public JTable getTableData(){
        return Tabel1;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Bersih;
    private javax.swing.JButton Btn_Cari;
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Keluar;
    private javax.swing.JButton Btn_Simpan;
    private javax.swing.JButton Btn_Ubah;
    private javax.swing.JComboBox<String> CbCari;
    private javax.swing.JComboBox<String> CbJenis;
    private javax.swing.JComboBox<String> CbKategori;
    private javax.swing.JTable Tabel1;
    private javax.swing.JTextField TxtHarga;
    private javax.swing.JTextField TxtKodee;
    private javax.swing.JTextField TxtNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtNama;
    // End of variables declaration//GEN-END:variables
}
