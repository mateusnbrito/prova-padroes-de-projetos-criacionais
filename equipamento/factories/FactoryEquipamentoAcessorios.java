package equipamento.factories;

import equipamento.interfaces.Equipamento;
import equipamento.interfaces.EquipamentoAcessorios;

public class FactoryEquipamentoAcessorios extends FactoryEquipamento{
  @Override
  public Equipamento createEquipamento() {
    return EquipamentoAcessorios.getInstance();
  }
}
