package MODUL_6.praktikum_2;

public class Car extends Vehicle {
    private int numberofDoors;

    public Car (String brand, int speed, int numberofDoors) {
    super (brand, speed);
    this.numberofDoors = numberofDoors;
    }

@Override
 public void start() {
    super.start();
    System.out.println("Car engine is running smoothly");
}
public void honk () {
    System.out.println("beep beep");
    }
}

