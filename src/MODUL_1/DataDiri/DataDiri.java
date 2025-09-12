package MODUL_1.DataDiri;


import java.time.LocalDate;


public class DataDiri {
    public static void main(String[] args) {
        System.out.println("Data Diri");
        String nama = "Nurul Fadila";
        String nim = "2024573010026";
        LocalDate TanggalLahir = LocalDate.of(2006, 2, 4);
        String jurusan = "Teknologi Informasi dan Komputer";
        String prodi = "Teknik Informatika";
        String tempat = "Lhokseumawe";
        int usia = 19;

        System.out.println("Nama :" + nama);
        System.out.println("NIM :" + nim);
        System.out.println("Tanggal Lahir :" + TanggalLahir);
        System.out.println("Jurusan :" + jurusan);
        System.out.println("Prodi :" + prodi);
        System.out.println("Tempat :" + tempat);
        System.out.println("Umur :" + usia);
    }
}
