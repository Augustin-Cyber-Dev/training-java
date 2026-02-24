<<<<<<< HEAD
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculo = new Calculadora();
        System.out.println("Digite um número: ");
        int resultado = calculo.dobrarNumero(sc.nextInt());
        System.out.println(resultado);
=======
public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.mensagem = "Olá, mundo!!!";

        pessoa1.escreverMensagem();
>>>>>>> 4cf741f684cd9a4ec8eb44f84a13eeecf7049bc7
    }
}