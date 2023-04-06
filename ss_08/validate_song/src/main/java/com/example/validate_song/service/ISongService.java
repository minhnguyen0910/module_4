package com.example.validate_song.service;

import com.example.validate_song.dto.SongDTO;
import com.example.validate_song.model.Song;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface ISongService {
    void save(SongDTO song);

    SongDTO findById(Integer id);

    Page<Song> findAll(PageRequest pageRequest);

    void edit(Song song);
}
