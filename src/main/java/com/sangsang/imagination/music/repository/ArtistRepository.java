package com.sangsang.imagination.music.repository;

import com.sangsang.imagination.music.entity.ArtistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<ArtistEntity, Long> {
}
