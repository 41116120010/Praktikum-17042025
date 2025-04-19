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
public class Anjing extends Hewan{
    
    public Anjing(String nama) {
        super(nama);
    }
   
    @Override
    public void bersuara(){
        System.out.println(nama+"berkata Guk!! Guk!");
    }
    
    
}
