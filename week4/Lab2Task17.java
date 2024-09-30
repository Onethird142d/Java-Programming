import java.util.Scanner;
public class Lab2Task17 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random()*90)+10;

        System.out.println("请输入一个两位数：");

        int temp = sc.nextInt();

        if(num == temp) {
            System.out.println("恭喜，获得奖金10000美元");
        }else if(num == temp/10+temp%10*10) {
            System.out.println("恭喜，获得奖金3000美元");
        }else if(num/10==temp/10 || num%10==temp%10) {
            System.out.println("恭喜，获得奖金1000美元");
        }else if(num/10==temp%10 || num%10==temp/10){
            System.out.println("恭喜，获得奖金500美元");
        }else {
            System.out.println("彩票作废");
        }

    }
}
