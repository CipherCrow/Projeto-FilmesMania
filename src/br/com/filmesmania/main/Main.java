package br.com.filmesmania.main;

import java.util.Scanner;

import br.com.filmesmania.control.GerenciaPaginaHtml;
import br.com.filmesmania.services.ConverteJson;
import br.com.filmesmania.services.RealizaRequisicao;

public class Main {

	public static void main(String[] args){
		System.out.println("Bem vindo ao meu primeiro projeto utilizando Java!");
		System.out.println("A principio, sera um programa simples que consumira a API da IMDb para consultas de filmes!");
		System.out.println("Entao, e gerado um arquivo HTML na pasta do projeto com os filmes consultados da API.");
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Por gentileza, poderia inserir sua chave da IMBd?");
			System.out.print("Chave: ");
			String key = sc.next();
			System.out.println();
			
			RealizaRequisicao requisicao = new RealizaRequisicao(key);
			ConverteJson conversor = new ConverteJson(requisicao.buscarResposta());		
			GerenciaPaginaHtml html = new GerenciaPaginaHtml(conversor.pegarFilmes());
			html.geraHtml();
			html.informacaoArquivo();
			
		}catch(Exception e) {
			System.out.println("Erro:" + e.getMessage());
		}
	}
}
