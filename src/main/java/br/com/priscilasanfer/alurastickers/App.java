package br.com.priscilasanfer.alurastickers;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;


public class App {
    public static void main(String[] args) throws IOException, InterruptedException {

        final String API_KEY = System.getenv("API_KEY");
        final String TOP_IMDB_TOP_250_MOVIES = System.getenv("API_IMDB_TOP250_FILMES");
        final String API_IMDB_MOCKADA = System.getenv("API.IMDB.MOCKADA");

        final String RESET = "\033[0;0m";
        final String RED = "\033[1;91m";

        // Acessar uma conexão via http e buscar os 250 filmes
        var client = HttpClient.newHttpClient();
        var endereco = URI.create(API_IMDB_MOCKADA);
        var request = HttpRequest.newBuilder(endereco).GET().build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        var body = response.body();
        System.out.println(body);

        // extrair so os dados que interessam (titulo, poster, classificação)
        JsonParser parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);

        // exibir e manipular os dados
        for (Map<String, String> filme : listaDeFilmes) {
            String urlImagem = filme.get("image");
            String titulo = filme.get("title");

            InputStream inputStream = new URL(urlImagem).openStream();
            String nomeArquivo = titulo + ".png";

            GeradorDeFigurinha geradora = new GeradorDeFigurinha();
            geradora.cria(inputStream, nomeArquivo);

            System.out.println();
            System.out.println(RED + "Título: " + RESET + titulo);
            System.out.println(RED + "Pôster: " + RESET + urlImagem);
            System.out.println(RED + "Nota imDb: " + RESET + filme.get("imDbRating"));

            var classificacao = Float.parseFloat(filme.get("imDbRating"));

            for (int x = 0; x < classificacao; x++) {
                System.out.print("⭐");
            }
            System.out.println();
        }
    }
}
