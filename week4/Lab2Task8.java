import java.util.Scanner;
public class Lab2Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the side of a hexagon
        System.out.print("Enter the length of the side: ");
        double s = input.nextDouble();

        // Compute the area of a hexagon
        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

        // Display result
        System.out.printf("The are of the hexagon is %4.2f\n", area);
    }
}
