import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double indice [] = new double[7];
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        int indiceDiaMin = 0;
        int indiceDiaMax = 0;
        double soma = 0;
        double media = 0;

        String dias [] = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

        System.out.println("Digite o indíce pluviométrico diário: ");

        for(int i = 0; i < indice.length; i++){
            indice[i] = sc.nextDouble();
            soma += indice[i];
            if(indice[i] < min) {
                min = indice[i];
                indiceDiaMin = i;
            }
            if (indice[i] > max){
                max = indice[i];
                indiceDiaMax = i;
            }
        }

        media = soma / indice.length;
        System.out.printf("O indíce pluviométrico mínimo foi: %s %.2f%n", dias[indiceDiaMin], min);
        System.out.printf("O indíce pluviométrico máximo foi: %s %.2f%n", dias[indiceDiaMax], max);
        System.out.printf("O indíce pluviométrico médio foi: %.2f%n", media);


        sc.close();
    }
}