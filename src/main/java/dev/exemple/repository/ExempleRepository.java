package dev.exemple.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.exemple.entite.Exemple;

public interface ExempleRepository extends JpaRepository<Exemple, Integer>{


	public List<Exemple> findAll() ;
}
