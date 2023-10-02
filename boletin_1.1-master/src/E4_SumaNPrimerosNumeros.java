import java.util.Scanner;

public class E4_SumaNPrimerosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, suma = 0;

        System.out.println("Introduce un número positivo:");
        N = scanner.nextInt();

        while (N <= 0) {
            System.out.println("El número debe ser estrictamente positivo. Introduce un número positivo:");
            N = scanner.nextInt();
        }

        for (int i = 1; i <= N; i++) {
            suma += i;
        }

        System.out.println("La suma de los " + N + " primeros números es: " + suma);
    }
}