import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan : ");
        int jumlah = sc.nextInt();
        
        String [] namaPesanan = new String[jumlah];
        sc.nextLine();
        double [] hargaPesanan = new double[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Pesanan ke- " + (i + 1));
            System.out.print("Masukkan nama makanan/minuman: " );
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga : Rp. ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();
           
        }

        double totalBiaya  = 0;
        for (int i = 0; i < jumlah; i++) {
            totalBiaya += hargaPesanan[i];
        }
        System.out.println("\n==== Daftar Pesanan ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Pesanan ke- " + (i + 1) + " : " + namaPesanan[i] + " Rp. " + hargaPesanan[i]);
        }
        System.out.println("\nTotal Biaya: Rp." + totalBiaya);
            
    }
}
