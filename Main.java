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
    Exercicio exercicio;
    String exercicioNome;
    ArrayList<TiposDeExercicios> exercicioCategorias = new ArrayList<>();
    ArrayList<TiposDeGruposMusculares> exercicioGruposMusculares = new ArrayList<>();
    ArrayList<TiposDeEquipamentos> exercicioEquipamentos = new ArrayList<>();
    ArrayList<Equipamento> equipamentos = new ArrayList<>();

    String descricao = null;
    String marca = null;
    Double peso = null;

    exercicioNome = "Caminhada na Esteira";
    exercicioCategorias.add(TiposDeExercicios.CARDIOVASCULAR);
    exercicioCategorias.add(TiposDeExercicios.FUNCIONAL);
    exercicioGruposMusculares.add(TiposDeGruposMusculares.COXAS);
    exercicioGruposMusculares.add(TiposDeGruposMusculares.PANTURRILHAS);
    exercicioEquipamentos.add(TiposDeEquipamentos.MAQUINAS);

    descricao = "Esta é a descrição.";
    marca = "Life Fitness";
    peso = 10.0;

    equipamentos = criarEquipamentos(exercicioEquipamentos, descricao, marca, peso);

    // exercicio.getEquipamentos().forEach(equipamento -> {
    //   System.out.println(equipamento);
    // });

    exercicio = criarExercicio(exercicioNome, exercicioCategorias, exercicioGruposMusculares, exercicioEquipamentos, equipamentos);
    // exercicio2 = criarExercicio(exercicioNome, exercicioCategorias, exercicioGruposMusculares, exercicioEquipamentos, equipamentos);

    // imprimirExercicio(exercicio);
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

  private static ArrayList<Equipamento> criarEquipamentos(ArrayList<TiposDeEquipamentos> tiposDeEquipamentos, String descricao, String marca, Double peso) {
    ArrayList<Equipamento> equipamentos = new ArrayList<>();

    tiposDeEquipamentos.forEach(equipamento -> {
      switch(equipamento){
        case ACESSORIOS: {
          equipamentos.add(new FactoryEquipamentoAcessorios().createEquipamento(descricao));
          break;
        }
        case HALTERES: {
          equipamentos.add(new FactoryEquipamentoHalteres().createEquipamento(peso));
          break;
        }
        case MAQUINAS: {
          equipamentos.add(new FactoryEquipamentoMaquinas().createEquipamento(descricao, marca));
          break;
        }
        default:
          break;
      }
    });

    return equipamentos;
  }

  private static void imprimirExercicio(Exercicio exercicio){
    System.out.println(exercicio.toString());
  }
}
