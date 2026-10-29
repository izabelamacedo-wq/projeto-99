package br.com.projeto.modelos;

import br.com.projeto.interfaces.Identificavel;

public class Aluno extends Pessoa implements Identificavel {

    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public String getIdentificacao() {
        return matricula;
    }

    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Matricula: " + matricula);
    }
}