package manzano;

import java.util.Scanner;

public class index_L05B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Digite um número para ver sua tabuada: ");
       int numero = scanner.nextInt();
       int tabuada;
       for (int i = 1; i<11; i++){
           tabuada = numero * i;
           System.out.println(numero + "x" +i+ "=" +tabuada);

        }
    }
}
