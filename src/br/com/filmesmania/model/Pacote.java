package br.com.filmesmania.model;

import java.util.List;

public class Pacote {

	private List<Filme> items;
	
	public Pacote(List<Filme> items) {
		this.items = items;
	}
	public List<Filme> getItems() {
		return items;
	}
}