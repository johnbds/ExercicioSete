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
public class ProfessorHorista extends Professor {
    private double salarioBase;
    private int numeroAulas;
    
    public ProfessorHorista(String nome, int idade, String numeroMatricula, double salarioBase, int numeroAulas) {
        super(nome, idade, numeroMatricula);
        setSalarioBase(salarioBase);
        setNumeroAulas(numeroAulas);
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getNumeroAulas() {
        return numeroAulas;
    }

    public void setNumeroAulas(int numeroAulas) {
        this.numeroAulas = numeroAulas;
    }
    
    
}
