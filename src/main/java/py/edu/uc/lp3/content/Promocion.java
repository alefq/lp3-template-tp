package py.edu.uc.lp3.content;

import java.util.Date;

import py.edu.uc.lp3.utils.Notificar;

public class Promocion implements Visible, Expirable {
	String tipo; //si es mes gratis, descuento, etc
	Date vencimiento; 
	int id;
	SitioReview sitio; //url del sitio en el que se canjea la promo
	

	public Promocion(String tipo, Date vencimiento, int id, SitioReview sitio) {
		super();
		this.tipo = tipo;
		this.vencimiento = vencimiento;
		this.id = id;
		this.sitio = sitio;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public Date getVencimiento() {
		return vencimiento;
	}


	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public SitioReview getSitio() {
		return sitio;
	}


	public void setSitio(SitioReview sitio) {
		this.sitio = sitio;
	}


	@Override
	public void mostrarNombre(String name) { //mostrar el tipo de promo
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mostrarDatos() { //mostrar la url del sitio
		
		
	}


	@Override
	public boolean controlVencimiento(Date vencimiento, Date hoy) {
		// TODO Auto-generated method stub
		if(vencimiento.equals(hoy)) {
			Notificar.estaVencido(this);
			return true;
		}
		return false;
	}
	
}
