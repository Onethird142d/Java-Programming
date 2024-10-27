public class task1 {
    public static void main(String[] args){
        int sum=0;
        int i=1;
        while(i<10){
            sum=sum+i;
            i++;//缺少这行会报错
        }
        System.out.println("Sum is "+sum);
    }
}
