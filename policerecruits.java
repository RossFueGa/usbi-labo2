/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrimexico1
 */
import java.util.Scanner;

public class policerecruits {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int mc=0;   //police men counter
        int in=0;
        int c=0; //crimes
        for(int i=0;i<n;++i){
            in = s.nextInt();
            if(in>0){
                mc+=in;
            }
            if(in<0){
                if(mc<=0){
                    c++;
                }else
                mc--;
            }
        }
        System.out.println(c);
    }
}
