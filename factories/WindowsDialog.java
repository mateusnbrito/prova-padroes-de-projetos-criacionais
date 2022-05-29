package factory;

import interfaces.equipamento.Button;
import interfaces.equipamento.WindowsButton;

public class WindowsDialog extends Dialog {
  @Override
  public Button createButton() {
    return new WindowsButton();
  }
}
