import java.util.Scanner;

public class EOCounting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = input.nextInt();

        int arr[] = new int[n];

        int even = 0;
        int odd = 0;

        int i = 0;

        System.out.println("Enter elements:");

        while (i < n) {

            arr[i] = input.nextInt();

            if (arr[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }

            i++;
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}