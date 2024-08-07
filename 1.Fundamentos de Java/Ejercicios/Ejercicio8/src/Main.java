import java.util.Scanner;

/***
 * Escribir un algoritmo que calcule la superficie de un triángulo en función de la base y la altura (S = 1/2 base × altura).
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float base,altura,superficie;

        System.out.println("Ingresa la base de triangulo: ");
        base = entrada.nextFloat();
        System.out.println("Ingresa la altura de triangulo: ");
        altura = entrada.nextFloat();

        superficie = (1.0f/2) * base * altura;

        System.out.println("La superficie del triangulo: "+superficie);


    }
}