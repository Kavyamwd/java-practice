import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = input.nextInt();

        boolean isPrime = isPrime(num);

        if (isPrime) {
            System.out.println("No is Prime");
        }
        else {
            System.out.println("No is not Prime");
        }
    }

    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        int i = 2;

        while (i < num) {

            if (num % i == 0) {
                return false;
            }

            i++;
        }

        return true;
    }
}