package equipamento.interfaces;

public class EquipamentoHalteres extends Equipamento{
  Double peso;

  private static EquipamentoHalteres instance;

  private EquipamentoHalteres(Double peso){
    this.peso = peso;

    super.incrementarQuantidade();
  }

  public static EquipamentoHalteres getInstance(Double peso){
    if(instance == null){
      instance = new EquipamentoHalteres(peso);
    }

    return instance;
  }

  public Double getPeso() {
    return peso;
  }

  @Override
  public String toString() {
    return "\nIdentificador: " + identificador + "\nQuantidade: " + quantidade + "\nPeso: " + peso;
  }
}
