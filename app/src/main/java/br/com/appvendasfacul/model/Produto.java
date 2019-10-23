package br.com.appvendasfacul.model;

public class Produto {
    private String codigoDeBarras;
    private String descricao;
    private String unidade;
    private double valorUnitario;

    public Produto(String codigoDeBarras, String descricao, String unidade, double valorUnitario) {
        this.codigoDeBarras = codigoDeBarras;
        this.descricao = descricao;
        this.unidade = unidade;
        this.valorUnitario = valorUnitario;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUnidade() {
        return unidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }
}
