package br.com.appvendasfacul.model;

public class ItemDoCupom {
    private int sequencial;
    private Produto produto;
    private double quantidade;
    private double desconto;

    public ItemDoCupom(int sequencial, Produto produto, double quantidade) {
        this.sequencial = sequencial;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getSequencial() {
        return sequencial;
    }

    public Produto getProduto() {
        return produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double percentual) {
        this.desconto = desconto;
    }
}
