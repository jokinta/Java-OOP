package Polymorphism.abstract_class;

public class Cirlcle extends Shape{

    protected Cirlcle(String type) {
        super(type);
    }

    public void print(){
        System.out.println("dasda");
    }

    @Override
    public int area() {
        return 1;
    }
}