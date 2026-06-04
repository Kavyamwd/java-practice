
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = input.nextInt();

        int factorial = factorial(num);

        System.out.println("Factorial: " + factorial);
    }

    public static int factorial(int num) {

        int factorial = 1;

        while (num > 0) {
            factorial *= num;
            num--;
        }

        return factorial;
    }
}