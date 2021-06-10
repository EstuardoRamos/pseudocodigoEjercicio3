
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        int num, n = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrse un numero: ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            n = n * i;
        }
        System.out.println("El factorial del numero es " + n);
    }

}
