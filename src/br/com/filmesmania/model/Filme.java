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

	public void setId(String id) {
		this.id = id;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFullTitle() {
		return fullTitle;
	}

	public void setFullTitle(String fullTitle) {
		this.fullTitle = fullTitle;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCrew() {
		return crew;
	}

	public void setCrew(String crew) {
		this.crew = crew;
	}

	public Double getImDbRating() {
		return imDbRating;
	}

	public void setImDbRating(Double imDbRating) {
		this.imDbRating = imDbRating;
	}

	public Integer getImDbRatingCount() {
		return imDbRatingCount;
	}

	public void setImDbRatingCount(Integer imDbRatingCount) {
		this.imDbRatingCount = imDbRatingCount;
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