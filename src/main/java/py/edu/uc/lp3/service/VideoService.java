package py.edu.uc.lp3.service;

import java.util.List;

import py.edu.uc.lp3.content.Video;



public interface VideoService {

	List<Video> findAll();

	void save(Video institute);

}
