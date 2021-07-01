package list;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        // Adicionando nomes na lista
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        // Atualizar lista pelo índice
        nomes.set(2, "Larissa");

        System.out.println(nomes);

        // Ordenando por ordem alfabética
        Collections.sort(nomes);

        System.out.println(nomes);

        // Atualizar lista pelo índice
        nomes.set(2, "Wesley");

        System.out.println(nomes);

        // Remover pelo índice
        nomes.remove(4);

        System.out.println(nomes);

        // Remover pelo elemento
        nomes.remove("Wesley");

        System.out.println(nomes);

        // Buscar elemento pelo índice
        String nome = nomes.get(1);

        System.out.println(nome);

        // Índice do elemento - retorna um inteiro
        int posicao = nomes.indexOf("Carlos");

        System.out.println(posicao);

        // Tamanho da lista - retorna um inteiro
        int tamanho = nomes.size();

        System.out.println(tamanho);

        // Remover pelo elemento
        nomes.remove("Larissa");

        System.out.println(nomes);

        // Tamanho da lista
        tamanho = nomes.size();

        System.out.println(tamanho);

        // Contém elemento na lista - retorna boolean
        boolean temAnderson = nomes.contains("Anderson");

        System.out.println(temAnderson);

        boolean temFernando = nomes.contains("Fernando");

        System.out.println(temFernando);

        // Verifica se a lista está vazia - retorna um boolean
        boolean listaEstaVazia = nomes.isEmpty();

        System.out.println(listaEstaVazia);

        // Percorrer lista ou collections com forEach
        for(String nomeDoItem: nomes){
            System.out.println("-->" + nomeDoItem);
        }

        // Percorrer lista ou collections com Iterator
        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()){
            System.out.println("---->" + iterator.next());
        }

        // Limpa a lista
        nomes.clear();

        // Verifica se a lista está vazia - retorna um boolean
        listaEstaVazia = nomes.isEmpty();

        System.out.println(listaEstaVazia);
    }
}
