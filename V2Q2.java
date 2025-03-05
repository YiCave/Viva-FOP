/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva2wed;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class V2Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Array 1:");
        String arr1=sc.nextLine();
        System.out.print("\nArray 2:");
        String arr2=sc.nextLine();
        
        System.out.println("Below is the sorted Array");
        int[]finalarray=mergeArray(parseArray(arr1),parseArray(arr2));
        printer(finalarray);
    }
    
    static void printer(int[]finalfinalarray){
        System.out.print("{");
        for(int numbers:finalfinalarray){
            if(numbers==0){
                continue;
            }else{
                System.out.print(numbers+" ");
                
            }
        }
        System.out.print("}");
    }
    static int[] parseArray(String x){
        String[]array=x.split(",");
        int[]nums=new int[array.length];
        
        for(int i=0;i<array.length;i++){
            nums[i]=Integer.parseInt(array[i]);
        }
        
        return nums;
    }
    
    static int[] mergeArray(int[]arr1,int[]arr2){
        
        int counter=0;
        
        int maxlength=arr1.length+ arr2.length;
        
        int[]finalarray=new int[maxlength];
        
        int[] isPresent=new int[maxlength];
        
        for(int i=0;i<isPresent.length;i++){
            isPresent[i]=-1;
        }
        
        for(int i=0;i<arr1.length;i++){
            boolean isDuplicated=false;
            
            for(int j=0;j<isPresent.length;j++){
                
                if(arr1[i]==isPresent[j]){
                    isDuplicated=true;    
                    break;
            }    
            }
            
                if(!isDuplicated){
                    finalarray[counter]=arr1[i];
                    isPresent[counter]=arr1[i];
                    counter++;
                }
            
                
           
        }
        
        for(int i=0;i<arr2.length;i++){
            boolean isDuplicated=false;
            
            for(int j=0;j<isPresent.length;j++){
                
                if(arr2[i]==isPresent[j]){
                    isDuplicated=true;    
                    break;
            }    
            }
            
                if(!isDuplicated){
                    finalarray[counter]=arr2[i];
                    isPresent[counter]=arr2[i];
                    counter++;
                }
            
                
           
        }
        
        int[] finalfinalarray=BubbleSort(finalarray);
        
        return finalfinalarray;
        
        
    }
    
    static int[] BubbleSort(int[]numbers){
        int[]storer=numbers; //prevent altering the original array
        for(int i=0;i<storer.length-1;i++){
            for(int j=0;j<storer.length-i-1;j++){
                if(storer[j]>storer[j+1]){
                    int temp=storer[j+1];
                    storer[j+1]=storer[j];
                    storer[j]=temp;
                }
            }
        }
        return storer;
    }
}
