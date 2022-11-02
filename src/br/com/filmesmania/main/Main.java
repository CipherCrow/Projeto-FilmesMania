package br.com.filmesmania.main;

import java.util.List;

import br.com.filmesmania.model.Filme;
import br.com.filmesmania.services.ConverteJson;
import br.com.filmesmania.services.RealizaRequisicao;

public class Main {

	public static void main(String[] args){
		
		System.out.println("Bem vindo ao meu primeiro projeto utilizando Java!");
		System.out.println("A principio, sera um programa simples que consumira a API da IMDb para consultas de filmes!");
		
		try {
			RealizaRequisicao requisicao = new RealizaRequisicao();
			ConverteJson conversor = new ConverteJson(requisicao.buscarResposta());
			List<Filme> filmes = conversor.pegarFilmes();
			filmes.forEach(e -> System.out.println(e.toString()));
		}catch(Exception e) {
			System.out.println("Erro:" + e.getMessage());
		}

	}
}
