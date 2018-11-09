package Polymorphism.abstract_class;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Cirlcle("Square");
        shape.print();
        System.out.println(shape.area());
    }
}
