package bankacc;


public class BankAccount {
    private static final double DEFAULT_INTEREST_RATE = 0.02;
    private static int idSequence;
    private static int interestRate;
    private int id;
    private double balance;

    public BankAccount() {
        interestRate = (int) DEFAULT_INTEREST_RATE;
        this.id = ++idSequence;
    }

    public static void setInterest(double interest) {

        interestRate = (int) interest;
    }

    public double getInterestRate(int years) {
        return this.balance * interestRate * years;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public int getId() {
        return id;
    }
}
