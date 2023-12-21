
package com.mycompany.mavenproject1;

/**
 *
 * @author SALAI
 */
public class lol {

    public static void main(String[] args) {
        int limitMt = 6;
        int mt[][] = new int[limitMt][limitMt];

        int matrizNumero = 0;
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++) {
                mt[i][j] = matrizNumero;
                System.out.print(mt[i][j] + "\t");
                matrizNumero++;
            }
            System.out.println("");
        }
        
        imprimirMatrizDiagonal(mt);
     
    }
    
    public static void imprimirMatrizDiagonal(int[][] mt){
           for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < i; j++) {
               
                   System.out.print(mt[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
