package br.com.filmesmania.services;

import java.util.List;

import br.com.filmesmania.model.Filme;
import br.com.filmesmania.model.PaginaHtml;


public class CriaHtmldosFilmes {
		
	public String criar(List<Filme> filmes) {
		StringBuilder construtor = new StringBuilder();
		
		filmes.forEach(filme -> {
			String template = PaginaHtml.TEMPLATEFILME.getHtml();
			
			construtor.append(template.replace("{filme.titulo}", filme.getTitle())
									  .replace("{filme.imagem}", filme.getImage())
									  .replace("{filme.rank}", filme.getRank().toString())
									  .replace("{filme.rating}", filme.getImDbRating().toString())
									  .replace("{filme.year}", filme.getYear().toString()));
		});

		
		return construtor.toString() ;
	}
}
