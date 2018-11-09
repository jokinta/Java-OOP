package Polymorphism.abstract_class;

public abstract class Shape {
    private String type;

    protected Shape(String type){
        this.type=type;
    }

    public void print(){
        System.out.println(this.type );
    }

    public abstract int area();

}
