package praktikum_3;

public class Cat extends Mammal{
    private boolean isIndoor;

    public Cat (String name, String furColour, boolean isIndoor) {
        super (name, furColour);
        this.isIndoor= isIndoor;
    }
    public void meow () {
        System.out.println(name + "is meowing: meow meow");
    }
    @Override
    public void eat () {
        System.out.println(name + "teh cat is eating cat food");
    }
}