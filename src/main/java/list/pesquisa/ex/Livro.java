package main.java.list.pesquisa.ex;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicado;

    public Livro(String titulo, String autor, int anoPublicado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicado=" + anoPublicado +
                '}';
    }
}
