package py.edu.uc.lp3.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uc.lp3.domain.Video;
import py.edu.uc.lp3.repository.VideoRepository;
import py.edu.uc.lp3.service.VideoService;

@Service
public class VideoServiceImpl implements VideoService {

	@Autowired
	private VideoRepository videoRepository;
	
	@Override
	public List<Video> findAll() {
		List<Video> videos = new ArrayList<>();
		Iterator<Video> aulasIterator = videoRepository.findAll().iterator();
		while (aulasIterator.hasNext()) {
			videos.add(aulasIterator.next());
		}
		return videos;
	}

	@Override
	public void save(Video institute) {
		videoRepository.save(institute);
	}

}
