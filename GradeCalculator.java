import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        double s1 = input.nextDouble();

        System.out.print("Enter marks of Subject 2: ");
        double s2 = input.nextDouble();

        System.out.print("Enter marks of Subject 3: ");
        double s3 = input.nextDouble();

        System.out.print("Enter marks of Subject 4: ");
        double s4 = input.nextDouble();

        System.out.print("Enter marks of Subject 5: ");
        double s5 = input.nextDouble();

        double total = s1 + s2 + s3 + s4 + s5;
        double percentage = total / 5;

        System.out.println("Percentage = " + percentage);

        if (percentage >= 90) {
            System.out.println("Grade A");
        }
        else if (percentage >= 80) {
            System.out.println("Grade B");
        }
        else if (percentage >= 70) {
            System.out.println("Grade C");
        }
        else if (percentage >= 60) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Grade F");
        }

        
    }
}
