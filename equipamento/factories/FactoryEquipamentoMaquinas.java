package equipamento.factories;

import equipamento.interfaces.Equipamento;
import equipamento.interfaces.EquipamentoMaquinas;

public class FactoryEquipamentoMaquinas extends FactoryEquipamento {
  public Equipamento createEquipamento(String descricao, String marca) {
    return EquipamentoMaquinas.getInstance(descricao, marca);
  }

  @Override
  public Equipamento createEquipamento() {
    return null;
  }
}
