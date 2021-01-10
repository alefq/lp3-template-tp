package py.edu.uc.lp3.utils;

import py.edu.uc.lp3.content.Expirable;
import py.edu.uc.lp3.content.Promocion;
import py.edu.uc.lp3.users.Premium;

public class Notificar { 

	public static void estaVencido (Expirable dato) {
		if (dato instanceof Premium) System.out.println("Tu credenciales expiraron");
		else if (dato instanceof Promocion) System.out.println("Esta promocion ya expiro");
	}

}
