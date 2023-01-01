package br.com.filmesmania.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.filmesmania.acao.ExibirTop250FilmesAcao;
import br.com.filmesmania.acao.LoginAcao;
import br.com.filmesmania.acao.RealizarLogin;


@WebServlet("/controler")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		String respostaClasse = null;
		
		if(acao.equals("realizarLogin")) {
			RealizarLogin executor = new RealizarLogin();
			respostaClasse = executor.executa(request, response);
		}
		else if(acao.equals("login")) {
			LoginAcao executor = new LoginAcao();			
			respostaClasse = executor.executa(request, response);	
		}
		else if(acao.equals("exibirTop250Filmes")) {
			ExibirTop250FilmesAcao executor = new ExibirTop250FilmesAcao();
			respostaClasse = executor.executa(request,response);
		}
		
		String[] tipoEEndereco = respostaClasse.split(":");
		
		if(tipoEEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view"+tipoEEndereco[1]);
			rd.forward(request,response);
		} else {
			response.sendRedirect("/WEB-INF/view"+tipoEEndereco[1]);
		}

	}
	

}
