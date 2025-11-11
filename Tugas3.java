import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi goreng", "Mie goreng", "Roti bakar", "Kentang goreng", "Teh tarik", "Cappucino", "Chocolate Ice"};
        System.out.println("=== Menu Kafe ===");
        for (String item : menu) {
            System.out.println("- " + item);
        }
        System.out.print("\nMasukkan nama makanan atau minuman yang ingin di cari : ");
        String cariMakanMinum = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMakanMinum)){
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("\nMakanan/Minuman " + cariMakanMinum + " tersedia di menu ");
        } else {
            System.out.println("\nMakanan/Minuman " + cariMakanMinum + " tidak ada di menu ");

        }
    }
}
