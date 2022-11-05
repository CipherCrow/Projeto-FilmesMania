package br.com.filmesmania.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class RealizaRequisicao {

	private final String URL_GET = "https://imdb-api.com/en/API/Top250Movies/";
	private HttpClient cliente;
	private HttpRequest requisicao;
	private HttpResponse<String> resposta;
	
	public RealizaRequisicao(String chave) throws IOException, InterruptedException {
		this.cliente = HttpClient.newHttpClient();
		this.requisicao = HttpRequest.newBuilder()
				.GET()
				.timeout(Duration.ofSeconds(10))
				.uri(URI.create(URL_GET+chave))
				.build();
		this.resposta = cliente.send(requisicao,HttpResponse.BodyHandlers.ofString());
	}
	
	public String buscarResposta() {
		return this.resposta.body();
	}
	
}
