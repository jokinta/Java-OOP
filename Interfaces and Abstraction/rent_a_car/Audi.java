package interfaces_and_abstraction.SimpleExercise.CarShop;

public class Audi implements Rentable {
    private String countryProduced;
    private String model;
    private String color;
    private Integer horsePower;
    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String countryProduced,String model,String color,Integer horsePower,Integer minRentDay,Double pricePerDay){
        this.countryProduced=countryProduced;
        this.model=model;
        this.color = color;
        this.horsePower=horsePower;
        this.minRentDay=minRentDay;
        this.pricePerDay=pricePerDay;
    }

    @Override
    public Integer getMinRentyDays() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String getCountryProduced() {
        return countryProduced;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("This is %s produced in %s and have %d tires",
                this.getModel(),
                this.countryProduced,TIERS));
        return sb.toString() ;
    }
}
