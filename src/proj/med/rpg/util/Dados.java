package proj.med.rpg.util;

public class Dados {

    public static int rolar(int ladosDado, int vezes) {
        return repetir(vezes, ladosDado);
    }

    private static int repetir(int vezes, int valorDado) {
        int resultado;
        int resultadoFinal = 0;
        System.out.print("(D" + valorDado + ") -> | ");
        for (int i = 1; i <= vezes; i++) {
            resultado = (int) ((Math.random()) * valorDado) + 1;
            System.out.print(resultado + " | ");
            if (resultado > resultadoFinal) {
                resultadoFinal = resultado;
            }
        }
        System.out.println("\nMaior Resultado: " + resultadoFinal);
        return resultadoFinal;
    }
}
