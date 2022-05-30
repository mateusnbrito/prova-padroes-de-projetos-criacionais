package equipamento.factories;

import equipamento.interfaces.Equipamento;
import equipamento.interfaces.EquipamentoMaquinas;

public class FactoryEquipamentoMaquinas extends FactoryEquipamento {
  @Override
  public Equipamento createEquipamento() {
    return EquipamentoMaquinas.getInstance();
  }
}
