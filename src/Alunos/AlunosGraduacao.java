/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alunos;

/**
 *
 * @author Rafa
 */
public class AlunosGraduacao extends Alunos {

    private String disciplinasGraduacao;

    public AlunosGraduacao(String nome, int idade, String numeroMatricula, String disciplinasGraduacao) {
        super(nome, idade, numeroMatricula);
        setDisciplinasGraduacao(disciplinasGraduacao);
    }

    public String getDisciplinasGraduacao() {
        return disciplinasGraduacao;
    }

    public void setDisciplinasGraduacao(String disciplinasGraduacao) {
        this.disciplinasGraduacao = disciplinasGraduacao;
    }
    
    
}
