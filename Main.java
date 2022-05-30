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

    exercicioNome = "Caminhada na Esteira";
    exercicioCategorias.add(TiposDeExercicios.CARDIOVASCULAR);
    exercicioGruposMusculares.add(TiposDeGruposMusculares.COXAS);
    exercicioEquipamentos.add(TiposDeEquipamentos.MAQUINAS);
    equipamentos = criarEquipamentos(exercicioEquipamentos);

    exercicio = ExercicioBuilder.exercicioBuilder()
      .nome(exercicioNome)
      .categorias(exercicioCategorias)
      .gruposMusculares(exercicioGruposMusculares)
      .equipamentos(equipamentos)
      .build();

    System.out.println(exercicio.toString());
  }

  static ArrayList<Equipamento> criarEquipamentos(ArrayList<TiposDeEquipamentos> tiposDeEquipamentos) {
    ArrayList<Equipamento> equipamentos = new ArrayList<>();

    tiposDeEquipamentos.forEach(equipamento -> {
      switch(equipamento){
        case ACESSORIOS: {
          equipamentos.add(new FactoryEquipamentoAcessorios().createEquipamento());
          break;
        }
        case HALTERES: {
          equipamentos.add(new FactoryEquipamentoHalteres().createEquipamento());
          break;
        }
        case MAQUINAS: {
          equipamentos.add(new FactoryEquipamentoMaquinas().createEquipamento());
          break;
        }
        default:
          break;
      }
    });

    return equipamentos;
  }
}
