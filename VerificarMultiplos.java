import java.util.Scanner;

public class VerificarMultiplos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        // Comprobar si el número es múltiplo de 3 y no es múltiplo de 5
        if (numero % 3 == 0 && numero % 5 != 0) {
            System.out.println("El número es múltiplo de 3 y no es múltiplo de 5.");
        } else {
            System.out.println("El número no cumple con las condiciones.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
