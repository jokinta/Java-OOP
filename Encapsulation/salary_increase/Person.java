package encapsulation.salary_increase;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {

        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void icreaseSalary(double bonus) {
        if (this.getAge() < 30) {
            this.setSalary(this.getSalary() * (1 + bonus / 200));
        } else {
            this.setSalary(this.getSalary() * (1 + bonus / 100));

        }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva", this.getFirstName(), this.getLastName(), this.getSalary());
    }
}
