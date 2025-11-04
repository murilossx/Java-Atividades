import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe principal responsável por calcular o faturamento anual e o valor de multas mensais
 * de uma locadora de DVDs. O programa solicita ao usuário a quantidade total de DVDs e o
 * valor do aluguel de cada DVD, realiza os cálculos e exibe os resultados formatados.
 * <p>
 * Após cada execução, o usuário pode optar por realizar um novo cálculo ou encerrar o programa.
 * </p>
 *
 * <p><b>Regras de cálculo:</b></p>
 * <ul>
 *     <li>1/3 dos DVDs são alugados por mês;</li>
 *     <li>O faturamento anual é calculado multiplicando o valor arrecadado mensalmente por 12;</li>
 *     <li>10% dos DVDs alugados são devolvidos com atraso, gerando multa de 10% sobre o valor do aluguel;</li>
 * </ul>
 *
 * @author Murilo
 * @version 1.0
 */
public class Main {

    /**
     * Método principal que executa o programa. Ele realiza leituras do usuário,
     * faz os cálculos de faturamento e multas, e controla o fluxo de repetição
     * com tratamento de exceções para entradas inválidas.
     *
     * @param args Argumentos de linha de comando (não utilizados neste programa)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double qntDvd = 0;
        double aluguel = 0;
        double qntAlugados = 0;
        double faturamentoAnual = 0;
        double multa = 0;
        double valorMulta = 0;
        double qntAtrasos = 0;
        String resposta = "";

        do {
            try {
                System.out.println("Digite a quantidade de DVDs e depois o valor de cada aluguel:");
                qntDvd = sc.nextDouble();
                aluguel = sc.nextDouble();
                sc.nextLine();

                qntAlugados = qntDvd / 3;
                faturamentoAnual = qntAlugados * aluguel * 12;
                multa = aluguel * 0.1;
                qntAtrasos = qntAlugados / 10;
                valorMulta = qntAtrasos * multa;

                System.out.printf("Faturamento Anual: R$ %.2f\n", faturamentoAnual);
                System.out.printf("Valor ganho com multas no mês: R$ %.2f\n", valorMulta);

                while (true) {
                    System.out.println("Deseja fazer outro cálculo? (sim para continuar e sair para encerrar)");
                    resposta = sc.nextLine().trim();
                    if (resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("sair")) {
                        break;
                    }
                }

                if (resposta.equalsIgnoreCase("sair")) {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro, por favor digite apenas números.");
                sc.nextLine();

                while (true) {
                    System.out.println("Deseja fazer outro cálculo? (sim para continuar e sair para encerrar)");
                    resposta = sc.nextLine().trim();
                    if (resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("sair")) {
                        break;
                    }
                }

                if (resposta.equalsIgnoreCase("sair")) {
                    break;
                }
            }

        } while (!resposta.equalsIgnoreCase("sair"));

        sc.close();
    }
}
