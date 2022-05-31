package equipamento.factories;

import equipamento.interfaces.Equipamento;
import equipamento.interfaces.EquipamentoHalteres;

public class FactoryEquipamentoHalteres extends FactoryEquipamento {

  public Equipamento createEquipamento(Double peso) {
    return EquipamentoHalteres.getInstance(peso);
  }

  @Override
  public Equipamento createEquipamento() {
    return null;
  }
}
