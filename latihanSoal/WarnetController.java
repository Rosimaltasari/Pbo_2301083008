/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanSoal;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class WarnetController {
    private FromWarnet fromWarnet;
    private Warnet warnet;
    private WarnetDao warnetDao; 
  
    
    public WarnetController(FromWarnet fromWarnet) {
    this.fromWarnet = fromWarnet;
    this.warnetDao = new WarnetDao();
    }
    
    public void clearForm() {
    fromWarnet.getTxtKode().setText("");
    fromWarnet.getTxtNama().setText("");
    fromWarnet.getTxtMasuk().setText("");
    fromWarnet.getTxtKeluar().setText("");
    fromWarnet.getTxtTanggal().setText("");
    fromWarnet.getCmbJenis().removeAllItems();
    fromWarnet.getCmbJenis().addItem("VIP");
    fromWarnet.getCmbJenis().addItem("Gold");
    }
    
    public void tampil() {
    DefaultTableModel tabelModel = (DefaultTableModel) fromWarnet.getTblWarnet().getModel();
        tabelModel.setRowCount(0);
        List<Warnet> list = warnetDao.getAll();  // Use the instance to call the method
        for (Warnet a : list){
            Object[] row = {
                a.getKodePelanggan(),
                a.getNamaPelanggan(),
                a.getJenisPelanggan(),
                a.getTglMasuk(),
                a.getJamMasuk(),
                a.getJamKeluar(),
                a.getLama(),
                a.getTarif(),
                a.getDiskon(),
                a.getTotalBayar(),
                a.calculateLama(),
                a.calculateTarif(),
                a.calculateDiskon(),
                a.calculateTotalBayar(),
    };
    tabelModel.addRow(row);
    }
    }
    
    public void saveWarnet() {
    warnet = new Warnet();
        warnet.setKodePelanggan(fromWarnet.getTxtKode().getText());
        warnet.setNamaPelanggan(fromWarnet.getTxtNama().getText());
        warnet.setJenisPelanggan(fromWarnet.getCmbJenis().getSelectedItem().toString());
        warnet.setTglMasuk(fromWarnet.getTxtTanggal().getText());
        warnet.setJamMasuk(fromWarnet.getTxtMasuk().getText());
        warnet.setJamKeluar(fromWarnet.getTxtKeluar().getText());
        warnet.setLama(warnet.calculateLama());
        warnet.setTarif(warnet.calculateTarif());
        warnet.setDiskon(warnet.calculateDiskon());
        warnet.setTotalBayar(warnet.calculateTotalBayar());
        warnetDao.insert(warnet);  // Use the instance to call the method
        JOptionPane.showMessageDialog(fromWarnet, "Insert OK");
    }
    
    public void updateWarnet() {
     int index = fromWarnet.getTblWarnet().getSelectedRow();
        warnet.setKodePelanggan(fromWarnet.getTxtKode().getText());
        warnet.setNamaPelanggan(fromWarnet.getTxtNama().getText());
        warnet.setJenisPelanggan(fromWarnet.getCmbJenis().getSelectedItem().toString());
        warnet.setTglMasuk(fromWarnet.getTxtTanggal().getText());
        warnet.setJamMasuk(fromWarnet.getTxtMasuk().getText());
        warnet.setJamKeluar(fromWarnet.getTxtKeluar().getText()); 
        warnet.setLama(warnet.calculateLama());
        warnet.setTarif(warnet.calculateTarif());
        warnet.setDiskon(warnet.calculateDiskon());
        warnet.setTotalBayar(warnet.calculateTotalBayar());
        warnetDao.update(index, warnet);  // Use the instance to call the method
        JOptionPane.showMessageDialog(fromWarnet, "Update OK");
    }
    
    public void getWarnet() {
    int index = fromWarnet.getTblWarnet().getSelectedRow();
        warnet = warnetDao.getWarnet(index);  // Use the instance to call the method
        if(warnet != null){
            fromWarnet.getTxtKode().setText(warnet.getKodePelanggan());
            fromWarnet.getTxtNama().setText(warnet.getNamaPelanggan());
            fromWarnet.getTxtTanggal().setText(warnet.getTglMasuk());
            fromWarnet.getCmbJenis().setSelectedItem(warnet.getJenisPelanggan());
            fromWarnet.getTxtKeluar().setText(warnet.getJamKeluar());
            fromWarnet.getTxtMasuk().setText(warnet.getJamMasuk());
    }
    }
    
    public void deleteWarnet() {
    int index = fromWarnet.getTblWarnet().getSelectedRow();
        warnetDao.delete(index);  // Use the instance to call the method
        JOptionPane.showMessageDialog(fromWarnet, "Delete OK");
    }
    
}
