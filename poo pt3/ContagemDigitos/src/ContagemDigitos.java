import java.util.Scanner;

public class ContagemDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para contar seus dígitos: ");
        int numero = scanner.nextInt();

        int contador = 0;
        int temp = numero;
        while (temp != 0) {
            temp /= 10;
            contador++;
        }

        System.out.println("O número " + numero + " tem " + contador + " dígitos.");

        scanner.close();
    }
}                                                                                                                                                                            