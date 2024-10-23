import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Gerando 10 números aleatórios entre 1 e 100: ");
        for (int i = 0; i < 10; i++) {
            int numero = random.nextInt(100) + 1; // Gera um número aleatório
            System.out.println(numero);
        }
    }
}                                                                                                                                                                             