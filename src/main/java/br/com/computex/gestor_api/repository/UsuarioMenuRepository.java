package br.com.computex.gestor_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.computex.gestor_api.models.UsuarioMenu;

@Repository
public interface UsuarioMenuRepository extends JpaRepository<UsuarioMenu, Long> {

	UsuarioMenu findById(long id);
	
}
