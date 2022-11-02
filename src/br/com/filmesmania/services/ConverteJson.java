package br.com.filmesmania.services;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.filmesmania.model.Filme;
import br.com.filmesmania.model.Pacote;

public class ConverteJson {
	String jason;
	Gson gson;
	Pacote pacotao;
	
	public ConverteJson(String Json) {
		String jason = Json;
		gson = new GsonBuilder().create();
		pacotao = gson.fromJson(jason, Pacote.class);
	}
	
	public List<Filme> pegarFilmes(){
		return pacotao.getItems();
	}
}
