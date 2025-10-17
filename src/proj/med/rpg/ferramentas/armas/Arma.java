package proj.med.rpg.ferramentas.armas;

import proj.med.rpg.ferramentas.efeitos.EfeitoEspecial;

public abstract class Arma {
  public int danoBase;
  public EfeitoEspecial efeitoEspecial;

  public abstract void atacar();
  public abstract void ataqueEspecial();
}
