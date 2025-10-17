package proj.med.rpg.ferramentas.armas;

import proj.med.rpg.ataques.ataqueEspecial.AtaqueEspecial;

public abstract class Arma {
  public int danoBase;
  public AtaqueEspecial ataqueEspecial;

  public abstract void atacar();
  public abstract void executarAtaqueEspecial();
}
