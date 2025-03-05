/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva2wed;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class V2Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int num=sc.nextInt();
        System.out.print("Width:");
        int width=sc.nextInt();
        System.out.println(format(num,width));
       
    }
    
    public static String format(int num, int width){
        String numstr=String.valueOf(num);
        int numlength=numstr.length();
        int leftoverlength=width-numlength;
        String finalreturn="";
        
        if(leftoverlength<0){
            return numstr;
        }else{
            for(int i=0;i<leftoverlength;i++){
                finalreturn+="0";
            }
            finalreturn+=numstr;
        }
        return finalreturn;
    }
}
