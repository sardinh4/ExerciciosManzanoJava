package manzano;

import java.util.Scanner;

public class index_L03K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double areaTotal = 0;
        String resposta;

        while (true) {
            System.out.print("Digite o nome do cômodo: ");
            String nomeComodo = scanner.nextLine();

            System.out.print("Digite a largura do cômodo em metros: ");
            double largura = scanner.nextDouble();

            System.out.print("Digite o comprimento do cômodo em metros: ");
            double comprimento = scanner.nextDouble();

            double areaComodo = largura * comprimento;
            areaTotal += areaComodo;

            System.out.println("Área do cômodo " + nomeComodo + ": " + areaComodo + " metros quadrados");

            scanner.nextLine(); // Limpar o buffer do scanner

            System.out.print("Deseja calcular outro cômodo? (SIM/NAO): ");
            resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("NAO")) {
                break;
            }
        }

        System.out.println("Área total da residência: " + areaTotal + " metros quadrados");
    }
}
