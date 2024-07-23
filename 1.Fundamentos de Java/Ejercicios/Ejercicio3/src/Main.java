/***
 * Calcular y visualizar la suma y el producto de los números pares comprendidos entre 20 y 400, ambos inclusive
 */
public class Main {
    public static void main(String[] args) {
        int sumaPares = 0;
        long productoPares = 1; // Cambiado a long para evitar overflow

        for (int numero = 20; numero <= 400; numero += 2) {
            sumaPares += numero;
            productoPares *= numero;
        }

        System.out.println("La suma de los numeros pares es: " + sumaPares);
        System.out.println("El producto de los numeros pares es: " + productoPares);
    }
}