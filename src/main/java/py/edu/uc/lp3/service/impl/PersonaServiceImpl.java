package py.edu.uc.lp3.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uc.lp3.constants.Contacto;
import py.edu.uc.lp3.domain.Persona;
import py.edu.uc.lp3.repository.PersonaRepository;
import py.edu.uc.lp3.service.PersonaService;
import py.edu.uc.lp3exceptions.GeneralLP3Exception;
import py.edu.uc.lp3exceptions.InscripcionException;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaRepository personaRepository;

	/*
	 * Funcion para obtener un persona en especifico Parametros: Long id : id del
	 * persona que qeremos Retorno: Persona persona : el persona con id = id
	 */
	@Override
	public Persona findById(Long id) {
		Persona persona = null;
		Optional<Persona> personaFromBD = personaRepository.findById(id);
		if (personaFromBD.isPresent()) {
			persona = personaFromBD.get();
		} else {
			throw new GeneralLP3Exception("No se encontró la persona con id: " + id);
		}
		return persona;
	}

	/*
	 * Funcion para obtener una lista de todos los personas Parametros: ninguno
	 * Retorno: List<Persona> personas : la lista de todos los personas
	 */
	@Override
	public List<Persona> findAll() {
		List<Persona> personas = new ArrayList<>();
		Iterator<Persona> iteratorPersonas = personaRepository.findAll().iterator();
		while (iteratorPersonas.hasNext()) {
			personas.add(iteratorPersonas.next());
		}
		return personas;
	}

	/*
	 * Funcion para guardar un persona con persistencia Parametros: Persona persona
	 * : el persona que guardaremos con persistencia Retorno: ninguno
	 */
	@Override
	public void save(Persona persona) {
		personaRepository.save(persona);
	}

	/*
	 * Funcion para eliminar un persona con un id especifico de la persistencia
	 * Parametros: Long id : el ide del persona que queremos eliminar Retorno:
	 * ninguno
	 */
	@Override
	public void delete(Long id) {
		personaRepository.deleteById(id);
	}

	/*
	 * Funcion para guardar una lista de personas con persistencia Parametros:
	 * List<Persona> personas : la lista de lospersonas que guardaremos con
	 * persistencia Retorno: ninguno
	 */
	@Override
	public void saveList(List<Persona> personas) throws InscripcionException {
		// EquipoService equipoServ = new EquipoService();
		for (Persona aGuardar : personas) {
			if (aGuardar.getNumeroCedula() < 0) {
				InscripcionException inscripcionException = new InscripcionException(// System.out.println(
						"Numero de cedula invalido: " + aGuardar.getNumeroCedula());
				inscripcionException.setContacto(Contacto.INSCRIPCION);
				throw inscripcionException;
			} else if (!numeroDeCedulaDisponible(aGuardar.getNumeroCedula())) {
				InscripcionException inscripcionException = new InscripcionException(// System.out.println(
						"Ya existe una persona con el numero de cedula: " + aGuardar.getNumeroCedula());
				inscripcionException.setContacto(Contacto.INSCRIPCION);
				throw inscripcionException;
			}
			save(aGuardar);

		}
	}

	/*
	 * Funcion para verificar si un numero de cedula especifico se encuentra
	 * disponible (si no hay nadie ya utilizando ese numero de cedula) Parametros:
	 * int cedula : el numero de cedula que queremos verificar Retorno: boolean :
	 * true si el numero de cedula se encuentra disponible, false si no
	 */
	@Override
	public boolean numeroDeCedulaDisponible(int cedula) {
		if (findByCedula(cedula) == null) {
			return true;
		}
		return false;
	}

	/*
	 * Funcion para obtener un persona por numerio de cedula Parametros: int cedula
	 * : el numero de cedula del persona que queremos Retorno: Persona actual : el
	 * persona que coincide con el numero de cedula null : si no se encontro ningun
	 * persona con dicho numero de cedula
	 */
	@Override
	public Persona findByCedula(int cedula) {
		Persona persona = personaRepository.findByNumeroCedula(cedula);
		return persona;
	}

	/*
	 * Funcion para eliminar un persona de la persistencia utilizando su numero de
	 * cedula Parametros: int cedula : el numero de cedula del persona que queremos
	 * eliminar Retorno: ninguno
	 */
	@Override
	public void deleteByCedula(int cedula) throws InscripcionException {
		Persona persona = findByCedula(cedula);
		if (persona == null) {
			InscripcionException inscripcionException = new InscripcionException(// System.out.println(
					"No un persona con numero de cedula: " + cedula);
			inscripcionException.setContacto(Contacto.INSCRIPCION);
			throw inscripcionException;
		}
		long id = persona.getId();
		personaRepository.deleteById(id);
	}

}
