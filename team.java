import java.util.Scanner;
public class team
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int p=s.nextInt();
        int pe,ve,to,count=0;
        for(int i=0;i<p;i++)
        {
            int sum=0;
            pe=s.nextInt();
            ve=s.nextInt();
            to=s.nextInt();
            sum+=pe+ve+to;
            if(sum>=2)
              ++count;
        }
        System.out.println(count);
    }
}