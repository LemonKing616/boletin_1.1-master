import java.util.Scanner;

public class E4_SumaNPrimerosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int joze, suma = 0;

        System.out.println("Introduce un número positivo:");
        joze = scanner.nextInt();

        while (joze <= 0) {
            System.out.println("El número debe ser estrictamente positivo. Introduce un número positivo:");
            joze = scanner.nextInt();
        }

        for (int i = 1; i <= joze; i++) {
            suma += i;
        }

        System.out.println("La suma de los " + joze + " primeros números es: " + suma);
    }
}