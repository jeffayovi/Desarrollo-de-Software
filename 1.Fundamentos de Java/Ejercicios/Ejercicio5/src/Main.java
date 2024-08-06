import java.util.Scanner;

/***
 * Diseñar un algoritmo que lea tres números y descubra si uno de ellos es la suma de los otros dos
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1,num2,num3;

        System.out.println("Ingresa primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Ingresa segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Ingresa tercero numero: ");
        num3 = entrada.nextInt();

        if (num1 == num2 + num3){
            System.out.println(num1 + " es la suma " + num2 + " y " +num3);
        } else if (num2 == num1 + num3) {
             System.out.println(num2 + " es la suma " + num1 + " y " +num3);
        } else if (num3 == num1 + num2) {
            System.out.println(num3 + " es la suma " + num1 + " y " +num2);
        }else {
            System.out.println("Ninguno de los numeros es la suma de los otros dos. ");
        }
        entrada.close();


    }
}