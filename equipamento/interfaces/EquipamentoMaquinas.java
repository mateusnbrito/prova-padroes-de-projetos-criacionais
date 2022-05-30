package equipamento.interfaces;

public class EquipamentoMaquinas implements Equipamento {
  String descricao;
  String marca;

  private static EquipamentoMaquinas instance;

  private EquipamentoMaquinas(){}

  public static EquipamentoMaquinas getInstance(){
    if(instance == null){
      instance = new EquipamentoMaquinas();
    }

    return instance;
  }
}
