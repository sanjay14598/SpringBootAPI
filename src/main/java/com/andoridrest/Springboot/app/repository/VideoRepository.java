package com.andoridrest.Springboot.app.repository;

import com.andoridrest.Springboot.app.entity.VideoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<VideoModel, Long> {
}
