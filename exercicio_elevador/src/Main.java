import java.io.Console;

public class Main 
{
    public static void main(String[] args) throws Exception 
    {
        Console console = System.console();
        var elevador = new Elevador();

        elevador.setAndarAtual(0);
        elevador.setPessoasPresentes(0);

        elevador.setTotalAndares(Integer.parseInt(console.readLine("Total de Andares: ")));
        elevador.setCapacidade(Integer.parseInt(console.readLine("Capacidade Total: ")));

        loop: while (true)
        {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");


            System.out.println("Andar Atual: " + elevador.getAndarAtual() + " ------- Total de Andares: " + elevador.getTotalAndares());
            System.out.println("Pessoas Presentes: " + elevador.getPessoasPresentes() + " ------- Capacidade: " + elevador.getCapacidade());

            System.out.print("\n[1] - Entrar ==== [2] - Sair\n[3] - Subir ===== [4] - Descer\n[0] - Finalizar: ");
            var input = Integer.parseInt(console.readLine());

            switch (input)
            {
                case 1:
                    elevador.entrar();
                    break;

                case 2:
                    elevador.sair();
                    break;

                case 3:
                    elevador.subir();
                    break;

                case 4:
                    elevador.descer();
                    break;

                case 0:
                    break loop;

                default:
                    break;
            }
        }
    }
}