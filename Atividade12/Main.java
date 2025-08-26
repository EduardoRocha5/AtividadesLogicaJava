package Atividade12;

/*Escreva um programa que use um loop for para somar todos os números inteiros de 1 a
100 e, no final, imprima o resultado total.
 */


public class Main {
    public static void main(String[] args) {
        
        int iSoma = 0;

        for (int i = 1; i <= 100; i++) {
            iSoma += i;

        }
        System.out.println("A soma dos numeros eh " + iSoma);

    }
}
