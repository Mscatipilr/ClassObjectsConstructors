public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Fred", 500);
        bankAccount1.deposit(100);
        bankAccount1.print();

        //Bank Transfer
        BankAccount bankAccount2 = new BankAccount("John", 5000);
        bankAccount2.withdraw(100);
        bankAccount2.print();

        BankAccount bankAccount3 = new BankAccount("Jane", 300);
        bankAccount3.deposit(100);
        bankAccount3.print();
        //end Bank Transfer
    }

}
/*
Example from notes:
Customer customer1 = new Customer("Dale");

        Customer customer2 = new Customer("Jane");
        Customer customer3 = new Customer("Bob");

        String typeOfCustomer1 = customer1.frequentCustomer();
        String typeOfCustomer2 = customer2.nonFrequentCustomer();
        String typeOfCustomer3 = customer3.frequentCustomer();

        customer1.howOld(21);
        customer1.printCustomer();

        customer2.howOld(56);
        customer2.printCustomer();

        customer3.howOld(33);
        customer3.printCustomer();
    }

    /*
public void returnsNothing() {
// the method body
// no return type, an example of this could be the howOld() method used already
}
public int returnsAnInteger() {
    // the method body, requires a return statement
        return 10;
}
public String returnsAString() {
    // the method body, requires a return statement
        return "returns a string";
}
etc
 */