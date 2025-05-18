package main.java.list.ordenacao.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        numeros = new ArrayList<>();

    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public List<Integer> ordenarCrescente() {
        List<Integer> numerosCrescentes = new ArrayList<>(numeros);
        Collections.sort(numerosCrescentes);
        return numerosCrescentes;
    }

    public List<Integer> ordenarDecrescente() {
        List<Integer> numerosDecrescentes = new ArrayList<>(numeros);

        Collections.sort(numerosDecrescentes, Collections.reverseOrder());
        return numerosDecrescentes;
    }


    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarCrescente());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDecrescente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }
}
