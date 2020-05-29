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
public class TemplatePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Icecek cay = new Cay();
        cay.icerikEkle();
        Icecek kahve = new Kahve();
        kahve.icerikEkle();
    }
    
}
