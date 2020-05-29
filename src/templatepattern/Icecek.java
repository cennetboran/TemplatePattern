/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatepattern;

/**
 *
 * @author lenovo
 */
public abstract class Icecek {
    
    public abstract void icecekHazirla();
    public abstract void suyuKaynat();
     public abstract void demle();
    public abstract void bardagaKoy();
    
    public final void icerikEkle(){
        icecekHazirla();
        suyuKaynat();
        demle();
        bardagaKoy();
    };
    
}
