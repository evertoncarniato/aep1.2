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
public class Aluno {
    
    private String matricula;
    private String nome;
    private String dataNascimento;
   
    public Aluno(String matricula, String nome, String dataNascimento){
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
}
