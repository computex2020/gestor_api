package br.com.computex.gestor_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.computex.gestor_api.models.Setor;

@Repository
public interface SetorRepository extends JpaRepository<Setor, Long> {

	Setor findById(long id);
}
