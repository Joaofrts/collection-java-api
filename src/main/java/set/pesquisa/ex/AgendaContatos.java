package main.java.set.pesquisa.ex;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatosSet;

    public AgendaContatos() {
        contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome , int telefone) {
        contatosSet.add(new Contato(nome, telefone));
    }

    public void exibirContatos() {
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatosSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }

        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int numeroNovo) {
        Contato contatoAtualizado = null;
        for (Contato c : contatosSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setTelefone(numeroNovo);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("João",12345678);
        agenda.adicionarContato("Pedro",987654321);
        agenda.adicionarContato("Joao Marcelo", 0);
        agenda.adicionarContato("João", 15163);
        agenda.adicionarContato("João Pedro", 15163);
        agenda.adicionarContato("Camila", 15161318);

        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("João"));
        System.out.println("Contatos atualizado: "+agenda.atualizarNumeroContato("João",5478));

        agenda.exibirContatos();

    }

}
