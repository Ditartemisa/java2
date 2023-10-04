import java.util.Scanner;

public class VerificarDivisibilidad {
	public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        // Comprobar si el número es divisible por 2 y por 3
        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println("El número es divisible por 2 y por 3.");
        } else {
            System.out.println("El número no es divisible por 2 y por 3.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

}
