package py.edu.uc.lp3.users;

import py.edu.uc.lp3.content.Promocion;

public interface Notificable{
	 void notificarPromo(Promocion promo, Premium user); //notificar cuando se te agrega una promo nueva
}
