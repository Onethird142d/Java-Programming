import java.util.Scanner;
public class task15 {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();//将str倒置的方法
        String newStr=new String(sb);
        if(str.equals(newStr)){
            System.out.println(str+" is a palindrome");
        }else{
            System.out.println(str+" is not a palindrome");
        }
    }
}
