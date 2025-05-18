package main.java.list.pesquisa.desafio;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros(){
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if(!numeros.isEmpty()){
            for(Integer numero : numeros){
                soma += numero;
            }
        }
        return soma;
    }

    public Integer encontraMaiorNumero(){
        int maior =0;
        if(!numeros.isEmpty()){
            maior = numeros.get(0);
            for(Integer numero : numeros){
                if(numero > maior){
                    maior = numero;
                }
            }
        }
        return maior;
    }

    public Integer encontraMenorNumero(){
        int menor =0;
        if(!numeros.isEmpty()){
            menor = numeros.get(0);
            for(Integer numero : numeros){
                if(numero < menor){
                    menor = numero;

                }
            }
        }
        return menor;
    }

    public List<Integer> exibirNumeros(){
        return numeros;
    }

    public static void main(String[] args) {
        SomaNumeros s = new SomaNumeros();
        s.adicionarNumero(2);
        s.adicionarNumero(2);
        s.adicionarNumero(3);
        s.adicionarNumero(6);
        s.adicionarNumero(-2);
        s.adicionarNumero(6);
        System.out.println(s.calcularSoma());
        System.out.println(s.encontraMaiorNumero());
        System.out.println(s.encontraMenorNumero());
        System.out.println(s.exibirNumeros());
    }
}
