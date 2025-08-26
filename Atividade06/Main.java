package Atividade06;

/*Declare duas variáveis, por exemplo, a = 5 e b = 10. Escreva um código para trocar os
valores entre elas, de forma que a se torne 10 e b se torne 5. Imprima os valores de ambas
as variáveis antes e depois da troca para verificar o resultado.
 */
public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println("Valor de A antes:" + a + " Valor de B antes:" + b);

        int temp = a; // guarda o valor de a=5
        a = b; // b=10 vai para a
        b = temp; // temp (antigo a=5) vai para b

        System.out.println("Valor de A depois:" + a + " Valor de B depois:" + b);

    }
}
