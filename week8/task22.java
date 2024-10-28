import java.util.Scanner;
public class task22{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入十个数字");
        double arr[]=new double[10];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=input.nextDouble();
        }
        System.out.println("The minimum is  "+min(arr));
    }
    public static double min(double[] array)
    {
        double num=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<num)
            {
                num=array[i];
            }
        }
        return num;
    }

}