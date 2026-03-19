import java.util.Scanner;

public class Main {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Não dá para dividir por zero.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CALCULADORA ===");

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.println("\nEscolha uma operação:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = somar(n1, n2);
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = subtrair(n1, n2);
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = multiplicar(n1, n2);
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                resultado = dividir(n1, n2);
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        sc.close();
    }
}