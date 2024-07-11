import java.util.Scanner;

/***
 *  Escribir un programa en el que se introduzca como dato de entrada la longitud del perímetro de un terreno, expresada con tres números enteros que representen hectómetros,
 * decámetros y metros, respectivamente; escribir la longitud en decímetros con un rótulo
 * representativo.
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la longitud del perímetro del terreno en hectómetros:");
        int hectometros = entrada.nextInt();

        System.out.println("Ingrese la longitud del perímetro del terreno en decámetros:");
        int decametros = entrada.nextInt();

        System.out.println("Ingrese la longitud del perímetro del terreno en metros:");
        int metros = entrada.nextInt();

        // Convertir a decímetros
        int decimetrosTotal = (hectometros * 10000) + (decametros * 100) + (metros / 10);

        System.out.printf("La longitud del perímetro del terreno es "+ decimetrosTotal + " decímetros" );

    }
}