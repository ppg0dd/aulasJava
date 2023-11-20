package com.mycompany.projetofinaldois;

public class Pagamento implements Avista, Cartao, Pix {
    private int id;
    private Cliente cli;
    private double valorOriginal;
    private double valorCalculado;
    private int tipoPagamento;
    
    public Pagamento (int id, Cliente cli, int tipoPagamento, double valorOriginal) {
        this.id = id;
        this.cli = cli;
        this.tipoPagamento = tipoPagamento;
        this.valorOriginal = valorOriginal;
    }
    
    public Cliente getCli () {
        return this.cli;
    }
    
    public int getId () {
        return this.id;
    }
    
    public double getValorOriginal () {
        return this.valorOriginal;
    }
    
    public int getTipoPagamento () {
        return this.tipoPagamento;
    }
}
