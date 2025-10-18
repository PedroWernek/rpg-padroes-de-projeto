package proj.med.rpg.ataques;

import proj.med.rpg.util.Dados;

public class Atacar {
  public static void executarAtaque(int danoBase,int vida) {
    //Rolar dado
    Dados.rolarD20(2);
  }
}
