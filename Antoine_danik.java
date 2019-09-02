package anton_danik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Antoine_danik {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter  the number of games played.\n" +
"");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Now, you may enter uppercase English letters 'A' and 'D' — the outcome of each of the games.");
        String s = br.readLine();
        int anton = s.length() - s.replaceAll("A", "").length();
        int danik = s.length() - s.replaceAll("D", "").length();
        
        for(int i=0;i<s.length();i++)
           {
               if(s.charAt(i)=='A')
                  anton++;
               else
                   danik++;
           }
           if(anton>danik)
                System.out.println("Anton");
           else if(danik>anton)
                System.out.println("Danik");
           else
                System.out.println("Friendship");
    }
}