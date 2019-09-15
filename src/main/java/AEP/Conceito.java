/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEP;

/**
 *
 * @author evert
 */
public class Conceito {
    
    private String id;
    private float nota;
    private Avaliacao avaliacao;
    private Aluno aluno;
    
    public Conceito(String id, float nota, Avaliacao avaliacao, Aluno aluno){
        
        this.id = id;
        this.avaliacao = avaliacao;
        this.nota = nota;
        this.aluno = aluno;
    }
}
