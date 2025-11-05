import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        double totalHarga;
        double Hargablender;
        String status ;
        
        System.out.println("masukkan harga blender =");
        Hargablender = ns.nextInt();
        ns.nextLine();

        System.out.println("masukkan status member =");
        status = ns.nextLine();

        if (Hargablender > 500000 && status.equals("member")) {
            totalHarga = Hargablender - (Hargablender * 0.10);            
            System.out.println("total harga" + totalHarga);
        }else {
            if (Hargablender > 1000000) {
                totalHarga = Hargablender * 0.95;
                System.out.println("total harga = " + totalHarga);
            }
        }
        totalHarga = Hargablender;
        System.out.println((totalHarga));
    }
}
