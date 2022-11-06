package br.com.filmesmania.services;

import java.util.List;

import br.com.filmesmania.model.Filme;

public class CriaHtmldosFilmes {
		
	public String criar(List<Filme> filmes) {
		StringBuilder construtor = new StringBuilder();
		
		filmes.forEach(filme -> {
			//Valores que serão usados no Builder
			String titulo = filme.getTitle();
			String imagem = filme.getImage();
			int posicao = filme.getRank();
			double nota = filme.getImDbRating();
			int ano = filme.getYear();
			
			construtor.append("""
		            <div class="separador col-sm-6 col-md-4 col-lg-3">
        <div class="card col-12 espaco bg-secondary">
            <div class="card-body text-white">
		""");
			construtor.append(titulo);
			
			construtor.append("""
					</h5>
                    </div>
                    <img src="
					""");
			construtor.append(imagem);
			
			construtor.append("""
					" class="card-img-top" alt="...">
                    <div class="card-body row text-center text-white">
                        <p class="card-text col-6 col-md-4">Posição: <strong class="text-black">
					""");
			construtor.append(posicao);
			
			construtor.append("""
					</strong></p>
                        <p class="card-text col-6 col-md-4">Nota: <strong class="text-black">
					""");
			construtor.append(nota);
			
			construtor.append("""
					</strong></p>
                        <p class="card-text col-12 col-md-4">Ano: <strong class="text-black">
					""");
			construtor.append(ano);
			
			construtor.append("""
					</strong></p>
                    </div>
                </div>
            </div>
            <!--CARD INDIVIDUAL-->
					""");
			construtor.append("\n");
			
			//SIM FICOU TERRIVELMENTE CONFUSO KKKKKK
		});

		
		return construtor.toString() ;
	}
}
