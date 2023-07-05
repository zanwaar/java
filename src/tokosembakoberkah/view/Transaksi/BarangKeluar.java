/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tokosembakoberkah.view.Transaksi;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import tokosembakoberkah.MainFrame;

/**
 *
 * @author Lenovo
 */
public class BarangKeluar extends javax.swing.JPanel {

    /**
     * Creates new form BarangKeluar
     */
    public BarangKeluar() {
        initComponents();
//               updateNomorTransaksi();
        fieldHarga.setEditable(false);
        fieldSubTotal.setEditable(false);
        fieldNamaBarang.setEditable(false);
        fieldKategori.setEditable(false);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Format tanggal (misalnya: 01/07/2023)
        String formattedDate = sdf.format(date);
        fieldTgl.setText(formattedDate);
        fieldTgl.setEditable(false);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        getsessionNama = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        fieldJumlah = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TambahList = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        fieldNamaBarang = new javax.swing.JTextField();
        fieldHarga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fieldKategori = new javax.swing.JTextField();
        fieldSubTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeltransaksi = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        fieldNamaBarang1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        fieldTgl = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(20, 49, 73));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("TRANSAKSI / BARANG KELUAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        getsessionNama.setText("welcome januar samjid");

        jButton1.setText("logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(403, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getsessionNama, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(getsessionNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);

        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        fieldJumlah.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        fieldJumlah.setToolTipText("");
        fieldJumlah.setMargin(new java.awt.Insets(2, 5, 2, 5));
        fieldJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldJumlahKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Nama Barang");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Harga");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Jumlah");

        TambahList.setText("Tambah ke list");
        TambahList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahListActionPerformed(evt);
            }
        });

        jButton5.setText("Pilih Barang");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        fieldNamaBarang.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        fieldNamaBarang.setToolTipText("");
        fieldNamaBarang.setMargin(new java.awt.Insets(2, 5, 2, 5));

        fieldHarga.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        fieldHarga.setToolTipText("");
        fieldHarga.setMargin(new java.awt.Insets(2, 5, 2, 5));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Kategori");

        fieldKategori.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        fieldKategori.setToolTipText("");
        fieldKategori.setMargin(new java.awt.Insets(2, 5, 2, 5));

        fieldSubTotal.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        fieldSubTotal.setToolTipText("");
        fieldSubTotal.setMargin(new java.awt.Insets(2, 5, 2, 5));

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("Sub Total");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldJumlah)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(fieldNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TambahList))
                    .addComponent(fieldHarga)
                    .addComponent(jLabel5)
                    .addComponent(fieldKategori)
                    .addComponent(fieldSubTotal)
                    .addComponent(jLabel6))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(fieldNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TambahList)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setLayout(new java.awt.GridLayout());

        tabeltransaksi.setBackground(new java.awt.Color(20, 49, 73));
        tabeltransaksi.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tabeltransaksi.setForeground(new java.awt.Color(255, 255, 255));
        tabeltransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "NAMA BARANG", "KATEGORI", "JUMLAH", "SUB TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabeltransaksi.setFocusable(false);
        tabeltransaksi.setGridColor(new java.awt.Color(255, 255, 255));
        tabeltransaksi.setRowHeight(25);
        tabeltransaksi.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tabeltransaksi.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tabeltransaksi.setShowGrid(true);
        tabeltransaksi.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tabeltransaksi);

        jPanel7.add(jScrollPane1);

        jButton4.setText("hapus item");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Simpan Data");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        fieldNamaBarang1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        fieldNamaBarang1.setToolTipText("");
        fieldNamaBarang1.setMargin(new java.awt.Insets(2, 5, 2, 5));

        jButton7.setText("Plih");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel9.setText("Tanggal");

        fieldTgl.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        fieldTgl.setToolTipText("");
        fieldTgl.setMargin(new java.awt.Insets(2, 5, 2, 5));

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel8.setText("Supplier");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(fieldNamaBarang1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(fieldNamaBarang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(fieldTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton6))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setText("Transaksi / Barang Keluar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(658, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        logoutUser();
        JOptionPane.showMessageDialog(this, "Berhasil Logout");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MainFrame mainFrame = (MainFrame) SwingUtilities.getWindowAncestor(this);
        mainFrame.changeContentPanel("transaksi");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fieldJumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldJumlahKeyReleased
        // TODO add your handling code here:
        String jumlahText = fieldJumlah.getText();

        // Memeriksa apakah nilai jumlah valid (misalnya angka)
        try {
            int jumlah = Integer.parseInt(jumlahText);
            int harga = Integer.parseInt(fieldHarga.getText());

            // Menghitung subtotal
            int subtotal = jumlah * harga;

            // Mengatur nilai subtotal ke fieldSubTotal
            fieldSubTotal.setText(String.valueOf(subtotal));
        } catch (NumberFormatException e) {
            // Penanganan jika nilai jumlah tidak valid
            // Misalnya, menampilkan pesan kesalahan atau mengatur subtotal menjadi 0
            fieldSubTotal.setText("0");
        }
    }//GEN-LAST:event_fieldJumlahKeyReleased

    private void TambahListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahListActionPerformed
        // TODO add your handling code here:
        Tambahlist();
    }//GEN-LAST:event_TambahListActionPerformed
    private int nomorTransaksi = 1;
    private int nomorTransaksiAwal = 1;

    private void Tambahlist() {
        String namaBarang = fieldNamaBarang.getText();
        String kategori = fieldKategori.getText();
        int jumlah = Integer.parseInt(fieldJumlah.getText());
        int subTotal = Integer.parseInt(fieldSubTotal.getText());

        // Tambahkan baris baru pada tabel transaksi
        DefaultTableModel model = (DefaultTableModel) tabeltransaksi.getModel();
        model.addRow(new Object[]{nomorTransaksi, namaBarang, kategori, jumlah, subTotal});

        // Tingkatkan nomor transaksi
        nomorTransaksi++;

        // Reset nilai pada field-field
        fieldNamaBarang.setText("");
        fieldKategori.setText("");
        fieldHarga.setText("");
        fieldJumlah.setText("");
        fieldSubTotal.setText("");
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:\
        String type = "BarangK";
        PilihBarangJDialog dialog = new PilihBarangJDialog(null, true, type);
        dialog.setTransaksiPanelk(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed
    public void setBarangData(String namaBarang, String kategori, int harga) {
        fieldNamaBarang.setText(namaBarang);
        fieldKategori.setText(kategori);
        fieldHarga.setText(String.valueOf(harga));

    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        deleteData();
        updateNomorTransaksi();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void deleteData() {
        int selectedRow = tabeltransaksi.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tabeltransaksi.getModel();
        if (selectedRow != -1) {
//            int id = (int) model.getValueAt(selectedRow, 0);
            int confirmation = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);

            if (confirmation == JOptionPane.YES_OPTION) {
                model.removeRow(selectedRow);
                JOptionPane.showMessageDialog(this, "Data Berhasil dihapus", "Success", JOptionPane.PLAIN_MESSAGE);
                updateNomorTransaksi();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih baris data yang ingin dihapus.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void updateNomorTransaksi() {
        DefaultTableModel model = (DefaultTableModel) tabeltransaksi.getModel();
        int rowCount = model.getRowCount();
        if (rowCount > 0) {
            // Mendapatkan nomor transaksi terakhir
            int lastTransaksi = (int) model.getValueAt(rowCount - 1, 0);

            // Mengatur nomor transaksi berikutnya
            nomorTransaksi = lastTransaksi + 1;
        } else {
            // Jika tidak ada data, kembali ke nomor transaksi awal
            nomorTransaksi = nomorTransaksiAwal;
        }
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TambahList;
    private javax.swing.JTextField fieldHarga;
    private javax.swing.JTextField fieldJumlah;
    private javax.swing.JTextField fieldKategori;
    private javax.swing.JTextField fieldNamaBarang;
    private javax.swing.JTextField fieldNamaBarang1;
    private javax.swing.JTextField fieldSubTotal;
    private javax.swing.JTextField fieldTgl;
    private javax.swing.JLabel getsessionNama;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabeltransaksi;
    // End of variables declaration//GEN-END:variables
}
