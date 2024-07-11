import java.util.Scanner;

/***
 * Escribir un programa para obtener la hipotenusa y los ángulos agudos de un triángulo
 * rectángulo a partir de las longitudes de los catetos
 */
public class Main {
    public static void main(String[] args) {
        double cateto1 = 0;
        double cateto2 = 0;
        double hipotenusa = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la longitud del primer cateto:");
        cateto1 = entrada.nextDouble();
        System.out.println("Ingrese la longitud del primer cateto: ");
        cateto2 = entrada.nextDouble();

        hipotenusa = Math.hypot(cateto1,cateto2);
        System.out.println("La hipotenusa es "+hipotenusa);

        double angulo1 = Math.acos(cateto1 / hipotenusa);
        double angulo2 = Math.acos(cateto2 / hipotenusa);
        double angulo3 = Math.PI - angulo1 - angulo2;

        double angulo1Grados = Math.toDegrees(angulo1);
        double angulo2Grados = Math.toDegrees(angulo2);
        double angulo3Grados = Math.toDegrees(angulo3);


        System.out.printf("Los ángulos agudos son " + angulo1Grados+ " "+ angulo2Grados + " " + angulo3Grados);
        entrada.close();
        

    }
}