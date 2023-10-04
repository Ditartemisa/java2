import java.util.Scanner;

public class VerificarNumero2 {
	
	 public static void main(String[] args) {
	        // Crear un objeto Scanner para leer la entrada del usuario
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar al usuario que ingrese un número
	        System.out.print("Ingresa un número: ");
	        int numero = scanner.nextInt();

	        // Comprobar si el número es mayor que 100 o menor que -100
	        if (numero > 100 || numero < -100) {
	            System.out.println("El número es mayor que 100 o menor que -100.");
	        } else {
	            System.out.println("El número no cumple con las condiciones.");
	        }

	        // Cerrar el objeto Scanner
	        scanner.close();
	    }

}
