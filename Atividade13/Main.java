package Atividade13;
/*Crie um programa que:
1. Crie uma lista de nomes usando ArrayList<String>
2. Adicione 5 nomes à lista
3. Exiba todos os nomes da lista
4. Remova um nome da lista
5. Exiba novamente a lista após a remoção
6. Mostre quantos nomes restaram na lista */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
      ArrayList<String> aNomes = new ArrayList<>();

        aNomes.add("Eduardo");
        aNomes.add("Joao");
        aNomes.add("Jaison");
        aNomes.add("Helio");
        aNomes.add("Mateus");

        for(String sNome : aNomes){
            System.out.println("Nomes: " + sNome);
        }

        aNomes.remove("Mateus");
        System.out.println( " ");


        for(String sNome : aNomes){
        System.out.println("Nomes: " + sNome);

        }
        
       System.out.println("Restaram:"+ aNomes.size()+" Nomes");



    }
}
