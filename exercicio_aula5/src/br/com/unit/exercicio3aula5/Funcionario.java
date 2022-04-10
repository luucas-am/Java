package br.com.unit.exercicio3aula5;

import java.io.Console;

public class Funcionario 
{
    private String cpf;
    private String nome;
    private String dataNascimento;
    private String matricula;

    public Funcionario() {
        System.out.println("Cadastrando Funcionario...");;
    }

    public String getTipo()
    {
        return this.getClass().getSimpleName();
    }

    public String getDetalhes()
    {
        return "CPF: " + this.cpf + "\nNome: " + this.nome + "\nData de Nascimento: " + this.dataNascimento + "\nMatrícula: " + this.matricula;
    }

    public void cadastrarFuncionario()
    {
        Console console = System.console();

        this.cpf = console.readLine("CPF: ");
        this.nome = console.readLine("Nome: ");
        this.dataNascimento = console.readLine("Data de Nascimento: ");
        this.matricula = console.readLine("Matrícula: ");
    }

    public void printDados()
    {
        var className = getTipo();
        var detalhes = getDetalhes();

        System.out.println(className + "\n" + detalhes);
    }
}
