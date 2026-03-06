import java.util.Scanner;

public class Main {
  public static void main() {
    ConversorMoeda conversor = new ConversorMoeda();
    conversor.perguntaDaConversao();

    Scanner sc = new Scanner(System.in);

    conversor.converterDolarParaReal(sc.nextDouble());

    sc.close();
  }
}