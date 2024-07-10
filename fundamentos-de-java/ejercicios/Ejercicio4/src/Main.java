import java.util.Scanner;

/***
 * Escribir un programa para convertir una medida dada en pies a sus equivalentes en
 * a) yardas, b) pulgadas, c) centímetros y d) metros (1 pie = 12 pulgadas, 1 yarda = 3 pies,
 * 1 pulgada = 2.54 cm, 1 m = 100 cm). Después, ingresar el número de pies e imprimir el
 * número de yardas, pies, pulgadas, centímetros y metros.
 */
public class Main {
    public static void main(String[] args) {
        float pies = 0;
        float yardas = 0,pulgadas = 0,centimetros = 0,metros = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresar medida de pies: ");
        pies = entrada.nextFloat();

        yardas = pies / 3;
        pulgadas = pies * 12;
        centimetros = pulgadas * 2.54f;
        metros = centimetros / 100;

        System.out.println("Pies: "+pies);
        System.out.println("Yardas: "+yardas);
        System.out.println("Pulgadas: "+pulgadas);
        System.out.println("Centigramos: "+centimetros);
        System.out.println("Metro: "+metros);
        entrada.close();





    }
}