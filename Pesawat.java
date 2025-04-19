/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum170425;

/**
 *
 * @author Lenovo
 */
public class Pesawat extends Udara {
    private int muatan;
    
    public Pesawat(){
        
    }
    
    public int getMuatan(){
        return muatan;
    }
    
    public void setMuatan(int muatan){
        this.muatan=muatan;
    }
    
    public Pesawat(String nama,int tahunProduksi,boolean mesin, int muatan){
        super(nama,tahunProduksi,mesin);
        this.muatan=muatan;
    }
    public void reset(String nama, int tahunProduksi,boolean mesin,int muatan){
        setNama(nama);
        setTahunProduksi(tahunProduksi);
        setMesin(mesin);
        setMuatan(muatan);
    }
    public String kategori(int muatan){
        if(muatan<=50)
            return "bobot kecil";
        else if (muatan<=100)
            return "bobot menengah";
        else 
            return"bobot besar";
    }
    
    @Override
    public void Cetak(){
        super.Cetak();
        System.out.println("mautan pesawat "+muatan+"orang penumpang");
        System.out.println("kategori =" + kategori(muatan));
    }
    
}
