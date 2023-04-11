import java.time.LocalDate;

public class Anime {
    int id;
    String nome;
    LocalDate dataLancamento;
    int classificacao;
    String genero;
    String autor;
    int quantidadeEpisodios;
    int temporadas;

    int mediaEpisodiosPorTemporada(){
        return quantidadeEpisodios/temporadas;
    }

    String exibirClassificacao(){
        String texto;
            if (classificacao == 0)
                texto = "Livre para todos os publicos";
            else
                texto = "Não recomendado para menores de " + classificacao + " anos ";
            return texto;
    }

    String mostrar(){
        return "Nome do anime: " + nome +
                "\nDe acordo com o ministério da justiça esse anime é  " + exibirClassificacao() +
                "\nA média de episódios por temporada é "+ mediaEpisodiosPorTemporada();
    }

}

