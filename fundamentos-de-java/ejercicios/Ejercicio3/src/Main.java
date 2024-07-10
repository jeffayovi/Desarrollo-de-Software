import java.util.Scanner;

/***
 * Este sistema de ecuaciones lineales
 * ax + by = c
 *  dx + ey = f
 * se puede resolver con las siguientes fórmulas:
 * x ce bf
 * ae bd = −
 * −
 * y af cd
 * ae bd = −
 * −
 *  Diseñar un programa que lea dos conjuntos de coeficientes (a, b, y c ; d, e y f) y visualice los valores de x y y.
 */
public class Main {
    public static void main(String[] args) {
        float a,b,c,d,e,f;
        float x = 0;
        float y = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el coeficiente a: ");
        a = entrada.nextFloat();

        System.out.println("Ingresa el coeficiente b: ");
        b = entrada.nextFloat();

        System.out.println("Ingresa el coeficiente c: ");
        c = entrada.nextFloat();

        System.out.println("Ingresa el coeficiente d: ");
        d = entrada.nextFloat();

        System.out.println("Ingresa el coeficiente e: ");
        e = entrada.nextFloat();

        System.out.println("Ingresa el coeficiente f: ");
        f = entrada.nextFloat();

        x = (c * e - b * f) / (a * e - b * d);
        y = (a * f - c * d) / (a * e - b * d);

        System.out.println(" Valores de x: "+x);
        System.out.println("Valor de y : "+y);


    }
}