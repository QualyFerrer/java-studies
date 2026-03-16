package services;

import entities.Pessoa;

public class PessoaService {

    public Pessoa criarPessoa(String nome, Integer idade, Double altura) {
        return new Pessoa(nome, idade, altura);
    }

    public void apresentarPessoa(Pessoa pessoa) {
        System.out.println(pessoa);
    }
}