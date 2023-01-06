package br.com.filmesmania.services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class RealizaRequisicao {

	private final String URL_GET = "https://imdb-api.com/br/API/Top250Movies/";
	private HttpClient cliente;
	private HttpRequest requisicao;
	private HttpResponse<String> resposta;
	
	public RealizaRequisicao(String chave){
		try {
			this.cliente = HttpClient.newHttpClient();
			this.requisicao = HttpRequest.newBuilder()
					.GET()
					.timeout(Duration.ofSeconds(10))
					.uri(URI.create(URL_GET+chave))
					.build();
			this.resposta = cliente.send(requisicao,HttpResponse.BodyHandlers.ofString());	
		}catch(Exception e) {
			System.out.println("Erro em "+ this + ": " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public String buscarResposta() {
		return this.resposta.body();
	}
	
}
