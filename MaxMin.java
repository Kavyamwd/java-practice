import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = input.nextInt();

        int arr[] = new int[n];

        int i = 0;

        System.out.println("Enter elements:");

        while (i < n) {
            arr[i] = input.nextInt();
            i++;
        }

        int max = arr[0];
        int min = arr[0];

        i = 1;

        while (i < n) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }

            i++;
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}