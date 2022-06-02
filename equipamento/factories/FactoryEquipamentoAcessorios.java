package equipamento.factories;

import equipamento.interfaces.Equipamento;
import equipamento.interfaces.EquipamentoAcessorios;

public class FactoryEquipamentoAcessorios extends FactoryEquipamento{
  public Equipamento createEquipamento(String descricao, String identificador, Integer quantidade) {
    return EquipamentoAcessorios.getInstance(descricao, identificador, quantidade);
  }

  @Override
  public Equipamento createEquipamento() {
    return null;
  }
}
