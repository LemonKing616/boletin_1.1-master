import java.util.Scanner;

public class E2_TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entre 0 y 10:");
        int numero = scanner.nextInt();

        if (numero >= 0 && numero <= 10) {
            System.out.println("Tabla del " + numero);
            for (int i = 0; i <= 10; i++) {
                System.out.println(numero + " * " + i + " = " + (numero * i));
            }
        } else {
            System.out.println("El número debe estar entre 0 y 10.");
        }
    }
}