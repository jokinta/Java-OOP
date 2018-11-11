package interfaces_and_abstraction.SimpleExercise.ShapesDrawing;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Drawable circle = new Circle(10);

        Drawable rectangle = new Rectangle(5, 7);

        rectangle.draw();

        circle.draw();
    }

}
