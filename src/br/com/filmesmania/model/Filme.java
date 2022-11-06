package br.com.filmesmania.model;

public class Filme {

	private String id;
	private Integer rank;
	private String title;
	private String fullTitle;
	private Integer year;
	private String image;
	private String crew;
	private Double imDbRating;
	private Integer imDbRatingCount;
	
	public Filme(String id, Integer rank, String title, String fullTitle, Integer year, String image, String crew,
			Double imDbRating, Integer imDbRatingCount) {
		super();
		this.id = id;
		this.rank = rank;
		this.title = title;
		this.fullTitle = fullTitle;
		this.year = year;
		this.image = image;
		this.crew = crew;
		this.imDbRating = imDbRating;
		this.imDbRatingCount = imDbRatingCount;
	}

	public String getId() {
		return id;
	}

	public Integer getRank() {
		return rank;
	}

	public String getTitle() {
		return title;
	}

	public String getFullTitle() {
		return fullTitle;
	}

	public Integer getYear() {
		return year;
	}


	public String getImage() {
		return image;
	}

	public String getCrew() {
		return crew;
	}


	public Double getImDbRating() {
		return imDbRating;
	}


	public Integer getImDbRatingCount() {
		return imDbRatingCount;
	}

	
	@Override
	public String toString() {
		return 	"{'id':" + "'" + this.getId() + "'," +
				"'rank':" + "'" + this.getRank() + "'," +
				"'title':" + "'" + this.getTitle() + "'," +
				"'fullTitle':" + "'" + this.getFullTitle() + "'," +
				"'year':" + "'" + this.getYear() + "'," + 
				"'image':" + "'" + this.getImage() + "'," + 
				"'crew':" + "'" + this.getCrew() + "'," + 
				"'imDbRating':" + "'" + this.getImDbRating() + "'," + 
				"'imDbRatingCount':" + "'" + this.getImDbRatingCount() + "}";
//		{"id":"tt0111161",
//		"rank":"1",
//		"title":"The Shawshank Redemption",
//		"fullTitle":"The Shawshank Redemption (1994)",
//		"year":"1994",
//		"image":"https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
//		"crew":"Frank Darabont (dir.), Tim Robbins, Morgan Freeman",
//		"imDbRating":"9.2",
//		"imDbRatingCount":"2656704"}
	}
}