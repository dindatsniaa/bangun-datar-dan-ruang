
package bangundatar;
import java.util.Scanner;
public class persegi_panjang {

    public static void main(String[] args) {
       Scanner nilai = new Scanner (System.in);
           int panjang , lebar ;
           int Luas , Keliling ;
           
           System.out.println("Masukan panjang = ");
           panjang = nilai.nextInt();
           System.out.println("Masukan lebar = ");
           lebar = nilai.nextInt();
           
           Keliling = 2*panjang + 2*lebar;
           System.out.println("Keliling Persegi Panjang = "+Keliling);
           Luas = panjang * lebar;
           System.out.println("Luas Persegi Panjang = "+Luas); 
    }
    
}
