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
public class Teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa ("Carla", "Rua tal", "999999");        
        p.mostrar();
        
        Fornecedor f = new Fornecedor ("Pedro", "Rua 1", "1203442", 100, 500);
        f.mostrar();
        
        Empregado e = new Empregado ("Euler", "Rua oi", "0083202", 10, 500, 0.075);
        e.mostrar();
        
        System.out.println(f.obterSaldo());
        System.out.println(e.calcularSalario());
        
    }
}

