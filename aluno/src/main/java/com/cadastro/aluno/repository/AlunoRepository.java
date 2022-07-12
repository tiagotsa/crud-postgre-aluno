package com.cadastro.aluno.repository;


import org.springframework.stereotype.Repository;
import com.cadastro.aluno.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}

