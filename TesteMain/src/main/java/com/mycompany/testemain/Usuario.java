package com.mycompany.testemain;

public class Usuario {
    public String user;
    public int senha;
    
    public Usuario (String user, int senha) {
        this.user = user;
        this.senha = senha;
    }
    
    public void imprimir () {
        System.out.println("Usuário: " + this.user);
    }
}
