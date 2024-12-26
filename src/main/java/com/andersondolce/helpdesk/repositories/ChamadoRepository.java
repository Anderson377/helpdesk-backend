package com.andersondolce.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersondolce.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
