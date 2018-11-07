package Polymorphism.area;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5,10);
        Rectangle squere = new Square(10);
        System.out.println(rect.area());
        System.out.println(squere.area());
    }
}
