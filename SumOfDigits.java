import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = input.nextInt();

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.println("Sum of Digits: " + sum);
    }
}