/***
 * Se desea calcular independiente la suma de los números pares e impares comprendidos entre 1 y 200.
 */
public class Main {
    public static void main(String[] args) {

        int sumaPares = 0;
        int sumaImpares = 0;
/***
 * El primer bucle itera sobre los números impares, comenzando desde 1 hasta 200, incrementando el contador en 2 en cada iteración (numero += 2). Esto evita
 * la necesidad de verificar si el número es impar en cada iteración, ya que solo se procesan los números impares
 */
         for (int numero = 1; numero <= 200; numero += 2) {
            sumaImpares += numero;
        }
/***
 * El segundo bucle itera sobre los números pares, comenzando desde 2 hasta 200, incrementando el contador en 2 en cada iteración (numero += 2).
 * Al igual que en el caso de los números impares, esto evita la necesidad de verificar si el número es par en cada iteración.
 */
        for (int numero = 2; numero <= 200; numero += 2) {
            sumaPares += numero;
        }
        System.out.println("La suma de los numeros pares es: "+sumaPares);
        System.out.println("La suma de los numeros impares es: "+sumaImpares);

    }
}