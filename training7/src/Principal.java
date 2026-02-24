import br.com.atividade.ContaBancaria;

public class Principal {
     public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(3);
        conta.setSaldo(18000);
        conta.titular = "Vitório";

         System.out.println("Número da Conta é: " + conta.getNumeroConta());
         System.out.println("Saldo é: " + conta.getSaldo());
         System.out.println("Titular é: " + conta.titular);

         conta.setSaldo(15000);
         System.out.println("Novo Saldo é: " + conta.getSaldo());
    }
}