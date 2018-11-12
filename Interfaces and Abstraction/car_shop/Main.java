import interfaces_and_abstraction.SimpleExercise.CarShop.Car;
import interfaces_and_abstraction.SimpleExercise.CarShop.Honda;

public class Main {
    public static void main(String[] args) {
        Car car = new Honda("Japan","HR-V","Grey",120);
        System.out.println(car);

    }
}
