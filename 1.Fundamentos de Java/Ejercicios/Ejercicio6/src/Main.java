/***
 * Calcular la suma de los cuadrados de los 100 primeros números naturales
 */
public class Main {
    public static void main(String[] args) {
        int sumaCuadrados = 0;

        for (int numero = 1; numero <= 100; numero++) {
            int cuadrado = numero * numero;
            sumaCuadrados += cuadrado;

        }
         System.out.println("La suma de los cuadrados de los primeros 100 numeros naturales es:  " +sumaCuadrados);
    }
}