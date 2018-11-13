package interfaces_and_abstraction.SimpleExercise.CarShop;

public interface Rentable extends Car{
    Integer getMinRentyDays();

    Double getPricePerDay();
}
