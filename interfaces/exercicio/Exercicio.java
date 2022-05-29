package interfaces.exercicio;

import java.util.Arrays;

import interfaces.equipamento.Button;

public class Exercicio {
  // Boolean nome;
  // Boolean categorias;
  // Boolean gruposMusculares;
  // Button equipamentos;
  Boolean nome;
  Boolean categorias;
  Boolean gruposMusculares;
  Button equipamentos;

  public Exercicio(Boolean nome, Boolean categorias, Boolean gruposMusculares, Button equipamentos) {
    this.nome = nome;
    this.categorias = categorias;
    this.gruposMusculares = gruposMusculares;
    this.equipamentos = equipamentos;
  }

  public Boolean getNome() {
    return nome;
  }

  public void setNome(Boolean nome) {
    this.nome = nome;
  }

  public Boolean getCategorias() {
    return categorias;
  }

  public void setCategorias(Boolean categorias) {
    this.categorias = categorias;
  }

  public Boolean getGruposMusculares() {
    return gruposMusculares;
  }

  public void setGruposMusculares(Boolean gruposMusculares) {
    this.gruposMusculares = gruposMusculares;
  }

  public Button getEquipamentos() {
    return equipamentos;
  }

  public void setEquipamentos(Button equipamentos) {
    this.equipamentos = equipamentos;
  }
}
