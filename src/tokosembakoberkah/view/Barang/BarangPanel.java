/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tokosembakoberkah.view.Barang;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tokosembakoberkah.controller.BarangController;
import tokosembakoberkah.model.BarangModel;

/**
 *
 * @author Lenovo
 */
public class BarangPanel extends javax.swing.JPanel {

    /**
     * Creates new form BarangPanel
     */
    private final BarangController barangController;
    private int currentPage = 1;
    private final int rowsPerPage = 10;
    
    public BarangPanel() {
        initComponents();
        barangController = new BarangController();
        loadDataBarang();
        updatePaginationButtons();
        count();
    }
    private void count() {
        int total = barangController.getBarangCount();
        count.setText("Jumlah Data : " + total);
    }

    private void loadDataBarang() {
        DefaultTableModel model = (DefaultTableModel) tabelbarang.getModel();
        model.setRowCount(0);

        // Mendapatkan daftar barang berdasarkan halaman
        List<BarangModel> barangList = barangController.getBarangByPage(currentPage, rowsPerPage);

        // Tambahkan data barang ke dalam tabel
        int nomorUrut = (currentPage - 1) * rowsPerPage + 1;
        for (BarangModel barang : barangList) {
            Object[] rowData = {barang.getId(), nomorUrut, barang.getKode(), barang.getNama(), barang.getKategori(), barang.getSatuan(), barang.getStok(), barang.getHargaSatuan()};
            model.addRow(rowData);
            nomorUrut++;
        }
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
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelbarang = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        page = new javax.swing.JLabel();
        count = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("MASTER BARANG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("welcome januar samjid");

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
                .addContainerGap(397, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        tabelbarang.setBackground(new java.awt.Color(20, 49, 73));
        tabelbarang.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tabelbarang.setForeground(new java.awt.Color(255, 255, 255));
        tabelbarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "1", "SQS", "SQS", "QSQS", "SQS", "QS", "QSQ"},
                {null, "2", "WD", "SQW", "QW", "QS", "SQS", "SSQS"},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "NO", "KODE", "NAMA", "KATEGORI", "SATUAN", "STOK", "HARGA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelbarang.setFocusable(false);
        tabelbarang.setGridColor(new java.awt.Color(255, 255, 255));
        tabelbarang.setRowHeight(25);
        tabelbarang.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tabelbarang.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tabelbarang.setShowGrid(true);
        tabelbarang.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tabelbarang);
        if (tabelbarang.getColumnModel().getColumnCount() > 0) {
            tabelbarang.getColumnModel().getColumn(0).setMinWidth(0);
            tabelbarang.getColumnModel().getColumn(0).setPreferredWidth(0);
            tabelbarang.getColumnModel().getColumn(0).setMaxWidth(0);
            tabelbarang.getColumnModel().getColumn(1).setMinWidth(50);
            tabelbarang.getColumnModel().getColumn(1).setPreferredWidth(50);
            tabelbarang.getColumnModel().getColumn(1).setMaxWidth(50);
        }

        jPanel5.add(jScrollPane1);

        btnEdit.setBackground(new java.awt.Color(255, 153, 51));
        btnEdit.setForeground(new java.awt.Color(0, 0, 0));
        btnEdit.setText("EDIT  Data Barang");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        prevButton.setText("jButton4");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        nextButton.setText("jButton4");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        page.setText("jLabel2");

        count.setText("jLabel2");

        btnHapus.setBackground(new java.awt.Color(255, 102, 102));
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus Data Barang");
        btnHapus.setFocusPainted(false);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnTambah.setBackground(new java.awt.Color(0, 153, 153));
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("TAMBAH Data Barang");
        btnTambah.setFocusPainted(false);
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(prevButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextButton)
                        .addGap(18, 18, 18)
                        .addComponent(page)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(count)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prevButton)
                    .addComponent(nextButton)
                    .addComponent(page)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(count)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1065, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int selectedRow = tabelbarang.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan diedit", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return; // Keluar dari fungsi setelah menampilkan pesan dialog
        }
        DefaultTableModel model = (DefaultTableModel) tabelbarang.getModel();
        int id = (int) model.getValueAt(selectedRow, 0);
        EditDialog editForm = new EditDialog(null, true, id);
        editForm.setVisible(true);
        loadDataBarang();
        updatePaginationButtons();
        count();
    }//GEN-LAST:event_btnEditActionPerformed

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        // TODO add your handling code here:
        if (currentPage > 1) {
            currentPage--;
            loadDataBarang();
            updatePaginationButtons();
        }
    }//GEN-LAST:event_prevButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        int totalRows = barangController.getBarangCount();
        int totalPages = (int) Math.ceil((double) totalRows / rowsPerPage);

        if (currentPage < totalPages) {
            currentPage++;
            loadDataBarang();
            updatePaginationButtons();
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        deleteDataBarang();
        loadDataBarang();
        updatePaginationButtons();
        count();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void deleteDataBarang() {
        int selectedRow = tabelbarang.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tabelbarang.getModel();
        if (selectedRow != -1) {

            int id = (int) model.getValueAt(selectedRow, 0);

            int confirmation = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);

            if (confirmation == JOptionPane.YES_OPTION) {
                barangController.deleteBarang(id);
                model.removeRow(selectedRow);
                JOptionPane.showMessageDialog(this, "Data Berhasil dihapus", "Success", JOptionPane.PLAIN_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih baris data yang ingin dihapus.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        AddDialog addDialog = new AddDialog(null, true);
        addDialog.setVisible(true);
        loadDataBarang(); // Refresh the table after adding data
        updatePaginationButtons();
        count();
    }//GEN-LAST:event_btnTambahActionPerformed
    private void updatePaginationButtons() {
        int totalRows = barangController.getBarangCount();
        int totalPages = (int) Math.ceil((double) totalRows / rowsPerPage);
        System.out.println("total Rows: " + totalRows + "Total Page " + totalPages);
        int prev = 1;
        int next = 0;
        page.setText("Total Pages " + totalPages);
        prevButton.setText("Page " + (currentPage - prev));
        nextButton.setText("Page " + (currentPage + next));
        if (currentPage <= 1) {
            prevButton.setEnabled(false);

        } else {
            prevButton.setEnabled(true);
        }

        if (currentPage >= totalPages) {
            nextButton.setEnabled(false);
        } else {
            nextButton.setEnabled(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel count;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel page;
    private javax.swing.JButton prevButton;
    private javax.swing.JTable tabelbarang;
    // End of variables declaration//GEN-END:variables
}