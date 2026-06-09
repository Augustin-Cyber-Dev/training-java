public class Livro extends Produto implements Calculavel{

    private String autor;

    public Livro(String nome, String autor, double preco) {
        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.9;
    }
}
