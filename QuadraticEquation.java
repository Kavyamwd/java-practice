import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = input.nextInt();

        System.out.print("Enter value of b: ");
        int b = input.nextInt();

        System.out.print("Enter value of c: ");
        int c = input.nextInt();

        int d = (b * b) - (4 * a * c);

        if (d > 0) {
            System.out.println("Real and Distinct Roots");
        }
        else if (d == 0) {
            System.out.println("Real and Equal Roots");
        }
        else {
            System.out.println("Imaginary Roots");
        }
    }
}
