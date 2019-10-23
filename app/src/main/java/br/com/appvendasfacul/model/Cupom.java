package br.com.appvendasfacul.model;

import java.util.List;

public class Cupom {
    private Empresa empresa;
    private Cliente cliente;
    private List<ItemDoCupom> itens;
    private Usuario usuario;

    public Cupom(Empresa empresa, Cliente cliente, Usuario usuario) {
        this.empresa = empresa;
        this.cliente = cliente;
        this.usuario = usuario;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void addItem(Produto produto,double quantidade){

    }

    public List<ItemDoCupom> getItens() {
        return itens;
    }
/*
    public double getValorTotal(){

    }*/
}
