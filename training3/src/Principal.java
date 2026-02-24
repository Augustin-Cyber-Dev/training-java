public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica =  new Musica();
        minhaMusica.titulo = "Nome da Música";
        minhaMusica.artista = "Nome do Artista";
        minhaMusica.anoLancamento = 2023;

        minhaMusica.exibeFichaTecnica();

        minhaMusica.avalia(9.7);
        minhaMusica.avalia(2.8);
        minhaMusica.avalia(1.8);

        double mediaAvaliacoes = minhaMusica.calcularMedia();
        System.out.println("Media das avaliações: " + mediaAvaliacoes);
    }
}