
import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n1 = input.nextInt();

        System.out.println("Enter size of second array:");
        int n2 = input.nextInt();

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        int arr3[] = new int[n1 + n2];

        int i = 0;

        System.out.println("Enter first array elements:");

        while(i < n1) {
            arr1[i] = input.nextInt();
            arr3[i] = arr1[i];
            i++;
        }

        i = 0;

        System.out.println("Enter second array elements:");

        while(i < n2) {
            arr2[i] = input.nextInt();
            arr3[n1 + i] = arr2[i];
            i++;
        }

        System.out.println("Merged Array:");

        i = 0;

        while(i < n1 + n2) {
            System.out.print(arr3[i] + " ");
            i++;
        }
    }
}