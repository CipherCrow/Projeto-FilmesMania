package br.com.filmesmania.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RealizarLogin implements Acao{
	
	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return "forward:/login.jsp";	
	}
	
}
