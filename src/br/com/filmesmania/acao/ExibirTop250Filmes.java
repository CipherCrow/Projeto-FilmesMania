package br.com.filmesmania.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.filmesmania.services.ConverteJson;
import br.com.filmesmania.services.RealizaRequisicao;

public class ExibirTop250Filmes implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		String chave = request.getParameter("chave");
		RealizaRequisicao requisicao = new RealizaRequisicao(chave);
		ConverteJson conversor = new ConverteJson(requisicao.buscarResposta());		
		request.setAttribute("filmes", conversor.pegarFilmes());
		
		return "forward:/filmes.jsp";	
	}

}
