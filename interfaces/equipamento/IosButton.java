package interfaces.equipamento;

public class IosButton implements Button{
  public void render() {
    System.out.println("<ios>Test Button</ios>");
    onClick();
  }

  public void onClick() {
    System.out.println("Click! iOS Button says - 'Hello World!'");
  }
}
