package factories;

import interfaces.equipamento.Button;

public abstract class Dialog {
  public abstract Button createButton();

  public void renderWindow() {
    Button okButton = createButton();
    okButton.render();
  }

}
