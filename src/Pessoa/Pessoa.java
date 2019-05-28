package Pessoa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa
 */
public class Pessoa {
    
    private String nome;
    private String endereco;
    private String telefone;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    //criando o construtor
    public Pessoa(String nome, String endereco, String telefone){
    
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);
    }
    
    public void mostrar (){
    
        System.out.println(getNome());
        System.out.println(getEndereco());
        System.out.println(getTelefone());
    }
}

