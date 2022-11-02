package br.com.filmesmania.main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.filmesmania.model.Filme;
import br.com.filmesmania.model.Pacote;



public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		final String URL_GET = "https://imdb-api.com/en/API/Top250Movies/<YorKeyHere>";

		HttpClient cliente = HttpClient.newHttpClient();
		HttpRequest requisicao = HttpRequest.newBuilder()
				.GET()
				.timeout(Duration.ofSeconds(10))
				.uri(URI.create(URL_GET))
				.build();
		HttpResponse<String> resposta = cliente.send(requisicao,HttpResponse.BodyHandlers.ofString());
		
		System.out.println("Bem vindo ao meu primeiro projeto utilizando Java!");
		System.out.println("A principio, sera um programa simples que consumira a API da IMDb para consultas de filmes!");
		
		String jason = resposta.body();
		Gson gson = new GsonBuilder().create();
		Pacote pacotao = gson.fromJson(jason, Pacote.class);
		List<Filme> filmes = pacotao.getItems();
		
		//FOR FUTURE USE
		
		List<Integer> ranks = new ArrayList<Integer>();
		List<String> titles = new ArrayList<String>();
		List<String> fullTitles = new ArrayList<String>();
		List<Integer> years = new ArrayList<Integer>();
		List<String> images = new ArrayList<String>();
		List<String> crews = new ArrayList<String>();
		List<Double> imdbRatings = new ArrayList<Double>();
		
		for (Filme filme : filmes) {
			System.out.println(filme.toString());
			ranks.add(filme.getRank());
			titles.add(filme.getTitle());
			fullTitles.add(filme.getFullTitle());
			years.add(filme.getYear());
			images.add(filme.getImage());
			crews.add(filme.getCrew());
			imdbRatings.add(filme.getImDbRating());
		}

	}
}
