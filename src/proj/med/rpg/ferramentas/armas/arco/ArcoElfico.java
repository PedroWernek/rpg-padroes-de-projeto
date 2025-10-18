package proj.med.rpg.ferramentas.armas.arco;

import proj.med.rpg.ataques.ataqueEspecial.ChuvaDeFlechas;

public class ArcoElfico extends Arco{

  public ArcoElfico() {
    this.danoBase = 12;
    this.ataqueEspecial = new ChuvaDeFlechas();
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
