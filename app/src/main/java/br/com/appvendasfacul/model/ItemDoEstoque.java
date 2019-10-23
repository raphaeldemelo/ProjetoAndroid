package br.com.appvendasfacul.model;

public class ItemDoEstoque {
    private Produto produto;
    private double quantidade;

    public ItemDoEstoque(Produto produto, double quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public double getQuantidade() {
        return quantidade;
    }
}
