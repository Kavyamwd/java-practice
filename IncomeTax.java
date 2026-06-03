import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual income: ");
        double income = input.nextDouble();

        double tax;

        if (income <= 250000) {
            tax = 0;
        }
        else if (income <= 500000) {
            tax = income * 0.05;
        }
        else if (income <= 1000000) {
            tax = income * 0.20;
        }
        else {
            tax = income * 0.30;
        }

        System.out.println("Tax = Rs" + tax);
    }
}