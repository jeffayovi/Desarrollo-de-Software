import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
         /***
         * Escribir un algoritmo para determinar el máximo común divisor (MCD) de dos números enteros (MCD) por el algoritmo de Euclides:
           • Dividir el mayor de los dos enteros positivos por el más pequeño.
           • Luego dividir el divisor por el resto.
           • Continuar el proceso de dividir el último divisor por el último resto hasta que la división sea exacta.
           • El último divisor es el MCD.
         */
        Scanner entrada = new Scanner(System.in);

        int a, b, resto;

        System.out.println("Ingrese el primer numero entero positivo (a): ");
        a = entrada.nextInt();
        System.out.println("Ingrese el segundo numero entero positivo (b): ");
        b = entrada.nextInt();

        // Asegurarse de que 'a' sea el mayor
        if (a < b) {
            int auxiliar = a;
            a = b;
            b = auxiliar;   
        }

        // Algoritmo de Euclides
        while (b != 0) {
            resto = a % b;
            a = b;  // Actualizar 'a' al último divisor
            b = resto;  // Actualizar 'b' al resto
        }

        System.out.println("El Máximo Común Divisor (MCD) es: " + a);
        entrada.close();  
    }
    
}
