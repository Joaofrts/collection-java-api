package main.java.set.pesquisa.desafio;

import java.util.HashSet;
import java.util.Set;

public class ListaDeTarefas {

    private Set<Tarefa> tarefasSet;

    public ListaDeTarefas() {
        tarefasSet = new HashSet<>();
    }

    public void adicionaTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removeTarefa(String descricao) {
        Tarefa tarefaRemover = null;
        for (Tarefa tarefa : tarefasSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaRemover = tarefa;
                break;
            }
        }
        tarefasSet.remove(tarefaRemover);
    }

    public void exibirTarefas(){
        System.out.println(tarefasSet);
    }

    public int contarTarefas(){
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : tarefasSet) {
            if(tarefa.isConcluido()){
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefa : tarefasSet) {
            if(!tarefa.isConcluido()){
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : tarefasSet) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                if (!tarefa.isConcluido()) {
                    tarefa.alteraConcluido();
                }else {
                    System.out.println("Tarefa ja marcada como concluida.");
                }
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : tarefasSet) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                if (tarefa.isConcluido()) {
                    tarefa.alteraConcluido();
                }else {
                    System.out.println("Tarefa ja marcada como Pendente.");
                }
            }
        }
    }

    public void limparListaTarefas() {
        tarefasSet.clear();
    }

    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();
        listaDeTarefas.adicionaTarefa("Tarefa 1");
        listaDeTarefas.adicionaTarefa("Tarefa 2");
        listaDeTarefas.adicionaTarefa("Tarefa 3");
        listaDeTarefas.adicionaTarefa("Tarefa 4");
        listaDeTarefas.adicionaTarefa("Tarefa 5");

        listaDeTarefas.exibirTarefas();

        System.out.println(listaDeTarefas.contarTarefas());
        listaDeTarefas.marcarTarefaPendente("Tarefa 1");
        listaDeTarefas.marcarTarefaConcluida("Tarefa 1");
        listaDeTarefas.marcarTarefaConcluida("Tarefa 1");

        System.out.println(listaDeTarefas.obterTarefasConcluidas());

        System.out.println(listaDeTarefas.obterTarefasPendentes());

        listaDeTarefas.removeTarefa("Tarefa 1");
        System.out.println(listaDeTarefas.contarTarefas());


        listaDeTarefas.exibirTarefas();

        listaDeTarefas.limparListaTarefas();

        listaDeTarefas.exibirTarefas();


    }
}
