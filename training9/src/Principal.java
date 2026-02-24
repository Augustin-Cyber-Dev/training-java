public class Principal {
    static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Piano");
        produto.setPreco(180000);

        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("O novo preço após o desconto é: R$ " + produto.getPreco());
    }
}