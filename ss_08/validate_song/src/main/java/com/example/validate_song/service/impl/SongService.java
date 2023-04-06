package com.example.validate_song.service.impl;

import com.example.validate_song.dto.SongDTO;
import com.example.validate_song.model.Song;
import com.example.validate_song.repository.ISongRepository;
import com.example.validate_song.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class SongService implements ISongService {
    @Autowired
    ISongRepository iSongRepository;

    @Override
    public void save(SongDTO songDTO) {
        Song song = new Song(songDTO.getName(), songDTO.getArtist(), songDTO.getType());
        iSongRepository.save(song);
    }

    @Override
    public SongDTO findById(Integer id) {
        Song song = iSongRepository.findById(id).get();
        return new SongDTO(song.getId(), song.getName(), song.getArtist(), song.getType());
    }

    @Override
    public Page<Song> findAll(PageRequest pageRequest) {
        return iSongRepository.findAll(pageRequest);
    }

    @Override
    public void edit(Song song) {
        iSongRepository.save(song);
    }
}
