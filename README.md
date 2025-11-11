PERTANYAAN PERCOBAAN 1 

1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?
jawaban : akan terjadi error, dikarenakan 5.0 dan 7.5 adalah bukan angka bulat dan jika angka tidak bulat maka tipe data yang digunakan harusnya adalah double bukan int, karna int adalah untuk angka yg bulat saja.
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.
jawaban : diganti menjadi inisialisasi array seperti yang sudah diajarkan yaitu tipeData namaArray[] = {nilai1, nilai2, nilai3, ...};
3. Ubah statement pada langkah No 4 menjadi seperti berikut
for (int i =0; i < 4; i++) {
    System.out.println(bil [i]);
    }
Apa keluaran dari program? Jelaskan maksud dari statement tersebut.
jawaban : keluaran akan sama seperti langkah yang sebelumnya yang belum di rubah, maksud dari statement tersebut digunakan untuk menampilkan empat elemen pertama dari sebuah array yang sudah dituliskan. i dimulai dari 0 , i < 4 = perulangan terus berjalan selama i kurang dari 4, i++ = setiap kali selesai satu putaran, nilai i bertambah 1
4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian?
jawaban : keluaran program seperti ini "Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4" karna index hanya sampai 3, yaitu 0,1,2,3

PERTANYAAN PERCOBAAN 2
1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini:
for (int i = 0; i < nilaiAkhir.length; i++) {
    System.out.print("Masukkan nilai akhir ke-" + i + ": ");
    nilaiAkhir[i] = sc.nextInt();
}
Jalankan program. Apakah terjadi perubahan? Mengapa demikian?
jawaban : tidak ada perubahan, program masih mengeluarkan output yang sama dikarenakan nilaiAkhir.length sama dengan nilai array yang ditentukan 
2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?
jawaban : maksudnya adalah mengulangi selama nilai i masih lebih kecil dari jumlah elemen dalam array nilaiAkhir
3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70):
for (int i = 0; i < nilaiAkhir.length; i++ ){
    if (nilaiAkhir [i] > 70) {
        System.out.println("Mahasiswa ke-" +i+ "lulus!");
    }
}
Jalankan program dan jelaskan alur program!
Jawaban : alur program tersebut adalah Program melakukan perulangan untuk memeriksa nilai setiap mahasiswa di dalam array nilaiAkhir, Jika nilai mahasiswa lebih dari 70, maka program mencetak pesan bahwa mahasiswa tersebut lulus, dan hanya menampilkan mahasiswa yang lulus saja jadi jika yang nilai nya dibawah 70 status mahasiswa tersebut tidak di tampilkan.

4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus, seperti ilustrasi output berikut:
jawaban : ditambahkan 
            if (nilaiAkhir [i] <= 70) {
                System.out.println("Mahasiswa ke-" +i+ " tidak lulus! ");
            } 

PERTANYAAN PERCOBAAN 3
1. Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa yang memiliki lebih besar dari 70 (>70)  
jawaban : sudah di commit

2. Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) sehingga program menerima jumlah elemen berdasarkan input dari pengguna dan mengeluarkan output seperti berikut ini:
jawaban : sudah di commit

PERTANYAAN PERCOBAAN 4
1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di atas.
jawaban : berfungsi untuk menghentikan perulangan for secara paksa ketika kondisi tertentu terpenuhi
2. Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari.
jawaban : sudah dicommit
3. Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan "Nilai yang dicari tidak ditemukan" jika nilai yang dicari (key) tidak ada di dalam array.
jawaban : sudah dicommit.