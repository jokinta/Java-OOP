package interfaces_and_abstraction.SimpleExercise.CarShop;

import java.io.Serializable;

public class Honda implements Car,Serializable,Sellable {
    private String countryProduced;
    private String model;
    private String color;
    private Integer horsePower;
    private Double price;

    public Honda(String countryProduced,String model,String color,Integer horsePower,Double price){
        this.countryProduced=countryProduced;
        this.model=model;
        this.color=color;
        this.horsePower=horsePower;
        this.price = price;
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
    public Double getPrice() {
        return this.price;
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
