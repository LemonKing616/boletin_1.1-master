import java.util.Scanner;

public class E7_MediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad;
        double suma = 0;
        double media;

        do {
            System.out.print("Introduce la cantidad de números a solicitar: ");
            cantidad = scanner.nextInt();

            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser mayor que 0. Inténtalo de nuevo.");
            }
        } while (cantidad <= 0);

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Introduce el número " + i + ": ");
            double numero = scanner.nextDouble();
            suma += numero;
        }

        media = suma / cantidad;

        System.out.println("La media de los números introducidos es: " + media);
    }
}