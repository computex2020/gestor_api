package br.com.computex.gestor_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.computex.gestor_api.models.RacaCor;

@Repository
public interface RacaCorRepository extends JpaRepository<RacaCor, Long> {

	RacaCor findById(long id);
}
