import java.util.Scanner;

/***
 * Escribir un programa que lea dos enteros de tres dígitos y calcule e imprima producto,
 * cociente y resto cuando el primero se divide entre el segundo.
 *  739 739
 *  x 12 / 12
 *  8868 R = 7 Q = 61
 */

public class Main {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        int numero1,numero2;
        int producto,cociente,resto;

        System.out.printf("Ingresa un numero entero de tres digitos: ");
        numero1 = entrada.nextInt();
        System.out.printf("Ingresa otro numero entero de tres digitos: ");
        numero2 = entrada.nextInt();

        if(numero1 >= 100 && numero1 <= 999 && numero2 >= 100 && numero2 <= 999){
            producto = numero1 * numero2;
            cociente = numero1 / numero2;
            resto = numero1 % numero2;
            System.out.println("Producto: "+producto);
            System.out.println("Cociente: "+cociente);
            System.out.println("Resto: "+resto);

        }else {
            System.out.println("no tiene numeros de tres digitos ");
        }
        entrada.close();

    }
}