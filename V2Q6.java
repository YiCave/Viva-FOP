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
public class V2Q6 {
    
    
    
    public static void main(String[] args) {
        
        int[][] matrix=parseMatrix();
        System.out.println("Original Matrix");
        displayMatrix(matrix);
        System.out.println("");
       
        
        rotateMatrix(matrix);
         System.out.println("New matrix");
        displayMatrix(matrix);
    }
    
    public static int[][] parseMatrix(){
        int[][]matrix;
        System.out.print("Enter the dimension of a square matrix(only from 1 to 100):");
        Scanner sc=new Scanner(System.in);
        int n=0;
        do{
             n=sc.nextInt();
        }while(n>100);
        
        matrix=new int[n][n];
        
       for(int i=0;i<n;i++){
           System.out.print("Row "+(i+1)+":");
           
           for(int j=0;j<n;j++){
           matrix[i][j]=sc.nextInt(); //will only read one token
           }
           
          
       }
       
       
        return matrix;
           
       
    }
    
    public static void displayMatrix(int[][] matrix){
        
        for(int[]rows:matrix){
            for(int num:rows){
                System.out.print(num+" ");
            }
            System.out.println("");
        }
        
    }
    
    public static int[][] transposematrix(int[][]matrix){
       // int[][]storer=matrix; //this DO NOT prevent altering the original matrix because they refer to THE SAME ADDRESS
       //instead, we do this(implement DEEP COPY)
       int[][]storer=new int[matrix.length][matrix.length];
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix.length;j++){
               storer[i][j]=matrix[i][j]; //this is because primitive type IS UNIQUE AND WONT BE THE SAME FOR EACH OTHER!!!!!
           }
       }
       
       int[][]emptyarray=new int[storer.length][storer.length];
       //here start to transpose
       for(int i=0;i<storer.length;i++){
           for(int j=0;j<storer.length;j++){
               emptyarray[i][j]=storer[j][i]; //dont do smtg like array[i][j]=[j][i]--it is not working for some nums cuz some ady CHANGED then it will refer to that value
           }
       }
        return emptyarray;
    }
    
    public static void rotateMatrix(int[][]matrix){
        
        int[][]storer=transposematrix(matrix);
        
        System.out.println("Transposed Matrix");
        for(int[]rows:storer){
            for(int num:rows){
                System.out.print(num+" ");
            }System.out.println("");
        }
        
        int last=storer.length-1;
       
        
        for(int j=0;j<storer.length;j++){
            
            for(int i=0;i<storer.length;i++){
                matrix[i][j]=storer[i][last];
                
            }
            last--;
        }
        
        
    }
    
}
