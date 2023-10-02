import java.util.Scanner;

public class E3_ParOImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad, numero;

        System.out.println("Ingrese la cantidad de números que desea verificar (debe ser mayor que 0):");
        cantidad = scanner.nextInt();

        while (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que 0. Ingrese nuevamente:");
            cantidad = scanner.nextInt();
        }

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Ingrese el número " + i + ":");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par.");
            } else {
                System.out.println("El número " + numero + " es impar.");
            }
        }
    }
}