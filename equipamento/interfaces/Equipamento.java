package equipamento.interfaces;

import java.util.UUID;

public abstract class Equipamento {
  String identificador = UUID.randomUUID().toString();
  Integer quantidade = 0;

  public void incrementarQuantidade(){
    this.quantidade++;
  }

  public String getIdentificador() {
    return identificador;
  }

  public Integer getQuantidade() {
    return quantidade;
  }

  @Override
  public String toString() {
    return "Equipamento [identificador=" + identificador + ", quantidade=" + quantidade + "]";
  }
}