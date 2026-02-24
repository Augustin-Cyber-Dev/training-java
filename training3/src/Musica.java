public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numeroAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Título da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lancamento: " + anoLancamento);
    }

    void avalia(double nota) {
        avaliacao += nota;
        numeroAvaliacoes++;
    }

    double calcularMedia() {
        return avaliacao / numeroAvaliacoes;
    }
}
