public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal;

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifaMensal() {
        saldoAtual -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Seu saldo atual é de: R$" + saldoAtual + "!");
    }
}