import java.util.Scanner;

public class  E6_ProductoPorSumas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroA, numeroB, producto, i;

        System.out.println("Introduce el primer número entero:");
        numeroA = scanner.nextInt();

        System.out.println("Introduce el segundo número entero:");
        numeroB = scanner.nextInt();

        producto = 0;

        if (numeroB < 0) {
            numeroA = -numeroA;
            numeroB = -numeroB;
        }

        for (i = 1; i <= numeroB; i++) {
            producto += numeroA;
        }

        if (numeroB < 0) {
            producto = -producto;
        }

        System.out.println("El producto de " + numeroA + " y " + numeroB + " es: " + producto);
    }
}
