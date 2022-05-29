import enums.Botoes;
import factory.Dialog;
import factory.HtmlDialog;
import factory.IosDialog;
import factory.WindowsDialog;

public class Main {
  private static Dialog instance;

  public static void main(String[] args) {
    configure(Botoes.HTML);
    runBusinessLogic();
    configure(Botoes.HTML);
    runBusinessLogic();
    configure(Botoes.HTML);
    runBusinessLogic();
    configure(Botoes.HTML);
    runBusinessLogic();
  }

  static void configure(Botoes botao) {
    switch(botao){
      case HTML: {
        instance = new HtmlDialog();
        break;
      }
      case WINDOWS: {
        instance = new WindowsDialog();
        break;
      }
      case IOS: {
        instance = new IosDialog();
        break;
      }
      default:
        break;
    }
  }

  static void runBusinessLogic() {
    instance.renderWindow();
  }
}
