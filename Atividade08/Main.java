package Atividade08;

/*Crie duas variáveis inteiras e atribua valores a elas. Use uma estrutura condicional
(if/else) para determinar e imprimir qual dos dois números é o maior */

public class Main {
    public static void main(String[] args) {

        int valor1 = 40;
        int valor2 = 50;

        if (valor1 > valor2) {
            System.out.println("Valor 1 é maior que Valor 2");
            System.out.println("Valor1:" + valor1 + " Valor2:" + valor2);

        } else {
            System.out.println("Valor 2 é maior que Valor 1");
            System.out.println("Valor1:" + valor1 + " Valor2:" + valor2);
        }

    }
}
