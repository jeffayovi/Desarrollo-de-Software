import java.util.Scanner;

/***
 *  Diseñar un algoritmo que lea y visualice una serie de números distintos de cero. El algoritmo debe terminar con un valor cero que no se debe visualizar.
 * Visualizar el número de valores leídos.
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int numero;
        int contador = 0;

        System.out.println("Ingrese una serie de numeros distintos de cero(ingresa 0 para terminar): ");

        while (true){
            numero = entrada.nextInt();
            if (numero == 0){
                break;
            }
            System.out.println("Numeros leido: "+numero);
            contador += 1;
        }
        System.out.println("Cantidad de valores leidos: "+contador);
        entrada.close();

    }
}