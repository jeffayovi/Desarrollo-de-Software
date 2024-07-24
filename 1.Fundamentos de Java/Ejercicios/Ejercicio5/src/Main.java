import java.util.Scanner;

/***Escribir el algoritmo que permita emitir la factura correspondiente a la compra de un artículo determinado del que se adquieren una o varias unidades.
 El IVA a aplicar es del 15% y si el precio bruto (precio venta más IVA) es mayor que 1 000 euros, se debe realizar un descuento de 5%.***/
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float precioUnitario = 0;
        int cantidad = 0;

        System.out.println("Ingresa precio del artículo: ");
        precioUnitario = entrada.nextFloat();
        System.out.println("Ingresa cantidad del artículo: ");
        cantidad = entrada.nextInt();

        float subtotal = precioUnitario * cantidad;

        float iva = subtotal * 0.15f;

        float precioBruto = subtotal + iva;

        float descuento = 0;

        if (precioBruto > 1000){
            descuento = precioBruto * 0.05f;
        }
        float totalAPagar = precioBruto - descuento;

        System.out.println("Subtotal: "+subtotal);
        System.out.println("IVA(15%): "+iva);
        System.out.println("Descuento: "+descuento);
        System.out.println("Total a pagar: "+totalAPagar);
        entrada.close();


    }
}