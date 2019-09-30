package br.com.computex.gestor_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.computex.gestor_api.models.TipoTelefone;

@Repository
public interface TipoTelefoneRepository extends JpaRepository<TipoTelefone, Long> {

	TipoTelefone findById(long id);
}
