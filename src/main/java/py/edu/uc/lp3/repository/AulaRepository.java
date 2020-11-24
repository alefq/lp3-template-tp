package py.edu.uc.lp3.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import py.edu.uc.lp3.domain.Aula;

@Repository
public interface AulaRepository extends PagingAndSortingRepository<Aula, Long> {

	List<Aula> findByDescripcion(String descipcion);

}
