public class Produto {
    private String nome;
    private double preco;

    public void Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void aplicarDesconto(double percentual) {
        double desconto = preco * (percentual / 100);
        preco -= desconto;
    }
}
