import java.util.Scanner;

public class VerificarTriangulo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese las longitudes de los lados del triángulo
        System.out.println("Ingresa las longitudes de los tres lados del triángulo:");
        System.out.print("Lado 1: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Lado 2: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Lado 3: ");
        double lado3 = scanner.nextDouble();

        // Verificar si el triángulo es equilátero o isósceles
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triángulo es equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("El triángulo es isósceles.");
        } else {
            System.out.println("El triángulo no es equilátero ni isósceles.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
