public class prime{
    public static void main(String[] args) {
        int i,j,c;
        System.out.println("prime no.s between 2-100");
        for(i=2;i<100;i++){
            c=0;
            for(j=1;j<=i;j++)
        {

        if(i%j==0)
        {
            c++;
        }
    }
        if(c==2)
        {
            System.out.println(i);
       }
       }
       }
    }