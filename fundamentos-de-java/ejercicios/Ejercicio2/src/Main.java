import java.util.Scanner;

/***
 * Una temperatura en grados Celsius o centígrados puede convertirse a su equivalente en
 * Fahrenheit de acuerdo con la siguiente fórmula:
 * f = 9
 * 5
 *  C + 32
 * Diseñe un programa que convierta una temperatura en grados Celsius a Fahrenheit.
 */
public class Main {
    public static void main(String[] args) {
        float C;
        float f = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresar la temperatura en grados Celsius o centígrados: ");
        C = entrada.nextFloat();

        f = (9.0f/5) * C + 32;

        System.out.println("La temperatura en grados Celsius a Fahrenheit es: "+f);
        entrada.close();




    }
}