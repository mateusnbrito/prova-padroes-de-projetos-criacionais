package equipamento.factories;

import equipamento.interfaces.Equipamento;
import equipamento.interfaces.EquipamentoHalteres;

public class FactoryEquipamentoHalteres extends FactoryEquipamento {

  public Equipamento createEquipamento() {
    return EquipamentoHalteres.getInstance();
  }
}
