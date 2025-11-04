import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double num [] = new double[20];
    double sum = 0;
    String resposta = "";


        System.out.println("Digite um conjunto de 20 elementos númericos:");
        for (int i = 0; i < num.length; i++) {
            while (true) {
                try {
                    num[i] = sc.nextDouble();
                    if (num[i] % 2 == 0) {
                        sum += num[i];
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Erro, digite apenas números.");
                    sc.nextLine();
                }
            }
        }

   System.out.printf("Soma de todos os números pares: %.0f", sum);

    sc.close();
    }
}