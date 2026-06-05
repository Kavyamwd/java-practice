
import java.util.Scanner;

public class CopyArr {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = input.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        int i = 0;

        System.out.println("Enter elements:");

        while(i < n) {
            arr1[i] = input.nextInt();
            i++;
        }

        i = 0;

        while(i < n) {
            arr2[i] = arr1[i];
            i++;
        }

        System.out.println("Copied Array:");

        i = 0;

        while(i < n) {
            System.out.print(arr2[i] + " ");
            i++;
        }
    }
}