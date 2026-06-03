import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.print("Enter third number: ");
        int c = input.nextInt();

        if(a > b && a > c) {
            System.out.println("Largest number is " + a);
        }
        else if(b > c) {
            System.out.println("Largest number is " + b);
        }
        else {
            System.out.println("Largest number is " + c);
        }
    }
}