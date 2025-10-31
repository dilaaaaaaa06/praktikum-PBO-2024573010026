package praktikum_3;

public class Animal {
    public String name;

    public Animal (String name) {
        this.name = name;
    }
    public void eat () {
        System.out.println(name + "is eating");
    }

    public void sleep () {
        System.out.println(name + "is sleep");
    }
}
