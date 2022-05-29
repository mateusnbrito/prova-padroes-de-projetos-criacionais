package factories;

import interfaces.equipamento.Button;
import interfaces.equipamento.HtmlButton;

public class HtmlDialog extends Dialog {

  public Button createButton() {
    return HtmlButton.getInstance();
  }
}
