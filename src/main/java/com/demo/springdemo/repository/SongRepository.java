package com.demo.springdemo.repository;

import com.demo.springdemo.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //spring
public interface SongRepository extends JpaRepository<Song, Integer> {

}
