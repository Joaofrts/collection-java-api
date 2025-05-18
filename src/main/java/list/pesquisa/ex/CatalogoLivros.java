package main.java.list.pesquisa.ex;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoLancamento) {
        livroList.add(new Livro(titulo, autor, anoLancamento));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if(livro.getAnoPublicado() >= anoInicial && livro.getAnoPublicado() <= anoFinal) {
                    livrosPorIntervaloAnos.add(livro);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo= livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1 ", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1 ", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 3 ", "Autor 2", 2023);
        catalogoLivros.adicionarLivro("Livro 4 ", "Autor 4", 2018);
        catalogoLivros.adicionarLivro("Livro 5 ", "Autor 5", 2005);
        catalogoLivros.adicionarLivro("Livro 6 ", "Autor 6", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2018, 2022));
    }
}
