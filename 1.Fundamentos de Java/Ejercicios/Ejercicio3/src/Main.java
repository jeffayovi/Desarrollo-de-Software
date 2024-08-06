/***
 * Diseñar un algoritmo que visualice y sume la serie de números 3, 6, 9, 12…, 99.
 */
public class Main {
    public static void main(String[] args) {
        int suma = 0;
        int numero = 3;

        while ( numero <= 99){
            System.out.println(numero);
            suma += numero;
            numero += 3;
        }
        System.out.println("La suma de la serie es: "+suma);
        


    }
}