import java.util.Scanner;

/***
 * Diseñar un algoritmo para determinar los números primos iguales o menores que N (leído del teclado). (Un número primo sólo puede ser divisible por él mismo y
 * por la unidad.)
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int N;
        int contador = 0;

        System.out.println("Ingrese un numero entero positivo(N): ");
        N = entrada.nextInt();

        for (int i = 1;i <= N;i++){
            if (N % i == 0){
                contador += 1;
            }
        }
        if (contador == 2){
            System.out.println("El numero "+ N + " es primo");
        } else {
            System.out.println("El numero "+ N + " no es primo");
        }
        entrada.close();

    }



}