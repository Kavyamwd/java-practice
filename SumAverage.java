

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = input.nextInt();

        int arr[] = new int[n];

        int sum = 0;

        int i = 0;

        System.out.println("Enter elements:");

        while (i < n) {
            arr[i] = input.nextInt();
            sum = sum + arr[i];
            i++;
        }

        int average = sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}