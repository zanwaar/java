/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tokosembakoberkah.view.Navigation;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import tokosembakoberkah.MainFrame;

/**
 *
 * @author Lenovo
 */
public class Navigation extends javax.swing.JPanel {

    /**
     * Creates new form Navigation
     */
    private JButton activeButton; // Tombol aktif saat ini
    public Navigation() {
        initComponents();
        activeButton = dahsboard; // Menginisialisasi tombol aktif tes
        setActiveButton(dahsboard); // Mengatur warna latar belakang awal
    }
    private void setActiveButton(JButton button) {
        // Mengubah warna latar belakang tombol aktif sebelumnya (jika ada)
        if (activeButton != null) {
            activeButton.setBackground(Color.white);
            activeButton.setForeground(Color.DARK_GRAY);
        }

        // Mengatur warna latar belakang tombol yang baru menjadi berbeda
        button.setBackground(Color.blue);
 button.setForeground(Color.WHITE);
        // Mengatur tombol yang baru sebagai tombol aktif
        activeButton = button;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dahsboard = new javax.swing.JButton();
        Transaksi = new javax.swing.JButton();
        Barang = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(java.awt.Color.darkGray);

        dahsboard.setText("Dashboard");
        dahsboard.setFocusPainted(false);
        dahsboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dahsboardActionPerformed(evt);
            }
        });

        Transaksi.setText("Transaksi");
        Transaksi.setFocusPainted(false);
        Transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransaksiActionPerformed(evt);
            }
        });

        Barang.setText("Barang");
        Barang.setFocusPainted(false);
        Barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarangActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.setFocusPainted(false);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PT TOKO SEMBAKO BERKAH");
        jLabel1.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Transaksi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Barang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dahsboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(102, 102, 102)
                .addComponent(dahsboard, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Barang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(321, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarangActionPerformed
        // TODO add your handling code here:
        MainFrame mainFrame = (MainFrame) SwingUtilities.getWindowAncestor(this);
        mainFrame.changeContentPanel("barang");

        setActiveButton(Barang); // Mengatur tombol dahsboard sebagai tombol aktif
    }//GEN-LAST:event_BarangActionPerformed

    private void TransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransaksiActionPerformed
        // TODO add your handling code here:
               MainFrame mainFrame = (MainFrame) SwingUtilities.getWindowAncestor(this);
        mainFrame.changeContentPanel("transaksi");

        setActiveButton(Transaksi); // Mengatur tombol dahsboard sebagai tombol aktif
    }//GEN-LAST:event_TransaksiActionPerformed

    private void dahsboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dahsboardActionPerformed
        // TODO add your handling code here:
             MainFrame mainFrame = (MainFrame) SwingUtilities.getWindowAncestor(this);
        mainFrame.changeContentPanel("dashboard");

        setActiveButton(dahsboard); // Mengatur tombol dahsboard sebagai tombol aktif
    }//GEN-LAST:event_dahsboardActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Barang;
    private javax.swing.JButton Transaksi;
    private javax.swing.JButton dahsboard;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
