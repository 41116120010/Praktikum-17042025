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
public class PesawatMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // buat objek bertipe array
        
     Pesawat[]daftarPesawat=new Pesawat[3];
     
     daftarPesawat[0]=new Pesawat("AirAsia",2025,true,180);
     daftarPesawat[1]=new Pesawat("singo aia",2018,false,100);
     daftarPesawat[2]=new Pesawat("merpati",2010,true,75);
     
     System.out.println("\t DAFTAR PESAWAT \n");
     for(int i=0;i<daftarPesawat.length;i++){
         System.out.println("\n data pesawat ke"+ (i+1)+ "==");
         daftarPesawat[i].Cetak();
         System.out.println();
     }
        
    }
    
}
