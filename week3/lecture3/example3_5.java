import java.util.Scanner;
public class example3_5 {
    public static void main(String[] args){
        int score;
        System.out.print("please enter the score:");
        Scanner in=new Scanner(System.in);
        score=in.nextInt();
        if(score>=90){
            double a;
            a=score*1.03;
            System.out.print(a);
        }
        else{
            double b;
            b=score*1.01;
            System.out.print(b);
        }
    }
}
