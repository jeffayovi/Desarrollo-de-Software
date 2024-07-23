import java.util.Scanner;

/***
 * Leer una serie de números distintos de cero (el último número de la serie es –99) y obtener el número mayor. Como resultado se debe visualizar
 * el número mayor y un mensaje de indicación de número negativo, caso de que se haya leído un número negativo.
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int mayor = Integer.MIN_VALUE;
        boolean numeroNegativoLeido = false;
        int numero;

        System.out.println("Ingresa un número (termina con -99):");
        numero = entrada.nextInt();

        while (numero != -99){
            if(numero < 0){
                numeroNegativoLeido = true;
            }
            if (numero > mayor){
                mayor = numero;
            }
            System.out.println("Ingresa un número (termina con -99):");
            numero = entrada.nextInt();
        }
        System.out.println("El número mayor es:" +mayor);

        if (numeroNegativoLeido){
            System.out.println("Se leyo al menos un numero negativo");
        }

    }
}