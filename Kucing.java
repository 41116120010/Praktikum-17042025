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
public class Kucing extends Hewan {

    public Kucing(String nama) {
        super(nama);//mengakses property hewan
    }
    
    @Override
    public void bersuara(){
    super.bersuara();
    System.out.println(nama+"berkata meong");
}

    void tampilkaNama() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
