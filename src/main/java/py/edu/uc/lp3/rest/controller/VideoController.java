package py.edu.uc.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.domain.Video;
import py.edu.uc.lp3.service.VideoService;

@RestController
public class VideoController {
	
	@Autowired
    private VideoService videoService;

	@RequestMapping(value = "/api/lp3/video", method = RequestMethod.GET)
    public List<Video> list() {
        return videoService.findAll();
    }

    @RequestMapping(value = "/api/lp3/video", method = RequestMethod.POST)
    public void add(@RequestBody Video institute) {
    	videoService.save(institute);
    }

}
