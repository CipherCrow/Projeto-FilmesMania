package br.com.filmesmania.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Deslogar implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sessao = request.getSession();
		//sessao.removeAttribute("usuarioLogado"); Remove indivualmente cada atributo do cookie
		sessao.invalidate(); //Destroi o cookie inteiro
		return "redirect:controler?ordem=RealizarLogin";
	}

}
