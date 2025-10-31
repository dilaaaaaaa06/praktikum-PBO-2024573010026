package praktikum_3;

public class InheritanceTypeTest {
    public static void main(String[] args) {

        Dog dog = new Dog("Buddy", "Brown", "Golden Retriever");
        dog.eat();
        dog.sleep();
        dog.giveBirth();
        dog.bark();

        System.out.println();


        Cat cat = new Cat("Whiskers", "White", true);
        cat.eat();
        cat.sleep();
        cat.giveBirth();
        cat.meow();

        System.out.println();


        Animal[] animals = {new Dog("Max", "Black", "Labrador"),
                new Cat("Luna", "Gray", false)};

        for (Animal animal : animals) {
            animal.eat();
        }
         }
    }
