import java.util.ArrayList;
import java.util.Scanner;

void main() {
    ArrayList<Produto> listaProdutos = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // Criação dos produtos
    Produto produto1 = new Produto("Sabão", 15.99, 5);
    Produto produto2 = new Produto("Detergente", 10.49, 8);
    Produto produto3 = new Produto("Desinfetante", 20.19, 10);

    // Adicionando os produtos na lista
    listaProdutos.add(produto1);
    listaProdutos.add(produto2);
    listaProdutos.add(produto3);

    // Retorna o tamanho da lista
    System.out.print("Tamanho da lista é: " + listaProdutos.size());
    System.out.println();

    // Retorna o nome do produto digitado pela posição
    System.out.print("Digite a posição do produto desejado (Posições: (0), (1), (2)): ");
    int posicao = sc.nextInt();
    System.out.println();

    // Exibe o return do método "toString"
    System.out.print("Produto na posição " + posicao + " é: " + listaProdutos.get(posicao).getNome());
    System.out.println();
    for (Produto produto : listaProdutos) {
        System.out.print(produto);
    }
    System.out.println();

    // Instânciando o objeto produtoNovo
    Produto produtoNovo = new Produto("Novo Produto", 13.99, 3);
    System.out.print(produtoNovo);
    System.out.println();

    // Instânciando o objeto produtoPerecivel
    ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto C", 12.75, 2, "2025-07-18");
    System.out.print(produtoPerecivel);
}