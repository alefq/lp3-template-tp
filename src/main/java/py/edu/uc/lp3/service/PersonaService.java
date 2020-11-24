package py.edu.uc.lp3.service;

import java.util.List;

import py.edu.uc.lp3.domain.Persona;
import py.edu.uc.lp3exceptions.InscripcionException;

public interface PersonaService {

	/*
	 * Funcion para obtener un persona en especifico
	 * Parametros:
	 * 				Long id : id del persona que qeremos
	 * Retorno:
	 * 				Persona persona : el persona con id = id
	 * */
	Persona findById(Long id);

	/*
	 * Funcion para obtener una lista de todos los personas
	 * Parametros:
	 * 				ninguno
	 * Retorno:
	 * 				List<Persona> personas : la lista de todos los personas
	 * */
	List<Persona> findAll();

	/*
	 * Funcion para guardar un persona con persistencia
	 * Parametros:
	 * 				Persona persona : el persona que guardaremos con persistencia
	 * Retorno:
	 * 				ninguno
	 * */
	void save(Persona persona);

	/*
	 * Funcion para eliminar un persona con un id especifico de la persistencia
	 * Parametros:
	 * 				Long id : el ide del persona que queremos eliminar
	 * Retorno:
	 * 				ninguno
	 * */
	void delete(Long id);

	/*
	 * Funcion para guardar una lista de personas con persistencia
	 * Parametros:
	 * 				List<Persona> personas : la lista de lospersonas que guardaremos con persistencia
	 * Retorno:
	 * 				ninguno
	 * */
	void saveList(List<Persona> personas) throws InscripcionException;

	/*
	 * Funcion para verificar si un numero de cedula especifico se encuentra disponible (si no hay nadie ya utilizando ese numero de cedula)
	 * Parametros:
	 * 				int cedula : el numero de cedula que queremos verificar
	 * Retorno:
	 * 				boolean : true si el numero de cedula se encuentra disponible, false si no
	 * */
	boolean numeroDeCedulaDisponible(int cedula);

	/*
	 * Funcion para obtener un persona por numerio de cedula
	 * Parametros:
	 * 				int cedula : el numero de cedula del persona que queremos
	 * Retorno:
	 * 				Persona actual : el persona que coincide con el numero de cedula
	 * 				null : si no se encontro ningun persona con dicho numero de cedula
	 * */
	Persona findByCedula(int cedula);

	/*
	 * Funcion para eliminar un persona de la persistencia utilizando su numero de cedula
	 * Parametros:
	 * 				int cedula : el numero de cedula del persona que queremos eliminar
	 * Retorno:
	 * 				ninguno
	 * */
	void deleteByCedula(int cedula) throws InscripcionException;

}