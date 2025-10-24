package MODUL_5.praktikum_2.praktikum_1;

public class AccessModifierTest {
    public static void main (String [] args) {
        Person person = new Person ("Budi Santoso", 25);

        person.email = "budi@email.com";
        System.out.println("Email: " + person.email);

        person.alamat = "Jakarta";
        System.out.println("Alamat: " + person.alamat);

        person.telepon = "08123445678";
        System.out.println("Telepon: " + person.telepon);

        person.tampilkaninfo();

        person.panggilMetodePribadi();

        System.out.println("\nDEMONSTRASI ACCESS MODIFIER");
        System.out.println("✓Public : Bisa diakses");
        System.out.println("✓Default : Bisa diakses (dalam package sama)");
        System.out.println("✓ Protected : Bisa diakses (dalam package sama)");
        System.out.println("Private : TIDAK bisa diakses langsung");
    }
}
