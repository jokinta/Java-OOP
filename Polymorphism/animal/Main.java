package Polymorphism.animal;

public class Main {
    public static void main(String[] args) {
        animal pig = new Pig();
        animal fish = new Fish();
        pig.move();
        fish.move();

    }
}
