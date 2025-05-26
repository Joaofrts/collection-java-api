package main.java.map.basico.desafio;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String,String> dicionarioMap;

    public Dicionario() {
        dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String Definicao){
        dicionarioMap.put(palavra,Definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()) dicionarioMap.remove(palavra);
    }

    public void exibirDicionario(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        if(!dicionarioMap.isEmpty()) return dicionarioMap.get(palavra);
        else return "Dicionario vazio!";

    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("A","Letra A");
        dicionario.adicionarPalavra("B","Letra B");
        dicionario.adicionarPalavra("C","Letra C");
        dicionario.adicionarPalavra("D","Letra D");
        dicionario.exibirDicionario();

        System.out.println(dicionario.pesquisarPorPalavra("A"));
        dicionario.removerPalavra("C");
    }
}
