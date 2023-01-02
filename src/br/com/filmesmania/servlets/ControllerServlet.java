package br.com.filmesmania.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.filmesmania.acao.Acao;


@WebServlet("/controler")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String ordem = request.getParameter("ordem");
		HttpSession sessao = request.getSession();
		boolean usuarioNaoLogado = (sessao.getAttribute("usuarioLogado") == null);
		boolean ehPaginaDesprotegida = !( (ordem.equals("RealizarLogin") | ordem.equals("Login")) );
		
		if(ehPaginaDesprotegida && usuarioNaoLogado ) {
			response.sendRedirect("controler?ordem=RealizarLogin");
			return;
		}
		
		String nomeDaClasse = "br.com.filmesmania.acao." + ordem;
		String respostaClasse = null;
		
		Acao acao;
		try {
			Class classe = Class.forName(nomeDaClasse); // Separa memória para usar aquela classe no projeto
			acao = (Acao) classe.newInstance();  // Instancia a Classe em uma acao
			respostaClasse = acao.executa(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		} 
				
		String[] tipoEEndereco = respostaClasse.split(":");
		
		if(tipoEEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view"+tipoEEndereco[1]);
			rd.forward(request,response);
		} else {
			response.sendRedirect(tipoEEndereco[1]);
		}

	}
	

}
