package farm;

public class Worker{
    private String name;
    private int id;
    private double fruitsPower;
    private double vegetablePower;

    public Worker(String name, int id, double fruitsPower, double vegetablePower) {
        this.name = name;
        this.id = id;
        this.fruitsPower = fruitsPower;
        this.vegetablePower = vegetablePower;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getFruitsPower() {
        return this.fruitsPower;
    }

    public void setFruitsPower(double fruitsPower) {
        this.fruitsPower = fruitsPower;
    }

    public double getVegetablePower() {
        return this.vegetablePower;
    }

    public void setVegetablePower(double vegetablePower) {
        this.vegetablePower = vegetablePower;
    }

    public double doWork(Area area) throws AreaException {
        if (!area.getType().equals("fruits") && !area.getType().equals("vegetables")) {
            throw new AreaException("Wrong type");
        }
        if (area.getType().equals("fruits")) {
            area.setAmount(area.getAmount() - this.fruitsPower);
            return fruitsPower;
        } else if (area.getType().equals("vegetables")) {
            area.setAmount(area.getAmount() - this.vegetablePower);
            return vegetablePower;
        }throw new AreaException("Ne");

    }

    public double doWork(Area area,boolean stickWithNet) throws AreaException {
        if(stickWithNet==true) {
            setVegetablePower(getVegetablePower() + getVegetablePower() * 60 / 100);
            setFruitsPower(getFruitsPower() + getFruitsPower() * 60 / 100);
        }
        if (!area.getType().equals("fruits") && !area.getType().equals("vegetables")) {
            throw new AreaException("Wrong type");
        }
        if (area.getType().equals("fruits")) {
            area.setAmount(area.getAmount() - this.fruitsPower);
            return fruitsPower;
        } else if (area.getType().equals("vegetables")) {
            area.setAmount(area.getAmount() - this.vegetablePower);
            return vegetablePower;
        }throw new AreaException("Ne");

    }

    public String toString(Area area) {
        ;
        return "Worker{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", fruitsPower=" + fruitsPower +
                ", vegetablePower=" + vegetablePower +
                ", left="+area.getAmount();
    }
}



