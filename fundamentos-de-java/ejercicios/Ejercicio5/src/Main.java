import java.util.Scanner;

/***
 * Teniendo como datos de entrada el radio y la altura de un cilindro, calcular su área lateral y volu
 */
public class Main {
    public static void main(String[] args) {

        double radio = 0,altura = 0;
        double areaLateral = 0,volumen = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el radio: ");
        radio = entrada.nextDouble();
        System.out.println("Ingresa la altura: ");
        altura = entrada.nextDouble();

        areaLateral = 2 * Math.PI * radio * altura;

        volumen =altura * Math.PI * Math.pow(radio,2);

        System.out.println("Area Lateral: "+areaLateral);
        System.out.println("Volumen: "+volumen);
        entrada.close();


    }
}