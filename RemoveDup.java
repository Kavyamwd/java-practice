
import java.util.Scanner;

public class RemoveDup {
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

        System.out.println("Unique Elements:");

        i = 0;

        while(i < n) {

            int j = 0;

            while(j < i) {

                if(arr[i] == arr[j]) {
                    break;
                }

                j++;
            }

            if(j == i) {
                System.out.print(arr[i] + " ");
            }

            i++;
        }
    }
}