import java.util.Scanner;

public class Lab2Task2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int s=0;
        int m=0;
        int h=0;
        System.out.println("how many seconds?");
        s=input.nextInt();
        if(s>=60){
            m=s/60;
            s=s-m*60;
        }if(m>=60){
            h=m/60;
            m=m-h*60;
        }
        System.out.println(s+"s="+h+"h"+m+"m"+s+"s");
    }
}
