package equipamento.factories;

import equipamento.interfaces.Equipamento;
import equipamento.interfaces.EquipamentoMaquinas;

public class FactoryEquipamentoMaquinas extends FactoryEquipamento {
  public Equipamento createEquipamento(String descricao, String marca, String identificador, Integer quantidade) {
    return EquipamentoMaquinas.getInstance(descricao, marca, identificador, quantidade);
  }

  @Override
  public Equipamento createEquipamento() {
    return null;
  }
}
