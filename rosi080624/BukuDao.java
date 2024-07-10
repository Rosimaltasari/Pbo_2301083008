/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rosi080624;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class BukuDao {
    private final List <Buku> data = new ArrayList();
    
    public BukuDao() {
    data.add(new Buku("001","Indahnya Surga","Rosi maltasari","khaira maulia","2017"));
    data.add(new Buku("002","Siapa sangka","Maulia","Anggara","2018"));
    }
    
    public void insert(Buku buku) {
    data.add(buku);
    }
    
    public void update(int index,Buku buku) {
    data.set(index,buku);
    }
    
    public void delete(int index) {
    data.remove(index);
    }
    
    public Buku getBuku(int index) {
    return data.get(index);
    }
    
     public List<Buku> getAll() {
         return data;
    }
    
}
