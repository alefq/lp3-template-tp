package py.edu.uc.lp3.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import py.edu.uc.lp3.domain.Charla;
import py.edu.uc.lp3.domain.Persona;
import py.edu.uc.lp3.repository.CharlaRepository;
import py.edu.uc.lp3.service.CharlaService;
import py.edu.uc.lp3.service.PersonaService;
import py.edu.uc.lp3exceptions.InscripcionException;

/**
 * 
 * Basado en https://github.com/Cristobal961/lp3-2018 
 * @author cbarreto
 *
 */
@Component
public class CharlaServiceImpl implements CharlaService {

	@Autowired
	private PersonaService personaService;
	
	@Autowired
	private CharlaRepository charlaRepository;
	
	@Override
	public Charla inscribirPersona(Charla charla, Persona persona) {
		List<Persona> inscriptos = charla.getListaInscriptos();
		inscriptos.add(persona);
		charla.setListaInscriptos(inscriptos);
		return charla;
	}

	@Override
	public Charla crearCharla(String nombre, String hora) {
		Charla nuevaCharla = new Charla(nombre, hora);
		charlaRepository.save(nuevaCharla);
		return nuevaCharla;
	}

	@Override
	public Charla inscribirPersona(String nombreCharla, Integer ci) throws InscripcionException {
		Charla charla = null;
		Persona persona = personaService.findByCedula(ci);
		ArrayList<Charla> charlas = charlaRepository.findByNombreCharla(nombreCharla);
		if(persona != null && !charlas.isEmpty()) {
			charla = charlas.get(0);			
			charla.getListaInscriptos().add(persona);
		} else {
			throw new InscripcionException(
					String.format("No se encuentra la persona con cédula: %s o la charla: %s", ci, nombreCharla));
		}
		return charla;
	}	
}
