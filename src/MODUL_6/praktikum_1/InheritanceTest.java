package MODUL_6.praktikum_1;

public class InheritanceTest {
    public static void main(String[] args) {
        Student student = new Student("Dila", 19, "2024573010026");

        student.displayInfo();
        student.study();
        student.greet();

        Person person = new Student("Nurul", 20, "2024573010002");
        person.greet();
    }
}
