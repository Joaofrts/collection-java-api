package main.java.list.ordenacao.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
    List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorAltura,new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas pessoa = new OrdenacaoPessoas();
        pessoa.adicionarPessoa("Maria Augusta", 25, 1.56);
        pessoa.adicionarPessoa("Jeferson", 21, 2.0);
        pessoa.adicionarPessoa("Maria Antonia", 18, 1.8);
        pessoa.adicionarPessoa("Joao Marcelo", 23, 1.95);

        System.out.println(pessoa.ordenarPorIdade());
        System.out.println(pessoa.ordenarPorAltura());
    }
}
