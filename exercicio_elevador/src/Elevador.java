public class Elevador 
{
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public int getAndarAtual() 
    {
        return andarAtual;
    }
    public void setAndarAtual(int andarAtual) 
    {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() 
    {
        return totalAndares;
    }
    public void setTotalAndares(int totalAndares) 
    {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() 
    {
        return capacidade;
    }
    public void setCapacidade(int capacidade) 
    {
        this.capacidade = capacidade;
    }

    public int getPessoasPresentes()
    {
        return pessoasPresentes;
    }
    public void setPessoasPresentes(int pessoasPresentes)
    {
        this.pessoasPresentes = pessoasPresentes;
    }

    public void entrar()
    {
        if (this.pessoasPresentes < this.capacidade)
            this.pessoasPresentes += 1;
    }

    public void sair()
    {
        if (this.pessoasPresentes > 0)
            this.pessoasPresentes -= 1;
    }

    public void subir()
    {
        if (this.andarAtual < this.totalAndares)
            this.andarAtual += 1;
    }
    public void descer()
    {
        if (this.andarAtual > 0)
            this.andarAtual -= 1;
    }
}