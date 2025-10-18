package proj.med.rpg.ataques;

import proj.med.rpg.util.CalcularSucesso;

public class Atacar {
  public static int executarAtaque(int danoBase, int ladosDado, int vida, int chance) {
    //Rolar dado
    return vida -= (int)(CalcularSucesso.dano(danoBase, ladosDado, chance));
  }
}
