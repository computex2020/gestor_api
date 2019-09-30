package br.com.computex.gestor_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.computex.gestor_api.models.Religiao;

@Repository
public interface ReligiaoRepository extends JpaRepository<Religiao, Long> {

	Religiao findById(long id);
}
