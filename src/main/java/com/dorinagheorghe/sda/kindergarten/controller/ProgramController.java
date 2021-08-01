package com.dorinagheorghe.sda.kindergarten.controller;

import com.dorinagheorghe.sda.kindergarten.service.ProgramService;
import com.dorinagheorghe.sda.kindergarten.service.dto.ProgramDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class ProgramController {

    private final ProgramService programService;

    public ProgramController(ProgramService programService) {
        this.programService = programService;
    }

    @GetMapping("/program-list")
    public String showProgramListPage(Model model) {
        model.addAttribute("programs", programService.getAll());
        return "program-list";
    }

    @GetMapping("/add-program")
    public String addProgram(Model model) {
        model.addAttribute("program", new ProgramDTO());
        return "program-add";
    }

    @PostMapping("/addprogram")
    public String saveProgram(@ModelAttribute("program") @Valid ProgramDTO programDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "program-add";
        }
        programService.save(programDTO);
        return "redirect:/program-list";
    }
}
