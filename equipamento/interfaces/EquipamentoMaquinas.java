package equipamento.interfaces;

public class EquipamentoMaquinas extends Equipamento {
  String descricao;
  String marca;

  private static EquipamentoMaquinas instance;

  private EquipamentoMaquinas(String descricao, String marca){
    this.descricao = descricao;
    this.marca = marca;
  }

  public static EquipamentoMaquinas getInstance(String descricao, String marca){
    if(instance == null){
      instance = new EquipamentoMaquinas(descricao, marca);
    }

    return instance;
  }

  public String getDescricao() {
    return descricao;
  }

  public String getMarca() {
    return marca;
  }

  @Override
  public String toString() {
    return "\nIdentificador: " + identificador + "\nQuantidade: " + quantidade + "\nDescricao: " + descricao  + "\nMarca: " + marca;
  }

}
