import java.util.Scanner;

public class CountEvenOddDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = input.nextInt();

        int even = 0;
        int odd = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            num /= 10;
        }

        System.out.println("Even Digits = " + even);
        System.out.println("Odd Digits = " + odd);
    }
}