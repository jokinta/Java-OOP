package encapsulation.first_and_reserve_team.class_box_data_validation;

public class Box {
    private double length;
    private double width;
    private double height;


    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        if(length<=0){
            throw new IllegalArgumentException("Lenght cannot be zero or negative.");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if(width<=0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if(height<=0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    public double calculateSurfaceArea(){
        return (2*this.length * this.width)*this.calculateLiteralSurfaceArea();
    }

    public double calculateLiteralSurfaceArea(){
        return (2*this.length*this.height)+(2*this.width*this.height);
    }

    public double calculateVolumeSurfaceArea(){
        return  this.length*this.width*this.height;

    }
}
