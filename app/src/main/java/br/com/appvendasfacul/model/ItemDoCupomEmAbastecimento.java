package br.com.appvendasfacul.model;

public class ItemDoCupomEmAbastecimento extends ItemDoCupom {
    private int bomba;
    private int bico;

    public ItemDoCupomEmAbastecimento(int sequencial, Produto produto, double quantidade, int bomba, int bico) {
        super(sequencial, produto, quantidade);
        this.bomba = bomba;
        this.bico = bico;
    }

    public int getBomba() {
        return bomba;
    }

    public int getBico() {
        return bico;
    }
}
