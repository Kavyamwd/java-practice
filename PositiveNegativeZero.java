
import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = input.nextInt();

        int arr[] = new int[n];

        int positive = 0;
        int negative = 0;
        int zero = 0;

        int i = 0;

        System.out.println("Enter elements:");

        while(i < n) {

            arr[i] = input.nextInt();

            if(arr[i] > 0) {
                positive++;
            }
            else if(arr[i] < 0) {
                negative++;
            }
            else {
                zero++;
            }

            i++;
        }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
        System.out.println("Zero = " + zero);
    }
}