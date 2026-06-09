void main() {

    Scanner sc = new Scanner(System.in);

    // Dados do Produto
    System.out.println("=== Cadastro de Produto ===");
    System.out.print("Nome: ");
    String nomeProduto = sc.nextLine();

    System.out.print("Preco unitario: ");
    double precoProduto = sc.nextDouble();

    System.out.print("Quantidade: ");
    int quantidadeProduto = sc.nextInt();

    System.out.print("Percentual de desconto: ");
    double descontoProduto = sc.nextDouble();
    sc.nextLine(); // limpa o buffer

    // Dados do Servico
    System.out.println("\n=== Cadastro de Servico ===");
    System.out.print("Descricao: ");
    String descricaoServico = sc.nextLine();

    System.out.print("Preco por hora: ");
    double precoServico = sc.nextDouble();

    System.out.print("Quantidade de horas: ");
    int horasServico = sc.nextInt();

    System.out.print("Percentual de desconto: ");
    double descontoServico = sc.nextDouble();

    // Criando objetos
    Produto produto = new Produto(nomeProduto, precoProduto);
    Servico servico = new Servico(descricaoServico, precoServico);

    // Aplicando desconto
    produto.aplicarDescontos(descontoProduto);
    servico.aplicarDescontos(descontoServico);

    // Resultado
    System.out.println("\n=== Resultado ===");
    System.out.println("Produto: " + produto.getNome() + " - Total: R$ " + produto.calcularPrecoTotal(quantidadeProduto));
    System.out.println("Servico: " + servico.getDescricao() + " - Total: R$ " + servico.calcularPrecoTotal(horasServico));

    sc.close();
}
