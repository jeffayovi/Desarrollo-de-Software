import java.util.Scanner;

/***
 * La fuerza de atracción entre dos masas, m1 y m2, separadas por una distancia d, está dada
 * por la fórmula:
 * F
 * Gm m
 * d = ∗ ∗1 2
 * 2
 *  donde G es la constante de gravitación universal G = 6.673 × 10–8 cm3/g ∙ seg2.
 *  Escribir un programa que solicite la masa de dos cuerpos y la distancia entre ellos
 * para obtener su fuerza gravitacional. La salida debe ser en dinas; un dina es igual a g ·
 * cm/seg2.
 */
public class Main {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la masa del primer cuerpo (en gramos):");
        double m1 = entrada.nextDouble();

        System.out.println("Ingrese la masa del segundo cuerpo (en gramos):");
        double m2 = entrada.nextDouble();

        System.out.println("Ingrese la distancia entre los cuerpos (en centímetros):");
        double d = entrada.nextDouble();

        // Constante de gravitación universal
        double G = 6.673e-8;

        // Calcular la fuerza gravitacional
        double F = (G * m1 * m2) / Math.pow(d, 2);

        // Convertir a dinas
        double F_dinas = F * 9.81; // 1 dina = g * cm/seg^2

        System.out.println("La fuerza gravitacional entre los cuerpos es " + F_dinas + " dinas");
        entrada.close();
        

    }
}