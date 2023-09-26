package com.sangsang.imagination.music.controller;

import com.sangsang.imagination.music.dto.SelectionRequest;
import com.sangsang.imagination.music.entity.Artist;
import com.sangsang.imagination.music.entity.Selection;
import com.sangsang.imagination.music.entity.Song;
import com.sangsang.imagination.music.repository.ArtistRepository;
import com.sangsang.imagination.music.repository.SelectionRepository;
import com.sangsang.imagination.music.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/music")
public class MusicController {

    private final ArtistRepository artistRepository;
    private final SongRepository songRepository;
    private final SelectionRepository selectionRepository;

    @Autowired
    public MusicController(ArtistRepository artistRepository, SongRepository songRepository, SelectionRepository selectionRepository) {
        this.artistRepository = artistRepository;
        this.songRepository = songRepository;
        this.selectionRepository = selectionRepository;
    }

    @GetMapping("/artists")
    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    @GetMapping("/songs")
    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }

    @PostMapping("/selection")
    public ResponseEntity<String> handleSelection(@RequestBody SelectionRequest selectionRequest) {
        System.out.println(selectionRequest);

        String selectedArtist = selectionRequest.getArtist();
        String selectedSong = selectionRequest.getSong();

        // 선택된 가수와 음원을 저장
        Selection selection = new Selection();
        selection.setSelectedArtist(selectedArtist);
        selection.setSelectedSong(selectedSong);
        selectionRepository.save(selection);

        // 클라이언트에 응답을 보내고 성공 메시지를 반환
        return ResponseEntity.ok("Selection received: Artist - " + selectedArtist + ", Song - " + selectedSong);
    }
}