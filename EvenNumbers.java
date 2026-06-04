import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = input.nextInt();

        printEven(num);
    }

    public static void printEven(int num) {

        int i = 2;

        while (i <= num) {
            System.out.print(i + " ");
            i += 2;
        }
    }
}