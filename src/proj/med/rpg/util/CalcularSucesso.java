package proj.med.rpg.util;

public class CalcularSucesso {
  /*
   * A regra será:
   * dado = 100% valor => dano = 200%
   * dado der entre 99% e 50% valor => dano = 100%
   * se não dano = 50% 
   */
  public static double dano(int danoBase, int ladosDado, int vezesRolado){
      double valorFinal = (double) Dados.rolar(ladosDado, vezesRolado) / ladosDado;
    System.out.println(valorFinal);
    if (valorFinal <= Valores.ChanceCritico.getValor()) {
      System.out.println("Critico!");
      return danoBase * 2;
    } else if (valorFinal < Valores.ChanceCritico.getValor() && valorFinal >= Valores.ChanceNormal.getValor()) {
      System.out.println("Normal");
      return danoBase * 1;
    } else if (valorFinal < Valores.ChanceNormal.getValor() && valorFinal >= Valores.ChanceErro.getValor()){
      System.out.println("Mal executado");
      return danoBase * 0.5;
    } else {
      System.out.println("Errou!");
      return danoBase * 0;
    }
  }
}
