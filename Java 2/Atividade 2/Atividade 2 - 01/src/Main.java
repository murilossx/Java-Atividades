import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double distancia = 0;
    double horas = 0;
    double velocidade = 0;
    String resposta = "";

    do{
        try {
            System.out.println("Digite a distância percorrida e depois quantas horas de viagem: ");
            distancia = sc.nextDouble();
            horas = sc.nextDouble();
            sc.nextLine();

            velocidade = distancia / horas;
            System.out.printf("Velocidade: %.2fKM/h\n", velocidade);

            while(true) {
                System.out.println("Deseja fazer outro cálculo? (sim para continuar ou sair para encerrar)");
                resposta = sc.nextLine().trim();
                if(resposta.equalsIgnoreCase("sim")) {
                    break;
                } else if(resposta.equalsIgnoreCase("sair")) {
                    break;
                }
            }

            if(resposta.equalsIgnoreCase("sair")) {
                break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro, digite a distância e depois a quantidade de horas.");
            sc.nextLine();
            while(true) {
                System.out.println("Deseja fazer outro cálculo? (sim para continuar ou sair para encerrar)");
                resposta = sc.nextLine().trim();
                if(resposta.equalsIgnoreCase("sim")) {
                    break;
                } else if(resposta.equalsIgnoreCase("sair")) {
                    break;
                }
            }

            if(resposta.equalsIgnoreCase("sair")) {
                break;
            }
        }

    }while(!resposta.equalsIgnoreCase("sair"));

    sc.close();


    }
}