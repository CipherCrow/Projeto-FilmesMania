package br.com.filmesmania.services;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.filmesmania.model.Filme;
import br.com.filmesmania.model.Pacote;

public class ConverteJson {
	private String jason;
	private Gson gson;
	private Pacote pacotao;
	
	public ConverteJson(String Json) {
		this.jason = Json;
		this.gson = new GsonBuilder().create();
		this.pacotao = gson.fromJson(jason, Pacote.class);
	}
	
	public List<Filme> pegarFilmes(){
		return this.pacotao.getItems();
	}
}
