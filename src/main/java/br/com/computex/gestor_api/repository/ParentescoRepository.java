package br.com.computex.gestor_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.computex.gestor_api.models.Parentesco;

@Repository
public interface ParentescoRepository extends JpaRepository<Parentesco, Long> {

	Parentesco findById(long id);
}
