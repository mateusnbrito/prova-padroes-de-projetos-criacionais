package equipamento.interfaces;

public class EquipamentoAcessorios extends Equipamento{
  String descricao;

  private static EquipamentoAcessorios instance;

  private EquipamentoAcessorios(){}

  public static EquipamentoAcessorios getInstance(){
    if(instance == null){
      instance = new EquipamentoAcessorios();
    }

    return instance;
  }
}
