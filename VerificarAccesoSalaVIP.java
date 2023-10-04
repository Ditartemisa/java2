import java.util.Scanner;

public class VerificarAccesoSalaVIP {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su edad
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        // Solicitar al usuario si tiene una invitación especial (true o false)
        System.out.print("¿Tienes una invitación especial? (true/false): ");
        boolean tieneInvitacionEspecial = scanner.nextBoolean();

        // Verificar si la persona tiene acceso a la sala VIP
        if (edad >= 18 || tieneInvitacionEspecial) {
            System.out.println("Tienes acceso a la sala VIP.");
        } else {
            System.out.println("No tienes acceso a la sala VIP.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
