package py.edu.uc.lp3.service;

import py.edu.uc.lp3.domain.Charla;
import py.edu.uc.lp3.domain.Persona;
import py.edu.uc.lp3exceptions.InscripcionException;
/**
 * 
 * Basado en https://github.com/Cristobal961/lp3-2018 
 * @author cbarreto
 *
 */
public interface CharlaService {

	/*
	 * Metodo inscribirPersona Recibe como parametros una Charla y una Persona y
	 * devuelve una charla con la persona inscripta en ella
	 */
	public Charla inscribirPersona(Charla charla, Persona persona);

	/*
	 * Metodo crearCharla Recibe como parametros un nombre y una hora, ambos en
	 * formato de string y devuelve una charla creada con sus atributos
	 * correspondientes seteados
	 */
	public Charla crearCharla(String nombre, String hora);

	public Charla inscribirPersona(String nombreCharla, Integer ci) throws InscripcionException;

}
