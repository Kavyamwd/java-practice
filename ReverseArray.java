import java.util.Scanner;

public class ReverseArray {
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

        int start = 0;
        int end = n - 1;

        while(start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Reversed Array:");

        i = 0;

        while(i < n) {
            System.out.print(arr[i] + " ");
            i++;
        }
    }
}