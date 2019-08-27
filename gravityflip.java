import java.util.*;
public class gravityflip
{
    public static void main(String[] args)
    {  
        Scanner s = new Scanner(System.in); 
        System.out.print("Ingresa cuantos numeros: ");
        int n = s.nextInt();  
        System.out.print("Ingresa los números: ");
        int a[] = new int[n];  
        for(int i = 0; i < n; i++)
        {  
            a[i] = s.nextInt();  
        }  
        Arrays.sort(a);  
        for(int i = 0 ; i < n-1; i++) 
        {  
            System.out.print(a[i]+" ");  
        }  
        System.out.println(a[n-1]);  
    }  
}