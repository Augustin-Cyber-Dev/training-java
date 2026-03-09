import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();

        System.out.println("---------------------------------------------------------");

        System.out.println("Digite a altura da sala:");
        double altura = sc.nextDouble();

        System.out.println("Digite o perímetro da sala:");
        double largura = sc.nextDouble();

        calculadora.calcularArea(altura, largura);
        calculadora.calcularPerimetro(altura, largura);

        System.out.println("---------------------------------------------------------");
    }
}