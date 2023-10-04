import java.util.Scanner;

	public class VerificarNumero {
	    public static void main(String[] args) {
	        // Crear un objeto Scanner para leer la entrada del usuario
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar al usuario que ingrese un número
	        System.out.print("Ingresa un número: ");
	        int numero = scanner.nextInt();

	        // Comprobar si el número está en el rango (mayor que 10 y menor que 20)
	        if (numero > 10 && numero < 20) {
	            System.out.println("El número está entre 10 y 20.");
	        } else {
	            System.out.println("El número no está entre 10 y 20.");
	        }

	        // Cerrar el objeto Scanner
	        scanner.close();
	    }
	}

