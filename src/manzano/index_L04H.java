package manzano;

import java.util.Scanner;

public class index_L04H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double areaTotal = 0;

        do {
            System.out.print("Digite o nome do cômodo: ");
            String nomeComodo = scanner.nextLine();

            System.out.print("Digite a largura do cômodo em metros: ");
            double largura = scanner.nextDouble();

            System.out.print("Digite o comprimento do cômodo em metros: ");
            double comprimento = scanner.nextDouble();

            double areaComodo = calcularArea(largura, comprimento);
            areaTotal += areaComodo;

            System.out.println("A área do " + nomeComodo + " é: " + areaComodo + " metros quadrados");

            scanner.nextLine(); // Limpar o buffer do teclado

            System.out.print("Deseja calcular a área de mais um cômodo? (SIM/NAO): ");
        } while (scanner.nextLine().equalsIgnoreCase("SIM"));

        System.out.println("A área total da residência é: " + areaTotal + " metros quadrados");
    }

    private static double calcularArea(double largura, double comprimento) {
        return largura * comprimento;
    }
}
