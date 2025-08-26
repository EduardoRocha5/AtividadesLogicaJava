package Atividade11;

import java.util.Scanner;


/*Peça ao usuário para digitar um número inteiro (ou atribua um valor fixo a uma variável).
Use um loop for para imprimir a tabuada desse número, de 1 a 10. Por exemplo, se o
número for 5, a saída deve ser 5 x 1 = 5, 5 x 2 = 10, etc. */
public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int valor;

        System.out.println("Digite um numero para a Tabuada:");
        valor = scan.nextInt();
        System.out.println("== Tabuada de "+ valor +" ==");

        for (int i = 0; i <= 10; i++) {
          
            System.out.println(valor +"x"+i+ "=" + valor * i);
        }
   
    }
}
