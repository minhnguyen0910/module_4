package com.example.validate_song.service;

import com.example.validate_song.dto.SongDTO;
import com.example.validate_song.model.Song;

public interface ISongService {
    void save(SongDTO song);
}
