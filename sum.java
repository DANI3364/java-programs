import java.util.Scanner;
public class sum{
    public static void main(String[] args) {
        Scanner myinput=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter 1st number");
        a=myinput.nextInt();
        System.out.println("enter 2nd number");
        b=myinput.nextInt();
        c=a+b;
        System.out.println("sum="+c);

    }
}