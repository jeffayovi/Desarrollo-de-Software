/***
 * Leer 500 números enteros y obtener cuántos son positivos.
 */
public class Main {
    public static void main(String[] args) {

        int contadorPositivos = 0;

        for (int numero = 1; numero <= 500; numero++) {
            if (numero > 0){
                contadorPositivos += 1;
            }

        }
        System.out.println("Total de numero positivos: " +contadorPositivos);
    }
}