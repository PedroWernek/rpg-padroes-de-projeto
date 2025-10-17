package proj.med.rpg.ferramentas.armas.machado;

import proj.med.rpg.ataques.ataqueEspecial.tipo.GolpeEsmagador;

public class MachadoDeGuerra extends Machado{

  public MachadoDeGuerra() {
    this.danoBase = 18;
    this.ataqueEspecial = new GolpeEsmagador();
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
