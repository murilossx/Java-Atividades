import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String resposta = "";
    double num1 = 0;
    double num2 = 0;
    String operator = "";
    double result = 0;
    do {
        try {
            System.out.print("java Calculadora: ");
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
            operator = sc.next();
            result = 0;
            if (operator.equals("+")) {
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equalsIgnoreCase("X")) {
                result = num1 * num2;
            } else if (operator.equals("/")) {
                result = num1 / num2;
            }
            System.out.println(result);
            System.out.println("Deseja fazer outro cálculo? (Digite sim pra continuar ou sair para encerrar)");
            sc.nextLine();
            resposta = sc.nextLine();
            if(resposta.equalsIgnoreCase("sair")) {
                break;
            }
        } catch(InputMismatchException e) {
            System.out.println("Erro, digite 2 números e depois o operador.");
            System.out.println("Deseja fazer outro cálculo? (Digite sair para encerrar)");
            sc.nextLine();
            resposta = sc.nextLine();
            if(resposta.equalsIgnoreCase("sair")) {
                break;
            }
        }
    }while(!resposta.equalsIgnoreCase("sair"));

        sc.close();
    }
}