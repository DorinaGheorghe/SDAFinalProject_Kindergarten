package com.dorinagheorghe.sda.kindergarten.repository;

import com.dorinagheorghe.sda.kindergarten.model.Program;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramRepository extends CrudRepository<Program, Long> {

}
