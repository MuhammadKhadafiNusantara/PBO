/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author khada
 */
public class Lingkaran extends BangunDatar {
    float r;
    
    @Override
    float luas() {
        float luas = (float) (Math.PI * r * r);
        System.out.println("\nLuas Lingkaran: " + luas);
        return luas;
    }
    
    @Override
    float keliling() {
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran: " + keliling);
        return keliling;
    }
}
