import java.util.Scanner;

public class MenorDeNNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, menor;
        char respuesta;

        System.out.println("Introduce un número:");
        numero = scanner.nextInt();
        menor = numero;

        do {
            System.out.println("¿Desea introducir más números? (S/N)");
            respuesta = scanner.next().charAt(0);

            while (respuesta != 'S' && respuesta != 'N') {
                System.out.println("Respuesta no válida. Introduce S o N:");
                respuesta = scanner.next().charAt(0);
            }

            if (respuesta == 'S') {
                System.out.println("Introduce otro número:");
                numero = scanner.nextInt();
                if (numero < menor) {
                    menor = numero;
                }
            }
        } while (respuesta == 'S');

        System.out.println("El número menor es: " + menor);
    }
}
