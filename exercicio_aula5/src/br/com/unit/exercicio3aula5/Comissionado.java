package br.com.unit.exercicio3aula5;

public class Comissionado extends Funcionario 
{
    private double comissao;
    private double valorVenda;
    private double salario;
    
    public Comissionado(int departamento, double valorVenda) 
    {
        super();
        super.cadastrarFuncionario();
        this.valorVenda = valorVenda;
        
        if(departamento == 1)
            this.comissao = 0.05;
        else
            this.comissao = 0.07;

        this.salario = this.comissao * this.valorVenda;
    }

    public String getTipo()
    {
        return this.getClass().getSimpleName();
    }

    public String getDetalhes()
    {
        return super.getDetalhes() + "\nValor a Receber: " + this.salario;
    }

    public void printDados()
    {
        super.printDados();
    }
}
