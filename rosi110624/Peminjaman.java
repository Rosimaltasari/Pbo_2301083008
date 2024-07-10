/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rosi110624;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class Peminjaman {
    
    private String KodeAnggota;
    private String KodeBuku;
    private String TglPinjam;
    private String TglKembali;
    private Integer Terlambat;
    private Integer dendaTotal;
    
    public Peminjaman() {
    }
    
    public Peminjaman(String KodeAnggota, String KodeBuku,
            String TglPinjam, String TglKembali, Integer Terlambat, Integer DendaTotal) {
    this.KodeAnggota = KodeAnggota;
    this.KodeBuku = KodeBuku;
    this.TglPinjam = TglPinjam;
    this.TglKembali = TglKembali;
    this.Terlambat = Terlambat;
        this.dendaTotal = dendaTotal;
        calculateLateAndFine();
    }

    public String getKodeAnggota() {
        return KodeAnggota;
    }

    public void setKodeAnggota(String KodeAnggota) {
        this.KodeAnggota = KodeAnggota;
    }

    public String getKodeBuku() {
        return KodeBuku;
    }

    public void setKodeBuku(String KodeBuku) {
        this.KodeBuku = KodeBuku;
    }

    public String getTglPinjam() {
        return TglPinjam;
    }

    public void setTglPinjam(String TglPinjam) {
        this.TglPinjam = TglPinjam;
    }

    public String getTglKembali() {
        return TglKembali;
    }

    public void setTglKembali(String TglKembali) {
        this.TglKembali = TglKembali;
    }

    public Integer getTerlambat() {
        return Terlambat;
    }

    public void setTerlambat(Integer Terlambat) {
        this.Terlambat = Terlambat;
    }

    public Integer getDendaTotal() {
        return dendaTotal;
    }

    public void setDendaTotal(Integer dendaTotal) {
        this.dendaTotal = dendaTotal;
    }

    private void calculateLateAndFine() {
        SimpleDateFormat sdf = new SimpleDateFormat("d-MMMM-yyyy");
        try {
            Date pinjamDate = sdf.parse(TglPinjam);
            Date kembaliDate = sdf.parse(TglKembali);
            long differenceInMilliseconds = kembaliDate.getTime() - pinjamDate.getTime();
            long differenceInDays = (differenceInMilliseconds / (1000 * 60 * 60 * 24));
            Terlambat = (int) differenceInDays;

            int finePerDay = 500;
            dendaTotal = Terlambat > 0 ? Terlambat * finePerDay : 0;

        } catch (ParseException e) {
            e.printStackTrace();
        }
     }
    
    
    
}
