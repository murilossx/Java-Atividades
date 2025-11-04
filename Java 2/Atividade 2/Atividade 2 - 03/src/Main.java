import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x1 = 0;
    double y1 = 0;
    double x2 = 0;
    double y2 = 0;
    double resultado = 0;
    String resposta = "";

    do {

        try {
            System.out.println("Digite as coordenadas do primeiro ponto:");
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            System.out.println("Digite as coordenadas do segundo ponto:");
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            sc.nextLine();

            resultado = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
            System.out.printf("Distância entre eles é: %.2f\n", resultado);



        } catch (InputMismatchException e) {
            System.out.println("Erro, por favor digite apenas números");
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
