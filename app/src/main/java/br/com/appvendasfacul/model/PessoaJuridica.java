package br.com.appvendasfacul.model;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String contato;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj,String contato) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.contato = contato;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getContato() {
        return contato;
    }
}
