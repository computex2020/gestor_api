package br.com.computex.gestor_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.computex.gestor_api.models.Nacionalidade;

@Repository
public interface NacionalidadeRepository extends JpaRepository<Nacionalidade, Long> {

	Nacionalidade findById(long id);
}
