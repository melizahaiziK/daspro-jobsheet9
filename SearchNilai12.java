import java.util.Scanner;
public class SearchNilai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan di input : ");
        int input = sc.nextInt();

        int[] arrNilai = new int [input]; {
        for (int i = 0; i < input; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
            }
            }
            System.out.print("Masukkan nilai yang ingin dicari: ");
            int nilai = sc.nextInt();
            int hasil = -1;
                for (int i = 0; i < input; i++) {
                    if (arrNilai[i] == nilai) {
                        hasil = i; 
                        break;
                    }
                }
            System.out.println();
            if (hasil != -1) {
            System.out.println("Nilai " + nilai+ " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
            } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}
