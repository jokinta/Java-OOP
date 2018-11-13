import interfaces_and_abstraction.SimpleExercise.CarShop.*;

public class Main {
    public static void main(String[] args) {
    Sellable honda = new Honda("Japan", "HR-V", "Gray", 110, 11111.1);
        Rentable audi = new Audi("Japan","HR-V", "Gray", 110, 3,3.33);
        printCarInfo(honda);
        printCarInfo(audi);

    }

    private static void printCarInfo(Car car) {
        System.out.println(String.format("%s is %s color and have %s horse power", car.getModel(), car.getColor(), car.getHorsePower()));
        System.out.println(car.toString());
    }

}
