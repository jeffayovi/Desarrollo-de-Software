import java.util.Scanner;

/***
 * Calcular y visualizar la longitud de la circunferencia y el área de un círculo de radio dado.
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double radio,circunferencia,area;

        System.out.println("Ingresa el radio de circulo: ");
        radio = entrada.nextFloat();

        circunferencia = 2 * Math.PI * radio;

        area = Math.PI * Math.pow(radio,2);

        System.out.println("Radio del circulo: "+radio);
        System.out.println("Longitud de la circuferencia: "+circunferencia);
        System.out.println(" Area de circulo: "+area);

        entrada.close();

    }
}