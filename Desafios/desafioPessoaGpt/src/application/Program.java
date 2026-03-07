package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import exceptions.DomainException;
import services.PessoaService;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        PessoaService service = new PessoaService();

        try {
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            Integer idade = sc.nextInt();

            System.out.print("Altura: ");
            Double altura = sc.nextDouble();

            Pessoa pessoa = service.criarPessoa(nome, idade, altura);
            service.apresentarPessoa(pessoa);

        } catch (InputMismatchException e) {
            System.out.println("Erro: tipo de dado inválido.");
        } catch (DomainException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}