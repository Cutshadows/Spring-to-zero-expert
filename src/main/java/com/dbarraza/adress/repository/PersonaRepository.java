package com.dbarraza.adress.repository;

import com.dbarraza.adress.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
