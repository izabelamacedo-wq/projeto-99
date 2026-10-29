package br.com.projeto;

import br.com.projeto.modelos.Aluno;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Maria", 20, "2026001");

        System.out.println("=== Dados do Aluno ===");

        aluno.exibirDados();

        System.out.println(
            "Identificacao: " + aluno.getIdentificacao()
        );
    }
}