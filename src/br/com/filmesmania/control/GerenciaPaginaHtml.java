package br.com.filmesmania.control;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import br.com.filmesmania.model.Filme;
import br.com.filmesmania.model.PaginaHtml;
import br.com.filmesmania.services.CriaHtmldosFilmes;

public class GerenciaPaginaHtml {
	private File arquivoHtml;
	private List<Filme> conteudo;
	
	public GerenciaPaginaHtml(List<Filme> listaDeFilmes) {
		this.conteudo = listaDeFilmes;
	}
	
	public void geraHtml() {
		this.arquivoHtml = new File("paginaWeb/index.html");
		try {
			FileWriter html = new FileWriter(this.arquivoHtml);
			BufferedWriter escritor = new BufferedWriter(html);	
			escritor.write(PaginaHtml.ABRIRHTML5.getHtml());
			escritor.write(PaginaHtml.HEAD.getHtml());
			escritor.write(PaginaHtml.ABRIRBODY.getHtml());
			escritor.write(PaginaHtml.HEADER.getHtml());
			escritor.write(PaginaHtml.ABRIRMAIN.getHtml());
			
			CriaHtmldosFilmes htmlDosFilmes = new CriaHtmldosFilmes();
			escritor.write(htmlDosFilmes.criar(conteudo));
			escritor.write(PaginaHtml.FECHARHTML5.getHtml());
			
			escritor.close();
			html.close();
			System.out.println("Processamento realizado!");
		}catch(IOException e) {
			System.out.println("Erro em "+ this + ": " + e.getMessage());
			e.printStackTrace();
		}
	}

	public void informacaoArquivo() {
		System.out.println("Seu arquivo contendo todos os 250 melhores filmes foi criado em '"+ arquivoHtml.getParent()+ "\\"
							+ "' com o nome de '"+ arquivoHtml.getName()+ "'");
	}
}
