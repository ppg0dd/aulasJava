package com.mycompany.projetofinaldois;

public class ProjetoFinalDois {

    public static void main(String[] args) {
        Cliente c = new Cliente ("vasco", "123");
        c.comprar(1234, 1, 1200);
        c.comprar(1235, 1, 2200);
        c.imprimirCompras();
    }
}
