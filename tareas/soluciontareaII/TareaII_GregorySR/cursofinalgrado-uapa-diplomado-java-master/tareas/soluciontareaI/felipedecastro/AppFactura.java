//Corregir errores
//Salida esperada después de corregir errores 
//Total: 80.0

public class AppFactura {

public static void main(String[] args) {
       // declaracion de variables
       double subtotal = 100.00; // asignar 100 a  subtotal
       double descuento = 0.20; // porcentaje descuento
       double montoDescuento = subtotal * descuento;
       double Total = subtotal - montoDescuento;

	// imprimir en la consola
	System.out.println("Calculadora de Factura");
	System.out.println();
	System.out.println("Subtotal       : $" + subtotal);
	System.out.println("Descuento      : " + (descuento*100) + "%");
	System.out.println("Monto descuento: $" + montoDescuento);
	System.out.println("Total          : $" + Total);
	System.out.println();
	}
}
