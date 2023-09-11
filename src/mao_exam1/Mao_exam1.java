/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mao_exam1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Mao_exam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
         int[] Array = {1,2,3,4,5};
       Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("choose number");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    number1(scanner);
                    break;
                case 2:
                    number2(scanner);
                    break;
                case 3:
                    number3(scanner);
                    break;
                case 4:
                    number4(scanner);
                    break;
                case 5:
                   number5(scanner);
                   
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void number1(Scanner scanner) {
      int[] array = {1,-2,3,-4,5};
        System.out.println("element in array:" + Arrays.toString(array));
       Scanner in = new Scanner(System.in);
       int size ;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[i]> array[j]) {
                     size = array[i];
                     array[i]=array[j];
                     array[j]=size;
                    
                }
            }
            
        }
        
        
       
    }
     private static void number2(Scanner scanner) {
   
      
    
       
        
    

        
}
      private static void number3(Scanner scanner) {
          
         Scanner in = new Scanner(System.in);
        System.out.println("Enter Elements To Sort: ");
        int size = in.nextInt();
        
        int iArr[] = new int [size];
        System.out.println("Enter"+ size + "Integers: ");
        for (int i=0; i<size; i++){
            iArr[i] = in.nextInt();
            
        } 
        for(int number:iArr) {
            System.out.println("number" + number);
            
        }
          
          
     
}
      private static void number4(Scanner scanner) {
   
           Scanner in = new Scanner(System.in);
        System.out.println("Enter number of Elements 2 to 20: ");
        int size = in.nextInt();
        
        int positiveEvenNumbers[] = new int [size];
        System.out.println("Enter numbers 2 to 20" +size);
        for (int i=0; i<size; i++){
            positiveEvenNumbers[i] = in.nextInt();
            
        } 
        for(int number:positiveEvenNumbers) {
            System.out.println("number" + number);
            
        }
        
          
          
}
      private static void number5(Scanner scanner) {
        
           Scanner in = new Scanner(System.in);
           
         System.out.println("input fibonachi sequence:");
        int size = in.nextInt();
        
          for (int i = 0; i < sequence.length; i++) {
              
          }
        
                  
}
}
      


     
