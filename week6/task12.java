public class task12 {
    public static void main(String[] args) {
        int count = 0;
        int number = 0; //用于之后的每十个数换行使用
        for (int i = 2; count < 50; i++)
        //n和i都是从2开始的，因为最小的素数是2，count是从0~49正好50个素数，
        {
            int isprime = 1;           //如果是素数就为1，不是素数即为0
            for (int n = 2; n < i; n++)       //n被当作除数，i是被除数，n从2开始且小于i
            {
                if (i % n == 0)             //如果可以被整除，不是素数
                {
                    isprime = 0;
                    break;
                }
            }
            if (isprime == 1)          //(i%n!=0)，即为素数
            {
                System.out.print(i + " ");//输出
                number = number + 1;    //number自增，用于每十个数输出的换行
                count = count + 1;
                if (number % 10 == 0) {
                    System.out.println();
                }
            }
        }

    }
}
