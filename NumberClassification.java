import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("Positive Number");
        }
        else {
            System.out.println("Not a Positive Number");
        }

        if (num % 2 == 0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        }
        else {
            System.out.println("Not divisible by both 3 and 5");
        }
    }
}