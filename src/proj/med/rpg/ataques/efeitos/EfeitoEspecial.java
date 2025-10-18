package proj.med.rpg.ataques.efeitos;

import proj.med.rpg.entidades.personagem.atibuto.Atributo;

public abstract class EfeitoEspecial {
  public int custoMana;
  public Atributo requisito;
  
  public abstract void aplicarEfeito();
}
