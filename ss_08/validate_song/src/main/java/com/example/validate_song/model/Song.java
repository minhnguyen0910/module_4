package com.example.validate_song.model;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "name_song", columnDefinition = "varchar(800)")
    String name;
    @Column(name = "artist", columnDefinition = "varchar(300)")
    String artist;
    @Column(name = "type", columnDefinition = "varchar(1000)")
    String type;

    public Song() {
    }

    public Song(Integer id, String name, String artist, String type) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.type = type;
    }

    public Song(String name, String artist, String type) {
        this.name = name;
        this.artist = artist;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
