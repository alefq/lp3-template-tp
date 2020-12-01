package py.edu.uc.lp3.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import py.edu.uc.lp3.domain.Persona;

//interface para almacenar y recuperar los datos sobre las personas
public interface PersonaRepository extends PagingAndSortingRepository<Persona, Long> {
	Persona findByNumeroCedula(int numeroCedula);	
}
