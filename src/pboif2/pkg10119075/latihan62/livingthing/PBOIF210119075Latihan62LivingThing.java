/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119075.latihan62.livingthing;

/**
Nama : Aditiya musthafa kamil
Kelas : PBOIF2
NIM : 10119075
Deskripsi Program : Program ini berisi program untuk menampilkan Living Thing utama
 */
public class PBOIF210119075Latihan62LivingThing {

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human objHuman=new Human();
        objHuman.setNama("Rizki Adam Kurniawan");
        
        objHuman.walk(objHuman.getNama());
        objHuman.breath(objHuman.getNama());
        objHuman.eat(objHuman.getNama());
    }
    
}

