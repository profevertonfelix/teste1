package com.Exemplo.de.aula.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Exemplo.de.aula.models.UsuarioModel;
import com.Exemplo.de.aula.repositories.UsuarioRepository;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository repository;
	
	@GetMapping("/")
	public String index() {
		return "usuario/index";
	}
}
