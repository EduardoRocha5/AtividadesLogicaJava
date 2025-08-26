package Atividade04;

import java.util.Scanner;

/*. Crie duas variáveis inteiras, atribua valores a elas e, em seguida, crie uma terceira variável
para armazenar a soma das duas primeiras. Imprima o resultado */

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int valor1;
        int valor2;
        int soma;
        
        System.out.println("Digite Valor 1: ");
        valor1 = scan.nextInt();
        System.out.println("Digite Valor 2: ");
        valor2 = scan.nextInt();

        soma = valor1 + valor2;

        System.out.println("Soma dos Valores: " + soma);

        System.exit(0);

    }
}
