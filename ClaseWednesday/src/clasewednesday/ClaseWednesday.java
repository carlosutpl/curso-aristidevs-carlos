/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasewednesday;

import java.util.Scanner;

/**
 *
 * @author SALAI
 */
public class ClaseWednesday {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double num1, num2, result;
        
        System.out.println("Ingresa two numbers my frein");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        
        System.out.println("La suma es: " + sumarNumeros(num1, num2));
          System.out.println("La resta es: " + restarNumeros(num1, num2));
            System.out.println("La multiplicacion es: " + multiplicacionNumeros(num1, num2));
    }
    
    public static double sumarNumeros(double num1, double num2){
        return num1+num2;
    }
    
      
    public static double sumarNumeros(int num1, int num2){
        return num1+num2;
    }
    
    
     public static double restarNumeros(double num1, double num2){
        return num1-num2;
    }
     
     
      public static double restarNumeros(int num1, int num2){
        return num1-num2;
    }
      
     public static double mutliplicacionNumeros(double num1, double num2){
        return num1*num2;
    }
     
        public static double multiplicacionNumeros(double num1, double num2){
        return num1*num2;
    }
    
    
    
    
}
