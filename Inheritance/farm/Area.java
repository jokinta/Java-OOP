package farm;

public class Area {
    private double size;
    private String type;
    private double amount;

    public Area(double size, String type, double amount) {
        setSize(size);
        this.type = type;
        setAmount(amount);
    }

    public double getSize() {
        return this.size;
    }

    public void setSize(double size) {
        if (size <= 0) {

        } else {
            this.size = size;
        }
    }


    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        if (amount < 0 || amount > getSize() * 100) {

        } else {
            this.amount = amount;
        }
    }
}
