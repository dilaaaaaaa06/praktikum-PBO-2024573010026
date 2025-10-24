# Laporan Modul 1: Perkenalan Java dan Ekosistemnya
**Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek   
**Nama:** Nurul Fadila  
**NIM:** 2024573010026  
**Kelas:** TI 2A

---

## Abstrak
Laporan ini membahas dasar-dasar bahasa pemrograman Java serta ekosistem yang mendukungnya. Dimulai dari pengenalan sejarah singkat Java, karakteristik utama seperti platform independen dan konsep object-oriented programming, hingga penjelasan tentang komponen ekosistem Java, meliputi Java Development Kit (JDK), Java Runtime Environment (JRE), serta Java Virtual Machine (JVM). Selain itu, laporan juga menyinggung berbagai framework, library, dan tools yang sering digunakan dalam pengembangan aplikasi berbasis Java, baik untuk desktop, mobile, maupun web.

Tujuan Pembuatan Laporan:
Tujuan pembuatan laporan ini adalah untuk memberikan pemahaman awal kepada pembaca mengenai bahasa pemrograman Java dan lingkungan ekosistemnya. Dengan adanya laporan ini, diharapkan pembaca dapat mengenali peran Java dalam dunia pemrograman, memahami komponen pendukungnya, serta melihat potensi penggunaannya dalam berbagai bidang pengembangan perangkat lunak.
---

## 1. Pendahuluan
Java adalah bahasa pemrograman tingkat tinggi yang dikembangkan oleh Sun Microsystems dan diperkenalkan pertama kali pada tahun 1995.

Bahasa ini banyak digunakan karena sifatnya yang platform-independent—yakni satu kali ditulis (“Write Once”) bisa dijalankan di banyak platform melalui Java Virtual Machine (JVM).

Selain itu, Java menerapkan paradigma object-oriented programming, memiliki sistem keamanan yang baik, dan mendukung multithreading serta manajemen memori otomatis melalui garbage collection.

Ekosistem Java terdiri dari beberapa komponen penting yang mendukung pengembangan, pelaksanaan, dan pemeliharaan perangkat lunak. Tiga komponen dasar yang selalu disebut adalah:

JVM (Java Virtual Machine): bertugas menjalankan bytecode Java sehingga aplikasi bisa berjalan di berbagai sistem operasi. JVM juga mengelola memori, pengecekan keamanan (security), dan tugas runtime lainnya.

JRE (Java Runtime Environment): terdiri dari JVM dan kumpulan pustaka (library) dasar yang dibutuhkan agar program Java bisa dijalankan.

JDK (Java Development Kit): lingkungan lengkap bagi pengembang untuk menulis, mengkompilasi, debug, dan membangun aplikasi Java. JDK mencakup compiler (javac), tools seperti jar, javadoc, serta pustaka-pustaka standar.

---

## 2. Proses instalasi Java
1. Siapkan pc/laptop
2. siapkan data/kuota untuk melakukan instalasi
3. untuk dapat menjalankan program dari java kita harus menginstall beberapa aplikasi dari ekosistem java itu sendiri
4. buka google/chrome
5. pertama kita akan menginstall jdk (java develpoment kit) yaitu Amazon Correto, Amazon Corretto adalah distribusi OpenJDK yang gratis, multiplatform, dan production-ready yang dikembangkan oleh Amazon.
-Langkah 1: Akses Website Amazon Corretto
   Buka browser web (Chrome, Firefox, atau Edge)
   Navigasikan ke alamat: https://aws.amazon.com/corretto/
   Klik tombol "Download Amazon Corretto" yang terletak di bagian tengah halaman
   Anda akan diarahkan ke halaman download yang menampilkan berbagai versi yang tersedia

-Langkah 2: Pilih Versi JDK yang Tepat
   Pada halaman download, pilih Amazon Corretto 17 atau Amazon Corretto 21 (keduanya adalah Long Term Support version)
   Untuk pembelajaran pemula, Corretto 17 sangat direkomendasikan karena stabilitas dan compatibility yang baik
   Pastikan Anda memilih versi untuk windows yaitu Windows x64: Untuk Windows 64-bit (paling umum)
 
-Langkah 3: Download Installer
   Klik pada link download yang sesuai dengan sistem operasi Anda
   Pilih format installer:
   Windows: File dengan ekstensi .msi (Microsoft Installer)
   Tunggu proses download selesai (ukuran file sekitar 200-300 MB)
   Pastikan lokasi download mudah diakses (biasanya folder Downloads)

-Langkah 4: Instalasi di Windows
    Buka File Explorer dan navigasikan ke folder Downloads
    Double-click file installer Amazon Corretto (contoh: amazon-corretto-17-x64-windows-jdk.msi)
    Jika muncul dialog "User Account Control", klik "Yes" untuk memberikan permission
    Pada welcome screen installer, klik "Next"
    Baca dan setujui License Agreement dengan mencentang "I accept the terms in the License Agreement", kemudian klik "Next"
    Pada halaman "Custom Setup", biarkan semua komponen tercentang (default installation), klik "Next"
    Catat dengan teliti installation path yang ditampilkan (biasanya: C:\Program Files\Amazon Corretto\jdk17.x.x_xx\)
    Klik "Install" untuk memulai proses instalasi
    Tunggu proses instalasi selesai (biasanya 2-5 menit)
    Klik "Finish" untuk menyelesaikan instalasi

-Langkah 7: Verifikasi Instalasi
    Windows: Buka Command Prompt dengan menekan Win+R, ketik cmd, tekan Enter

-Langkah 8: Setup Environment Variables (Khusus Windows)
    Klik kanan pada "This PC" di desktop atau File Explorer, pilih "Properties"
    Klik "Advanced system settings" di panel kiri
    Pada dialog System Properties, klik "Environment Variables…"
    Di bagian "System variables", klik "New…"
    Masukkan:
    Variable name: JAVA_HOME
    Variable value: C:\Program Files\Amazon Corretto\jdk17.0.x_xx (sesuaikan dengan versi yang terinstall)
    Klik "OK"
    Cari variable "Path" di System variables, klik "Edit…"
    Klik "New" dan tambahkan: %JAVA_HOME%\bin
    Klik "OK" pada semua dialog yang terbuka
    Restart Command Prompt untuk menerapkan perubahan

6. lalu Instalasi Intellj Idea CE
-Langkah 1: Mengakses Website JetBrains
   Buka browser web dan navigasikan ke: https://www.jetbrains.com/idea/
   Pada halaman utama, Anda akan melihat dua pilihan: Ultimate (berbayar) dan Community (gratis)
   Klik tombol "Download" di bawah "Community Edition"
   Anda akan diarahkan ke halaman download yang otomatis mendeteksi sistem operasi Anda

-Langkah 2: Download IntelliJ IDEA
   Pastikan tab "Community" dipilih (bukan Ultimate)
   Sistem akan otomatis mendeteksi OS Anda dan menampilkan download button yang sesuai
   Klik "Download" untuk memulai download
   Ukuran file sekitar 700MB-1GB, pastikan koneksi internet stabil
   File installer akan tersimpan di folder Downloads dengan nama seperti:
   Windows: ideaIC-2023.x.x.exe

-Langkah 3: Instalasi di Windows
   Navigasikan ke folder Downloads dan double-click file ideaIC-2023.x.x.exe
   Jika Windows menampilkan security warning, klik "Yes" atau "Run anyway"
   Pada welcome screen, klik "Next"
   Pilih installation directory (default: C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.x.x)
   Klik "Next" untuk melanjutkan
   Pada Installation Options, centang opsi berikut:
   ✅ "64-bit launcher" (untuk sistem 64-bit)
   ✅ "Add launchers dir to the PATH"
   ✅ "Add 'Open Folder as Project'"
   ✅ ".java" - Associate .java files
   ✅ "Download and install JetBrains Runtime"
   Klik "Next"
   Pada Start Menu Folder, biarkan default dan klik "Install"
   Tunggu proses instalasi selesai (5-10 menit)
   Centang "Run IntelliJ IDEA Community Edition" dan klik "Finish"

-Langkah 6: First Time Setup IntelliJ IDEA
    Saat pertama kali membuka IntelliJ IDEA, Anda akan melihat "Welcome to IntelliJ IDEA"
    Pada dialog "Import IntelliJ IDEA Settings", pilih "Do not import settings"
    Klik "OK"
    Pilih UI Theme:
    "Light" untuk tema terang (cocok untuk lingkungan terang)
    "Darcula" untuk tema gelap (cocok untuk mata yang sensitif)
    Klik "Next"
    Pada "Default plugins", biarkan semua plugin default tercentang
    Klik "Next"
    Pada "Featured plugins", Anda bisa skip dulu dengan klik "Start using IntelliJ IDEA"
-Langkah 7: Verifikasi Konfigurasi JDK di IntelliJ IDEA
    Pada Welcome screen IntelliJ IDEA, klik "New Project"
    Di panel kiri, pilih "Java"
    Pastikan "Project SDK" menampilkan Amazon Corretto yang telah diinstall
    Jika belum muncul, klik "Add SDK" → "JDK"
    Navigate ke folder instalasi Amazon Corretto:
    Windows: C:\Program Files\Amazon Corretto\jdk17.0.x_xx
    Klik "OK" untuk menambahkan JDK
    Klik "Cancel" untuk keluar dari dialog New Project

7. dengan begitu program java anda akan dapat dijalankan meggunakan dua aplikasi diatas
---

## 3. Laporan proses pembuatan program hello world dengan java
1. Buat sebuah project baru di intellj dengan memilih file -> new -> project
2. Pastikan teknology, lokasi penyimpanan sesuai.
3. Hilangkan checklist pada tulisan Create Git repository
4. Buat sebuah java class baru dan beri nama Main dengan klik kanan pada folder src pilih new -> Java Class
5. Tuliskan kode berikut:
   public class Main {
   public static void main(String[] args) {
   System.out.println("Hello World");
   }
   }
6. Jalankan programnya dengan mengklik tombol hijau di atas dan cek hasil nya.
---

## 3. Laporan proses pembuatan program hello world dengan java
1. Laporan proses pembuatan program Data Diri dengan java
2. Buat sebuah project baru di intellj dengan memilih file -> new -> project
3. Pastikan teknology, lokasi penyimpanan sesuai.
4. Hilangkan checklist pada tulisan Create Git repository
5. Buat sebuah package baru dan beri nama DataDiri dengan klik kanan pada folder src pilih new -> package
   Tuliskan kode berikut:

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


5. Jalankan programnya dan cek hasil nya.

## 4. Referensi
Introduction to Java — GeeksforGeeks
Java Architecture and its Components | JVM, JRE and JDK — Edureka Blog
Module 1 - Course Introduction & Lab Setup (https://hackmd.io/@mohdrzu/ByrYifVFeg#Module-1---Course-Introduction-amp-Lab-Setup)

---
