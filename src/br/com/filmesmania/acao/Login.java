package br.com.filmesmania.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.filmesmania.model.Usuario;

public class Login implements Acao{
	
	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String chave = request.getParameter("chave");	
		HttpSession sessao = request.getSession();
		sessao.setAttribute("usuarioLogado", new Usuario(chave));
		
		return "redirect:controler?ordem=ExibirTop250Filmes";	
	}
	
}
