package Polymorphism.animal;

public class Dog implements animal {
    @Override
    public void move() {
        System.out.println("move");
    }

    @Override
    public String makeSound() {
        return "barking";
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }

    @Override
    public double weightGain() {
        return 3;
    }
}
