import java.util.Scanner;

public class E10_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, resultado, i;

        System.out.println("Introduce un numero entero positivo:");
        N = scanner.nextInt();

        while (N < 0) {
            System.out.println("Introduce un nume1ro positivo:");
            N = scanner.nextInt();
        }

        resultado = 1;

        if (N > 0) {
            for (i = 2; i <= N; i++) {
                resultado *= i;
            }
        }

        System.out.println("Factorial(" + N + ") = " + resultado);
    }
}