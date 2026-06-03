
import java.util.Scanner;

public class PlacementCriteria {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter CGPA: ");
        double cgpa = input.nextDouble();

        System.out.print("active backlog?: ");
        boolean backlog = input.nextBoolean();

        System.out.print("Enter attendance percentage: ");
        double attendance = input.nextDouble();

        if (cgpa >= 7.0 && backlog == false && attendance >= 75) {
            System.out.println("Eligible for Placement");
        }
        else {
            System.out.println("Not Eligible for Placement");
        }
    }
}