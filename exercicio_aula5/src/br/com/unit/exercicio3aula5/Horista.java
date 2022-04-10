package br.com.unit.exercicio3aula5;

public class Horista extends Funcionario
{
    private final double HORA_TRABALHO = 50.0;
    private double horasTrabalhadas;
    private double salario;

    public Horista(double horasTrabalhadas) 
    {
        super();
        super.cadastrarFuncionario();
        this.horasTrabalhadas = horasTrabalhadas;
        this.salario = this.horasTrabalhadas * this.HORA_TRABALHO;
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
