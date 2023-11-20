package com.mycompany.projetofinaldois;
import java.util.*;


public class Cliente {
    private String nome;
    private String cpf;
    private List<Pagamento> lista; 
    
    public Cliente (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        lista = new ArrayList<>();
    }
    
    public String getNome () {
        return this.nome;
    }
    
    public String getCpf () {
        return this.cpf;
    }
    
    public void comprar (int id, int tipoPagamento, double valorOriginal) {
        Pagamento p = new Pagamento (id, this, tipoPagamento, valorOriginal);
        lista.add(p);
    }
    
    public void imprimirCompras() {
        for (Pagamento p : lista) {
            System.out.println(p.getId());
        }
    }
}
