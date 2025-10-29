import java.util.Scanner;

public class segitiga {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double alas ;
        double tinggi;
        double a;
        double b;
        double c;
        double luas;
        double keliling;

        System.out.println("masukkan alas :");
        alas = myObj.nextDouble();
        System.out.println(" masukkan tinggi :");
        tinggi = myObj.nextDouble();
        System.out.println("masukkan a :");
        a = myObj.nextDouble();
        System.out.println("masukkan b :");
        b = myObj.nextDouble();
        System.out.println("masukkan c :");
        c = myObj.nextDouble();

        luas = 0.5 * alas * tinggi;  
        
        keliling = a + b + c;

        System.out.println("hasil luas :" + luas);
        System.out.println("keliling :2" + keliling);
    }
}