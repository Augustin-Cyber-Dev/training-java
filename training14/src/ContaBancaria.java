public class ContaBancaria {
    protected double saldoAtual;

    public void depositar(double valor) {
        saldoAtual += valor;
        System.out.println("Deposito de " + valor + " realizado. Seu saldo atual é de: R$ " + saldoAtual + "!");
    }

    public void sacar(double valor) {
        if (valor <= saldoAtual) {
            saldoAtual -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo atual é de: R$ " + saldoAtual + "!");
        } else {
            System.out.println("Saldo insuficiente para saque!");
        }
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo atual é de: " + saldoAtual);
    }
}