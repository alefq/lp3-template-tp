package py.edu.uc.lp3.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import py.edu.uc.lp3.domain.Video;

@Repository
public interface VideoRepository extends PagingAndSortingRepository<Video, Long> {

}
