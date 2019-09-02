package Petya_and_strings;

import java.util.Scanner;
public class petya_and_strings {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String a=input.next();
        a=a.toLowerCase();
        System.out.println("now, you may write the next word to compare");
        String b=input.next();
        b=b.toLowerCase();
        if(a.compareTo(b)==0)System.out.println("0");
        else if(a.compareTo(b)>0) System.out.println("1");
        else System.out.println("-1");


    }

}