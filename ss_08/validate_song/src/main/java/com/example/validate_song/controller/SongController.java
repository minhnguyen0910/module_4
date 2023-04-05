package com.example.validate_song.controller;

import com.example.validate_song.dto.SongDTO;
import com.example.validate_song.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("song")
public class SongController {
    @Autowired
    ISongService iSongService;

    @GetMapping("")
    public String showForm(Model model) {
        model.addAttribute("song", new SongDTO());
        return "create";
    }

    @PostMapping("create")
    public String create(@Valid @ModelAttribute("song") SongDTO songDTO,
                         BindingResult bindingResult,
                         Model model) {
        new SongDTO().validate(songDTO, bindingResult);
        if (bindingResult.hasErrors()) {
            return "create";
        } else {
            iSongService.save(songDTO);
            return "redirect:/song";
        }
    }
}
