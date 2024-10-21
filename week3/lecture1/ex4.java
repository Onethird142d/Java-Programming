import java.util.Scanner;
public class ex4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer for seconds:");
        int seconds = input.nextInt();

        int minutes = seconds/60;
        int remainSeconds = seconds % 60;
        System.out.println(seconds+" seconds is "+minutes+" minutes and "+remainSeconds+" seconds ");

    }
}
