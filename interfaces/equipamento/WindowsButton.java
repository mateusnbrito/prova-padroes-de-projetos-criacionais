package interfaces.equipamento;
public class WindowsButton implements Button {
  public void render() {
    System.out.println("<windows>Test Button</windows>");
    onClick();
  }

  public void onClick() {
    System.out.println("Click! Windows Button says - 'Hello World!'");
  }
}
