package main.java.set.basico.desafio;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        palavrasUnicasSet = new HashSet<>();
    }

    public void adicionaPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removePalavra(String palavra) {
        if(!palavrasUnicasSet.isEmpty()){
            if(palavrasUnicasSet.contains(palavra)){
                palavrasUnicasSet.remove(palavra);
            }else {
                System.out.println("Essa palavra não existe no Set");
            }
        }else{
            System.out.println("O Set está vazio.");
        }
    }

    public void verificarPalavra(String palavra) {
        if(palavrasUnicasSet.contains(palavra)){
            System.out.println("A palavra "+palavra+" existe no Set");

        }else {
            System.out.println("A palavra "+palavra+" não existe no Set");
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionaPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionaPalavra("Palavra 2");
        conjuntoPalavrasUnicas.adicionaPalavra("Palavra 3");
        conjuntoPalavrasUnicas.adicionaPalavra("Palavra 2");
        conjuntoPalavrasUnicas.adicionaPalavra("Palavra 4");
        conjuntoPalavrasUnicas.adicionaPalavra("Palavra 5");

        conjuntoPalavrasUnicas.verificarPalavra("Palavra 3");

        conjuntoPalavrasUnicas.removePalavra("Palavra 2");
        conjuntoPalavrasUnicas.verificarPalavra("Palavra 2");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }
}
