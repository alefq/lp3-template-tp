package py.edu.uc.lp3.users;

import java.util.List;

import py.edu.uc.lp3.content.Promocion;
import py.edu.uc.lp3.content.SitioReview;
import py.edu.uc.lp3.content.Video;

public class Admin extends Usuario implements Administrable, Modificable{
	
	public Admin(String username, String password, List<String> roles) {
		super(username, password, roles);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addPromo(Promocion new_promo, Premium user) {
		// TODO Auto-generated method stub
		user.notificarPromo(new_promo, user);
		return false;
	}

	@Override
	public Usuario addUsuario(Usuario new_user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Video addVideo(Video new_video) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Video cambiarGenero(Video video) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Video cambiarRating(Video video, SitioReview sitio) {
		// TODO Auto-generated method stub
		return null;
	}


}
