/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rosi110624;


/**
 *
 * @author DELL
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class PeminjamanController {
    
   private FromPeminjaman form;
    private List<Peminjaman> data;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public PeminjamanController(FromPeminjaman form) {
        this.form = form;
        data = new ArrayList<>();
    }

    public void clearForm() {
        form.getTxtKodeAnggota().setText("");
        form.getTxtKodeBuku().setText("");
        form.getTxtTglPinjam().setText("");
        form.getTxtTglKembali().setText("");
        form.getTxtTerlambat().setText("");
        form.getTxtDenda().setText("");
    }

    public void tampil() {
        // Logic to display data in the table
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) form.getTblPeminjaman().getModel();
        model.setRowCount(0); // Clear the table first
        for (Peminjaman p : data) {
            Object[] row = {
                p.getKodeAnggota(),
                p.getKodeBuku(),
                p.getTglPinjam(),
                p.getTglKembali(),
                p.getTerlambat(),
                p.getDendaTotal()
            };
            model.addRow(row);
        }
    }

    public void savePinjam() {
        try {
            String kodeAnggota = form.getTxtKodeAnggota().getText();
            String kodeBuku = form.getTxtKodeBuku().getText();
            String tglPinjam = form.getTxtTglPinjam().getText();
            String tglKembali = form.getTxtTglKembali().getText();

            Date pinjamDate = sdf.parse(tglPinjam);
            Date kembaliDate = sdf.parse(tglKembali);
            long differenceInMilliseconds = kembaliDate.getTime() - pinjamDate.getTime();
            int terlambat = (int) (differenceInMilliseconds / (1000 * 60 * 60 * 24));
            int dendaTotal = terlambat > 0 ? terlambat * 500 : 0;

            form.getTxtTerlambat().setText(String.valueOf(terlambat));
            form.getTxtDenda().setText(String.valueOf(dendaTotal));

            Peminjaman peminjaman = new Peminjaman(kodeAnggota, kodeBuku, tglPinjam, tglKembali, terlambat, dendaTotal);
            data.add(peminjaman);
            tampil();
            clearForm();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void updatePinjam() {
        // Logic to update pinjam data
       int selectedRow = form.getTblPeminjaman().getSelectedRow();
        if (selectedRow != -1) {
            try {
                String kodeAnggota = form.getTxtKodeAnggota().getText();
                String kodeBuku = form.getTxtKodeBuku().getText();
                String tglPinjam = form.getTxtTglPinjam().getText();
                String tglKembali = form.getTxtTglKembali().getText();

                Date pinjamDate = sdf.parse(tglPinjam);
                Date kembaliDate = sdf.parse(tglKembali);
                long differenceInMilliseconds = kembaliDate.getTime() - pinjamDate.getTime();
                int terlambat = (int) (differenceInMilliseconds / (1000 * 60 * 60 * 24));
                int dendaTotal = terlambat > 0 ? terlambat * 500 : 0;

                form.getTxtTerlambat().setText(String.valueOf(terlambat));
                form.getTxtDenda().setText(String.valueOf(dendaTotal));

                Peminjaman peminjaman = new Peminjaman(kodeAnggota, kodeBuku, tglPinjam, tglKembali, terlambat, dendaTotal);
                data.set(selectedRow, peminjaman);
                tampil();
                clearForm();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    public void deletePinjam() {
        // Logic to delete pinjam data
        int selectedRow = form.getTblPeminjaman().getSelectedRow();
        if (selectedRow != -1) {
            data.remove(selectedRow);
            tampil();
            clearForm();
        }
    }

    public void getPinjam() {
        // Logic to get selected pinjam data
        int selectedRow = form.getTblPeminjaman().getSelectedRow();
        if (selectedRow != -1) {
            Peminjaman pinjamBuku = data.get(selectedRow);
            form.getTxtKodeAnggota().setText(pinjamBuku.getKodeAnggota());
            form.getTxtKodeBuku().setText(pinjamBuku.getKodeBuku());
            form.getTxtTglPinjam().setText(pinjamBuku.getTglPinjam());
            form.getTxtTglKembali().setText(pinjamBuku.getTglKembali());
            form.getTxtTerlambat().setText(String.valueOf(pinjamBuku.getTerlambat()));
            form.getTxtDenda().setText(String.valueOf(pinjamBuku.getDendaTotal()));
        }
    } 
    
    
    public void calculateTerlambatAndDenda(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date tglPinjam = sdf.parse(form.getTxtTglPinjam().getText());
            Date tglKembali = sdf.parse(form.getTxtTglKembali().getText());

            long diffInMillies = tglKembali.getTime() - tglPinjam.getTime();
            long diff = diffInMillies / (1000 * 60 * 60 * 24);

            int terlambat = (int) Math.max(0, diff - 7); // Assuming a 7-day borrow period
            int dendaTotal = terlambat * 500; // Assuming a fine of 500 per day of delay

            form.getTxtTerlambat().setText(String.valueOf(terlambat));
            form.getTxtDenda().setText(String.valueOf(dendaTotal));
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(form, "Format tanggal salah. Gunakan format dd-MMM-yyyy.");
        }
    }
    }
    
