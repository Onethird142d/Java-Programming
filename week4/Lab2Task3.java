public class Lab2Task3 {
    public static void main(String[] args){
        System.out.println("if today is Tuesday,what will be the day in 100");
    int nowday=2;
    int day=100%7;
    switch(day){
        case 0:
            System.out.println("today is tuesday");
            break;
        case 1:
            System.out.println("today is wednesday");
            break;
        case 2:
            System.out.println("today is thursday");
            break;
        case 3:
            System.out.println("today is friday");
            break;
        case 4:
            System.out.println("today is saturday");
            break;
        case 5:
            System.out.println("today is sunday");
            break;
        case 6:
            System.out.println("today is monday");
            break;
    }
    }
}
