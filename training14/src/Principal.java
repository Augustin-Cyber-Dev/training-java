public class Principal {
    static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(18000);
        conta.consultarSaldo();

        System.out.println();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(300);
        contaCorrente.setTarifaMensal(30);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(250);
        contaCorrente.consultarSaldo();
    }
}