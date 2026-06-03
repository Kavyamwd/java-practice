
import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        int a = input.nextInt();

        System.out.print("Enter second angle: ");
        int b = input.nextInt();

        System.out.print("Enter third angle: ");
        int c = input.nextInt();

        if (a + b + c == 180) {
            System.out.println("Valid Triangle");
        }
        else {
            System.out.println("Not a Valid Triangle");
        }

       
    }
}