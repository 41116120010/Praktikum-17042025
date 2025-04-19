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
public class MainHewan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pembuatan objek
        Hewan hewanku=new Hewan("Makhluk hidup");
        Kucing kucingku=new Kucing("Bobby");
        Anjing anjingku=new Anjing("zamrud");
        //mengakses super class
        System.out.println("tampilkan akses super class hewan");
        hewanku .tampilkanNama();
        hewanku.bersuara();
        
        //mengakses sub class kucing
        System.out.println("\n tampilkan akses sub class kucing");
        kucingku.tampilkaNama();
        kucingku.bersuara();
    
     //mengakses sub class Anjing
    System.out.println("\n tampilkan akses sub class anjing");
    anjingku.tampilkanNama();
    anjingku.bersuara();
    
}
}
