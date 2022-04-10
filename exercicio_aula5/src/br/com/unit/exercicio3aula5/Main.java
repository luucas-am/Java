package br.com.unit.exercicio3aula5;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) throws InterruptedException, IOException 
    {
        Console console = System.console();
        var funcionarios = new ArrayList<Funcionario>();

        loop: while(true)
        {
            System.out.println("[1] - Cadastrar Assalariado\n[2] - Cadastrar Comissionado\n[3] - Cadastrar Horista");
            System.out.println("[4] - Relatar Funcionarios\n[0] - Sair");
            var entrada = Integer.parseInt(console.readLine("Opção Desejada: "));

            if(System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");

            switch (entrada) {
                case 1:
                    var cargo = Integer.parseInt(console.readLine("[1] - Assistente\n[2] - Supervisor\nOpção Desejada: "));
                    if(cargo < 1 && cargo > 2)
                        break;
                    
                    var assalariado = new Assalariado(cargo);
                    funcionarios.add(assalariado);
                    break;

                case 2:
                    var departamento = Integer.parseInt(console.readLine("[1] - Roupas\n[2] - Calçados\nOpção Desejada: "));
                    if(departamento < 1 && departamento > 2)
                        break;
                    
                    var valorVenda = Double.parseDouble(console.readLine("Valor de Venda: "));
                    var comissionado = new Comissionado(departamento, valorVenda);
                    funcionarios.add(comissionado);
                    break;

                case 3:
                    var horasTrabalhadas = Double.parseDouble(console.readLine("Horas Trabalhadas: "));
                    var horista = new Horista(horasTrabalhadas);
                    funcionarios.add(horista);
                    break;
                
                case 4:
                    for(int i = 0; i < funcionarios.size(); i++)
                    {
                        funcionarios.get(i).printDados();
                        System.out.println("\n");
                    }
                    break;

                case 0:
                    break loop;

                default:
                    break;
            }
            console.readLine("\nPressione Enter Para Continuar.");
            if(System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        }
    }    
}
