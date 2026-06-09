import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    CalculadoraSalaRetangular calc = new CalculadoraSalaRetangular();

    System.out.print("Digite o valor da altura e largura respectivamente para descobrir a área: ");
    calc.calcularArea(sc.nextDouble(), sc.nextDouble());

    System.out.print("Digite o valor da altura e largura respectivamente para descobrir o perímetro: ");
    calc.calcularPerimetro(sc.nextDouble(), sc.nextDouble());
}
