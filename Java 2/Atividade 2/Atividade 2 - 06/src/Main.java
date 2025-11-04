import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = 0;
    int a = 0;
    int b = 1;
    int prox = 0;
    String resposta = "";

    do {
        try {
            System.out.println("Digite até que número que a série do fibonacci irá:");
            num = sc.nextInt();
            sc.nextLine();

            while(a <= num) {
                System.out.print(a + " ");
                prox = a + b;
                a = b;
                b = prox;
            }
        } catch (InputMismatchException e) {
          System.out.println("Erro, digite apenas números por favor.");
          sc.nextLine();
        }

        while(true) {
            System.out.println("\nDeseja fazer outro cálculo? Digite sim para continuar ou sair para encerrar o programa.");
            resposta = sc.nextLine();
            if(resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("sair")) {
                break;
            }
        }

    }while(!resposta.equalsIgnoreCase("sair"));

    sc.close();

    }
}