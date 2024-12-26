package com.andersondolce.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersondolce.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
