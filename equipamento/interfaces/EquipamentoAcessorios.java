package equipamento.interfaces;

public class EquipamentoAcessorios extends Equipamento{
  String descricao;

  private static EquipamentoAcessorios instance;

  private EquipamentoAcessorios(String descricao){
    this.descricao = descricao;

    super.incrementarQuantidade();
  }

  public static EquipamentoAcessorios getInstance(String descricao){
    if(instance == null){
      instance = new EquipamentoAcessorios(descricao);
      
    }

    return instance;
  }

  public String getDescricao() {
    return descricao;
  }

  @Override
  public String toString() {
    return "\nIdentificador: " + identificador + "\nQuantidade: " + quantidade + "\nDescricao: " + descricao;
  }
}
