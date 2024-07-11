/***
 * Escribir sentencias de asignación que permitan intercambiar los valores de dos variable
 */
public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        // Guardar el valor de 'a' en una variable temporal
        int temp = a;
        // Cambiar el valor de 'a' por el valor de 'b'
        a = b;
        // Cambiar el valor de 'b' por el valor guardado en la variable temporal
        b = temp;

        System.out.println("Después del intercambio: a=" + a + ", b=" + b);

    }
}