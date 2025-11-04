import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cargo = "";
        double salario = 0;
        double bonusAnual = 0;
        int dptGerenciados = 0;
        int qntGerenciadas = 0;
        String resposta = "";

        do {
            try {
                System.out.println("Digite o Cargo do Funcionário e o Salário Atual:");
                cargo = sc.nextLine();
                salario = sc.nextDouble();

                if(cargo.equalsIgnoreCase("diretor")) {
                    System.out.println("Digite a Quantidade de Departamentos Gerenciados:");
                    dptGerenciados = sc.nextInt();
                } else if (cargo.equalsIgnoreCase("gerente")) {
                    System.out.println("Digite a Quantidade de Pessoas Gerenciadas:");
                    qntGerenciadas = sc.nextInt();
                }

                sc.nextLine();

                cargo = cargo.trim().toLowerCase();
                switch (cargo) {
                    case "diretor":
                        bonusAnual = (4 * salario) + (3000.00 * dptGerenciados);
                        break;
                    case "gerente":
                        bonusAnual = (2 * salario) + (100.00 * qntGerenciadas);
                        break;
                    case "analista":
                        bonusAnual = salario;
                        break;
                    case "programador":
                        bonusAnual = salario * 0.8;
                        break;
                    case "auxiliar de limpeza":
                        bonusAnual = salario * 0.5;
                        break;
                    default:
                        System.out.println("Cargo Inválido");
                        continue;
                }

                System.out.printf("O bônus anual do funcionário é: %.2f\n", bonusAnual);

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

        }while(!resposta.equalsIgnoreCase("sair"));

        sc.close();

    }
}