package br.com.unit.exercicio1aula5;

import java.io.Console;

public class Main 
{
    public static void main(String[] args) throws Exception
    {
        Console console = System.console();
        var pessoaFisica = new Fisica();
        var pessoaJuridica = new Juridica();

        System.out.println("Informações Pessoa Física");

        pessoaFisica.setNome(console.readLine("Nome: "));
        pessoaFisica.setEndereco(console.readLine("Endereço: "));
        pessoaFisica.setTelefone(console.readLine("Telefone: "));
        pessoaFisica.setCpf(console.readLine("CPF: "));
        pessoaFisica.setRg(console.readLine("RG: "));
        pessoaFisica.setDataNascimento(console.readLine("Data de Nascimento: "));

        System.out.println("\nInformações Pessoa Jurídica");
        
        pessoaJuridica.setNome(console.readLine("Nome: "));
        pessoaJuridica.setEndereco(console.readLine("Endereço: "));
        pessoaJuridica.setTelefone(console.readLine("Telefone: "));
        pessoaJuridica.setCnpj(console.readLine("CNPJ: "));
        pessoaJuridica.setInscricaoEstadual(console.readLine("Inscrição Estadual: "));
        pessoaJuridica.setInscricaoMunicipal(console.readLine("Inscrição Municipal: "));
    }
}
