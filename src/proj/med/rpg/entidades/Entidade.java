package proj.med.rpg.entidades;

import proj.med.rpg.entidades.status.Status;

public abstract class Entidade {
  public int vida;
  public Status status = Status.Normal;
}
