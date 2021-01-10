package py.edu.uc.lp3.users;

import java.util.List;

public interface Autorizable {
	boolean login (String username, String password); //verifica el login
	boolean validar(String username, List<String> roles); //verifica si tiene el rol necesario para realizar cierta accion
}
