package com.dorinagheorghe.sda.kindergarten.service;

import com.dorinagheorghe.sda.kindergarten.model.Program;
import com.dorinagheorghe.sda.kindergarten.repository.ProgramRepository;
import com.dorinagheorghe.sda.kindergarten.service.dto.ProgramDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ProgramService {
    private final ProgramRepository programRepository;

    public ProgramService(ProgramRepository programRepository) {
        this.programRepository = programRepository;
    }

    public List<Program> getAll() {
        return new ArrayList<Program>((Collection<? extends Program>) programRepository.findAll());
    }

    public void save(ProgramDTO programDTO){
        Program program= new Program();
        program.setName(programDTO.getName());
        program.setDescription(programDTO.getDescription());
        programRepository.save(program);
    }
}
