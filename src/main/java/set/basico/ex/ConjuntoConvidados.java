package main.java.set.basico.ex;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));

    }

    public void removerCandidatoPorCodigo(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : convidados) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidados.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidados.size();
    }

    public void exibirConvidados() {
        System.out.println(convidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conj = new ConjuntoConvidados();
        System.out.println("Existem " + conj.contarConvidados() + " convidado(s) dentro do Set" );

        conj.adicionarConvidado("Convidado 1", 1234);
        conj.adicionarConvidado("Convidado 2", 1235);
        conj.adicionarConvidado("Convidado 3", 1235);
        conj.adicionarConvidado("Convidado 4", 1236);

        System.out.println("Existem " + conj.contarConvidados() + " convidado(s) dentro do Set" );

        conj.removerCandidatoPorCodigo(1234);

        System.out.println("Existem " + conj.contarConvidados() + " convidado(s) dentro do Set" );

        conj.exibirConvidados();
    }
}
