package br.com.atividade;

public class ModeloCarro extends Carro{
    private String modeloMotor;
    private String corCarro;
    private String modeloFuncionamento;

    public void definirModeloDoMotor(String modeloMotor) {
        this.modeloMotor = modeloMotor;
    }

    public void definirCorDoCarro(String corCarro) {
        this.corCarro = corCarro;
    }

    public void definirFuncionamento(String modeloFuncionamento) {
        this.modeloFuncionamento = modeloFuncionamento;
    }

    public void exibirInfoModeloCarro() {
        System.out.println();
        System.out.println("********* Características do Carro *********");
        System.out.println("Modelo do Motor: " + modeloMotor);
        System.out.println("Cor do Carro: " + corCarro);
        System.out.println("Funcionamento do Carro: " + modeloFuncionamento);
        System.out.println("********************************************");
        System.out.println();
    }
}