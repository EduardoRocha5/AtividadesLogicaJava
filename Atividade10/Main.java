package Atividade10;

import java.util.Scanner;


/*10. Declare uma variável inteira. Use uma estrutura if/else if/else para verificar se o
valor é positivo, negativo ou zero. Imprima o resultado correspondente.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int valor1;

        System.out.println("Digite um Valor: ");
        valor1 = scan.nextInt();

        if (valor1 > 0) {
            System.out.println("Positivo: "+valor1);
        } else if(valor1 < 0) {
             System.out.println("Negativo: "+valor1);
        }else{
             System.out.println("Valor é ZERO: "+valor1);
        }
    

    }

}
