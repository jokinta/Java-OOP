package Polymorphism.animal;

public class Fish implements animal {
    @Override
    public void move() {
        System.out.println("swim");
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
        return 1;
    }
}
