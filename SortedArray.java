
import java.util.Scanner;

public class SortedArray {
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

        i = 0;

        while(i < n - 1) {

            if(arr[i] > arr[i + 1]) {
                System.out.println("Array is Not Sorted");
                return;
            }

            i++;
        }

        System.out.println("Array is Sorted");
    }
}