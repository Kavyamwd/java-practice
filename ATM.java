import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        double balance = input.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double amount = input.nextDouble();

        if (amount % 100 != 0) {
            System.out.println("Amount should be multiple of 100");
        }
        else if (amount > balance) {
            System.out.println("Insufficient Balance");
        }
        else if (balance - amount < 1000) {
            System.out.println("Minimum balance of 1000 must remain");
        }
        else {
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance = " + (balance - amount));
        }
    }
}
