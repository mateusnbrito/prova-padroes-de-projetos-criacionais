package equipamento.interfaces;

public abstract class Equipamento {
  String identificador;
  Integer quantidade;

  public void incrementarQuantidade(){
    if(this.quantidade != null){
      this.quantidade++;
    }
    else{
      this.quantidade = 1;
    }
  }

  public String getIdentificador() {
    return identificador;
  }

  public Integer getQuantidade() {
    return quantidade;
  }
}