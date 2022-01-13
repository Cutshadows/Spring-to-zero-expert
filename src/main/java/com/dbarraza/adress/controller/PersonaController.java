package com.dbarraza.adress.controller;

import com.dbarraza.adress.entities.Persona;
import com.dbarraza.adress.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    PersonaRepository personaRepository;
    @RequestMapping(path="/")
    public List<Persona> getAllPersona(){
        return personaRepository.findAll();
    }
}
