package com.cadastro.aluno.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cadastro.aluno.entity.Aluno;
import com.cadastro.aluno.repository.AlunoRepository;

@RestController
@RequestMapping(value = "/api")
public class AlunoController {
	@Autowired
	AlunoRepository repository;
	

	@GetMapping
	public List<Aluno> list() {
		return repository.findAll();
	
}

	@PostMapping
	public Aluno salvar(@RequestBody Aluno aluno) {
		return repository.save(aluno);
	}

}
