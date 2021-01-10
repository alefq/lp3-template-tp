package py.edu.uc.lp3.content;

public interface Clasificable {
	String getRating(SitioReview sitio); //Añadir el rating de un video
	//String ya que los sitios de review utilizan formatos distintos para sus puntajes ej: "85", "60%", "7,5", "*****"
}
