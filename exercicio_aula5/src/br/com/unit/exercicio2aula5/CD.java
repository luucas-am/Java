package br.com.unit.exercicio2aula5;

import java.io.Console;

public class CD extends Midia
{
    private int nMusicas;
    
    public CD()
    {
        super();
        System.out.println("Cadastrando CD...");
    }

    public CD(int codigo, double preco, String nome, int musicas) {
        super(codigo, preco, nome);
        this.nMusicas = musicas;
    }
    
    public String getTipo()
    {
        return this.getClass().getSimpleName();
    }
    
    public String getDetalhes()
    {
        return super.getDetalhes() + "\nNúmero de Musicas: " + this.nMusicas;
    }

    public void printDados()
    {
        super.printDados();
    }

    public void setMusicas(int nMusicas) 
    {
        this.nMusicas = nMusicas;
    }

    public void inserirDados()
    {
        Console console = System.console();

        super.inserirDados();
        var musicas = Integer.parseInt(console.readLine("Número de Músicas"));
        setMusicas(musicas);       
    }
}