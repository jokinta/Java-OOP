package Polymorphism.area;

public class Square extends Rectangle {

    public Square(double sideA) {
        super(sideA);
    }

    @Override
    public double area() {
        return super.getSideA()*super.getSideA();
    }
}
