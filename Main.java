import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
    Exercicio exercicio = null;
    String exercicioNome = null;
    ArrayList<TiposDeExercicios> exercicioCategorias = new ArrayList<>();
    ArrayList<TiposDeGruposMusculares> exercicioGruposMusculares = new ArrayList<>();
    ArrayList<TiposDeEquipamentos> exercicioEquipamentos = new ArrayList<>();
    ArrayList<Equipamento> equipamentos = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    Boolean inputFinalizado = false;

    while(!inputFinalizado){
      String optionNome;
      String optionTiposDeExercicios;
      String optionTiposDeGruposMusculares;
      String optionTiposDeEquipamentos;

      System.out.println("Nome do exercício:");
      optionNome = scanner.nextLine();
      System.out.println();

      System.out.println("Categorias do exercício:");

      Arrays.asList(TiposDeExercicios.values()).forEach(tipoDeExercicio -> {
        System.out.println(tipoDeExercicio);
      });

      System.out.println();
      optionTiposDeExercicios = scanner.nextLine();
      System.out.println();

      System.out.println("Grupos musculares do exercício:");

      Arrays.asList(TiposDeGruposMusculares.values()).forEach(tipoDeGrupoMuscular -> {
        System.out.println(tipoDeGrupoMuscular);
      });

      System.out.println();
      optionTiposDeGruposMusculares = scanner.nextLine();
      System.out.println();

      System.out.println("Equipamentos do exercício:");

      Arrays.asList(TiposDeEquipamentos.values()).forEach(tipoDeEquipamento -> {
        System.out.println(tipoDeEquipamento);
      });

      System.out.println();
      optionTiposDeEquipamentos = scanner.nextLine();
      System.out.println();

      System.out.println(optionNome.getClass().getSimpleName());

      if((optionNome.getClass().getSimpleName()).equals("String")){
        exercicioNome = optionNome;
      }

      if((optionTiposDeExercicios.getClass().getSimpleName()).equals("String")){
        List<String> inputOptions = Arrays.asList(optionTiposDeExercicios.split("\\s*,\\s*"));

        Arrays.asList(TiposDeExercicios.values()).forEach(tipoDeExercicio -> {
          inputOptions.forEach(inputOption -> {
            if(inputOption.equalsIgnoreCase(tipoDeExercicio.toString())){
              exercicioCategorias.add(tipoDeExercicio);
            }
          });
        });
      }

      if((optionTiposDeGruposMusculares.getClass().getSimpleName()).equals("String")){
        List<String> inputOptions = Arrays.asList(optionTiposDeGruposMusculares.split("\\s*,\\s*"));

        Arrays.asList(TiposDeGruposMusculares.values()).forEach(tipoDeGrupoMuscular -> {
          inputOptions.forEach(inputOption -> {
            if(inputOption.equalsIgnoreCase(tipoDeGrupoMuscular.toString())){
              exercicioGruposMusculares.add(tipoDeGrupoMuscular);
            }
          });
        });
      }

      if((optionTiposDeEquipamentos.getClass().getSimpleName()).equals("String")){
        List<String> inputOptions = Arrays.asList(optionTiposDeEquipamentos.split("\\s*,\\s*"));

        Arrays.asList(TiposDeEquipamentos.values()).forEach(tipoDeEquipamento -> {
          inputOptions.forEach(inputOption -> {
            if(inputOption.equalsIgnoreCase(tipoDeEquipamento.toString())){
              Equipamento novoEquipamento;
              String optionDescricao = null;
              Double optionPeso = null;
              String optionMarca = null;

              switch(tipoDeEquipamento){
                case ACESSORIOS: {
                  System.out.println("Descrição do Acessório:");
                  optionDescricao = scanner.nextLine();
                  System.out.println();
                  break;
                }
                case HALTERES: {
                  System.out.println("Peso do Halter:");
                  optionPeso = scanner.nextDouble();
                  System.out.println();
                  break;
                }
                case MAQUINAS: {
                  System.out.println("Descrição da Máquina:");
                  optionDescricao = scanner.nextLine();
                  System.out.println();
                  System.out.println("Marca da Máquina:");
                  optionMarca = scanner.nextLine();
                  System.out.println();
                  break;
                }
              }

              novoEquipamento = criarEquipamentos(tipoDeEquipamento, optionDescricao, optionMarca, optionPeso);
              novoEquipamento.incrementarQuantidade();

              equipamentos.add(novoEquipamento);
            }
          });
        });
      }

      inputFinalizado = true;
    }

    scanner.close();

    exercicio = criarExercicio(exercicioNome, exercicioCategorias, exercicioGruposMusculares, exercicioEquipamentos, equipamentos);

    imprimirExercicio(exercicio);
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

  private static Equipamento criarEquipamentos(TiposDeEquipamentos tiposDeEquipamentos, String descricao, String marca, Double peso) {
    Equipamento equipamento = null;

    switch(tiposDeEquipamentos){
      case ACESSORIOS: {
        equipamento = new FactoryEquipamentoAcessorios().createEquipamento(descricao);
        break;
      }
      case HALTERES: {
        equipamento = new FactoryEquipamentoHalteres().createEquipamento(peso);
        break;
      }
      case MAQUINAS: {
        equipamento = new FactoryEquipamentoMaquinas().createEquipamento(descricao, marca);
        break;
      }
      default:
        break;
    }

    return equipamento;
  }

  private static void imprimirExercicio(Exercicio exercicio){
    System.out.println(exercicio.toString());
  }
}
