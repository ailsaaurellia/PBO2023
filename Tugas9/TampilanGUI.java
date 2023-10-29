/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author Ailsa
 */
public class TampilanGUI extends javax.swing.JFrame {
    
private Timer refreshTimer;

public TampilanGUI() {
    try {
        dataBuku = new ArrayList<>();
        initComponents();
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/UTS_PBO_BUKU", "postgres", "Chanhee98");
        tampil(conn);

        // Membuat dan mengatur timer untuk auto-refresh setiap 5 detik (5000 milidetik)
        refreshTimer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tampil(conn);
            }
        });
        refreshTimer.start();
    } catch (SQLException ex) {
        Logger.getLogger(TampilanGUI.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
     public void peringatan(String pesan) {
        JOptionPane.showMessageDialog(rootPane, pesan);
    }
    ArrayList<Buku> dataBuku;

    private int masukkanData(Connection conn, String isbn, String judul_buku, String tahun_terbit, String penerbit_buku) throws SQLException {
        PreparedStatement pst = conn.prepareStatement("INSERT INTO buku (isbn, judul_buku, tahun_terbit, penerbit_buku) VALUES(?,?,?,?)");
        pst.setString(1, isbn);
        pst.setString(2, judul_buku);
        pst.setString(3, tahun_terbit);
        pst.setString(4, penerbit_buku);
        return pst.executeUpdate();
    }

    private int perbaruiData(Connection conn, String isbn, String judul_buku, String tahun_terbit, String penerbit_buku) throws SQLException {
        PreparedStatement pst = conn.prepareStatement("UPDATE buku SET judul_buku=?, tahun_terbit=?, penerbit_buku=? WHERE isbn=?");
        pst.setString(1, judul_buku);
        pst.setString(2, tahun_terbit);
        pst.setString(3, penerbit_buku);
        pst.setString(4, isbn);
        return pst.executeUpdate();
    }
    
    private int hapusData(Connection conn, String isbn) throws SQLException {
        PreparedStatement pst = conn.prepareStatement("DELETE FROM buku WHERE isbn = ?");
        pst.setString(1, isbn);
        return pst.executeUpdate();
    }

      private void tampil(Connection conn) {
        dataBuku.clear();
        try {
            String sql = "select * from buku";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Buku data = new Buku();
                data.setIsbn(String.valueOf(rs.getObject(1)));
                data.setJudul_buku(String.valueOf(rs.getObject(2)));
                data.setTahun_terbit(String.valueOf(rs.getObject(3)));
                data.setPenerbit_buku(String.valueOf(rs.getObject(4)));
                dataBuku.add(data);
            }
            DefaultTableModel model = (DefaultTableModel) jTableBuku.getModel();
            model.setRowCount(0);
            for (Buku data : dataBuku) {

                Object[] baris = new Object[4];
                baris[0] = data.getIsbn();
                baris[1] = data.getJudul_buku();
                baris[2] = data.getTahun_terbit();
                baris[3] = data.getPenerbit_buku();
                model.addRow(baris);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TampilanGUI.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jLabelIsbn = new javax.swing.JLabel();
        jLabelJudul = new javax.swing.JLabel();
        jLabelTahun = new javax.swing.JLabel();
        jLabelDaftar = new javax.swing.JLabel();
        jLabelPenerbit = new javax.swing.JLabel();
        jTextFieldjudul = new javax.swing.JTextField();
        jTextFieldisbn = new javax.swing.JTextField();
        jTextFieldtahun = new javax.swing.JTextField();
        jTextFieldpenerbit = new javax.swing.JTextField();
        jButtonSimpan = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jScrollPaneBuku = new javax.swing.JScrollPane();
        jTableBuku = new javax.swing.JTable();
        jButtonCetak = new javax.swing.JButton();
        jButtonUpload = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buku/WhatsApp Image 2023-10-22 at 21.21.07.jpeg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelIsbn.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabelIsbn.setText("ISBN");
        getContentPane().add(jLabelIsbn);
        jLabelIsbn.setBounds(240, 180, 100, 39);

        jLabelJudul.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabelJudul.setText("Judul Buku");
        getContentPane().add(jLabelJudul);
        jLabelJudul.setBounds(240, 230, 130, 39);

        jLabelTahun.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabelTahun.setText("Tahun Terbit");
        getContentPane().add(jLabelTahun);
        jLabelTahun.setBounds(240, 280, 170, 39);

        jLabelDaftar.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDaftar.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabelDaftar.setForeground(new java.awt.Color(102, 51, 0));
        jLabelDaftar.setText("DAFTAR BUKU");
        getContentPane().add(jLabelDaftar);
        jLabelDaftar.setBounds(680, 80, 450, 60);

        jLabelPenerbit.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabelPenerbit.setText("Penerbit Buku");
        getContentPane().add(jLabelPenerbit);
        jLabelPenerbit.setBounds(240, 330, 180, 39);

        jTextFieldjudul.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextFieldjudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldjudulActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldjudul);
        jTextFieldjudul.setBounds(520, 230, 270, 30);

        jTextFieldisbn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextFieldisbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldisbnActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldisbn);
        jTextFieldisbn.setBounds(520, 180, 270, 30);

        jTextFieldtahun.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextFieldtahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldtahunActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldtahun);
        jTextFieldtahun.setBounds(520, 280, 270, 30);

        jTextFieldpenerbit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextFieldpenerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldpenerbitActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldpenerbit);
        jTextFieldpenerbit.setBounds(520, 330, 270, 30);

        jButtonSimpan.setBackground(new java.awt.Color(0, 102, 102));
        jButtonSimpan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSimpan.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSimpan.setText("SIMPAN");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSimpan);
        jButtonSimpan.setBounds(460, 430, 130, 50);

        jButtonUpdate.setBackground(new java.awt.Color(255, 204, 0));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUpdate);
        jButtonUpdate.setBounds(680, 430, 130, 50);

        jButtonHapus.setBackground(new java.awt.Color(204, 153, 0));
        jButtonHapus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonHapus.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHapus.setText("HAPUS");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHapus);
        jButtonHapus.setBounds(880, 430, 130, 50);

        jTableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ISBN", "Judul Buku", "Tahun Terbit", "Penerbit"
            }
        ));
        jTableBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBukuMouseClicked(evt);
            }
        });
        jScrollPaneBuku.setViewportView(jTableBuku);

        getContentPane().add(jScrollPaneBuku);
        jScrollPaneBuku.setBounds(420, 530, 634, 160);

        jButtonCetak.setBackground(new java.awt.Color(255, 153, 153));
        jButtonCetak.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCetak.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCetak.setText("CETAK");
        jButtonCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCetakActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCetak);
        jButtonCetak.setBounds(140, 530, 190, 50);

        jButtonUpload.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonUpload.setText("UPLOAD");
        jButtonUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUploadActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUpload);
        jButtonUpload.setBounds(960, 260, 131, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ailsa\\Downloads\\WhatsApp Image 2023-10-22 at 21.21.07.jpeg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 0, 1600, 910);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldjudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldjudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldjudulActionPerformed

    private void jTextFieldisbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldisbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldisbnActionPerformed

    private void jTextFieldtahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldtahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldtahunActionPerformed

    private void jTextFieldpenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldpenerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldpenerbitActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        String isbn = jTextFieldisbn.getText().trim();
        String judul = jTextFieldjudul.getText();
        String tahun = jTextFieldtahun.getText();
        String penerbit = jTextFieldpenerbit.getText();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TugasBukuPU");
        EntityManager em = emf.createEntityManager();
        Buku_1 b = new Buku_1();
        b.setIsbn(isbn);
        b.setJudulBuku(judul);
        b.setTahunTerbit(tahun);
        b.setPenerbitBuku(penerbit);
        em.getTransaction().begin();
        em.merge(b);
        em.getTransaction().commit();

        jTextFieldisbn.setText("");
        jTextFieldjudul.setText("");
        jTextFieldtahun.setText("");
        jTextFieldpenerbit.setText("");

    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        // TODO add your handling code here:
        String isbn = jTextFieldisbn.getText().trim();
       
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TugasBukuPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Buku_1 b = em.find(Buku_1.class, isbn);
        em.remove(b);

        em.getTransaction().commit();


        jTextFieldisbn.setText("");
        jTextFieldjudul.setText("");
        jTextFieldtahun.setText("");
        jTextFieldpenerbit.setText("");
 
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        // TODO add your handling code here:
        String isbn = jTextFieldisbn.getText().trim();
        String judul = jTextFieldjudul.getText();
        String tahun = jTextFieldtahun.getText();
        String penerbit = jTextFieldpenerbit.getText();

        EntityManager entityManager = Persistence.createEntityManagerFactory("TugasBukuPU").createEntityManager();
        entityManager.getTransaction().begin();
        Buku_1 b = new Buku_1();
        b.setIsbn(isbn);
        b.setJudulBuku(judul);
        b.setTahunTerbit(tahun);
        b.setPenerbitBuku(penerbit);
        entityManager.persist(b);
        entityManager.getTransaction().commit();
        
        jTextFieldisbn.setText("");
        jTextFieldjudul.setText("");
        jTextFieldtahun.setText("");
        jTextFieldpenerbit.setText("");
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jTableBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBukuMouseClicked
        // TODO add your handling code here:
                int baris = jTableBuku.rowAtPoint(evt.getPoint());

        String isbn = jTableBuku.getValueAt(baris, 0).toString();
        jTextFieldisbn.setText(isbn);

        String judul = jTableBuku.getValueAt(baris, 1).toString();
        jTextFieldjudul.setText(judul);

        String tahun = jTableBuku.getValueAt(baris, 2).toString();
        jTextFieldtahun.setText(tahun);

        String penerbit= jTableBuku.getValueAt(baris, 3).toString();
        jTextFieldpenerbit.setText(penerbit);
    }//GEN-LAST:event_jTableBukuMouseClicked

    private void jButtonCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCetakActionPerformed

        InputStream reportTemplate = Buku_1.class.getResourceAsStream("Buku.jrxml");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TugasBukuPU");
        EntityManager em = emf.createEntityManager();
        List<Buku_1> data = em.createQuery("SELECT b FROM Buku_1 b", Buku_1.class).getResultList();
        JasperReport jasperReport;
        
        try {
            jasperReport = JasperCompileManager.compileReport(reportTemplate);
            Map<String, Object> parameters = null;
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JRBeanCollectionDataSource(dataBuku));
            JasperViewer.viewReport(jasperPrint, false);

        } catch (JRException ex) {
            ex.printStackTrace();
        } finally {

            em.close();
            emf.close();
        }
    }//GEN-LAST:event_jButtonCetakActionPerformed

    private void jButtonUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUploadActionPerformed
        // TODO add your handling code here:
        JFileChooser filechooser = new JFileChooser();

                int i = filechooser.showOpenDialog(null);
                if (i == JFileChooser.APPROVE_OPTION) {
                    
                    EntityManager entityManager = Persistence.createEntityManagerFactory("TugasBukuPU").createEntityManager();
                    entityManager.getTransaction().begin();

                    
                    File f = filechooser.getSelectedFile();
                    String filepath = f.getPath();
                    String fi = f.getName();
                    //Parsing CSV Data
                    System.out.print(filepath);
                    DefaultTableModel csv_data = new DefaultTableModel();

                    try {

                        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filepath));
                        org.apache.commons.csv.CSVParser csvParser = CSVFormat.DEFAULT.parse(inputStreamReader);
                        for (CSVRecord csvRecord : csvParser) {

                        Buku_1 b = new Buku_1();
                        b.setIsbn(csvRecord.get(0));
                        b.setJudulBuku(csvRecord.get(1));
                        b.setTahunTerbit(csvRecord.get(2));
                        b.setPenerbitBuku(csvRecord.get(3));
                        entityManager.persist(b);
                        
                        }
                        
                    } catch (Exception ex) {
                        System.out.println("Error in Parsing CSV File");
                    }
                    
                    entityManager.getTransaction().commit();
                }
    }//GEN-LAST:event_jButtonUploadActionPerformed
              
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            TampilanGUI guiBuku= new TampilanGUI();
            guiBuku.setVisible(true);

            // Menambahkan window listener untuk mematikan timer saat aplikasi ditutup
            guiBuku.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    guiBuku.refreshTimer.stop();
                    System.exit(0);
                }
            });
        }
    });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCetak;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonUpload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDaftar;
    private javax.swing.JLabel jLabelIsbn;
    private javax.swing.JLabel jLabelJudul;
    private javax.swing.JLabel jLabelPenerbit;
    private javax.swing.JLabel jLabelTahun;
    private javax.swing.JScrollPane jScrollPaneBuku;
    private javax.swing.JTable jTableBuku;
    private javax.swing.JTextField jTextFieldisbn;
    private javax.swing.JTextField jTextFieldjudul;
    private javax.swing.JTextField jTextFieldpenerbit;
    private javax.swing.JTextField jTextFieldtahun;
    // End of variables declaration//GEN-END:variables
}