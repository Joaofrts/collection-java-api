package main.java.set.pesquisa.desafio;

public class Tarefa {

    private String descricao;
    private boolean concluido;

    public Tarefa( String descricao) {
        this.concluido = false;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void alteraConcluido() {
        this.concluido = !this.concluido;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluido=" + concluido +
                '}';
    }
}
