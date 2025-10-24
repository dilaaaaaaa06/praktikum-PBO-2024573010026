package MODUL_3.latihan;

import java.util.Scanner;
public class NilaiUjian {
    public static void main(String[] args) {

        // Langkah 1: Deklarasi dan inisialisasi array nilai untuk 10 siswa
        int[] nilai = {78, 85, 90, 67, 88, 92, 76, 81, 95, 84};

        // Langkah 2: Inisialisasi variabel untuk perhitungan
        int total = 0;
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];

        // Langkah 3: Loop untuk menghitung total, mencari nilai tertinggi & terendah
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i]; // menjumlahkan semua nilai

            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }

        // Langkah 4: Hitung rata-rata
        double rataRata = (double) total / nilai.length;

        // Langkah 5: Tampilkan hasil
        System.out.println("=== Data Nilai Ujian 10 Siswa ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Siswa " + (i + 1) + ": " + nilai[i]);
        }

        System.out.println("\nRata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
    }
}
