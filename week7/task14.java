import java.util.Scanner;
public class task14 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        // Make gcd to be the minimum of n1 and n2
        int gcd = n1 < n2 ? n1 : n2;

        // Find the greatest common divisor
        while (n1 % gcd != 0 || n2 % gcd != 0) {
            gcd--;
        }

        // Display result
        System.out.println("The greatest common divisor for " + n1 +
                " and " + n2 + " is " + gcd);
    }
    public static int[] getArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100) + 1;
        }
        return array;
    }
}
