public class IdadePessoa {
    private String nome;
    private int idade;

    public void verificaIdade() {
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade!");
        } else {
            System.out.println(nome + " não é maior de idade!");
        }
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}