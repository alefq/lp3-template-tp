package py.edu.uc.lp3.users;

import java.util.Date;
import java.util.List;

import py.edu.uc.lp3.content.Expirable;
import py.edu.uc.lp3.content.Promocion;
import py.edu.uc.lp3.utils.Listar;
import py.edu.uc.lp3.utils.Notificar;

public class Premium extends Espectador implements Notificable, Expirable {
	List<Promocion> promos;
	Date vencimiento;
	
	public Premium(String username, String password, List<String> roles, List<Promocion> promos, Date vencimiento) {
		super(username, password, roles);
		this.promos = promos;
		this.vencimiento = vencimiento;
	}

	public List<Promocion> getPromos() {
		return promos;
	}

	public void setPromos(List<Promocion> promos) {
		this.promos = promos;
	}

	public Date getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}

	@Override
	public void notificarPromo(Promocion promo, Premium user) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mostrarDatos() {
		Listar.roles(this.roles);
		Listar.promociones(this.promos);
	}

	@Override
	public boolean controlVencimiento(Date vencimiento, Date hoy) {
		if(vencimiento.equals(hoy)) {
			Notificar.estaVencido(this);
			return true;
		}
		return false;
	}

}
