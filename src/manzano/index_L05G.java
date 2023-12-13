package manzano;

public class index_L05G {
    public static void main(String[] args) {
        for (int expoente = 0; expoente <= 15; expoente++) {
            long resultado = calcularPotenciaDeTres(expoente);
            System.out.println("3^" + expoente + " = " + resultado);
        }
    }

    private static long calcularPotenciaDeTres(int expoente) {
        long resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= 3;
        }

        return resultado;
    }
}
