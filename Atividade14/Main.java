package Atividade14;

import java.util.ArrayList;
import java.util.List;

/*Crie um programa que simule uma lista de compras:
1. Crie uma lista de produtos usando List<String>
2. Adicione 6 produtos à lista (ex: "Arroz", "Feijão", "Leite")
3. Exiba a lista completa numerada (1. Arroz, 2. Feijão...)
4. Verifique se um produto específico está na lista (use .contains())
5. Substitua um produto por outro (remova um e adicione outro)
6. Exiba o primeiro e último item da lista
7. Limpe toda a lista e confirme que está vazia */

public class Main {

    public static void main(String[] args) {

        List<String> aComprasProduto = new ArrayList<>();

        aComprasProduto.add("Arroz");
        aComprasProduto.add("Feijão");
        aComprasProduto.add("Pão");
        aComprasProduto.add("Carne de Frango");
        aComprasProduto.add("Ovo");
        aComprasProduto.add("Carvão");

        System.out.println("Tem Feijão: " + aComprasProduto.contains("Feijao"));

        aComprasProduto.remove("Feijao");
        aComprasProduto.add("Cerveja");

        for (int i = 0; i < aComprasProduto.size(); i++) {
            System.out.println((i + 1) + ". " + aComprasProduto.get(i));
        }
        System.out.println("Primeiro Item:"+ aComprasProduto.get(0));
        System.out.println("Ultimo Item:"+ aComprasProduto.get(aComprasProduto.size()-1));

        aComprasProduto.clear();

        System.out.println("Apos a Limpeza");
        
        if(aComprasProduto.size() > 0){ 
            System.out.println("Tem coisa!");

        }else{
            System.out.println("A lista Esta Vazia");
        }


    }

}
