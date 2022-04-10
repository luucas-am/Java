package br.com.unit.exercicio2aula5;

import java.io.Console;

public class Midia 
{
    private int codigo;
    private double preco;
    private String nome;

    public Midia()
    {
        System.out.println("Cadastrando Mídia...");
    }
    
    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public String getTipo()
    {
        return this.getClass().getSimpleName();
    }

    public String getDetalhes()
    {
        return "Código: " + this.codigo + "\nPreço: R$" + this.preco + "\nNome: " + this.nome;
    }

    public void printDados()
    {
        var className = getTipo();
        var detalhes = getDetalhes();

        System.out.println(className + "\n" + detalhes);
    }

    public void inserirDados()
    {
        Console console = System.console();

        this.codigo = Integer.parseInt(console.readLine("Codigo: "));
        this.preco = Double.parseDouble(console.readLine("Preço: "));
        this.nome = console.readLine("Nome: ");
    }
}
