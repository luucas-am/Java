package br.com.unit.aula4exercicio1;

import java.util.Scanner;

public class ConversaoDeUnidadeDeAreas 
{
    public static void main(String[] args) throws Exception 
    {
        var scanner = new Scanner(System.in);
        while (true)
        {
            System.out.print("\n[1] - Metros Quadrados para Pés Quadrados\n[2] - Pés Quadrados para Centimetros Quadrados");
            System.out.print("\n[3] - Milhas Quadradas para Acres\n[4] - Acres para Pés Quadrados\n[0] - Sair");
            System.out.print("\nOpção Desejada: ");
            var entrada = scanner.nextInt();

            if (entrada == 0)
                break;

            System.out.print("\nDigite um número: ");
            var num = scanner.nextDouble();

            double resultado;
            switch (entrada) 
            {
                case 1:
                    resultado = converterMetrosPes(num);
                    System.out.printf("\n%.2f m² = %.2f pes²\n", num, resultado);
                    break;
                case 2:
                    resultado = converterPesCentimetros(num);
                    System.out.printf("\n%.2f pes² = %.2f cm²\n", num, resultado);
                    break;
                case 3:
                    resultado = converterMilhasAcres(num);
                    System.out.printf("\n%.2f milhas² = %.2f acres²\n", num, resultado);
                    break;
                case 4:
                    resultado = converterAcresPes(num);
                    System.out.printf("\n%.2f acres² = %.2f pes²\n", num, resultado);
                    break;
                default:
                    System.out.println("\nERROR - Entrada Inválida.");
                    break;
            }
        } 
        scanner.close();
    }

    public static double converterMetrosPes(double a) {
        final double METRO_EM_PES = 10.76;
        return a * METRO_EM_PES;
    }

    public static double converterPesCentimetros(double a) {
        final double PES_EM_CENTIMETROS = 929.03;
        return a * PES_EM_CENTIMETROS;
    }

    public static double converterMilhasAcres(double a) {
        final double MILHAS_EM_ACRES = 640;
        return a * MILHAS_EM_ACRES;
    }

    public static double converterAcresPes(double a) {
        final double ACRES_EM_PES = 43560;
        return a * ACRES_EM_PES;
    }
}