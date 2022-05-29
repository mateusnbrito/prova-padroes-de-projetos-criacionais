package interfaces.exercicio;

import interfaces.equipamento.Button;

public class BuilderExercicio {
  Boolean nome;
  Boolean categorias;
  Boolean gruposMusculares;
  Boolean equipamentos;

  public BuilderExercicio() {
    this.nome = true;
  }

  public BuilderExercicio categorias(Boolean _categorias){
    this.categorias = _categorias;
    return this;
  }

  public BuilderExercicio gruposMusculares(Boolean _gruposMusculares){
    this.gruposMusculares = _gruposMusculares;
    return this;
  }

  public BuilderExercicio equipamentos(Boolean _equipamentos){
    this.equipamentos = _equipamentos;
    return this;
  }

  public Exercicio build(){
    return new Exercicio(nome, categorias, gruposMusculares, equipamentos);
  }
}
