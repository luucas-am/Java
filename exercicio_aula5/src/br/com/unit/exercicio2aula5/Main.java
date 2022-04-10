package br.com.unit.exercicio2aula5;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) throws InterruptedException, IOException 
    {
        Console console = System.console();
        var dvds = new ArrayList<DVD>();
        var cds = new ArrayList<CD>();

        loop: while(true)
        {
            System.out.println("[1] - Cadastrar DVD\n[2] - Cadastrar CD\n[3] - Relatar DVD\n[4] - Relatar CD\n[0] - Sair");
            var entrada = Integer.parseInt(console.readLine("Opção Desejada: "));
            

            if(System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");

            switch (entrada) {
                case 1:
                    var dvd = new DVD();
                    dvd.inserirDados();
                    dvds.add(dvd);
                    break;
            
                case 2:
                    var cd = new CD();
                    cd.inserirDados();
                    cds.add(cd);
                    break;

                case 3:
                    for(int i = 0; i < dvds.size(); i++)
                    {
                        dvds.get(i).printDados();
                        System.out.println("\n");
                    }
                    break;

                case 4:
                    for(int i = 0; i < cds.size(); i++)
                    {
                        cds.get(i).printDados();
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
