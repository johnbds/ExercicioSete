/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Professores;

/**
 *
 * @author Rafa
 */
public class ProfessorIntegral extends Professor{
    private double salario;
        
    public ProfessorIntegral(String nome, int idade, String numeroMatricula, double salario) {
        super(nome, idade, numeroMatricula);
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    
    
}
