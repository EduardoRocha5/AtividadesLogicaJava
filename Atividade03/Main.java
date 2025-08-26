package Atividade03;

import java.util.Scanner;

/* Crie duas variáveis: uma para a temperatura em Celsius e outra para a conversão para
Fahrenheit. Use a fórmula F=(C×1.8)+32 para calcular a temperatura em Fahrenheit. Imprima
ambos os valores. */

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double tCelcius;
        double tFhr;

        System.out.println("Digite a Temperatura em Celcius para Calcular:");
        tCelcius = scan.nextDouble();

        tFhr = (tCelcius * 1.8) + 32;

        System.out.println("A temperatura em Fahrenheit é: "+ tFhr );

    }
}
