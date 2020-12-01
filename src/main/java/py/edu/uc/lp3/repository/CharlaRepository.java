package py.edu.uc.lp3.repository;

import java.util.ArrayList;

import org.springframework.data.repository.PagingAndSortingRepository;

import py.edu.uc.lp3.domain.Charla;

/**
 * 
 * Basado en https://github.com/Cristobal961/lp3-2018 
 * @author cbarreto
 *
 */
public interface CharlaRepository extends PagingAndSortingRepository<Charla, Long> {

	ArrayList<Charla> findByNombreCharla(String nombre);

	ArrayList<Charla> findAll();

}
