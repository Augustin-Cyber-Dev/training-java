public class ConversorMoeda implements ConversaoFinanceira {

    public void perguntaDaConversao() {
        System.out.println("Insira o valor em dolar que você quer converter para real:");
    }

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 5.28;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$ " + valorReal + "!");
    }
}
