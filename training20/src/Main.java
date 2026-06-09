import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    // Dados do Livro
    System.out.println("=== Cadastro de Livro ===");
    System.out.print("Nome: ");
    String nomeLivro = sc.nextLine();

    System.out.print("Preço: ");
    double precoLivro = sc.nextDouble();
    sc.nextLine();

    System.out.print("Autor: ");
    String autorLivro =  sc.nextLine();

    Livro livro = new Livro(nomeLivro, autorLivro, precoLivro);

    // Dados do Produto Físico
    System.out.println("=== Cadastro de Produto Físico ===");
    System.out.print("Nome: ");
    String nomeProduto = sc.nextLine();

    System.out.print("Preço: ");
    double precoProduto = sc.nextDouble();

    ProdutoFisico produto = new ProdutoFisico(nomeProduto, precoProduto);

    // Prints
    System.out.println("=== CHECK IN ===");
    System.out.println("Livro: " + livro.getNome() + " - Autor: " + livro.getAutor() + " - Preço: R$ " + livro.calcularPrecoFinal());
    System.out.println("Produto Físico: " + produto.getNome() + " - Preço: R$ " + produto.calcularPrecoFinal());

    sc.close();
}
