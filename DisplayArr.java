import java.util.Scanner;

public class DisplayArr {
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

        System.out.println("Array Elements:");

        i = 0;

        while(i < n) {
            System.out.print(arr[i] + " ");
            i++;
        }
    }
}