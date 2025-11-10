import java.util.Scanner;
public class ArrayRataNilai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa = ");
        int jmlMahasiswa = sc.nextInt();

        int [] nilaiMhs= new int [jmlMahasiswa];
        double totallulus = 0;
        double totaltdklulus = 0;
        int jmlLulus = 0;
        int jmltdklulus = 0;

        for (int i=0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs [i] > 70) {
                totallulus += nilaiMhs[i];
                jmlLulus++;
            } else {
                totaltdklulus += nilaiMhs[i];
                jmltdklulus++;
            }
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            
        }
        double ratalulus = totallulus/jmlLulus;
        double ratatdklulus = totaltdklulus/jmltdklulus;
        System.out.println("Rata-rata nilai lulus = " + ratalulus) ;
        System.out.println("Rata-rata nilai tidak lulus = " + ratatdklulus);
    }
}
