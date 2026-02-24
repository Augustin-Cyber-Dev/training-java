public class Principal {
    static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Vitório");
        pessoa1.setIdade(18);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Giovana");
        pessoa2.setIdade(17);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos de idade!");
        pessoa1.verificaIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos de idade!");
        pessoa2.verificaIdade();
    }
}