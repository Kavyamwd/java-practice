
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = input.nextInt();

        int arr[] = new int[n];

        int i = 0;

        System.out.println("Enter elements:");

        while(i < n) {
            arr[i] = input.nextInt();
            i++;
        }

        int largest = arr[0];
        int secondLargest = arr[0];

        i = 1;

        while(i < n) {

            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }

            i++;
        }

        System.out.println("Second Largest = " + secondLargest);
    }
}