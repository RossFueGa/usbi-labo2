import java.util.Scanner;
public class vanyaandfence
{
    public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);
       int n=in.nextInt() , h=in.nextInt(),per,sum=0;
       for(int i=0;i<n;i++)
       {
           per=in.nextInt();
           if(per>h)
                sum+=2;
           else
                sum++;
       }
       System.out.println(sum);
    }
}