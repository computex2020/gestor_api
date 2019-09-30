package br.com.computex.gestor_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.computex.gestor_api.models.Operadora;

@Repository
public interface OperadoraRepository extends JpaRepository<Operadora, Long> {

	Operadora findById(long id);
}
