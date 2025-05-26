package main.java.map.pesquisa.ex;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

    private Map<Long, Produto> produtosMap;

    public EstoqueProduto() {
        produtosMap = new HashMap<>();
    }

    public void adicionarProduto( Long id, String nome, double preco, int quantidade){
        produtosMap.put(id,new Produto(nome,quantidade,preco));
    }

    public void exibirProdutos(){
        System.out.println(produtosMap);
    }

    public double calcularValorTotalEstoque(){
        double totalEstoque = 0;
        for(Produto produto : produtosMap.values()){
            totalEstoque += produto.getPreco() * produto.getQuantidade();
        }
        return totalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produto produto : produtosMap.values()){
            if(produto.getPreco() > maiorPreco){
                maiorPreco=produto.getPreco();
                produtoMaisCaro = produto;
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for(Produto produto : produtosMap.values()){
            if(produto.getPreco() < menorPreco){
                menorPreco=produto.getPreco();
                produtoMaisBarato = produto;
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeValorTotalNoEstoque = null;
        double maiorvalorTotalNoEstoque = Double.MIN_VALUE;
        for(Produto produto : produtosMap.values()){
            if(produto.getPreco()*produto.getQuantidade() > maiorvalorTotalNoEstoque){
                maiorvalorTotalNoEstoque=produto.getPreco()*produto.getQuantidade();
                produtoMaiorQuantidadeValorTotalNoEstoque=produto;
            }
        }
        return produtoMaiorQuantidadeValorTotalNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();
        estoqueProduto.adicionarProduto(1L,"Feijão",6.75,15);
        estoqueProduto.adicionarProduto(2L,"Arroz",5.50,15);
        estoqueProduto.adicionarProduto(3L,"Macarrão",8.0,10);
        estoqueProduto.adicionarProduto(4L,"Açucar",3.2,15);
        estoqueProduto.exibirProdutos();
        System.out.println(estoqueProduto.calcularValorTotalEstoque());
        System.out.println(estoqueProduto.obterProdutoMaisCaro());
        System.out.println(estoqueProduto.obterProdutoMaisBarato());
        System.out.println(estoqueProduto.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
