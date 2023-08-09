
package bangundatar;


public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;
    
   @Override
   float luas() {
        float luas = (float) (alas * tinggi)/2;
        System.out.println("\nLuas Segitiga: "+ luas);
        return luas;
   }
}
