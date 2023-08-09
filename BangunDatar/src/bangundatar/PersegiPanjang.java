/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author khada
 */
public class PersegiPanjang extends BangunDatar{
    float panjang;
    float lebar;
    
    @Override
    float luas() {
        float luas = panjang * lebar;
        System.out.println("\nLuas Persegi Panjang: " + luas);
        return luas;
    }
    
    @Override
    float keliling() {
        float kll = 2*panjang + 2*lebar;
        System.out.println("Keliling Persegi Panjang: " + kll);
        return kll;
    }
}
