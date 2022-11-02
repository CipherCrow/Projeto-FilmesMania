package br.com.filmesmania.main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		final String URL_GET = "https://imdb-api.com/en/API/Top250Movies/<YourKeyHere>";

		HttpClient cliente = HttpClient.newHttpClient();
		HttpRequest requisicao = HttpRequest.newBuilder()
				.GET()
				.timeout(Duration.ofSeconds(10))
				.uri(URI.create(URL_GET))
				.build();
		HttpResponse<String> resposta = cliente.send(requisicao,HttpResponse.BodyHandlers.ofString());
		
		System.out.println("Bem vindo ao meu primeiro projeto utilizando Java!");
		System.out.println("A principio, sera um programa simples que consumira a API da IMDb para consultas de filmes!");
		
		System.out.println(resposta.body());
	
	}
}
