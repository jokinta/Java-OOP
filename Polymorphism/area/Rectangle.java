package Polymorphism.area;

public class Rectangle {
    private double sideA;
    private double sideB;

    protected Rectangle(double sideA) {
        this.sideA = sideA;
    }

    protected Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double area(){
        return this.sideA * this.sideB;
    }

    public double getSideA() {
        return this.sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return this.sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
}
