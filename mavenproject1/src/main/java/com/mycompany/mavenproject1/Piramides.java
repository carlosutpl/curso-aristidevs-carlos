
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author SALAI
 */
public class Piramides {
    public static void main(String[] args) {
        //Piramide normal:
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la piramide");
        int longitud = sc.nextInt();
        
        for(int i = 0; i < longitud; i++){
           for(int j = 0; j <= i; j++){
               System.out.print("* ");
           }
            System.out.println("");
        }
        
        System.out.println("PIRAMIDE INVERTIDA");
        
          
        for(int i = 0; i < longitud; i++){
           for(int j = 0; j < (longitud-i); j++){
               System.out.print("* ");
           }
            System.out.println("");
        }
        System.out.println("MATRICES CUADRADAS");
        
        int limitMt = 5;
        int mt[][] = new int[limitMt][limitMt];
        
        for(int i = 0; i < mt.length; i++){
            for(int j = 0; j < mt.length; j++){
                mt[i][j] = (i+j);
            }
        }
        
          for(int i = 0; i < mt.length; i++){
            for(int j = 0; j < mt.length; j++){
                 System.out.print(mt[i][j] + " \t");
            }
              System.out.println("");
        }
          
          
    }
}
