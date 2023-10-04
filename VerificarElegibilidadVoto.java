
import java.util.Scanner;

public class VerificarElegibilidadVoto {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la edad
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        // Solicitar al usuario que ingrese si está inhabilitado legalmente (true o false)
        System.out.print("¿Estás inhabilitado legalmente? (true/false): ");
        boolean inhabilitadoLegalmente = scanner.nextBoolean();

        // Verificar si la persona puede votar
        if (edad >= 18 && !inhabilitadoLegalmente) {
            System.out.println("Puedes votar en las próximas elecciones.");
        } else {
            System.out.println("No puedes votar en las próximas elecciones.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

