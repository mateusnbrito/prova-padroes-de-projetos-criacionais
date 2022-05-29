package factory;

import interfaces.equipamento.Button;
import interfaces.equipamento.IosButton;

public class IosDialog extends Dialog{
  @Override
  public Button createButton() {
    return new IosButton();
  }
}
