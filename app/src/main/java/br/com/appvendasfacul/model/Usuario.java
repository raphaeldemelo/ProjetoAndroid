package br.com.appvendasfacul.model;

public class Usuario {
    private String matricula;
    private String nome;
    private String senha;
    private boolean isGerente;

    public Usuario(String matricula, String nome, String senha, boolean isGerente) {
        this.matricula = matricula;
        this.nome = nome;
        this.senha = senha;
        this.isGerente = isGerente;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isGerente() {
        return isGerente;
    }
}
