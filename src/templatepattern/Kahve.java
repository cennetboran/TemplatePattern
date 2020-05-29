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
public class Kahve extends Icecek{

    @Override
    public void icecekHazirla() {
        System.out.println("Kahve Hazırlanıyor");
    }

    @Override
    public void suyuKaynat() {
        System.out.println("Kahve suyu kaynatılıyor");
    }

    @Override
    public void demle() {
        System.out.println("Kahve demleniyor");
    }

    @Override
    public void bardagaKoy() {
        System.out.println("Kahve bardağa koyuluyor");
    }
    
}
