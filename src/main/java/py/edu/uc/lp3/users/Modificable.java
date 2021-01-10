package py.edu.uc.lp3.users;

import py.edu.uc.lp3.content.SitioReview;
import py.edu.uc.lp3.content.Video;

public interface Modificable { //lo que el curador puede modificar
	public Video cambiarGenero(Video video);
	public Video cambiarRating(Video video, SitioReview sitio);
}
