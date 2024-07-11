import java.util.Scanner;

/***
 * Escribir un programa que solicite ingresar longitud y anchura de una habitación; hecho
 * esto, visualice su superficie con esos datos.
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la longitud de la habitación (en metros):");
        double longitud = entrada.nextDouble();

        System.out.println("Ingrese la anchura de la habitación (en metros):");
        double anchura = entrada.nextDouble();

        // Calcular la superficie de la habitación
        double superficie = longitud * anchura;

        System.out.println("La superficie de la habitación es " + superficie + " metros cuadrados" );
        entrada.close();

        

    }
}