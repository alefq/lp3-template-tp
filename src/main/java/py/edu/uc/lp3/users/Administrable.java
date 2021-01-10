package py.edu.uc.lp3.users;

import py.edu.uc.lp3.content.Promocion;
import py.edu.uc.lp3.content.Video;

public interface Administrable { //es lo que el admin puede hacer
	boolean addPromo(Promocion new_promo, Premium user); 
	public Usuario addUsuario(Usuario new_user);
	public Video addVideo(Video new_video);
}
