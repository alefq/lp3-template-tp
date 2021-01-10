package py.edu.uc.lp3.content;

import java.util.List;

import py.edu.uc.lp3.utils.Listar;

public class Video implements Visible, Clasificable{
	String nombre;
	String genero;
	int id;
	List<SitioReview> ratings; //una lista donde almacenar los rating de distintos tipos
	
	
	
	public Video(String nombre, String genero, int id, List<SitioReview> ratings) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.id = id;
		this.ratings = ratings;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public List<SitioReview> getRatings() {
		return ratings;
	}


	public void setRatings(List<SitioReview> ratings) {
		//este va ser un chiqui mas complejo
		this.ratings = ratings;
	}


	public long duracionTotal() {
		long duracion = 0l;
		return duracion;
	}


	@Override
	public void mostrarNombre(String name) { //va mostrar el nombre de la serie/pelicula
		// TODO Auto-generated method stub
		name = this.nombre; 
	}


	@Override
	public void mostrarDatos() { //va mostrar los ratings
		// TODO Auto-generated method stub
		Listar.ratings(this.ratings);
	}


	@Override
	public String getRating(SitioReview sitio) {
		// TODO Auto-generated method stub
		ratings.add(sitio);
		return null;
	}

}
