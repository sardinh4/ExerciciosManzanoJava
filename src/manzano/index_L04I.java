package manzano;

import java.util.Scanner;

public class index_L04I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;

        System.out.println("Digite valores positivos inteiros (digite um valor negativo para encerrar):");

        int valor;

        do {
            System.out.print("Digite um valor: ");
            valor = scanner.nextInt();

            if (valor >= 0) {
                // Atualiza o maior valor, se necessário
                if (valor > maiorValor) {
                    maiorValor = valor;
                }

                // Atualiza o menor valor, se necessário
                if (valor < menorValor) {
                    menorValor = valor;
                }
            }

        } while (valor >= 0);

        if (maiorValor != Integer.MIN_VALUE && menorValor != Integer.MAX_VALUE) {
            System.out.println("Maior valor digitado: " + maiorValor);
            System.out.println("Menor valor digitado: " + menorValor);
        } else {
            System.out.println("Nenhum valor positivo foi digitado.");
        }
    }
}
