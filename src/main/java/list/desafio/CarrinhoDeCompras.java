package main.java.list.desafio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private final List<Item> listaDeCompras;

    public CarrinhoDeCompras() {
        this.listaDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item item : listaDeCompras) {
            if (item.getNome().equalsIgnoreCase(nome)) {

                itemParaRemover.add(item);

            }
        }
        listaDeCompras.removeAll(itemParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotalCarrinho = 0;
        for (Item item : listaDeCompras) {
            valorTotalCarrinho += item.getPreco() * item.getQuantidade();
        }
        return valorTotalCarrinho;
    }

    public void exibirItens(){
        System.out.println(listaDeCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.exibirItens();
        System.out.println("Valor Total do Carrinho é: "+carrinho.calcularValorTotal());

        carrinho.adicionarItem("Refrigerante",12.5,3);
        carrinho.adicionarItem("Pipoca",15.0,2);
        carrinho.adicionarItem("Chocolate",4.0,1);
        carrinho.adicionarItem("Chocolate",4.0,0);

        carrinho.exibirItens();


        System.out.println("Valor Total do Carrinho é: "+carrinho.calcularValorTotal());

        carrinho.removerItem("pipoca");


        System.out.println("Valor Total do Carrinho é: "+carrinho.calcularValorTotal());
        carrinho.exibirItens();



    }
}
