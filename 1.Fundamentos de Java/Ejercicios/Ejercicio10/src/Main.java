import java.util.Scanner;

/***
 * Escribir un algoritmo que encuentre el salario semanal de un trabajador, dada la tarifa horaria y el número de horas trabajadas diariamente.
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float horasTrabajados,tarifaHoraria,salarioDiario,salarioSemanal;
        int diasTrabajados;

        System.out.println("Ingrese la Tarifa horaria: ");
        tarifaHoraria = entrada.nextFloat();
        System.out.println("Ingrese el numero de horas trabajadas por dia: ");
        horasTrabajados = entrada.nextFloat();

        //Calcular el Salario Diario
        salarioDiario = horasTrabajados * tarifaHoraria;

        System.out.println("Ingrese el numeros de dias trabajados en semana: ");
        diasTrabajados = entrada.nextInt();

        //Calcular el salario Semanal
        salarioSemanal = salarioDiario * diasTrabajados;

        System.out.println("El salario semanal es:$ "+salarioSemanal);
        entrada.close();

    }
}