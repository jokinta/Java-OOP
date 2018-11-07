package Polymorphism.animal;

public class Pig implements animal {
    @Override
    public void move() {
        System.out.println("move");
    }

    @Override
    public String makeSound() {
        return "sound";
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }

    @Override
    public double weightGain() {
        return 5;
    }
}
