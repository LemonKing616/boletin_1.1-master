import java.util.Scanner;

public class E9_NumeroPerfecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, acumsumaDivisores;

        System.out.println("Introduce un número entero positivo:");
        numero = scanner.nextInt();

        while (numero <= 0) {
            System.out.println("Introduce un número positivo:");
            numero = scanner.nextInt();
        }

        acumsumaDivisores = 0;

        for (int i = 1; i < numero - 1; i++) {
            if (numero % i == 0) {
                acumsumaDivisores += i;
            }
        }

        if (acumsumaDivisores == numero) {
            System.out.println("El número " + numero + " es perfecto");
        } else {
            System.out.println("El número " + numero + " no es perfecto");
        }
    }
}