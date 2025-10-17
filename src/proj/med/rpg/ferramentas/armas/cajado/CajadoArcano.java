package proj.med.rpg.ferramentas.armas.cajado;

import proj.med.rpg.ataques.ataqueEspecial.tipo.BolaDeFogo;

public class CajadoArcano extends Cajado{

  public CajadoArcano() {
    this.danoBase = 8;
    this.ataqueEspecial = new BolaDeFogo();
    }

  @Override
  public void atacar() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'atacar'");
  }

  @Override
  public void executarAtaqueEspecial() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'executarAtaqueEspecial'");
  }


}
