import java.util.Scanner;

/***
 * Escribir un algoritmo que lea cuatro números y a continuación visualice el mayor de los cuatro
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1,num2,num3,num4;
        int mayor;

        System.out.println(" Ingrese el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println(" Ingrese el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println(" Ingrese el tercer numero: ");
        num3 = entrada.nextInt();
        System.out.println(" Ingrese el cuarto numero: ");
        num4 = entrada.nextInt();

        mayor = num1;

        if (num2 > mayor)
            mayor = num2;
        if (num3 > mayor)
            mayor = num3;
        if(num4 > mayor)
            mayor = num4;
        System.out.println("El mayor de los cuatro numeros es: "+mayor);
        entrada.close();


    }
}