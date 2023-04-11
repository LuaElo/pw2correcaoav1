import java.time.LocalDate;

public class AnimeTeste {

    public static void main(String[] args) {
        Anime meuAnime = new Anime();
        meuAnime.nome = "Yu Yu Hakusho";
        meuAnime.quantidadeEpisodios = 112;
        meuAnime.temporadas = 1;
        meuAnime.autor = "Yoshihiro Togashi";
        meuAnime.classificacao = 14;
        meuAnime.dataLancamento = LocalDate.of(1992, 10, 10);
        meuAnime.genero = "Ação";
    }

}
