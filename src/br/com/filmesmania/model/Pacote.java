package br.com.filmesmania.model;

import java.util.List;

public class Pacote {

	List<Filme> items;
	public Pacote(List<Filme> items) {
		this.items = items;
	}
	public List<Filme> getItems() {
		return items;
	}
	public void setItems(List<Filme> items) {
		this.items = items;
	}
}