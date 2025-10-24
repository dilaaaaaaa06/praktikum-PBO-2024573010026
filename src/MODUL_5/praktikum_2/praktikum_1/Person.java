package MODUL_5.praktikum_2.praktikum_1;

public class Person {
    private String nama;
    private int umur;

    String alamat;

    protected String telepon;

    public String email;

    public Person (String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }


    public void tampilkaninfo() {
        System.out.println("INFORMASI PERSON");
        System.out.println("Nama :" + nama);
        System.out.println("Umur :"+ umur);
        System.out.println("Alamat :" + alamat);
        System.out.println("Telepon :" + telepon);
        System.out.println("Email :" + email);
    }

   private void metodePribadi () {
       System.out.println("Ini adalah metode private");
   }

   protected void metodeProtected () {
       System.out.println("Ini adalah metode protected");
   }
   public void panggilMetodePribadi () {
        metodePribadi () ;
   }
}
