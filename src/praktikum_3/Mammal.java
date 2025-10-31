package praktikum_3;

public class Mammal extends Animal {
    protected String furColour;

    public Mammal (String name, String furColour) {
        super (name);
        this.furColour= furColour;
    }

    public void giveBirth () {
        System.out.println(name + "is giving birth");
    }
}
