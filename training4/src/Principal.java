public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Supra MK4";
        meuCarro.ano = 2023;
        meuCarro.cor = "Azul Meia-Noite";

        meuCarro.exibirFichaTecnica();

        System.out.println("A idade do carro é: " + meuCarro.calcularIdadeCarro() + " anos!!!");
    }
}