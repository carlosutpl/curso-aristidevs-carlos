package clasewednesday;

/**
 *
 * @author SALAI
 */
public class CalculadoraMatrices {

    public static void main(String[] args) {
        int limitFilas = 3, limitColumnas = 3;
        int matriz1[][] = new int[limitFilas][limitColumnas];
        int matriz2[][] = new int[limitFilas][limitColumnas];

        int matrizSuma[][] = new int[limitFilas][limitColumnas];
        int matrizResta[][] = new int[limitFilas][limitColumnas];
        int matrizMultiplicacion[][] = new int[limitFilas][limitColumnas];
        
        generarMatriz(matriz1, limitFilas, limitColumnas);
        System.out.println("La matriz 1 generada es: ");
        System.out.println(getMatriz(matriz1, limitFilas, limitColumnas));

        generarMatriz(matriz2, limitFilas, limitColumnas);
        System.out.println("La matriz 2 generada es: ");
        System.out.println(getMatriz(matriz2, limitFilas, limitColumnas));

        sumarMatrices(matriz1, matriz2, matrizSuma, limitFilas, limitColumnas);
        restarMatrices(matriz1, matriz2, matrizResta, limitFilas, limitColumnas);
        
        
        System.out.println("La suma de matrices es: \n" + getMatriz(matrizSuma, limitFilas, limitColumnas));
       
         System.out.println("La resta de matrices es: \n" + getMatriz(matrizResta, limitFilas, limitColumnas));
    }

    public static void generarMatriz(int matriz[][], int limitFilas, int limitColumnas) {
        for (int i = 0; i < limitFilas; i++) {
            for (int j = 0; j < limitColumnas; j++) {
                matriz[i][j] = (int) (Math.random() * (9 - 0 + 1) + 0);
            }
        }
    }

    public static String getMatriz(int matriz[][], int limitFilas, int limitColumnas) {
        String cadena = "";
        for (int i = 0; i < limitFilas; i++) {
            for (int j = 0; j < limitColumnas; j++) {
                cadena += String.format("%d\t", matriz[i][j]);
            }
            cadena += "\n"; //Salto de linea \n
        }

        return cadena;
    }

    public static void sumarMatrices(int matriz1[][], int matriz2[][], int matrizResultado[][], int limitFilas, int limitColumnas) {
        for (int i = 0; i < limitFilas; i++) {
            for (int j = 0; j < limitColumnas; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }

        }
    }

    public static void restarMatrices(int matriz1[][], int matriz2[][], int matrizResultado[][], int limitFilas, int limitColumnas) {
        for (int i = 0; i < limitFilas; i++) {
            for (int j = 0; j < limitColumnas; j++) {
                matrizResultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }

        }
    }
    
     public static void multiplicarMatrices(int matriz1[][], int matriz2[][], int matrizResultado[][], int limitFilas, int limitColumnas) {
        for (int i = 0; i < limitFilas; i++) {
            for (int j = 0; j < limitColumnas; j++) {
                matrizResultado[i][j] = matriz1[i][j] * matriz2[i][j];
            }

        }
    }
}
