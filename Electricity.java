import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = input.nextInt();

        int bill;

        if (units <= 100) {
            bill = units * 5;
        }
        else if (units <= 200) {
            bill = (100 * 5) + ((units - 100) * 7);
        }
        else {
            bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }

        System.out.println("Electricity Bill = rs" + bill);
    }
}