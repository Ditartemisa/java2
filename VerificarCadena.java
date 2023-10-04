import java.util.Scanner;

public class VerificarCadena {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena de texto
        System.out.print("Ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();

        // Comprobar si la cadena contiene tanto "a" como "b"
        boolean contieneA = false;
        boolean contieneB = false;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == 'a') {
                contieneA = true;
            } else if (caracter == 'b') {
                contieneB = true;
            }

            // Si ambas letras se han encontrado, no es necesario seguir buscando
            if (contieneA && contieneB) {
                break;
            }
        }

        if (contieneA && contieneB) {
            System.out.println("La cadena contiene tanto 'a' como 'b'.");
        } else {
            System.out.println("La cadena no contiene tanto 'a' como 'b'.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
