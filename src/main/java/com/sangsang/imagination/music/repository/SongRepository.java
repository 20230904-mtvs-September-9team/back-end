package com.sangsang.imagination.music.repository;

import com.sangsang.imagination.music.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
