package py.edu.uc.lp3.users;

import java.util.List;

import py.edu.uc.lp3.content.Video;
import py.edu.uc.lp3.content.Visible;
import py.edu.uc.lp3.utils.Listar;

public class Usuario implements Autorizable, Visible{
	String username; //correo o username
	String password;
	List<String> roles;
	
	public Usuario(String username, String password, List<String> roles) {
		super();
		this.username = username;
		this.password = password;
		this.roles = roles;
	}

	public void verVideo(Video video) {
		//mostrar los rating y eso
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	
	
	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validar(String username, List<String> roles) {
		// TODO Auto-generated method stub
		//comparar de que el usuario tenga el rol que necesita
		return false;
	}

	
	@Override
	public void mostrarNombre(String name) {
		// TODO Auto-generated method stub
		name = this.username;
	}

	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
		Listar.roles(this.roles);
	}

}
