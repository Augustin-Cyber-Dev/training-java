public class Principal {
    static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("Lógica de Progamação");
        livro1.setAutor("Vitório");

        Livro livro2 = new Livro();
        livro2.setTitulo("Lógica da Vida");
        livro2.setAutor("Giovana");

        livro1.exibirDetalhes();

        System.out.println();
        
        livro2.exibirDetalhes();
    }
}