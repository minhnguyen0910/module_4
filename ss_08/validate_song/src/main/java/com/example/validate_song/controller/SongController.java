package com.example.validate_song.controller;

import com.example.validate_song.dto.SongDTO;
import com.example.validate_song.model.Song;
import com.example.validate_song.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("list")
    public String showList(Model model, @RequestParam(name = "page", defaultValue = "0") Integer page) {
        model.addAttribute("list", iSongService.findAll(PageRequest.of(page, 2)));
        return "list";
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

    @GetMapping("edit")
    public String showFormEdit(@RequestParam(name = "id") Integer id, Model model) {
        model.addAttribute("song", iSongService.findById(id));
        return "edit";
    }

    @PostMapping("edit")
    public String edit(@ModelAttribute("song") Song song) {
        iSongService.edit(song);
        return "redirect:/song/list";
    }
}
