import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = 0;
        double B = 0;
        double C = 0;
        double delta = 0;
        double x1 = 0;
        double x2 = 0;
        String resposta = "";

        do {
            try {
                System.out.println("Digite os coeficientes A, B e C:");
                A = sc.nextDouble();
                B = sc.nextDouble();
                C = sc.nextDouble();
                sc.nextLine();
                delta = (Math.pow(B, 2)) - (4 * A * C);
                x1 = (-B + (Math.sqrt(delta))) / (2 * A);
                x2 = (-B - (Math.sqrt(delta))) / (2 * A);
                System.out.printf("Resultado: x = %.2f e x = %.2f\n", x1, x2);
            } catch (InputMismatchException e) {
                System.out.println("Erro, digite apenas números por favor.");
                sc.nextLine();
            }

            while(true) {
                System.out.println("Deseja fazer outro cálculo? Digite sim para continuar ou sair para encerrar o programa.");
                resposta = sc.nextLine();
                if(resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("sair")) {
                    break;
                }
            }

        } while(!resposta.equalsIgnoreCase("sair"));


        sc.close();

    }
}