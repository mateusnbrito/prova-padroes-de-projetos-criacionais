package equipamento.factories;

import equipamento.interfaces.Equipamento;
import equipamento.interfaces.EquipamentoAcessorios;

public class FactoryEquipamentoAcessorios extends FactoryEquipamento{
  public Equipamento createEquipamento(String descricao) {
    return EquipamentoAcessorios.getInstance(descricao);
  }

  @Override
  public Equipamento createEquipamento() {
    return null;
  }
}
