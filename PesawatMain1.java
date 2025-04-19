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
public class PesawatMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pesawat p=new Pesawat("air asia",2020,true,130);
        System.out.println("kondisi awal");
        p.Cetak();
        
        System.out.println();
        
        System.out.println("kondisi setelah reset");
        p.reset("singo aia",1998, false,80);
        p.Cetak();
    }
    
}
