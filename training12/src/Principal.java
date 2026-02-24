import br.com.atividade.ModeloCarro;

public class Principal {
    static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(30000, 50000, 18000);
        meuCarro.definirModeloDoMotor("V8");
        meuCarro.definirCorDoCarro("Black Piano");
        meuCarro.definirFuncionamento("Híbrido");
        meuCarro.exibirInfo();
        meuCarro.exibirInfoModeloCarro();
    }
}