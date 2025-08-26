package Atividade07;

import java.util.Scanner;

/*7. Declare três variáveis do tipo double com valores de notas. Calcule a média dessas notas
e use uma estrutura if/else para imprimir "Aprovado" se a média for maior ou igual a
7.0, e "Reprovado" caso contrário */

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1;
        double nota2;
        double media;

        System.out.println("Digite nota01:");
        nota1 = scan.nextDouble();

        System.out.println("Digite nota02:");
        nota2 = scan.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Sua Média Foi: " + media);
            System.out.println("Aprovado :)");

        } else {

            System.out.println("Sua Média Foi: " + media);
            System.out.println("Reprovado ;-;");

        }

    }
}
