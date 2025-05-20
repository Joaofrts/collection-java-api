package main.java.set.ordenacao.desafio;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(Long matricula) {
        Aluno alunoRemover = null;
        for (Aluno aluno : alunosSet) {
            if (aluno.getMatricula() == matricula) {
                alunoRemover = aluno;
                break;
            }
        }
        if (alunoRemover != null) {
            alunosSet.remove(alunoRemover);
        }else {
            System.out.println("Aluno não existe no sistema");
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorMatricula(){
        Set<Aluno> alunosPorMatricula = new TreeSet<>(new ComparatorPorNota());
        alunosPorMatricula.addAll(alunosSet);
        return alunosPorMatricula;
    }

    public void exibirAlunos(){
        System.out.println(alunosSet);
    }


    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        gerenciador.exibirAlunos();
        gerenciador.adicionarAluno("Aluno1", 10L, 6.7);
        gerenciador.adicionarAluno("Aluno2", 2L, 5.0);
        gerenciador.adicionarAluno("Aluno3", 33L, 3.0);
        gerenciador.adicionarAluno("Aluno4", 4L, 4.8);
        gerenciador.adicionarAluno("Aluno5", 4L, 8.9);
        gerenciador.adicionarAluno("Aluno6", 1L, 9.5);
        gerenciador.adicionarAluno("Aluno7", 6L, 10.0);
        gerenciador.adicionarAluno("Aluno8", 7L, 7.2);

        gerenciador.exibirAlunos();

        System.out.println(gerenciador.exibirAlunosPorMatricula());

        System.out.println(gerenciador.exibirAlunosPorNome());

        gerenciador.removerAluno(6L);
        System.out.println();
        gerenciador.exibirAlunos();
    }
}
