package com.example.validate_song.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Column;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

public class SongDTO implements Validator {
    Integer id;
    @NotBlank(message = "tên bài hát không được để trống")
//    @Max(value = 300, message = "không vượt quá 300 kí tự")
    private String name;
    @NotBlank(message = "tên nghệ sĩ không được để trống")
//    @Max(value = 500, message = "không vượt quá 500 kí tự")
    private String artist;
    @NotBlank(message = "tên thể loại không được đê trống")
//    @Max(value = 1000, message = "không vượt quá 1000 kí tự")
    private String type;

    public SongDTO() {
    }

    public SongDTO(String name, String artist, String type) {
        this.name = name;
        this.artist = artist;
        this.type = type;
    }

    public SongDTO(Integer id, String name, String artist, String type) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.type = type;
    }

    @Override
    public void validate(Object target, Errors errors) {
        SongDTO songDTO = (SongDTO) target;
        if (!songDTO.name.matches("^[a-zA-Z0-9.\\\\-\\\\/+=@_ ]{0,300}$")) {
            errors.rejectValue("name", "", "vui lòng khong nhập kí tự đặc biệt");
        }
        if (!songDTO.artist.matches("^[a-zA-Z0-9.\\\\-\\\\/+=@_ ]{0,500}$")) {
            errors.rejectValue("artist", "", "vui long không nhập các kí tự đặc biệt");
        }
        if (!songDTO.type.matches("^[A-Za-z0-9, ]{0,1000}$")) {
            errors.rejectValue("type", "", "không nhập các kí tự đặc biệt ngoại trừ dấu phẩy");
        }
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

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }


}
