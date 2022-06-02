import java.util.ArrayList;

import enums.TiposDeEquipamentos;
import enums.TiposDeExercicios;
import enums.TiposDeGruposMusculares;
import equipamento.factories.FactoryEquipamentoAcessorios;
import equipamento.factories.FactoryEquipamentoHalteres;
import equipamento.factories.FactoryEquipamentoMaquinas;
import equipamento.interfaces.Equipamento;
import exercicio.interfaces.Exercicio;
import exercicio.interfaces.Exercicio.ExercicioBuilder;

public class Main {
  public static void main(String[] args) {
    TiposDeEquipamentos equipamentoTipoDeEquipamento;
    String equipamentoDescricao;
    String equipamentoMarca;
    Double equipamentoPeso;
    String equipamentoIdentificador;
    Integer equipamentoQuantidade;
    String exercicioNome = "";
    ArrayList<TiposDeExercicios> exercicioCategorias = new ArrayList<>();
    ArrayList<TiposDeGruposMusculares> exercicioGruposMusculares = new ArrayList<>();
    ArrayList<TiposDeEquipamentos> exercicioEquipamentos = new ArrayList<>();
    ArrayList<Equipamento> equipamentos = new ArrayList<>();

    // TODO: 1 - Esquema de Criação de Equipamentos
    equipamentoTipoDeEquipamento = TiposDeEquipamentos.MAQUINAS;
    equipamentoDescricao = "Esteira Ergométrica";
    equipamentoMarca = "Life Fitness";
    equipamentoPeso = 10.0;
    equipamentoIdentificador = "1";
    equipamentoQuantidade = 1;

    // novoEquipamento1
    Equipamento novoEquipamento1 = criarEquipamento(equipamentoTipoDeEquipamento, equipamentoDescricao, equipamentoMarca, equipamentoPeso, equipamentoIdentificador, equipamentoQuantidade);
    System.out.println(novoEquipamento1.toString());

    equipamentoTipoDeEquipamento = TiposDeEquipamentos.MAQUINAS;
    equipamentoDescricao = "Esteira Ergométrica";
    equipamentoMarca = "Life Fitness";
    equipamentoPeso = 10.0;
    equipamentoIdentificador = "1";
    equipamentoQuantidade = 2;

    // novoEquipamento2
    Equipamento novoEquipamento2 = criarEquipamento(equipamentoTipoDeEquipamento, equipamentoDescricao, equipamentoMarca, equipamentoPeso, equipamentoIdentificador, equipamentoQuantidade);
    System.out.println(novoEquipamento2.toString());

    // TODO: 2 - Esquema de Criação de Exercicios
    exercicioNome = "Caminhada na Esteira";
    exercicioCategorias.add(TiposDeExercicios.CARDIOVASCULAR);
    exercicioCategorias.add(TiposDeExercicios.MOBILIDADE);
    exercicioGruposMusculares.add(TiposDeGruposMusculares.COXAS);
    exercicioGruposMusculares.add(TiposDeGruposMusculares.PANTURRILHAS);
    exercicioEquipamentos.add(TiposDeEquipamentos.MAQUINAS);
    equipamentos.add(novoEquipamento1);

    // novoExercicio1
    Exercicio novoExercicio1 = criarExercicio(exercicioNome, exercicioCategorias, exercicioGruposMusculares, exercicioEquipamentos, equipamentos);
    System.out.println(novoExercicio1.toString());
    exercicioCategorias.clear();
    exercicioGruposMusculares.clear();
    exercicioEquipamentos.clear();
    equipamentos.clear();

    exercicioNome = "Caminhada na Esteira";
    exercicioCategorias.add(TiposDeExercicios.CARDIOVASCULAR);
    exercicioGruposMusculares.add(TiposDeGruposMusculares.COXAS);
    exercicioEquipamentos.add(TiposDeEquipamentos.MAQUINAS);
    equipamentos.add(novoEquipamento2);

    // novoExercicio2
    Exercicio novoExercicio2 = criarExercicio(exercicioNome, exercicioCategorias, exercicioGruposMusculares, exercicioEquipamentos, equipamentos);
    System.out.println(novoExercicio2.toString());
    exercicioCategorias.clear();
    exercicioGruposMusculares.clear();
    exercicioEquipamentos.clear();
    equipamentos.clear();

    exercicioNome = "Caminhada na Esteira";

    // novoExercicio3
    Exercicio novoExercicio3 = criarExercicio(exercicioNome, exercicioCategorias, exercicioGruposMusculares, exercicioEquipamentos, equipamentos);
    System.out.println(novoExercicio3.toString());
    exercicioCategorias.clear();
    exercicioGruposMusculares.clear();
    exercicioEquipamentos.clear();
    equipamentos.clear();
  }

  private static Exercicio criarExercicio(String exercicioNome, ArrayList<TiposDeExercicios> exercicioCategorias, ArrayList<TiposDeGruposMusculares> exercicioGruposMusculares, ArrayList<TiposDeEquipamentos> exercicioEquipamentos, ArrayList<Equipamento> equipamentos){
    Exercicio novoExercicio;

    novoExercicio = ExercicioBuilder.exercicioBuilder()
      .nome(exercicioNome)
      .categorias(exercicioCategorias)
      .gruposMusculares(exercicioGruposMusculares)
      .equipamentos(equipamentos)
      .build();

    return novoExercicio;
  }

  private static Equipamento criarEquipamento(TiposDeEquipamentos tiposDeEquipamentos, String descricao, String marca, Double peso, String identificador, Integer quantidade) {
    Equipamento equipamento = null;

    switch(tiposDeEquipamentos){
      case ACESSORIOS: {
        equipamento = new FactoryEquipamentoAcessorios().createEquipamento(descricao, identificador, quantidade);
        break;
      }
      case HALTERES: {
        equipamento = new FactoryEquipamentoHalteres().createEquipamento(peso, identificador, quantidade);
        break;
      }
      case MAQUINAS: {
        equipamento = new FactoryEquipamentoMaquinas().createEquipamento(descricao, marca, identificador, quantidade);
        break;
      }
      default:
        break;
    }

    return equipamento;
  }
}
