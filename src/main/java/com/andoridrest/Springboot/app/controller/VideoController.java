package com.andoridrest.Springboot.app.controller;

import com.andoridrest.Springboot.app.entity.VideoModel;
import com.andoridrest.Springboot.app.error.ResourceNotFoundException;
import com.andoridrest.Springboot.app.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VideoController {

    @Autowired
    private VideoRepository videoRepository;

    @PostMapping("/addVideo")
    public VideoModel addVideo(@RequestBody VideoModel videoModel) {
        return videoRepository.save(videoModel);
    }

    @GetMapping("/videos")
    public List<VideoModel> fetchAllVideos() {
        return videoRepository.findAll();
    }

    @GetMapping("/video/{videoId}")
    public ResponseEntity<VideoModel> geVideoById(
            @PathVariable(value = "videoId") Long videoId) throws ResourceNotFoundException {
        VideoModel videoModel = videoRepository.findById(videoId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found :: " + videoId));
        return ResponseEntity.ok().body(videoModel);
    }
}
