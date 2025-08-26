
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         * Escreva um programa que declare uma variável inteira, atribua a ela um valor
         * e, em
         * seguida, use uma estrutura condicional (if/else) para determinar se o número
         * é par ou
         * ímpar. Imprima o resultado no console.
         */

        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.println("Digite um valor para calcular: ");
        valor = sc.nextInt();


        if (valor % 2 == 0) {
            System.out.printf("Este numero é par:"+ valor);
        } else {
            System.out.println("Este numero é impar: "+valor);
        }


    }
}