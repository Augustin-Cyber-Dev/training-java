void main() {
    ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

    Pessoa pessoa1 = new Pessoa("Vitório", 19);
    Pessoa pessoa2 = new Pessoa("Giovana", 18);
    Pessoa pessoa3 = new Pessoa("Luiza", 47);

    listaDePessoas.add(pessoa1);
    listaDePessoas.add(pessoa2);
    listaDePessoas.add(pessoa3);

    System.out.print("Tamanho da lista: " + listaDePessoas.size());

    System.out.println();

    System.out.print("Primeira pessoa da lista: " + listaDePessoas.get(0));

    System.out.println();

    System.out.print("******** LISTA DE PESSOAS ********");
    for (Pessoa pessoa : listaDePessoas) {
        System.out.println(pessoa);
    }
}
