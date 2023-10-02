import java.util.Scanner;

public class E5_NumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, contadorPositivos;

        contadorPositivos = 0;

        do {
            System.out.print("Introduce un número (negativo para terminar): ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                contadorPositivos++;
            }
        } while (numero >= 0);

        System.out.println("Has introducido " + contadorPositivos + " números positivos.");
    }
}