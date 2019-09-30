package br.com.computex.gestor_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.computex.gestor_api.models.Sexo;

@Repository
public interface SexoRepository extends JpaRepository<Sexo, Long> {

	Sexo findById(long id);
}
