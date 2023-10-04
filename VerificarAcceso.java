import java.util.Scanner;

public class VerificarAcceso {
    public static void main(String[] args) {
        // Definir un nombre de usuario y contraseña válidos
        String usuarioValido = "usuario";
        String contrasenaValida = "contrasena";

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el nombre de usuario
        System.out.print("Ingresa tu nombre de usuario: ");
        String usuarioIngresado = scanner.nextLine();

        // Solicitar al usuario que ingrese la contraseña
        System.out.print("Ingresa tu contraseña: ");
        String contrasenaIngresada = scanner.nextLine();

        // Verificar si el nombre de usuario y la contraseña son válidos
        if (usuarioIngresado.equals(usuarioValido) && contrasenaIngresada.equals(contrasenaValida)) {
            System.out.println("Acceso concedido. Bienvenido, " + usuarioIngresado + "!");
        } else {
            System.out.println("Acceso denegado. Nombre de usuario o contraseña incorrectos.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
