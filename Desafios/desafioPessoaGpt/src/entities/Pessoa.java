package entities;

import exceptions.DomainException;

public class Pessoa {

    private String nome;
    private Integer idade;
    private Double altura;

    public Pessoa(String nome, Integer idade, Double altura) {
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new DomainException("Nome não pode ser vazio.");
        }
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        if (idade == null || idade <= 0) {
            throw new DomainException("Idade deve ser maior que 0.");
        }
        this.idade = idade;
    }

    public void setAltura(Double altura) {
        if (altura == null || altura <= 0) {
            throw new DomainException("Altura deve ser maior que 0.");
        }
        this.altura = altura;
    }

    @Override
    public String toString() {
        return String.format(
                "Olá, meu nome é %s, tenho %d anos e minha altura é %.2f metros.",
                nome, idade, altura
                );
 
    }
}