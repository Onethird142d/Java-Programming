import java.util.Scanner;
public class Lab2Task13 {
    public static void main(String[] args) {
        int score;
        System.out.print("请输入分数：");
        Scanner in=new Scanner(System.in);
        score=in.nextInt();
        if(score>=90)
        {
            double a;
            a=score*1.03;
            System.out.print(a);
        }
        else
        {
            double b;
            b=score*1.01;
            System.out.print(b);
        }
    }
}
