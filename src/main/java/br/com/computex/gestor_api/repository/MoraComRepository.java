package br.com.computex.gestor_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.computex.gestor_api.models.MoraCom;

@Repository
public interface MoraComRepository extends JpaRepository<MoraCom, Long> {

	MoraCom findById(long id);
}
