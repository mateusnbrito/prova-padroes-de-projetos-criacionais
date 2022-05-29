package interfaces.equipamento;
public class HtmlButton implements Button{
  private static HtmlButton instance;

  private HtmlButton(){}

  public static HtmlButton getInstance(){
    if(instance == null){
      instance = new HtmlButton();
    }

    return instance;
  }

  public void render() {
    System.out.println("<button>Test Button</button>");
    onClick();
  }

  public void onClick() {
    System.out.println("Click! HTML Button says - 'Hello World!'");
  }
}
