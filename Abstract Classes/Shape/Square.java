package Polymorphism.abstract_class;

public abstract class Square extends Shape {

    private int side;
    protected Square(String type,int side) {
        super(type);
        this.side = side;
    }


}
