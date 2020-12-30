
package bangunruang;
import java.util.Scanner;
public class balok {
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 
        System.out.println("Menghitung Volume dan Luas Balok");
        System.out.print("panjang           : ");
        int p = input.nextInt();
        System.out.print("lebar             : ");
        int l = input.nextInt();
        System.out.print("tinngi            : ");
        int t = input.nextInt();
        System.out.print("Luas permukaan    : "+ (2*((p*l)+(p*t)+(l*t))) + "\n");
        System.out.println("Volume          : " + (p*l*t));     
        
        
}
}
