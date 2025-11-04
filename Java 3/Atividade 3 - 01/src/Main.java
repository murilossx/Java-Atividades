import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double contador = 0;
        String resposta = "";
        double num = 0;
        double media = 0;

        do {
            try {
                System.out.println("Digite um número inteiro ou real(S para encerrar):");
                resposta = sc.nextLine();
                if(resposta.equalsIgnoreCase("S")) {
                    break;
                }
                num = Double.parseDouble(resposta);
                soma += num;
                contador++;

            }catch (NumberFormatException e) {
            System.out.println("Valor inválido, digite novamente, apenas números inteiros ou reais.");
            }

        }while(!resposta.equalsIgnoreCase("S"));

        if (contador > 0) {
            media = soma / contador;
            System.out.printf("Média: %.2f", media);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }
        sc.close();
    }
}