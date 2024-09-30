import java.util.Scanner;
public class Lab2Task7 {
    public static void main(String[] args) {
        double DriveDistance,MilePerGallon,PricePerGallon,CostDrive;
        Scanner Input;

        System.out.print("Enter the driving distance:");
        Input = new Scanner(System.in);
        DriveDistance = Input.nextDouble();

        System.out.print("Enter miles per gallon:");
        Input = new Scanner(System.in);
        MilePerGallon = Input.nextDouble();

        System.out.print("Enter price per gallon:");
        Input = new Scanner(System.in);
        PricePerGallon = Input.nextDouble();

        CostDrive = DriveDistance / MilePerGallon * PricePerGallon;
        System.out.println("The cost of driving is $" + CostDrive);

        Input.close();
    }
}
