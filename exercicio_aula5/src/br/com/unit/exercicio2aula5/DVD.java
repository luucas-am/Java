package br.com.unit.exercicio2aula5;

import java.io.Console;

public class DVD extends Midia
{
    private int nFaixas;
    
    public DVD()
    {
        super();
        System.out.println("Cadastrando DVD...");
    }

    public DVD(int codigo, double preco, String nome, int faixas) {
        super(codigo, preco, nome);
        this.nFaixas = faixas;
    }

    public String getTipo()
    {
        return this.getClass().getSimpleName();
    }

    public String getDetalhes()
    {
        return super.getDetalhes() + "\nNúmero de Faixas: " + this.nFaixas;
    }

    public void printDados()
    {
        super.printDados();
    }

    public void setFaixas(int nFaixas) 
    {
        this.nFaixas = nFaixas;
    }

    public void inserirDados()
    {
        Console console = System.console();

        super.inserirDados();
        var faixas = Integer.parseInt(console.readLine("Número de Faixas: "));
        setFaixas(faixas);
    }
}