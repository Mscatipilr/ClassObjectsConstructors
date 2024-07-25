public class BankAccount {
    //attributes
    private String name;
    private double balance;

    //constructor
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    //methods
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }

    public void print() {
        System.out.println(name + "'s account balance: " + balance);
        System.out.println(" ");
    }
}
