package br.com.appvendasfacul.model;

public class Empresa {
    private String cnpj;
    private String nome;
    private String endereco;

    public Empresa(String cnpj, String nome, String endereco) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

}
