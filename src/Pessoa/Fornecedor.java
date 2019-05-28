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
public class Fornecedor extends Pessoa {    
    private double valorCredito;
    private double valorDivida;
    
    //criando o construtor
    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida){    
        super(nome, endereco, telefone); //chama aquele que ele está herdando (nesse caso a classe pessoa)        
        setValorCredito(valorCredito);
        setValorDivida(valorDivida);
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    
    public void mostrar (){
        super.mostrar();
        System.out.println(getValorCredito());
        System.out.println(getValorDivida());
    }
    
    public double obterSaldo(){
    
        return getValorCredito() - getValorDivida();
    }
}
