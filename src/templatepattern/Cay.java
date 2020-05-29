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
public class Cay extends Icecek{

    @Override
    public void icecekHazirla() {
        System.out.println("Çay Hazırlanıyor");
    }

    @Override
    public void suyuKaynat() {
        System.out.println("Çay suyu kaynatılıyor");
    }

    @Override
    public void demle() {
        System.out.println("Çay demleniyor");
    }

    @Override
    public void bardagaKoy() {
        System.out.println("Çay bardağa koyuluyor");
    }
    
}
