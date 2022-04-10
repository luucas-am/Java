package br.com.unit.exercicio3aula5;

public class Assalariado extends Funcionario
{
    private String salario;

    public Assalariado(int cargo) {
        super();
        super.cadastrarFuncionario();
        
        if (cargo == 1)
            this.salario = "1 Salário Mínimo";
        else
            this.salario = "2 Salários Mínimos";
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
