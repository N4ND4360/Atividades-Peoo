
public class Musica {

	private String titulo;
	private double duracao;
	private String artista;
	private String album;
	private int ano;
	private int ranking;
 public Musica () {	 
 }
 public Musica(String titulo, String artista, String album, int ano , int ranking, double  duracao) {
	this.titulo = titulo;
	this.artista = artista;
	this.album = album;
	this.ano = ano;
}
 public void setTitulo(String titulo) {
	this.titulo = titulo;
}
 public String getTitulo() {
	return titulo;
}
 public void setArtista(String artista) {
	this.artista = artista;
}
 public String getArtista() {
	return artista;
}
 public void setAlbum(String album) {
	this.album = album;
}
 public String getAlbum() {
	return album;
}
 public void setAno(int ano) {
	this.ano = ano;
}
 public int getAno() {
	return ano;
}
 public void setRanking(int ranking) {
	this.ranking = ranking;
}
 public int getRanking() {
	return ranking;
}
 public void setDuracao(double duracao) {
	this.duracao = duracao;
}
 public double getDuracao() {
	return duracao;
}
 public String toString() {
	return "Título: " + titulo + ", Artista: " + artista +" Álbum: " + album ;
	
}
}
