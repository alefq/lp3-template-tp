
package py.edu.uc.lp3.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.domain.Charla;
import py.edu.uc.lp3.service.CharlaService;
import py.edu.uc.lp3exceptions.InscripcionException;

/**
 * 
 * Basado en https://github.com/Cristobal961/lp3-2018 
 * @author cbarreto
 *
 */
@RestController
@RequestMapping(value = "/charla")
public class CharlaController {

	@Autowired
	private CharlaService charlaService;
	
	@RequestMapping(value = "/crear/nombre={nombre}/hora={hora}", method = RequestMethod.POST)
	public Charla crearCharla(@PathVariable String nombre, @PathVariable String hora) {
		Charla aux = charlaService.crearCharla(nombre, hora);
		return aux;
	}

	@RequestMapping(value = "/inscribir/charla={nombre}/ci={ci}", method = RequestMethod.POST)
	public Charla inscribirPersona(@PathVariable String nombre, @PathVariable Integer ci) {
		Charla auxCharla = null;
		try {
			auxCharla = charlaService.inscribirPersona(nombre, ci);
		} catch (InscripcionException e) {
			//Solo para demo en la clase
			e.printStackTrace(System.err);
		}				
		return auxCharla;
	}

}
