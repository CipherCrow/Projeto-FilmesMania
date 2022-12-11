package br.com.filmesmania.servlets;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.filmesmania.control.GerenciaPaginaHtml;
import br.com.filmesmania.services.ConverteJson;
import br.com.filmesmania.services.RealizaRequisicao;


@WebServlet("/paginaprincipal")
public class Bemvindo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Bem vindo ao meu primeiro projeto utilizando Java!");
		System.out.println("A principio, sera um programa simples que consumira a API da IMDb para consultas de filmes!");
		System.out.println("Entao, e gerado um arquivo HTML na pasta do projeto com os filmes consultados da API.");
		
		String chave = request.getParameter("chave");
		
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
