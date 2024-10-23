import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();
        
        System.out.print("Digite a altura do retângulo: ");
        double height = scanner.nextDouble();
        
        double area = base * height;
        System.out.println("A área do retângulo é: " + area);
    }
}