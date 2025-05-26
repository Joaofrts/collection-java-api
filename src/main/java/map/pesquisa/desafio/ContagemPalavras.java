package main.java.map.pesquisa.desafio;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private final Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if(!contagemPalavrasMap.isEmpty()) contagemPalavrasMap.remove(palavra);
    }

    public void exibirContagemPalavras() {
        System.out.println(contagemPalavrasMap);
    }

    public Map<String, Integer> encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = "";
        int maiorContagem = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }

        Map<String, Integer> contagemPalavrasMaisFrequente = new HashMap<>();
        contagemPalavrasMaisFrequente.put(palavraMaisFrequente, maiorContagem);


        return contagemPalavrasMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras cp = new ContagemPalavras();
        cp.exibirContagemPalavras();

        cp.adicionarPalavra("Acabou",45);
        cp.adicionarPalavra("Encerrou",13);
        cp.adicionarPalavra("Parabens",60);
        cp.adicionarPalavra("Chegou",55);

        cp.exibirContagemPalavras();

        System.out.println(cp.encontrarPalavraMaisFrequente());

        cp.removerPalavra("Parabens");

        System.out.println(cp.encontrarPalavraMaisFrequente());
        cp.exibirContagemPalavras();

    }
}
