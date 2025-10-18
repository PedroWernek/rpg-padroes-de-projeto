package proj.med.rpg.ferramentas.armas.cajado;

import proj.med.rpg.ataques.ataqueEspecial.BolaDeFogo;

public class CajadoArcano extends Cajado{

  public CajadoArcano() {
    this.danoBase = 8;
    this.ataqueEspecial = new BolaDeFogo();
    }

  @Override
  public void atacar(int vida) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'atacar'");
  }

  @Override
  public void executarAtaqueEspecial(int vida) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'executarAtaqueEspecial'");
  }


}
