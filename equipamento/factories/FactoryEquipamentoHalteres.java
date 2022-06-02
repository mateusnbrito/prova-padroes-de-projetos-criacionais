package equipamento.factories;

import equipamento.interfaces.Equipamento;
import equipamento.interfaces.EquipamentoHalteres;

public class FactoryEquipamentoHalteres extends FactoryEquipamento {

  public Equipamento createEquipamento(Double peso, String identificador, Integer quantidade) {
    return EquipamentoHalteres.getInstance(peso, identificador, quantidade);
  }

  @Override
  public Equipamento createEquipamento() {
    return null;
  }
}
