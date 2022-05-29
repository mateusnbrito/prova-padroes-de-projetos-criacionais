import enums.Botoes;
import factories.Dialog;
import factories.HtmlDialog;
import factories.IosDialog;
import factories.WindowsDialog;

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
