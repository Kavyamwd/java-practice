import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }

        if (num % 5 == 0) {
            System.out.println("Divisible by 5");
        }
        else {
            System.out.println("Not Divisible by 5");
        }

        
    }
}