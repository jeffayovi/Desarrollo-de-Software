import java.util.Scanner;

/***
 * Diseñar un algoritmo para calcular la velocidad (en m/s) de los corredores de la carrera de 1500 metros. La entrada consistirá en parejas de números
 * (minutos, segundos) que dan el tiempo del corredor; por cada corredor, el algoritmo debe visualizar el tiempo en minutos y segundos, así como la velocidad media.
 * Ejemplo de entrada de datos: (3,53) (3,40) (3,46) (3,52) (4,0) (0,0); el último par de datos se utilizará como fin de entrada de datos.
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int minutos,segundos;
        int totalSegundos = 0;
        float velocidad;

        System.out.println("Ingresa los tiempos de los corredores (minutos,segundos)");
        System.out.println("Ingresa 0 para minutos y 0 para segundo para terminar ");

        while (true){
            System.out.println("Minutos: ");
            minutos = entrada.nextInt();
            System.out.println("Segundos: ");
            segundos = entrada.nextInt();

            if (minutos == 0 && segundos == 0){
                break;
            }

            totalSegundos = (minutos * 60) + segundos;
            velocidad = 1500.0f / totalSegundos;

            System.out.println("Tiempo: " + minutos + " minutos " + segundos + " segundos ");
            System.out.println("Velocidad media: " + velocidad + " m/s ");

        }


    }
}