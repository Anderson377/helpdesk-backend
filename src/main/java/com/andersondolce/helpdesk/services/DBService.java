package com.andersondolce.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.andersondolce.helpdesk.domain.Chamado;
import com.andersondolce.helpdesk.domain.Cliente;
import com.andersondolce.helpdesk.domain.Tecnico;
import com.andersondolce.helpdesk.domain.enuns.Perfil;
import com.andersondolce.helpdesk.domain.enuns.Prioridade;
import com.andersondolce.helpdesk.domain.enuns.Status;
import com.andersondolce.helpdesk.repositories.ChamadoRepository;
import com.andersondolce.helpdesk.repositories.ClienteRepository;
import com.andersondolce.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null, "Anderson", "0988348", "anderson@gmail.com", encoder.encode("123"));
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus", "99832309", "linus@gmail.com", encoder.encode("123"));
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
	
}
