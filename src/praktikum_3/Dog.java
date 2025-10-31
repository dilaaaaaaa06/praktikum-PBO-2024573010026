package praktikum_3;

public class Dog extends Mammal{
    private String breed;

    public Dog (String name, String furColour, String breed) {
        super (name, furColour);
        this.breed = breed;
    }
    public void bark () {
        System.out.println(name + "is barking: woof woof");
    }
    @Override
    public void eat () {
        System.out.println(name + " teh dpg is eating dog food");
    }
}
