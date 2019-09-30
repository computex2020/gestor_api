package br.com.computex.gestor_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.computex.gestor_api.models.Guarda;

@Repository
public interface GuardaRepository extends JpaRepository<Guarda, Long> {

	Guarda findById(long id);
}
