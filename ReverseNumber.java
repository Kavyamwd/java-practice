
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = input.nextInt();

        int reverse = reverse(num);

        System.out.println("Reverse Number: " + reverse);
    }

    public static int reverse(int num) {

        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        return rev;
    }
}