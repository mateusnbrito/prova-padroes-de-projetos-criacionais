import enums.TiposDeEquipamentos;
import equipamento.factories.FactoryEquipamento;
import equipamento.factories.FactoryEquipamentoHalteres;
import equipamento.factories.FactoryEquipamentoAcessorios;

public class Main {
  private static FactoryEquipamento instance;

  public static void main(String[] args) {
    configurar(TiposDeEquipamentos.ACESSORIOS);
    rodarLogicaDeNegocio();
    configurar(TiposDeEquipamentos.ACESSORIOS);
    rodarLogicaDeNegocio();
    configurar(TiposDeEquipamentos.ACESSORIOS);
    rodarLogicaDeNegocio();
    configurar(TiposDeEquipamentos.HALTERES);
    rodarLogicaDeNegocio();
    configurar(TiposDeEquipamentos.HALTERES);
    rodarLogicaDeNegocio();
    configurar(TiposDeEquipamentos.HALTERES);
    rodarLogicaDeNegocio();
    configurar(TiposDeEquipamentos.MAQUINAS);
    rodarLogicaDeNegocio();
    configurar(TiposDeEquipamentos.MAQUINAS);
    rodarLogicaDeNegocio();
    configurar(TiposDeEquipamentos.MAQUINAS);
    rodarLogicaDeNegocio();
  }

  static void configurar(TiposDeEquipamentos tipoDeEquipamento) {
    switch(tipoDeEquipamento){
      case ACESSORIOS: {
        instance = new FactoryEquipamentoAcessorios();
        break;
      }
      case HALTERES: {
        instance = new FactoryEquipamentoHalteres();
        break;
      }
      case MAQUINAS: {
        instance = new FactoryEquipamentoAcessorios();
        break;
      }
      default:
        break;
    }
  }

  static void rodarLogicaDeNegocio() {
    System.out.println(instance.createEquipamento());
  }
}
