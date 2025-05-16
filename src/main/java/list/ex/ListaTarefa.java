package main.java.list.ex;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private final List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefaList.add(new Tarefa(descricao));
    }

    public void apagarTarefa(String descricao) {
        List<Tarefa> tarefasParaApagar = new ArrayList<>();
        for (Tarefa tarefa : this.tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaApagar.add(tarefa);
            }
        }
        this.tarefaList.removeAll(tarefasParaApagar);
    }

    public int obterNumeroTarefa() {
        return this.tarefaList.size();
    }

    public void obterDescricaoTarefa() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O numero total de tarefas é : " + listaTarefa.obterNumeroTarefa());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de tarefas é : " + listaTarefa.obterNumeroTarefa());

       // listaTarefa.apagarTarefa("Tarefa 1");

        System.out.println("O numero total de tarefas é : " + listaTarefa.obterNumeroTarefa());

        listaTarefa.obterDescricaoTarefa();
    }
}
