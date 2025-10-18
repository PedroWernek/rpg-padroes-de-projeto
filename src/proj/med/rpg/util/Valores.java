package proj.med.rpg.util;

public enum Valores {
  ChanceCritico(0.95),
  ChanceNormal(0.50),
  ChanceErro(0.2);

  private final double valor;

  private Valores(double valor) {
    this.valor = valor;
  }

  public double getValor() {
    return this.valor;
  }


}
