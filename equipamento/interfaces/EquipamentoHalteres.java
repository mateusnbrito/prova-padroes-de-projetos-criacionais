package equipamento.interfaces;

public class EquipamentoHalteres extends Equipamento{
  Double peso;

  private static EquipamentoHalteres instance;

  private EquipamentoHalteres(){}

  public static EquipamentoHalteres getInstance(){
    if(instance == null){
      instance = new EquipamentoHalteres();
    }

    return instance;
  }
}
