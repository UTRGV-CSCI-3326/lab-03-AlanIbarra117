public class BankAccount {

    public static void main(String[] args) {

        // Initial balance
        double balance = 2175.37;

        // Bob's transactions
        balance -= 302.50;      // Bob withdrew $302.50
        balance += 50.03;       // Bob deposited $50.03
        balance -= balance / 2; // Bob withdrew half of his current balance
        balance += 20.00;       // Bob deposited $20.00
        balance -= 1.00;        // Bob withdrew $1
        balance *= 2;           // Bob deposited his paycheck, doubling his balance
        balance += 1.00;      // Bob deposited $1

        // Output the final balance
        System.out.printf("Bob's new balance: $%.2f%n", balance);

    }
}
