import java.util.Scanner;

public class  E6_Multiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, producto, i;

        System.out.println("Introduce el primer número entero:");
        x = scanner.nextInt();

        System.out.println("Introduce el segundo número entero:");
        y = scanner.nextInt();

        producto = 0;

        if (y < 0) {
            x = -x;
            y = -y;
        }

        for (i = 1; i <= y; i++) {
            producto += x;
        }

        if (y < 0) {
            producto = -producto;
        }

        System.out.println("El producto de " + x + " y " + y + " es: " + producto);
    }
}
