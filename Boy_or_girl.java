package boy_or_girl;
import java.util.*;
import java.io.*;
public class Boy_or_girl  {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please introduce the string");
        String name = input.next();
        String temp = "";
        int count = 0;
        for(int i = 0;i< name.length();i++){
            if(!temp.contains(String.valueOf(name.charAt(i)))){
                temp+=name.charAt(i);
                count++;
            }else
                continue;
        }
        if(count %2==0){
            System.out.println("CHAT WITH HER!");
        }else
            System.out.println("IGNORE HIM!");
 
 
    }
}