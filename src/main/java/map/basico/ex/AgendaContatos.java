package main.java.map.basico.ex;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String,Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisaPorNome(String nome){
        Integer telefonePorNome = null;
        if(!agendaContatosMap.isEmpty()){
            telefonePorNome = agendaContatosMap.get(nome);
        }
        return telefonePorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("João Marcelo", 15196843);
        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("João", 15687773);
        agendaContatos.adicionarContato("João Marcelo", 1596764966);
        agendaContatos.adicionarContato("Antoni Teles", 1568737);

        agendaContatos.exibirContatos();

        System.out.println( agendaContatos.pesquisaPorNome("João"));

        agendaContatos.removerContato("Antoni Teles");

        agendaContatos.exibirContatos();
    }
}
