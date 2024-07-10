/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rosi110624;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class PeminjamanDao {
    
    private List<Peminjaman> data = new ArrayList();
    
     public PeminjamanDao(){
        data.add(new Peminjaman("A123", "B001", "6-JUNI-2024", "10-JUNI-2024", 0, 0));
        data.add(new Peminjaman("A124", "B002", "6-JUNI-2024", "20-JUNI-2024", 7, 35000));      
    }
    
    public void insert(Peminjaman peminjaman) {
    data.add(peminjaman);
    }
    
    public void update(int index,Peminjaman peminjaman) {
    data.set(index,peminjaman);
    }
    
    public void delete(int index) {
    data.remove(index);
    }
    
    public Peminjaman getPeminjaman(int index) {
    return data.get(index);
    }
    
     public List<Peminjaman> getAll() {
         return data;
    }
    
    
    
}
