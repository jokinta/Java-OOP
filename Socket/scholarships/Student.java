package scholarships;

public class Student {
    private String name;
    private double rating;
    private double amount;

    public Student(String name,double rating,double amount){
        this.name=name;
        this.rating=rating;
        this.amount=amount;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName()).append(" ").append(getAmount()).append(" ").append(getRating());
        return sb.toString();
    }
}
